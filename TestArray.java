public class TestArray {
    public static void main(String[] args) {
        // array size
        int size = 10;
        // define array
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 5.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // caculate summary
        double total = 0;
        for (double each: myList) {
            total += each;
        }
        System.out.println("summary: " + total);
    }
}
