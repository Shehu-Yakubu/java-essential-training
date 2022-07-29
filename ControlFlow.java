import java.time.LocalDateTime;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        /* IF CONDITIONALS
            // var scanner = new Scanner(System.in);
            // System.out.print("Enter a month number (1-12): ");
            // var monthNumber = scanner.nextInt();

            // var now = LocalDateTime.now();
            // var monthNumber = now.getMonthValue();

            // String message;
            // if (monthNumber < 1 || monthNumber > 12) {
                // message = "That isn't a valid month!";
            // } else
            
            if (monthNumber <= 3) {
                message = "That's in Quarter 1!";
            } else if (monthNumber <= 3) {
                message = "That's in Quarter 2!";
            } else {
                message = "That's in the first half of the year!";
            }
            System.out.println(message);
        */
        
        /* SWITCH STATEMENT */
        /*
            var now = LocalDateTime.now();
            var monthNumber = now.getMonthValue();

            switch (monthNumber) {
                case 1: 
                    System.out.println("The month is January");
                    break;
                case 2:
                    System.out.println("The month is February");
                    break;
                case 3:
                    System.out.println("The month is March");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("It's the 4th quarter");
                    break;
                default:
                    System.out.println("You chose another month");
            }
        */

        /* LOOPING */
        String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        };
        /*for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }*/
        // Enhance for loop (foreach loop)
        /*for (var month : months) {
            System.out.println(month);
        }*/

        /* WHILE LOOP */
        /*var whileCounter = 0;
        while (whileCounter < months.length) {
            System.out.println(months[whileCounter]);
            whileCounter++;
        }*/

        /* DO WHILE LOOP */
        var doCounter = 0;
        do {
            System.out.println(months[doCounter]);
            doCounter++;
        } while(doCounter < months.length);
    }
}