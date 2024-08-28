public class Student {

    int id ; //instance members - Object - Stored in Heap
    String name; //instance
    String dob; // instance
    String bloodGroup;
    University universityDetails;
    static String university;

    public void setStudent(int sId, String sname, String sbloodGroup, String sdob, University uniDet)  {  // local variables
        name = sname;
        id = sId;
        bloodGroup = sbloodGroup;
        dob = sdob;
        universityDetails = uniDet;
    }
    public void getDetails() {
        System.out.println(name + " "+id + " " + "" +bloodGroup);
        System.out.println(name);
        System.out.println(id);
        System.out.println(dob);
        System.out.println(bloodGroup);
        System.out.println(universityDetails.univName);
        System.out.println(universityDetails.univID);

    }

}

// HEAP AREA (All instance variables are stored in HEAP)
// CLASS AREA / Method AREA (All STATIC members are class )
// STACK AREA // ALL Local variables stored in stack

// Setter and Getter method
