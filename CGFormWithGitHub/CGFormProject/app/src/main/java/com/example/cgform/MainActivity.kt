
package com.example.cgform
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)

  val w1=findViewById<EditText>(R.id.w1)
  val a1=findViewById<EditText>(R.id.a1)
  val btn=findViewById<Button>(R.id.calcBtn)
  val result=findViewById<TextView>(R.id.result)

  btn.setOnClickListener{
   val w=w1.text.toString().toDoubleOrNull()?:0.0
   val a=a1.text.toString().toDoubleOrNull()?:0.0
   val m=w*a
   val cg=if(w!=0.0) m/w else 0.0
   result.text="Moment: $m\nCG: $cg"
  }
 }
}
