# 📰 NewsApp

**NewsApp** is a Kotlin-based Android application that provides users with the latest news articles across different categories such as business, sports, and science. The app follows modern Android development practices and leverages the MVVM architecture for better code organization and maintainability.

## 🚀 Features
-Fetch leatest news and detailed information.
-  Fetch data from a remote news API
- ☀ Clean UI with Material Design principles
- Offline Support: Access recipes offline with local caching using Room database.
## 🏗 Architecture

The project is based on the **MVVM (Model - View - ViewModel)** architecture:

- **Model**: Data classes and repository layer for accessing remote and local data.
- **ViewModel**: Acts as a bridge between the UI and data layer using LiveData and StateFlow.
- **View**: Activities and Fragments observing data changes and updating the UI.

## 🛠 Tech Stack

- **Kotlin** – Primary programming language.
- **Android Jetpack Components** – ViewModel
- **Retrofit** – For network operations.
- **Coroutines + Flow** for asynchronous programming
- **Hilt** – For dependency injection.

### Prerequisites

- Android Studio (Flamingo or newer)
- Kotlin 1.9+
- Android SDK 34

### Steps

1. Clone the repo:
   ```bash
   git clone https://github.com/Marwamostafa-md/NewsApp.git
   cd NewsApp
2.Open the project in Android Studio.

3.Sync Gradle and build the project.

4.Run the app on your emulator or physical device.
