/*
 *      ASSIGNMENT # 2
 *      1. Use a while loop to print your FIRSTNAME three times.
 *	    2. Use a do-while loop to print your MIDDLENAME four times.
 *	    3. Use a for loop to print your SURNAME five times.
 *	    4. Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)
 *	    5. Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)
 *	    6. Rename your java file as assignment2.java
 *	    7. Upload the java file into your github assigment repository CCPRGG1L_ASSIGNMENT_INF224.
 */
public class Assignment2 {
    
    public static void main(String[] args) {
        // PROBLEM 1
        int count = 0;
        while (count != 3) {
            System.out.println("Russel");
            count++;
        }

        // PROBLEM 2
        int num = 0;
        do {
            System.out.println("Gratil");
            num++;
        } while (num != 4);

        // PROBLEM 3
        for (int i = 0; i < 5; i++) {
            System.out.println("Rapi");
        }
        
        // PROBLEM 4
        char[] firstName = {'R', 'U', 'S', 'S', 'E', 'L'};
        for (int x = 0; x < 6; x++) {
            System.out.print(firstName[x]);
        }

        System.out.println();
        
        // PROBLEM 5
        for (int n = 5; n >= 0; n--) {
            System.out.print(firstName[n]);
        }
    }
}
