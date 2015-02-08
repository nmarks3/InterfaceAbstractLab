package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingClass {

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setInfo(courseName, courseNumber);
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites; // Need to make this private somehow
    }

}
