public class Node {

    course data;

    Node next; 

    public Node(course data) {
        this.data = data;
        next = null;
    } // Node(data, next);

    public String getName() {
        return data.getCourseName();
    } // getData()

    public int getRating() {
        return data.getCourseRating();
    } // getRating()

    public float getDistance() {
        return data.kmDistance();
    } // getDistance

    public course getCourse() {
        return data;
    } // getCourse()

    public Node getNode() {
        return next;
    } // getNode()

} // class Node