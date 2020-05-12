public class BaseClass {

    //use protected to allow overriding/changing of this value in all inheriting classess
    //use private to change this field ONLY on this level
    //(don't) use public to let ANY class change this value
    protected String field1;

    public String hello() {
        return "\n Hello from: " + this.toString() + " field1: " + field1;
    }

    public BaseClass() {
        System.out.println("I'm in BaseClass (def) constructor!");
        this.field1 = "set in base class!";
    }
}