public class peopleTester
{
    private String name;
    private String occupation;

    public peopleTester(java.lang.String myName, java.lang.String myOccupation)
    {
        name = myName;
        occupation = myOccupation;
    }

    public String toString()
    {
        return "Hello, " + name+ " your occupation of: "+ occupation+ " is very impressive.";
    }


}
