/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package office.management.challenge;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Scanner;

public class App {

    static Office office = new Office();
    static Integer userChoice;

    public static void main(String[] args) {

        String mainMenu = ("Select a choice from the menu: \n" + "1. Add a room\n" + "2. See all rooms\n"
                + "3. See available rooms\n" + "4. Enter a room\n" + "5. Leave a room\n" + "6. Exit\n");

        do {
            System.out.println(App.getGreeting());
            System.out.println(mainMenu);
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();

            switch (userChoice) {
            case 1:
                App.displayAddRoomOption();
                break;
            case 2:
                if (office.spaces.isEmpty()) {
                    System.out.println("You have no spaces to see\n");
                } else {
                    App.displayAllRooms();
                }
                break;
            case 3:
                App.displayAvailableRooms();
                break;
            case 6:
                System.exit(0);
                break;
            }
        } while (userChoice != 0);

    }

    public static String getGreeting() {
        return "Welcome to your office management app!\n";
    }

    public static Character displayReturnPrompt() {
        System.out.println("Press x to return to the main menu:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static Character displayAddRoomOption() {
        System.out.println("Enter a name for your room");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        office.addRoom(new MeetingRoom(name));
        Character response = App.displayReturnPrompt();
        return response;
    }

    public static Character displayAllRooms() {
        Enumeration<MeetingRoom> e = Collections.enumeration(office.spaces);

        System.out.println("Your meeting rooms: ");
        while (e.hasMoreElements()) {
            MeetingRoom currentItem = e.nextElement();
            String line = String.format(" * %s", currentItem.name);
            System.out.println(line);
        }
        Character response = App.displayReturnPrompt();
        return response;
    }

    public static Character displayAvailableRooms() {
        Enumeration<String> e = Collections.enumeration(office.getAvailableRooms());

        System.out.println("Available rooms: ");
        while (e.hasMoreElements()) {
            String currentItem = e.nextElement();
            String line = String.format(" * %s", currentItem);
            System.out.println(line);
        }

        Character response = App.displayReturnPrompt();
        return response;
    }
}
