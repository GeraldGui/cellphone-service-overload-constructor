package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        // Ask user for serial number
        System.out.print("What is the serial number for the first phone? ");
        long serialNumber1 = myObj.nextLong();
        myObj.nextLine();

        // Ask user for model of phone1
        System.out.print("What model is the phone for the first phone? ");
        String model1 = myObj.nextLine();

        // Ask user for carrier
        System.out.print("Who is the carrier for the first phone? ");
        String carrier1 = myObj.nextLine();

        // Ask user for phone1 number
        System.out.print("What is the phone number for the first phone? ");
        String phoneNumber1 = myObj.nextLine();

        // Ask user who is owner of phone1
        System.out.print("Who is the owner of the phone for the first phone? ");
        String owner1 = myObj.nextLine();

        CellPhone phone1= new CellPhone();

        // Sets all the variables
        phone1.setSerialNumber(serialNumber1);
        phone1.setModel(model1);
        phone1.setCarrier(carrier1);
        phone1.setPhoneNumber(phoneNumber1);
        phone1.setOwner(owner1);

        CellPhone phone2 = new CellPhone();

        System.out.print("\nWhat is the serial number for the second phone? ");
        long serialNumber2 = myObj.nextLong();
        myObj.nextLine();

        // Ask user for model of phone1
        System.out.print("What model is the phone for the second phone? ");
        String model2 = myObj.nextLine();

        // Ask user for carrier
        System.out.print("Who is the carrier for the second phone? ");
        String carrier2 = myObj.nextLine();

        // Ask user for phone1 number
        System.out.print("What is the phone number for the second phone? ");
        String phoneNumber2 = myObj.nextLine();

        // Ask user who is owner of phone1
        System.out.print("Who is the owner of the phone for the second phone? ");
        String owner2 = myObj.nextLine();

        // Sets all the variables
        phone2.setSerialNumber(serialNumber2);
        phone2.setModel(model2);
        phone2.setCarrier(carrier2);
        phone2.setPhoneNumber(phoneNumber2);
        phone2.setOwner(owner2);

        System.out.print("\nWhat is the serial number for the third phone? ");
        long serialNumber3 = myObj.nextLong();
        myObj.nextLine();

        // Ask user for model of phone1
        System.out.print("What model is the phone for the third phone? ");
        String model3 = myObj.nextLine();

        // Ask user for carrier
        System.out.print("Who is the carrier for the third phone? ");
        String carrier3 = myObj.nextLine();

        // Ask user for phone1 number
        System.out.print("What is the phone number for the third phone? ");
        String phoneNumber3 = myObj.nextLine();

        // Ask user who is owner of phone1
        System.out.print("Who is the owner of the phone for the third phone? ");
        String owner3 = myObj.nextLine();

        CellPhone phone3 = new CellPhone(serialNumber3, model3, carrier3, phoneNumber3, owner3);

        // Sets all the variables
        phone3.setSerialNumber(serialNumber3);
        phone3.setModel(model3);
        phone3.setCarrier(carrier3);
        phone3.setPhoneNumber(phoneNumber3);
        phone3.setOwner(owner3);


        display(phone1, phone2, phone3);

        // Close Scanner
        myObj.close();
    }

    public static void display (CellPhone phone1, CellPhone phone2, CellPhone phone3) {
        StringBuilder builder = new StringBuilder();

        // Initiates the while loop
        int i = 0;

        // While loop to keep going until i is more than 1
        while (i < 3) {
            if (i == 0) {
                // StringBuilder to take less space
                builder.append("\nSerialNumber: ").append(phone1.getSerialNumber());
                builder.append("\nModel: ").append(phone1.getModel());
                builder.append("\nCarrier: ").append(phone1.getCarrier());
                builder.append("\nPhone number: ").append(phone1.getPhoneNumber());
                builder.append("\nOwner: ").append(phone1.getOwner());

                System.out.println(builder);

                phone1.dial("\n" + phone2.getPhoneNumber());
                builder.setLength(0);
            }
            else if (i == 1) {
                // StringBuilder to take less space
                builder.append("\nSerialNumber: ").append(phone2.getSerialNumber());
                builder.append("\nModel: ").append(phone2.getModel());
                builder.append("\nCarrier: ").append(phone2.getCarrier());
                builder.append("\nPhone number: ").append(phone2.getPhoneNumber());
                builder.append("\nOwner: ").append(phone2.getOwner());

                System.out.println(builder);

                phone2.dial("\n" + phone1.getPhoneNumber());
                builder.setLength(0);
            }
            else {
                // StringBuilder to take less space
                builder.append("\nSerialNumber: ").append(phone3.getSerialNumber());
                builder.append("\nModel: ").append(phone3.getModel());
                builder.append("\nCarrier: ").append(phone3.getCarrier());
                builder.append("\nPhone number: ").append(phone3.getPhoneNumber());
                builder.append("\nOwner: ").append(phone3.getOwner());

                System.out.println(builder);

                // Random for the third phone to call phone1 or phone 2
                int min = 1;
                int max = 10;
                Random ran = new Random();
                int random = ran.nextInt(max - min + 1) + min;

                System.out.println();
                phone3.dial((random < 6 ? phone1 : phone2));

            }
            // Add 1 to i after
            i++;
        }
    }
}
