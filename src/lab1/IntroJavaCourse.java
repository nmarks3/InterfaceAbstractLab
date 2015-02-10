package lab1;

import javax.swing.JOptionPane;

/**
 * See ProgrammingClass
 *
 * @Nolan Marks
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    public IntroJavaCourse(String courseName, String courseNumber, double credits,
            String prerequisites) {
        setInfo(courseName, courseNumber, credits, prerequisites);
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites; // Need to make this private somehow
    }

}
