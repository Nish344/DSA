import java.util.Scanner;

/**
 * Good Program - which runs correctly, occupies less space in memory, and takes less time to run.
 *
 * An array (Linear data) is a collection of homogeneous (similar) types of data elements in
 * contiguous memory.
 *
 * Data is stored in successive memory locations and is identified by an index number.
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /**---------------------------DECLARATION----------------------------------------
         * Syntax ==> data_type [] array_name = new data_type[size];
         */
        int[] SalaryEmp = new int[10];    //Example for array Declaration

        /**----------------------------INITIALIZATION-----------------------------------
         * Initialization during compile time:
         * Compiler will automatically allocate memory for all initialized elements in the array.
         * If the number of elements is less than the size provided, then such elements will take zero as the null value.
         * This default value depends on the datatype: for int it's 0, for boolean it's false, etc.
         */
        int[] age = {2, 5, 6, 1, 3, 2, 4, 5};  // Example for array initialization during compile time

        //-------------------------Initialization during runtime-----------------------
        int[] Salary1 = new int[10];
        System.out.println("Enter 10 salaries:");
        for (int i = 0; i < Salary1.length; i++) {
            Salary1[i] = scn.nextInt();
        }

        System.out.print("Salaries entered: ");
        for (int i = 0; i < Salary1.length; i++) {
            System.out.print(Salary1[i] + " ");
        }
        System.out.println();

        /**----------------------------OPERATIONS ON ARRAY----------------------------------
         * Traversing an Array
         * Inserting an element
         * Deleting an element
         * Searching an element
         * Merging two arrays
         * Sorting an array
         */

        //---------------------------------Traversing an Array-------------------------------
        /** Traversing an array means accessing every element in an array exactly once
         * so that it can be processed.
         */
        int[] traverse = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < traverse.length; i++) {
            traverse[i] = scn.nextInt();
        }

        System.out.println("The array elements are:");
        for (int i = 0; i < traverse.length; i++) {
            System.out.println(traverse[i]);
        }

        // Close the Scanner object
        scn.close();
    }
}

