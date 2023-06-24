package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int succsessRate = Arrays.stream(arr).sum();
        System.out.println("Choose:\n1.Enter user\n2.Enter admin");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("1. Past Simple - is\na)a\nb)b\nc)c\nd)d");
                    Scanner scanner2 = new Scanner(System.in);
                    if(scanner2.nextLine() == "a"){
                        System.out.println("2. Past Simple - is\na)a\nb)b\nc)c\nd)d");
                        Scanner scanner3 = new Scanner(System.in);
                        if(scanner3.nextLine() == "a"){
                            System.out.println("3. Past Simple - is\na)a\nb)b\nc)c\nd)d");
                            Scanner scanner4 = new Scanner(System.in);
                            if(scanner4.nextLine() == "a"){
                                System.out.println("4. Past Simple - is\na)a\nb)b\nc)c\nd)d");
                                Scanner scanner5 = new Scanner(System.in);
                                if(scanner5.nextLine() == "a"){
                                    System.out.println("5. Past Simple - is\na)a\nb)b\nc)c\nd)d");
                                    Scanner scanner6 = new Scanner(System.in);
                                    if(scanner6.nextLine() == "a"){
                                        System.out.println("You Win");
                                    }else if(scanner6.nextLine() == "q"){
                                        break;
                                    }else if(scanner6.nextLine() == "b" || scanner6.nextLine() == "c" || scanner6.nextLine() == "d"){
                                        arr[4] = 25;
                                    }
                                }else if(scanner5.nextLine() == "q"){
                                    break;
                                }else if(scanner5.nextLine() == "b" || scanner5.nextLine() == "c" || scanner5.nextLine() == "d"){
                                    arr[3] = 25;
                                }
                            }else if(scanner4.nextLine() == "q"){
                                break;
                            }else if(scanner4.nextLine() == "b" || scanner4.nextLine() == "c" || scanner4.nextLine() == "d"){
                                arr[2] = 25;
                            }
                        }else if(scanner3.nextLine() == "q"){
                            break;
                        }else if(scanner3.nextLine() == "b" || scanner3.nextLine() == "c" || scanner3.nextLine() == "d"){
                            arr[1] = 25;
                        }
                    }else if(scanner2.nextLine() == "q"){
                        break;
                    }else if(scanner2.nextLine() == "b" || scanner2.nextLine() == "c" || scanner2.nextLine() == "d"){
                        arr[0] = 25;
                    }
                    break;
                case 2:
                    System.out.println("Enter password");
                    Scanner scanner1 = new Scanner(System.in);
                    if(scanner1.nextInt() == 1111){
                        System.out.println("SuccsessRate = " + succsessRate + " %");
                    }
            }
        }
    }

}
