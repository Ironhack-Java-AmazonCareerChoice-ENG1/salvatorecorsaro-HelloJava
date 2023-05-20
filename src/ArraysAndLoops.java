import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraysAndLoops {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello Java: day 2");

//        camelCase helloMyNameIsSalvatore <-
//        snake_case hello_my_name_is_salvatore x



//        arrays
        int[] intArray = {33,54,11,66}; // indexes are 0,1,2,3
        String[] students = {"Asmita", "Louis", "Victor"};
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(students));
        System.out.println(intArray);
        System.out.println(intArray[0]);
        System.out.println(intArray[intArray.length -1]);// arrays are zero indexed
        students[0] = "Ransford";
        System.out.println(Arrays.toString(students));

        int[] zeroes = new int[5];
        Integer[] zeroes2 = new Integer[5];
        String[] names= new String[5];
        System.out.println(Arrays.toString(zeroes));
        System.out.println(Arrays.toString(zeroes2));
        System.out.println(Arrays.toString(names));

//        loops
        for(int i = 0; i <5; i++) { //for ( start; untill; {}; then do;)
            System.out.println(i);
        }

//        for (int i = 5; i >= 0; i--){
//            System.out.println("countdown: " + i + ".5");
//            Thread.sleep(500);
//            System.out.println("countdown: " + i);
//            Thread.sleep(500);
//
//        }
//        System.out.println("Wake up, is time to learn JAVA!");
        System.out.println("now we skip a number");
        for (int i = 0; i < 10; i+=2 ) {
            System.out.println(i);
        }
        for (int index = 0; index < students.length; index++){
            System.out.println("student name is: " + students[index]);
        }
        int i = 42;
        while (i <60){
            System.out.println("number is: " + i);
            i++;
        }

        while (true){
            System.out.println("I will crash your pc");
            Random r = new Random();
            int result = r.nextInt(0, 10);
            System.out.println(result);
            if ( result % 2 == 0){
                System.out.println("It's even let's BREAK");
                break; // this will stop the loop
            }
        }

        int y = -10;
        do {
            System.out.printf("number is: %d\n", y);
            y++;
        } while (y < 0);


    }
}
