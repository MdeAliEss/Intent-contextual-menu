# Intent contextual menu
 This repository contains an example Android project demonstrating how to implement a contextual menu using MainActivity with animations and navigation to other activities. The app is built in Kotlin.
# Android Menu Example

This repository contains an example Android project demonstrating how to implement a contextual menu in an Android app using `MainActivity` with animations and navigation to other activities. The app is built in Kotlin.

## Package Structure

The main functionality is contained within the `com.example.menu` package.

### MainActivity

`MainActivity` is the entry point of the application, featuring:
- A text view (`TextView`) with a pulse animation.
- A context menu with two options: **Ajouter** and **Supprimer**.
- Navigation to other activities based on the context menu selection.

## Features

1. **Pulse Animation on TextView**:  
   The `TextView` in the main layout starts with a pulsing animation upon launching the app.

2. **Context Menu**:
   - A context menu appears when the user long-presses on the `TextView`.
   - The menu provides the following options:
     - **Ajouter**: Starts `Ajouter` activity.
     - **Supprimer**: Starts `Supprimier` activity.

3. **Intent Navigation**:
   - The `onContextItemSelected()` method handles navigation to the `Ajouter` and `Supprimier` activities based on the user's selection in the context menu.