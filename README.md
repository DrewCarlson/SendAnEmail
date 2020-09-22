Send an email
===

An application that you would expect to work but does not.

### Usage

This application displays a "Send Email" button used to test if a device will handle email intents.

### Setup

1. `git clone https://github.com/DrewCarlson/SendAnEmail.git`
2. `./gradlew installDebug`
3. Launch SendAnEmail

### How

Clicking the send button runs the following code:

```kotlin
ShareCompat.IntentBuilder.from(this)
    .setChooserTitle("Will You See Me?")
    .addEmailTo("a@real.email")
    .startChooser()
```

You might expect this to work, but you're probably wrong.
