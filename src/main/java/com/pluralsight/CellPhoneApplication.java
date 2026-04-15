package com.pluralsight;

import java.util.Scanner;
import com.pluralsight.CellPhone;

public class CellPhoneApplication 
{
    public static void display(CellPhone cellPhone) {
        System.out.println(cellPhone);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = CellPhone.createCellPhone(scanner);
        CellPhone cellPhone2 = CellPhone.createCellPhone(scanner);

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        scanner.close();
    }
}
