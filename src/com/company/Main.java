package com.company;

import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Start();
    }

    public static void Start() {
        System.out.println("Welcome to PSIC System");
        System.out.println("Select Your Option");
        System.out.println("Press 1 for Admin");
        System.out.println("Press 2 for Visitor");
        System.out.println("Press 3 for Patient");
        Scanner mainMenu = new Scanner(System.in);  // Input to Identify the user type
        int mainMenu_option = mainMenu.nextInt();  // Read user input
        if (mainMenu_option == 1) {
            System.out.println("Welcome to Admin Portal");
            System.out.println("Press 1 for Patient Treatment Reports ");
            System.out.println("Press 2 for Overall Reports");
            System.out.println("Press 0 to Go Back");
            Scanner admin = new Scanner(System.in);  // Input to Identify the patient history
            int admin_record = admin.nextInt();  // Read user input
            if (admin_record == 1) {
                Center recordAccess = new Center();
                recordAccess.DataReader("patient_reports.csv");
            } else if (admin_record == 2) {
                Center recordAccess = new Center();
                recordAccess.DataReader("reports.csv");
            } else if (admin_record == 0) {
                Start();
            }
        } else if (mainMenu_option == 2) {
            System.out.println("Welcome to Visitor Portal");
            System.out.println("Press 1 to Book Consultation");
            System.out.println("Press 0 to Go Back");
            Scanner admin = new Scanner(System.in);  // Input to Identify the patient history
            int admin_record = admin.nextInt();
            if (admin_record == 1) {
                Patient newPatient = new Patient();
                newPatient.visitor();
            } else if (admin_record == 0) {
                Start();
            } else {
                System.out.println("Please Select the Right Option");
            }
        } else if (mainMenu_option == 3) {
            System.out.println("Welcome to Patient Portal");
            System.out.println("Press 1 for New Patient");
            System.out.println("Press 2 for Existing Patient");
            System.out.println("Press 0 to Go Back");
            Scanner patient = new Scanner(System.in);  // Input to Identify the patient history
            int patient_record = patient.nextInt();  // Read user input
            if (patient_record == 1) {
                Patient newPatient = new Patient();
                newPatient.createPatient();
            } else if (patient_record == 2) {
                System.out.println("Enter Patient ID");
                Patient newPatient = new Patient();
                newPatient.validatingPatient();

            } else if (patient_record == 0) {
                Start();
            } else {
                System.out.println("Please Select the Right Option");
            }

        }
//        else if(mainMenu_option==4){
//            System.out.println("Welcome to Physician Portal");
//
//        }
        else {
            System.out.println("Please Select the Right Option");
        }
    }
}
