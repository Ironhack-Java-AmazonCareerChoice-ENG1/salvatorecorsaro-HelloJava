public class DataTypesOperatorsAndConditions {
    public static void main(String[] args) {


        System.out.println("Hello Java!");
        System.out.println("We're going to be friends!");

//        DATA TYPES

        int perfectEspressoGramsOfCoffee = 7;
        System.out.println("Perfect Espresso grams of coffee: " + perfectEspressoGramsOfCoffee);

        byte age = 34;
//        byte age2 = 150;
        long veryBigNumber = 888888888888L;

        float coffeeRating = 4.5F; //variable
        double biggerDecimalNumber = 856.67;

        boolean isCoffeeAmazing = true;
        boolean isCocaColaHealthy = false;

        char coffeeSize = 'L';

        String myCoffeeMachine = "AereoPress";
        String greeting = "Hello World";

        System.out.println(greeting);
        Integer numberOfCoffeeBeans = 42;
        System.out.println(Integer.MIN_VALUE); //instruction


//        OPERATORS
        int num1 = 2;
        int num2 = 2;
        int sum = num1 + num2;
        System.out.println("sum: "+ sum);
        System.out.println(num1 + num2);

        int sub = num1 - num2;
        System.out.println("subtraction: " + sub);
        System.out.println(sub);

        int multiply = num1 * num2;
        System.out.println("multiply: " + multiply);
        int division = num1 / num2;
        System.out.println("divide: " + division);
        int divisionFail = 10 / 3;
        System.out.println("divide 10 / 3 : " + divisionFail);
        double divisionOk = 10.0 / 3.0;
        System.out.println("divide 10 / 3 : " + divisionOk);

        System.out.println("module: " + (10 % 4));

        System.out.println(7 % 2); // 1 so odd
        System.out.println(42 % 2); // 0 even

        boolean isBigger = 5 > 3;
        System.out.println(isBigger);

        boolean isSmaller = 5 < 10;
        boolean isEqual = 5 == 5; // notice is not = but ==

        int x = 42;
        System.out.println(x);
        x++; // x = x + 1;
        System
                .out
                .println(x);
        x--;
        System.out.println(x);
        x+=5; //47! x = x + 5;
        System.out.println(x);


//        conditionals
        int statusCode = 42;

        if (statusCode == 200) {
            System.out.println("all good!");
        }else if (statusCode == 400) {
            System.out.println("bad request");
        } else {
            System.out.println("what code is that?!");
        }

        String coffeeToPrepare = "Espresso";

        if (!coffeeToPrepare.equals("Espresso")) {
            System.out.println("Please, prepare 1 espresso!");
        } else if (coffeeToPrepare.equals("FlatWhite")) {
            System.out.println("Please, prepare 2 espresso!");
        } else {
            System.out.println("prepare a tea :(");
        }


        System.out.println(coffeeToPrepare.toUpperCase());
        System.out.println(coffeeToPrepare.contains("Espre"));

        int myNumber = 13;
        switch (myNumber){
            case 0 -> {
                System.out.println("Zero!");
                break;
            }

            case 1 -> {
                System.out.println("One!");
                break;
            }
            case 13 -> {
                System.out.println("My number!!");
                break;
            }
            default -> System.out.println("Nothing special");
        }
        int result = !(5 > 10) ? 1 : 0; // ternary operator : condition ? true : false;
//        5 > 10 is five bigger than 10?
//        !(5>10) is not five bigger than 10?
        System.out.println(result);

    }
}