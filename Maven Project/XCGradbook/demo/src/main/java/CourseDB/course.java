package CourseDB;

public class course implements Courses {

    String courseName;

    int courseRating;

    float kmDistance;

    public course(String courseName, int courseRating, float kmDistance) {
        this.courseName = courseName;
        this.courseRating = courseRating;
        this.kmDistance = kmDistance;
    } // XC(courseName, courseRating, kmDistance)

    @Override
    public String getCourseName() {
        return courseName;
    } // getCourseName()

    @Override
    public int getCourseRating() {
        return courseRating;
    } // getCourseRating()

    @Override
    public float kmDistance() {
        return kmDistance;
    } // kmDistance()
} // class XC