// 4. Take time (hours and minutes) and print the smaller angle between the hour and minute hands

package Phase_1.Level_5;
import java.util.Scanner;

public class CalculateClockAngle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0-23) = ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes (0-59) = ");
        int minutes = sc.nextInt();

        // Input validation
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid time input");
        } else {

            // Convert 24-hour format to 12-hour format
            hours = hours % 12;

            // Calculate angles
            double hourAngle = (hours * 30) + (minutes * 0.5);
            double minuteAngle = minutes * 6;

            // Find absolute difference
            double angle = Math.abs(hourAngle - minuteAngle);

            // Find the smaller angle
            double smallerAngle = Math.min(angle, 360 - angle);

            System.out.println("Smaller angle between hands = " + smallerAngle + " degrees");
        }

        sc.close();
    }
}


// 🧠 CONCEPT EXPLANATION
// 🔹 1. Why hours % 12?

// An analog clock has only 12 hours.

// 13 → 1

// 14 → 2

// 23 → 11

// So:

// hours = hours % 12;

// 🔹 2. Why hour hand moves with minutes?

// Hour hand is not fixed.

// Moves 30° per hour

// Moves 0.5° per minute

// So:

// hourAngle = (hours * 30) + (minutes * 0.5);

// 🔹 3. Why minute hand angle = minutes * 6?

// Full circle = 360°

// 60 minutes → 360°

// So:

// 360 / 60 = 6 degrees per minute

// 🔹 4. Why absolute difference?

// Angle can’t be negative.

// angle = |hourAngle − minuteAngle|

// 🔹 5. Why min(angle, 360 - angle)?

// Clock has two angles between hands:

// One clockwise

// One counter-clockwise

// We need the smaller one.

// 🧪 Example Dry Run
// Input:
// 3 30


// Calculation:

// Hour angle = 3×30 + 30×0.5 = 105°

// Minute angle = 30×6 = 180°

// Difference = 75°

// Smaller angle = 75°

// ✅ Output: 75 degrees

// 🔑 ONE-LINE MEMORY RULE

// Hour hand = 30° per hour + 0.5° per minute
// Minute hand = 6° per minute