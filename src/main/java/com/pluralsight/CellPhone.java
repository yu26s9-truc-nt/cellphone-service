package com.pluralsight;

import java.util.Scanner;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {
        return "Serial Number: " + this.serialNumber + "\n" +
               "Model: " + this.model + "\n" +
               "Carrier: " + this.carrier + "\n" +
               "Phone Number: " + this.phoneNumber + "\n" +
               "Owner: " + this.owner;
    }

    public void dial(String phoneNumber) {
        System.out.printf("%s's phone is calling %s\n", this.owner, phoneNumber);
    }

    public static CellPhone createCellPhone(Scanner scanner) {
        CellPhone cellPhone = new CellPhone();
        System.out.print("What is the serial number? ");
        cellPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("What model is the phone? ");
        cellPhone.setModel(scanner.nextLine());
        System.out.print("Who is the carrier? ");
        cellPhone.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number? ");
        cellPhone.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone? ");
        cellPhone.setOwner(scanner.nextLine());
        return cellPhone;
    }
}
