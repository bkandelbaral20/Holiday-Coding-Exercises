
/*
Create a new Java class called Reindeer. This should be in the same package as your Santa class. This should have
a protected String property of 'name.' Add a constructor that sets this name property when a new Reindeer is created.
Display a message that tells you the name of the new Reindeer that has been created. Test your new class in the main
 method of the Santa class by creating instances of Santa's reindeer.
 */


public class Reindeer {

    protected String name;

    public Reindeer() {
    }

    public Reindeer(String name) {
        this.name = name;
    }

    public String toString() {
        return "This is just to print out the object in string form";
    }

//    public static void main(String[] args) {
//        Reindeer rein = new Reindeer("Coco");
//        System.out.println("The name of my Reindeer is " + rein.name);
//        System.out.println(rein);
//    }
}
