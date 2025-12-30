// ------------------------------------------------------------
// Class Name: Subject
// Description:
// This class represents a university subject in Year 2 program.
// It stores information such as subject code, subject name, and credits.
// The class demonstrates good coding standards such as encapsulation,
// naming conventions, validation, and exception handling.
//
// Author: Nhem Phada
// Date: 30/12/2025
// ------------------------------------------------------------

public class Subject {

    // -------------------- CONSTANT --------------------
    // A constant value that never changes during program execution.
    public static final int MAX_CREDITS = 5;

    // -------------------- ATTRIBUTES --------------------
    // Private attributes protect the internal state of the object.
    private String subjectCode;   // Example: "SE201"
    private String subjectName;   // Example: "Software Engineering"
    private int credits;          // Example: 3

    // -------------------- CONSTRUCTOR --------------------
    public Subject(String subjectCode, String subjectName, int credits) {
        setSubjectCode(subjectCode);
        setSubjectName(subjectName);
        setCredits(credits);
    }

    // -------------------- GETTERS --------------------
    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredits() {
        return credits;
    }

    // -------------------- SETTERS WITH VALIDATION --------------------

    public void setSubjectCode(String subjectCode) {
        if (subjectCode == null || subjectCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject code cannot be null or empty.");
        }
        this.subjectCode = subjectCode;
    }

    public void setSubjectName(String subjectName) {
        if (subjectName == null || subjectName.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty.");
        }
        this.subjectName = subjectName;
    }

    public void setCredits(int credits) {
        if (credits <= 0 || credits > MAX_CREDITS) {
            throw new IllegalArgumentException(
                "Credits must be between 1 and " + MAX_CREDITS
            );
        }
        this.credits = credits;
    }

    // -------------------- SUMMARY --------------------
    // This class follows:
    // - Encapsulation
    // - Naming conventions (camelCase for variables, PascalCase for class)
    // - Use of constants for fixed values
    // - Input validation using exceptions
}
