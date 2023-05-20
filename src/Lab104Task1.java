public class Lab104Task1 {
    public static void main(String[] args) {

//        create a method that receive an array of int

//        find the smallest and the greatest number
//        calculate the difference between the two
//        return it
//int[] testArray = {2, 4, 1, 3, 66, -76, -1042, 15673, 0 , 1, 13, 11};
int[] testArray = {13};
        System.out.println(findDifferenceBetweenMaxAndMin(testArray)); // expecting 3

    }

    //        create a method that receive an array of int
    public static int findDifferenceBetweenMaxAndMin(int[] array){
//        find the smallest and the greatest number
//        check all the number and store the smallest and the biggest
//        declare smallest variable with the bigger possible int
        int smallest = Integer.MAX_VALUE;
//        declare biggest variable with the smallest possible int
        int biggest = Integer.MIN_VALUE;
//        start the loop
        for (int i = 0; i< array.length; i++){
//        compare the actual number with the biggest. is it bigger? if so this is the new bigger number
            if (array[i] > biggest){
                biggest = array[i];
            }
//        compare the actual number with the smallest. is it smaller? if so this is the new smallest number
            if (array[i] < smallest){
                smallest = array[i];
            }
//        loop end
        }
//        return biggest - smallest
        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);
        return biggest - smallest;
    }
}
