/*
 * Comments: 
 *  + remember that binary search requires a sorted collection of data, so I need to sort the list first (by course difficulty)
 *   
 */

public class XCListings {

    /*
     * head node
     */
    Node cur;
    
    /*
     * current amount of course listings in the list
     */
    int size;

    /*
     * List containing the courses
     */
    public XCListings() {
        this.cur = null;
        this.size = 0;
    } // XCListing()

    public int getSize() {
        return size;
    } // getSize()

    /*
     * Determines if the course is present within the list already. If it is, returns false. Otherwise, it returns true.
     */
    public boolean courseInList(Node node) {
        if (cur == null) {
            return false;
        } // if
        else {
            Node temp = cur;
            int i = 0;
            while (i < size) {
                if (temp.getName().equals(node.getName())) {
                    return true;
                } // if
                temp = temp.next;
                i++;
            } // while
        } // else
        return false;
    } // boolean courseInList(node)
    
    /*
     * Adds the node at the end of the list of courses, does nothing if there is already a course with the same name
     */
    public void add(Node node) {
        if (courseInList(node) == false) {
            if (cur == null) {
                cur = node;
            } // if 
            else {
                Node temp = cur;
                while (temp.next != null) {
                temp = temp.next;
            } // while
            temp.next = node;
            } // else
            size++;
        } // if
    } // add(node)

    /*
     * returns the list of xc courses as strings
     */
    public void dump() {
        Node temp = cur;
        for (int i = 0; i < size; i++) {
            if (temp.data != null) {
                System.out.println((i + 1) + ". Course name: " + temp.getName() + ", difficulty rating: " + temp.getRating() + ", total km: " + temp.getDistance());
            } // if
            temp = temp.next;
        } // while 
    } // dump()

    /*
     * returns a string and display all the information of a node
     */
    public static void ToString(Node node) {
        System.out.println("Course name: " + node.getName() + ", difficulty rating: " + node.getRating() + ", total km: " + node.getDistance());
    } // ToString(Node node)

    /*
     * removes the node in the list if it exists. if it is not found, then does nothing. 
     */
    public void remove(Node node) {
        if (courseInList(node) == true) {
            Node temp = cur;
            int i = 0;
            while (i < size) {
                if (temp.getName().equals(node.getName())) {
                    temp.next = temp.next.next;
                    size--;
                    return;
                } // if
                temp = temp.next;
                i++;
            } // while
        } // if

    } // remove(node)

    /*
     * Sorts the list of xc courses by their difficulty rating, by most to least difficulty.
     */
    public XCListings SortByDifficulty(XCListings list) {
        XCListings sorted = new XCListings();
        Node temp = cur;
        for (int i = 0; i < size; i++) {
      //      if (temp.getCourseRating == )
        }
        return null; //STUB
    } // SortByDifficulty()

    public boolean NameInList(String name) {
        if (cur == null) {
            return false;
        } // if
        else {
            Node temp = cur;
            int i = 0;
            while (i < size) {
                if (temp.getName().equals(name)) {
                    return true;
                } // if
                temp = temp.next;
                i++;
            } // while
        } // else
        return false;
    } // boolean courseInList(node)

    /*
     * Searches the list of xc course and returns the matching node. If the node does not exist, throws an exception.
     */
    public Node Search(String name) throws Exception{
        Node temp = cur;
        int i = 0;
        if (NameInList(name) == true) {
            while (i < size) {
                if (name.equals(temp.getName())) {
                    return temp;
                } // if 
                temp = temp.next;
            } //while
            return temp;
        } // if
        else {
            throw new Exception();
        } // else  
    } // Search(name)
 


} // class XCListings

