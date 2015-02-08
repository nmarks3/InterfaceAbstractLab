package lab1;

import javax.swing.JOptionPane;

/**
 * See ProgrammingClass
 *
 * @Nolan Marks
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingClass {
    
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setInfo(courseName, courseNumber);
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
