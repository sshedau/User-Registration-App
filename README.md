# 👤 User Registration App (Android + Firebase Realtime Database)

A basic **Android User Registration App** that stores and retrieves user information using **Firebase Realtime Database**. Built using **Kotlin**, it demonstrates Firebase integration, form handling, and real-time database usage in a clean and beginner-friendly format.

---

## 🚀 Features

- ✅ User registration screen with basic validation
- ✅ Stores user data in Firebase Realtime Database
- ✅ Prevents duplicate usernames
- ✅ Fetches and displays existing user data
- ✅ XML UI

---

## 📸 Screenshots

_Add screenshots here (optional). You can take them from the emulator or device and upload to GitHub's issue tracker or assets folder._

---

## 🧰 Tech Stack

| Layer       | Technology                  |
|-------------|-----------------------------|
| Language    | Kotlin                      |
| UI          | XML       |
| Backend     | Firebase Realtime Database  |
| IDE         | Android Studio              |
| Build Tool  | Gradle                      |

---

## 📁 Project Structure

UserRegistrationApp/
├── app/
│ ├── java/com/example/firstapp/
│ │ ├── MainActivity.kt
│ │ ├── RegistrationActivity.kt
│ │ └── ...
│ ├── res/
│ │ ├── layout/
│ │ │ └── activity_registration.xml
│ │ └── drawable/
│ └── AndroidManifest.xml
├── build.gradle (Project & App)
├── google-services.json
└── README.md

---

## 🔌 Firebase Setup Instructions

### 1. Create Firebase Project
- Go to [Firebase Console](https://console.firebase.google.com/)
- Click **"Add Project"** and follow the steps

### 2. Register Android App
- Inside your Firebase project → Add app → Android
- Enter your package name (e.g., `com.example.firstapp`)
- Download `google-services.json` and place it inside the `app/` folder

### 3. Enable Realtime Database
- Go to Firebase Console → Build → Realtime Database
- Click **"Create Database"**
- Set rules for development:

```json
{
  "rules": {
    ".read": true,
    ".write": true
  }
}
