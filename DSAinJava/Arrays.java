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
    public static void main(String[] args)
    {
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

        //--------------------------Inserting an Element in an Array--------------------------
        /**Inserting an element in an array refers to the operation of adding an element
         * to the array.
         * Insertion in arrays can be done in three ways:
         * (a) Insertion at the beginning
         * (b) Insertion at a specified position
         * (c) Insertion at the end
         */

        //Insertion at the beginning
        /**We assume ARR is an array with N elements in it. The maximum elements
         that can be stored in the array is defined by SIZE. We should first check if
         the array has an empty space available to store any element in it or not, and
         then we proceed with the insertion process.
         Step 1:START
         Step 2:IF N = SIZE,
         Print OVERFLOW
         ELSE
         N = N + 1
         Step 3:SET I = N
         Step 4:Repeat Step 5 while I>=0
         Step 5:SET ARR[I+1] = ARR[I]
         [ END OF LOOP ]
         Step 6:SET ARR[0] = New_Element
         Step 7:EXIT
         */

        //Insertion at a specified position
        /**In order to insert a new element in the array, the previously stored
         elements in the array must move one place forward from their current place
         until the element at the specified position is reached.
         Step 1:START
         Step 2:IF N = SIZE,
         Print OVERFLOW
         ELSE
         N = N + 1
         Step 3:SET I = N
         Step 4:Repeat Step 5 while I>=POS
         Step 5:SET ARR[I+1] = ARR[I]
         [ END OF LOOP ]
         Step 6:SET ARR[POS] = New_Element
         Step 7:EXIT
         */
        //Insertion at the end
        /**In this case the new element to be inserted
         is inserted at the end of the array. So, there is no need for swapping the
         elements in this case.
         Step 1:START
         Step 2:IF N = SIZE,
         Print OVERFLOW
         ELSE
         N = N + 1
         Step 3:SET ARR[N] = New_Element
         Step 4:EXIT
         */
        //Example code for all the cases of Insertion

                Scanner scn1= new Scanner(System.in);
                int[] arr = new int[10];
                System.out.println("Enter the number of elements in array:");
                int n = scn1.nextInt();
                System.out.println("Enter the elements of array:");
                for (int i = 0; i < n; i++) {
                    arr[i] = scn1.nextInt();
                }
                System.out.println("***MENU***");
                System.out.println("1. Insertion from beginning");
                System.out.println("2. Insertion from specified location");
                System.out.println("3. Insertion from end");
                System.out.println("Enter your choice:");
                int choice = scn1.nextInt();
                int value = 0;
                if (n == 10) {
                    System.out.println("Overflow error");
                } else {
                    switch (choice) {
                        case 1:
                            for (int i = n - 1; i >= 0; i--) {
                                arr[i + 1] = arr[i];
                            }
                            System.out.println("Enter new value:");
                            value = scn1.nextInt();
                            arr[0] = value;
                            System.out.println("After insertion array is");
                            for (int i = 0; i <= n; i++) {
                                System.out.print(arr[i] + "\t");
                            }
                            break;
                        case 2:
                            System.out.println("Enter position");
                            int pos = scn1.nextInt();
                            for (int i = n - 1; i >= pos - 1; i--) {
                                arr[i + 1] = arr[i];
                            }

                            System.out.println("Enter new value:");
                            value = scn1.nextInt();
                            arr[pos - 1] = value;
                            System.out.println("After insertion array is");
                            for (int i = 0; i <= n; i++) {
                                System.out.print(arr[i] + "\t");
                            }
                            break;
                        case 3:
                            System.out.println("Enter new value:");
                            value = scn1.nextInt();
                            arr[n] = value;
                            System.out.println("After insertion array is");
                            for (int i = 0; i <= n; i++) {
                                System.out.print(arr[i] + "\t");
                            }
                            break;
                        default:
                            System.out.println("Wrong Choice");
                            break;
                    }
                }
    }
}








