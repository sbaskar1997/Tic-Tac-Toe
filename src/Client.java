import java.util.Scanner;

/**
 * Created by Sandeep on 11/30/2015.
 */
public class Client {
    public void play() {
        Scanner numbers = new Scanner(System.in);
        Scanner nonnumbers = new Scanner(System.in);
        System.out.println("Creating board...");
        CreateBoard cb = new CreateBoard();
        Action a = new Action(cb.getMatrix());
        boolean x = true;
        boolean check = new Check().check(cb.getMatrix());
        boolean quit = false;
        int counter = 0;
        int ab = -1;
        while (!quit) {
            boolean validChoice = false;
            while (!validChoice) {
                if (counter == 0) {
                    if (x) {
                        System.out.println("Player x, would you like to 1) Add Piece or 2) Print board 3) Exit");
                    } else {
                        System.out.println("Player o, would you like to 1) Add Piece or 2) Print board 3) Exit");
                    }
                    ab = numbers.nextInt();
                }
                if (ab == 1) {
                    validChoice = true;
                    while (!check) {
                        if (counter != 0) {
                            if (x) {
                                System.out.println("Player x, would you like to 1) Add Piece or 2) Print board 3) Exit");
                            } else {
                                System.out.println("Player o, would you like to 1) Add Piece or 2) Print board 3) Exit");
                            }
                            ab = numbers.nextInt();
                        }
                        counter++;
                        if (ab == 2 || ab == 3) {
                            break;
                        }
                        if (x) {
                            System.out.println("Player x");
                        } else {
                            System.out.println("Player o");
                        }
                        System.out.println("Row?: ");
                        int row = numbers.nextInt();
                        System.out.println("Column?: ");
                        int column = numbers.nextInt();
                        boolean checker = true;
                        try {
                            while (row < 0 || row >= 3 || column < 0 || column >= 3) {
                                System.out.println("That isn't valid");
                                System.out.println("Row?: ");
                                row = numbers.nextInt();
                                System.out.println("Column?: ");
                                column = numbers.nextInt();
                                if (a.contains(row, column)) {
                                    System.out.println("Element exists");
                                    checker = false;
                                }

                            }
                            if (checker) {
                                if (x) {
                                    a.addX(row, column);
                                    x = false;
                                } else {
                                    a.addO(row, column);
                                    x = true;
                                }
                            }
                            check = new Check().check(cb.getMatrix());
                        } catch (ElementExistsException eee) {
                            System.out.println("That spot is occupied");
                            continue;
                        }
                    }

                } else if (ab == 2) {
                    validChoice = true;
                    System.out.println(a.printBoard());
                    counter = 0;
                } else if (ab == 3) {
                    validChoice = true;
                    quit = true;
                    System.out.println("Thanks for playing!");
                }
                check = true;
                if (check) {
                    quit = true;
                }

            }
        }
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.play();
    }
}
