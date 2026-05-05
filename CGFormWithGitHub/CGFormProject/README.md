# CGForm - Center of Gravity Calculator

An Android app to calculate Center of Gravity (CG) from Weight and Arm inputs.

## How to Build APK via GitHub Actions

### Step 1 – Create GitHub Repository
1. Go to https://github.com/new
2. Create a new **public** repository (e.g. `CGFormApp`)
3. Don't initialize with README

### Step 2 – Upload Project Files
Upload all files from this ZIP to your repository. You can do this via:
- GitHub website (drag & drop)
- Git command line

### Step 3 – Generate Gradle Wrapper (One Time)
After uploading, the `gradle/wrapper/gradle-wrapper.jar` file must be generated.

**Option A** – In Android Studio:
Open the project, it will auto-generate everything.

**Option B** – From terminal (if you have Gradle installed):
```bash
gradle wrapper --gradle-version 8.2
```

### Step 4 – Run the Workflow
1. Go to your GitHub repo → **Actions** tab
2. Click **Build APK**
3. Click **Run workflow**
4. Wait ~5 minutes
5. Download the APK from the **Artifacts** section

## Project Structure
```
CGFormApp/
├── .github/
│   └── workflows/
│       └── build-apk.yml      ← GitHub Actions workflow
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/example/cgform/
│       │   └── MainActivity.kt
│       └── res/layout/
│           └── activity_main.xml
├── gradle/wrapper/
│   ├── gradle-wrapper.jar     ← generate via Android Studio
│   └── gradle-wrapper.properties
├── build.gradle
├── gradlew
├── gradlew.bat
└── settings.gradle
```
