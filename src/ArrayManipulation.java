import java.util.Arrays;

public class ArrayManipulation {

     static void add(int x, int y) {
        int sum = 0;
        for(int i = x; i < y; i++ ) {
            sum = sum + i;
            System.out.println(sum);
        }
    }

    static void addVarArg(int... x) {
        for(int i = 0; i < x.length; i++ ) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

         Student student1 = new Student();
         University university = new University();
         university.univID = 200;
         university.univName = "Vel tech";
         student1.setStudent(1,"Sohail", "o+","29-11-1988",university);
         student1.getDetails();

        int sum = 0;
        int [] arr = {100,200,300,101,202,303,404 };
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<arr.length; i++) {
            arr[i] = 1 + (int) (Math.random()*100);
            sum += arr[i];
        }

        System.out.println("Sum of arr elements " +sum);

        add(5,6);
        add(100, 105);
        add(1,10);

        addVarArg(10,20,30);
        addVarArg(10,10);
    }
}
