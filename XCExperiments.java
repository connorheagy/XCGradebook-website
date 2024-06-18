/*
 * TO DO: 
 *  + create a helper functions that create course much easier withour repitition.
 *  + create a helper function that does that prints invidual nodes faster when searching.
 *   
 */

public class XCExperiments {
    public static void main(String[] args) throws Exception {

        XCListings l1 = new XCListings();
        course A = new course("LaVern Gibson", 8, 8);
        Node n1 = new Node(A);

        course B = new course("Les Duke", 8, 8);
        Node n2 = new Node(B);

        course C = new course("Augustana", 3, 8);
        Node n3 = new Node(C);

        course D = new course("Roy Griak", 10, 8);
        Node n4 = new Node(D);

        l1.add(n1);
        l1.add(n2);
        l1.add(n3);
        l1.add(n4);
        //l1.add(n2);
        //l1.remove(n4);

        l1.dump();

        XCListings.ToString(l1.Search("POOP"));

        
    } // main(args)
} // class XCExperiments
