package main.java;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        /*
        * Public - access specifier to access the method globally
        * static - keyword to invoke this method without instantiating the class
        * void   - keyword that represent that the method does not return anything
        * main   - indentifier that looks for the starting point of java
        * args   - stores command line arguments of java
         */
        System.out.print("Printing in java");

        int a = 10;
        double d = 10.234;

        // Typecasting

        int x = (int) d;
        double t = a;

        System.out.println("x: " + x + "\n t: " + t );

        // Loops
        int i = 0;
        System.out.println("While");
        while(i < 10){
            i++;
            System.out.println(i);
        }

        System.out.println("For each");
        int [] lt = {1,2,3,4,5};
        for(int l:lt){
            System.out.println(l);
        }

        System.out.println("do while");
        do{
            i++;
            System.out.println(i);
        }while(i<10);

        // Conditional
        Scanner sc = new Scanner(System.in); // User input
        // int num = sc.nextInt(15);
        // radix is the base number to parse any int
        // Example :
        // here since radix is 15 if the input value is 11 that actual input will be parsed as 1*15^1 + 1*15^0 = 16


        // System.out.println("Input number : " + num);
        // Input number is 16 for input value 11

        // Taking input
        // We cannot user nextLine after nextInt : https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);

        // Consuming the leftover new line
        // using the nextLine() method
        sc.nextLine();

        // reading the complete line for the integer
        // and converting it to an integer
        int age = Integer.parseInt(sc.nextLine());

        String fatherName = sc.nextLine();
        String motherName = sc.nextLine();

        // Print the values to check
        // if the input was correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Father's Name: "
                + fatherName);
        System.out.println("Mother's Name: "
                + motherName);

        sc.close();

        // Scanner delimiter

        //using regex to read only integers from a string source
        String data = "1a2b345c67d8,9#10";
        Scanner sc1 = new Scanner(data);

        // setting non-digit regex as delimiter
        sc1.useDelimiter("\\D");

        while(sc1.hasNext()) {
            System.out.println(sc1.next());
        }

        // don't forget to close the scanner
        sc1.close();





    }
}
