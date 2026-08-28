# Contact App (Spring Boot + HTML/CSS)

## Structure
- `src/main/resources/static/index.html` — landing page
- `src/main/resources/static/contact.html` — contact form (Name, Email, Message)
- `src/main/resources/static/style.css` — shared styling
- `src/main/java/.../ContactController.java` — handles POST /submit, prints to console
- `src/main/java/.../ContactAppApplication.java` — Spring Boot entry point

## How to run
1. Open the folder in IntelliJ / VS Code / any IDE with Maven support, OR use terminal:
   ```
   mvn spring-boot:run
   ```
2. Open browser: `http://localhost:8080/index.html`
3. Click "Contact" → fill the form → Submit.
4. Check the terminal/console where the app is running — you'll see the
   submitted Name, Email, Message printed there.

## Notes
- No database yet — data is only printed to console (as per requirement).
- Form submits via native HTML POST to `/submit` (no JS/fetch needed) — simplest
  possible flow, good for the "no DB yet" stage.
- Import into IntelliJ: File → Open → select the folder → let it auto-detect
  as a Maven project.
