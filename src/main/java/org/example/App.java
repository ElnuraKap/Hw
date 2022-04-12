package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        AutoBase.autoBase();
        AutoDriver.autoDriver();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Выберите трак от 1 до 3");
            String input = sc.nextLine();
            int id = Integer.parseInt(input);
            switch (id) {
                case 1:
                    System.out.println("N: " + 1);
                    System.out.println("Bus: " + "RENAULT_MAGNUM");
                    System.out.println("Driver: " + "Sasha");
                    System.out.println("Bus State: " + State.BASE);
                    break;
                case 2:
                    System.out.println("N: " + 2);
                    System.out.println("Bus: " + " VOLVO_FH12");
                    System.out.println("Driver: " + "Petya");
                    System.out.println("Bus State: " + State.BASE);
                    break;
                case 3:
                    System.out.println("N: " + 3);
                    System.out.println("Bus: " + "DAF_XT");
                    System.out.println("Driver: " + "Vasya");
                    System.out.println("Bus State: " + State.BASE);
                    break;
                    default:
                    System.out.println("Неверный id");
            }
            try {
                Truck truck = new Truck();
                System.out.println("Введите новое состояние трака (BASE, ROUT, REPAIR)");
                String state = sc.nextLine();
                truck.changeState(state);
                truck.changeDriver();
                truck.startDriving();
                truck.startRepair();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }



}

