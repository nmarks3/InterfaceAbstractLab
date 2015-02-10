
package lab2;

/**
 *
 * @author sawyer
 */
public interface Programming {
    
    public void setCourseName();
    public void getCourseName();
    public void setCourseNumber();
    public void getCourseNumber();
    public void setCredits();
    public void getCredits();
    public void setPrerequisites();
    public void getPrerequisites();
    
    public void setInfo(String courseName, String courseNumber, double credits,
            String prerequisites);
    public void getInfo(String courseName, String courseNumber, double credits,
            String prerequisites);
    
}
