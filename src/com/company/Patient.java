package com.company;

import java.nio.*;
import java.util.*;
import java.time.*;
import java.io.*;  // Import the File class

public class Patient extends Center {
//  int patientID;

    //String patientName;
    //String patientAddress;
    //int patientTel_num;
    public void createPatient() {
        System.out.println("Enter Full Name");
        Scanner patientname = new Scanner(System.in);  // Input to Identify the patient history
        String patient_Name = patientname.nextLine();  // Read user input
        System.out.println("Enter your Address");
        String patient_Address = patientname.nextLine();  // Read user input
        System.out.println("Enter your phone number");
        int patientTel_num = patientname.nextInt();
        patientDataStorage(patient_Name,patient_Address,patientTel_num);
    }

    public void validatingPatient() {
        Scanner patientUserID = new Scanner(System.in);
        int patientID = patientUserID.nextInt();
        patientDataCheck(patientID,"Patient_Record.csv");
    }
    public void visitor() {
        System.out.println("Book Consultation");
        System.out.println("Enter Full Name");
        Scanner vname = new Scanner(System.in);  // Input to Identify the patient history
        String visitor_Name = vname.nextLine();  // Read user input
        Physician vObj=new Physician();
        vObj.visitorBookingOpt("V",visitor_Name);

    }
}
