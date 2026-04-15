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

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
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

    public void dial(CellPhone phone) {
        System.out.printf("%s's phone is calling %s\n", this.owner, phone.getPhoneNumber());
    }

    public static CellPhone createCellPhone(Scanner scanner) {
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        CellPhone cellPhone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
        return cellPhone;
    }
}
