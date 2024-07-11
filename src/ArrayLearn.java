public class ArrayLearn {
    public static void main(String[] args) {
        String [] cities = { "Chennai", "Hyderabad", "Kerala", "Bangalore", "Coimbatore" };
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);

        for(String eachCity: cities) {
            System.out.println(eachCity);
        }

        double[] randomNumber = new double[10];

        for(int i=0; i< randomNumber.length;i++) {
            randomNumber[i] = Math.random();
        }

        for(double randomNum: randomNumber) {
            System.out.println(randomNum);
        }
    }
}
