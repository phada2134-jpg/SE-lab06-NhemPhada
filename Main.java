// ------------------------------------------------------------
// Class Name: Main
// Description:
// This class is the entry point of the program.
// It is responsible for creating objects and demonstrating how
// the Subject and Session classes work together.
// This class does NOT contain business logic — only execution logic.
//
// Author: Nhem Phada
// Date: 30/12/2025
// ------------------------------------------------------------

public class Main {

    // -------------------- MAIN METHOD --------------------
    // This is the first method that runs when the program starts.
    // The JVM looks for a method with this exact signature:
    // public static void main(String[] args)

    public static void main(String[] args) {

        // Step 1: Create a Subject object
        // This represents a course in the university system.
        Subject subject = new Subject("SE201", "Software Engineering", 3);

        // Step 2: Create a Session object
        // This represents a study session for the subject.
        Session session = new Session("SE Revision", 14, 16);

        // Step 3: Display information using getter methods
        // We do not access fields directly because they are private.
        System.out.println("Subject Information:");
        System.out.println("Code: " + subject.getSubjectCode());
        System.out.println("Name: " + subject.getSubjectName());
        System.out.println("Credits: " + subject.getCredits());

        System.out.println();

        System.out.println("Session Information:");
        System.out.println("Session Name: " + session.getSessionName());
        System.out.println("Start Time: " + session.getStartTime());
        System.out.println("End Time: " + session.getEndTime());

        // Step 4: Demonstrate exception handling (optional example)
        // Uncommenting the following line will cause an exception
        // because the start time is greater than the end time.

        // session.setDuration(18, 16);

        // This shows that the system protects itself from invalid data.
    }

    // -------------------- SUMMARY --------------------
    // This class demonstrates:
    // 1. Separation of concerns — it does not manage Subject or Session data.
    // 2. Object creation and interaction.
    // 3. Program execution entry point.
    // 4. How exceptions protect system correctness.
}
