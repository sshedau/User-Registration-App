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

## 🗄️ Firebase Database JSON Structure

```json
{
  "MyUsers": {
    "-OS5YZIMUZBXPIvQV9Li": {
      "userAge": 20,
      "userEmail": "shivamchute@gmail.com",
      "userId": "-OS5YZIMUZBXPIvQV9Li",
      "userName": "Shivam Chute"
    },
    "-OS5YbmH2ZRllTAdkiCX": {
      "userAge": 19,
      "userEmail": "ayushwadhai@gmail.com",
      "userId": "-OS5YbmH2ZRllTAdkiCX",
      "userName": "Ayush Wadhai "
    },
    "-OS5Yfpiorh8xY-gFQ8U": {
      "userAge": 20,
      "userEmail": "abhishekmangrudkar@gmail.com",
      "userId": "-OS5Yfpiorh8xY-gFQ8U",
      "userName": "Abhishek Mangrudkar "
    },
    "-OS5Ykg0q0WZ8c3cwZvG": {
      "userAge": 19,
      "userEmail": "nainityabombewar@gmail.com",
      "userId": "-OS5Ykg0q0WZ8c3cwZvG",
      "userName": "Nainitya Bombewar"
    },
    "-OS5Ys0JsF0ci36WmOuN": {
      "userAge": 19,
      "userEmail": "sujalhedau1971@gmail.com",
      "userId": "-OS5Ys0JsF0ci36WmOuN",
      "userName": "Sujal Sunil Hedau"
    }
  }
}
