public class Student {

    int id ; //instance members - Object - Stored in Heap
    String name; //instance
    String dob; // instance
    String bloodGroup;
   static String university = "Standford";

    public void setStudent(int sId, String sname, String sbloodGroup, String sdob)  {  // local variables
        name = sname;
        id = sId;
        bloodGroup = sbloodGroup;
        dob = sdob;
    }
    public void getDetails() {
        System.out.println(name + " "+id + " " + "" +bloodGroup);
        System.out.println(name);
        System.out.println(id);
        System.out.println(dob);
        System.out.println(bloodGroup);
        System.out.println(university);
    }

}

// HEAP AREA (All instance variables are stored in HEAP)
// CLASS AREA / Method AREA (All STATIC members are class )
// STACK AREA // ALL Local variables stored in stack

// Setter and Getter method
