public class ChildClass extends BaseClass {


    //we can add as many custom parameter-taking constructors and call one
    //from another. Do we REALLY need that? Rarely.
    public ChildClass(String param) {
        System.out.println("Hi from ChildClass - overriding field1 !");
        this.field1 = param;
    }

    //this is the default constructor but with custom implementation.
    //it is default in sense of accepting no parameters
    public ChildClass() {
        //note that there is implicit (invisible) call like:
        //super();
        //ALWAYS present. Check out - the base class is reporting always as first!

        //you must not call to a chained constructor later. Must be the first call:
        this("set in 1-param constructor");
        System.out.println("...just called \"chained\" constructor\n");

        System.out.println("... and I'm (still) in ChildClass (def) constructor!");

        System.out.println("...and (again) overriding field1 !");
        //I can change this value, because it is "only" protected one
        this.field1 = "field1 (re)set in ChildClass default constructor";

        System.out.println("\n and the final value of the field1 is: \n" + field1);


    }
}
