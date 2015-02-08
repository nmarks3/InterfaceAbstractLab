package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author sawyer
 */
public abstract class ProgrammingClass {

    private String courseName;
    private String courseNumber;
    private double credits;
    String prerequisites;
    
    public void setInfo(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public void getInfo() {
        getCourseName();
        getCourseNumber();
        getCredits();
        getPrerequisites();
    }

    private String getCourseNumber() {
        return courseNumber;
    }

    private final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    private double getCredits() {
        return credits;
    }

    private void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    private String getCourseName() {
        return courseName;
    }

    private final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    private String getPrerequisites() {
        return prerequisites;
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
    public abstract void setPrerequisites(String prerequisites);

}
