
# SafeLine
SafeLine stands as the ultimate companion for women, ensuring their safety in every circumstance. Through its user-friendly features, it empowers you to swiftly alert your loved ones of your whereabouts and connect with emergency services effortlessly. Even if the app is directed towards women, any individual is entertained to use it for their own safety.


## Features 

- **User Management:**
  - **Login and Registration:** User can login and signup using their email ids. upon signing up, the user will receive a verification link in the provided email address to verify themselves.

- **Safety Measures:**
  - **Live Location Sharing:** Instantly share your location with trusted contacts.
  - **Trusted Contacts:** Add up to 10 trusted contacts for quick access.
  - **User Notifications:** Alert contacts who are also SafeLine users via notifications.
  - **SMS Notifications:** Reach out to non-users via SMS notifications.

- **Emergency Assistance:**
  - **Emergency Helplines:** Access important emergency contact numbers.
  - **Safety Tips:** Learn from a list of safety tips to stay secure.

- **SOS Mode:**
  - **Shake Detection:** Trigger SOS mode with a simple shake gesture.
  - **Audible Alert:** Activate a loud siren to attract attention.
  - **Automatic Emergency Call:** Connect with emergency services instantly in SOS mode.

## Architecture 

This app uses [***Firebase***](https://firebase.google.com/) and Google Cloud services.

## Build-Tool 

You need to have [Android Studio Giraffe or above](https://developer.android.com/studio) to build this project.

## Getting Started 

- In Android Studio project, go to `Tools` > `Firebase` > `Authentication` > `Authenticate using a custom authentication system`:
  - First, `Connect to Firebase`
  - After that, `Add the Firebase Authentication SDK to your app`

- Now open your project's [Firebase Console](https://console.firebase.google.com/) > `Authentication` > `Sign-in method`:
  - Enable `Email/Password`
  - Do not enable `Email link (passwordless sign-in)`

- Enable [Cloud Messaging](https://console.cloud.google.com/apis/library/googlecloudmessaging.googleapis.com) API library

- Enable [Token Service API](https://console.cloud.google.com/apis/library/securetoken.googleapis.com)

- Again, Open your project's [Firebase Console](https://console.firebase.google.com/) > `Settings icon` (beside Project Overview) > `Users and permissions` > `Cloud Messaging`:
  - Copy the `Server Key` of Cloud Messaging API and paste it in NotificationAPI.java file in the project file.


## Credits

- [icons8.com](https://icons8.com) for the in-app icons.
