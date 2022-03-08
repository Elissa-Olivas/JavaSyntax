package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // DATA TYPES
        // primitive data types
        int s;
        double ss;
        boolean isQuitting;
        char myChar;
        // non-primitive data types
        String name;
        //Class- superclasses, subclasses
        Vehicle myCar = new Vehicle("Ford", "Bronco"); // myCar is the new Object created from the Car class () not using a constructor ("", "") using a constructor

        // OPERATORS
        int x = 4;
        int y = 2;
        // arithmetic operators
        System.out.println(x + y); //addition,  (x-y) subtract, ( x/y) divide, ( x*y) multiply, (x%y) gives a remainder
        // relational operators
        if (x < y) ; // less than, (x > y) x is greater than y, <= , >= , == (equal to), != (not equal to)
        // logical operators
        if (x < 40 && y < 40) ; // && checks if both are true, || checks if one or the other is true
        // assignment operators
        int r = 10; // = assignment, += , -= , *= , %= , &= , ^= , |= ,
        // increment and decrement operators
        for (int l = 0; l < r; l++) ; // ++ increment, -- decrement

        // Scanner for user input
        Scanner myScanner = new Scanner(System.in);
        int userInput = myScanner.nextInt();
        String userInput2 = myScanner.nextLine();
        String userInput3 = myScanner.next();

        // Random - selecting a random element from an Array or ArrayList
        String[] namesOfPeople = {"bob", "Millie", "Ester"};
        Random random = new Random();
        //namesOfPeople[random.nextInt(2)]; //name of Array, # is Num in Array - 1
        //namesOfPeople[random.nextInt(2).getMakeOfCar]; //if there was a make of car to get info from a constructor

        List<String> peopleNames = new ArrayList<>();
        peopleNames.add("Bob");
        peopleNames.add("Millie");
        peopleNames.add("Ester");
        Random random2 = new Random();
        peopleNames.get(random2.nextInt(2));
        System.out.println(peopleNames.get(random2.nextInt(3)));

        // VARIABLES
        String person = "Bob"; //String is variable type
                               // person (declaring it by giving it a name),
                               // "Bob" (assigning by giving it a value)


        // METHODS - only runs when it is called *****See more in the Vehicle Class
        Vehicle myCar1 = new Vehicle("Ford", "Bronco"); // (would actually be blank)
        myCar1.setMake("Ford");
        myCar1.setModel("Bronco");
        myCar1.describeCar();


        //CONSTRUCTORS - uses same as the Class name ****See more in the Vehicle Class
        Vehicle myCar2 = new Vehicle("Ford", "Mustang"); //add the setters in the Object itself
        myCar2.describeCar();

        // PRINTING IN JAVA
        System.out.println(myCar1.getMake()); //this will get the myCar1 and get the Make and print that specific info
        myCar2.describeCar(); //calling a method will print the object's info that is described in the method


        // IF STATEMENTS - *if this statement is true, do this..... else if not true do this......
        if (x > y) {
            System.out.println(x + " is grater than " + y);
        }
        // if-else statement
        if (x > y) {
            System.out.println(x + " is grater than " + y);
        } else {
            System.out.println(x + " is less than " + y);
        }

        // LOOPS - initalizer, condition statement, body (usually a print statement), incrementor or decrementor
        // for loop
        for (int j = 0; j < 10; j++) {
            System.out.println(j);    // int j = 0 iis the initalizer. j < 10 is the condition to test if it is still within perameters. j++ is incrementing it
        }
        // for each - usually used to go through an ArrayList
//        for (String newString; arrayName) {
//            System.out.println(newString);
//        }
        //while loop - tests at the beginning
        int index = 0;
        while (index < 3) {
            System.out.println(index);
            index++;
        }

        do {
            if (x < y) {
                isQuitting = true;
            } else {
                isQuitting = false;

            }

        }while (isQuitting) ;

        // ARRAYS - must have all the same Data Type, Cannot change size.
        String[] suites = {"Spades", "Hearts", "Diamonds", "Clubs"}; // {0, 1, 2, 3}
        System.out.println(Arrays.toString(suites)); // outputs [Spades, Hearts, Diamonds, Clubs]
        System.out.println(suites[1]); //prints out 1 of the array - Hearts

        // ARRAY LISTS - Can have multiple Data Types in 1 List, Can change size
        List<String> newCars = new ArrayList<>(); //new object created on Main
        newCars.add("Tesla");
        newCars.add("Ford Bronco");
        newCars.add("Toyota Rav4");
        System.out.println(newCars); //outputs [Tesla, Ford Bronco, Toyota Rav4]
            //modifying a list
        newCars.add(1, "Nissan Altima");
        System.out.println(newCars);   // out put is now [Tesla, Nissan, Ford, Toyota]
        newCars.remove("Ford Bronco");
        System.out.println(newCars); //output is now [Tesla, Nissan, Toyota]
        System.out.println(newCars.get(1)); //outputs 1 element: Nissan Altima

        List<Vehicle> newVehicles = new ArrayList<>(); //new Object using the Vehicle Class and the Constructor
        newVehicles.add(new Vehicle("Tesla", "CRX"));
        System.out.println(newVehicles.get(0).getMake()); // get specific info from the array list (0) is the # in the arrayList, then getMake()- what ever info you need to pull.

        // ERROR HANDLING - an error in run time - Try/Catch, Throw, Throws, Finally
             // you can have more than one catch
             //use the AttendeeManager, Attendee and the InvalidIDNumberException for this example.
        AttendeeManager newManager = new AttendeeManager();

        try {
            newManager.createByID("12345678");
            throw new InvalidIDNumberException("Error creating AttendeeManger, Invalid ID Number");
        } catch (InvalidIDNumberException ex) {
            ex.printStackTrace();
        }


        // OBJECTS

        // CLASSES

        // INTERFACES - Make a new class with Interface instead of Java.
             // subclassName IMPLEMENTS SuperclassName. Contract on the Superclass that must be filled by subclasses
             // Uses BLANK METHODS - void mover(); - this will not return anything...or int mover(); - this will return an int.
             // See more on Mover Interface
        Trucks newTruck = new Trucks ("Ford", "F-150", "4 wheel drive", 120);
        newTruck.describeCar();
        newTruck.mover();

        // INHERITANCE - extends common methods and variables to multiple subclasses
             // subclass EXTENDS superclassname.
             // see more on TRUCKS Class
    }
}
