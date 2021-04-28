package com.company;

import java.nio.*;
import java.util.*;
import java.time.*;
import java.io.*;

import static com.company.Main.Start;
import static com.company.Main.patient;

public class Physician extends Center {
    int bOption;
    int drSelect;
    int weekN;
    int dayN;

    public void patientBookingOpt(String p_id, String p_name) {
        System.out.println("Book your Appointment");
        System.out.println("Press 1 to Search by Physician");
        System.out.println("Press 2 to Search by Expertise");
        System.out.println("Press 0 to Go Back");

        Scanner bookOption = new Scanner(System.in);  // Input to Identify the patient history
        this.bOption = bookOption.nextInt();  // Read user input
        if (bOption == 1) {
            System.out.println("Press 1 for Dr. Ali");
            System.out.println("Press 2 for Dr. Rasthana");
            System.out.println("Press 3 for Dr. Murli Parsad Sharma");
            System.out.println("Press 4 for Dr. Samuel Martin");
            System.out.println("Press 5 for Dr. Katherine");
            System.out.println("Press 0 to Go Back");
            Scanner drChoice = new Scanner(System.in);
            this.drSelect = drChoice.nextInt();  // Read user input
            if (drSelect == 1) {
                String[] d1Data = {"1", "Dr.Ali", "Neural mobilisation", "123456789", "N.M Ward"};
                System.out.println("Book Appointment");
                selectDoctor(d1Data, p_id, p_name);
            } else if (drSelect == 2) {
                String[] d2Data = {"2", "Dr.Rasthana", "Acupuncture", "123456789", "Acupunture Ward"};
                System.out.println("Book Appointment");
                selectDoctor(d2Data, p_id, p_name);
            } else if (drSelect == 3) {
                String[] d3Data = {"3", "Dr.M.P Sharma", "Pool Rehabilitation", "123456789", "Swimming Pool"};
                System.out.println("Book Appointment");
                selectDoctor(d3Data, p_id, p_name);
            } else if (drSelect == 4) {
                String[] d4Data = {"4", "Dr.Steve Ellison", "Massage", "123456789", "Massage Room"};
                System.out.println("Book Appointment");
                selectDoctor(d4Data, p_id, p_name);
            } else if (drSelect == 5) {
                String[] d5Data = {"5", "Dr.Susan Kate", "Mobilisation", "123456789", "General Ward"};
                System.out.println("Book Appointment");
                selectDoctor(d5Data, p_id, p_name);
            } else if (drSelect == 0) {
                patientBookingOpt(p_id, p_name);
            } else {
                System.out.println("Wrong Option");
            }
        } else if (bOption == 2) {
            System.out.println("Press 1 for Neural mobilisation");
            System.out.println("Press 2 for Acupuncture");
            System.out.println("Press 3 for Massage");
            System.out.println("Press 4 for Mobilisation of the spine and joints");
            System.out.println("Press 5 for Pool Rehabilitation");
            System.out.println("Press 0 to Go Back");
            Scanner AoEChoice = new Scanner(System.in);
            this.drSelect = AoEChoice.nextInt();  // Read user input
            if (drSelect == 1) {
                String[] d1Data = {"1", "Dr.Ali", "Neural mobilisation", "123456789", "N.M Ward"};
                System.out.println("Book Appointment");
                selectDoctor(d1Data, p_id, p_name);
            } else if (drSelect == 2) {
                String[] d2Data = {"2", "Dr.Rasthana", "Acupuncture", "123456789", "Acupunture Ward"};
                System.out.println("Book Appointment");
                selectDoctor(d2Data, p_id, p_name);
            } else if (drSelect == 3) {
                String[] d3Data = {"3", "Dr.M.P Sharma", "Pool Rehabilitation", "123456789", "Swimming Pool"};
                System.out.println("Book Appointment");
                selectDoctor(d3Data, p_id, p_name);
            } else if (drSelect == 4) {
                String[] d4Data = {"4", "Dr.Steve Ellison", "Massage", "123456789", "Massage Room"};
                System.out.println("Book Appointment");
                selectDoctor(d4Data, p_id, p_name);
            } else if (drSelect == 5) {
                String[] d5Data = {"5", "Dr.Susan Kate", "Mobilisation ", "123456789", "General Ward"};
                System.out.println("Book Appointment");
                selectDoctor(d5Data, p_id, p_name);
            } else if (drSelect == 0) {
                patientBookingOpt(p_id, p_name);
            } else {
                System.out.println("Wrong Option");
            }
        } else if (bOption == 0) {
            patient();
        } else {
            System.out.println("Invalid Option");
        }
    }

    public void selectDoctor(String[] option, String p_id, String p_name) {
        System.out.println("Select Week (1 or 2 or 3 or 4)");
        System.out.println("Press 0 to Go Back");
        Scanner weekSelect = new Scanner(System.in);
        this.weekN = weekSelect.nextInt();
        if (weekN == 1) {
            System.out.println("Select Appointment");
            System.out.println("Press 1 for Monday, 1PM to 3PM");
            System.out.println("Press 2 for Tuesday, 6PM to 8PM");
            System.out.println("Press 3 for Wednesday,8AM to 10AM");
            System.out.println("Press 4 for Thursday,4PM to 5PM");
            System.out.println("Press 0 to Go Back");
            Scanner daySelect = new Scanner(System.in);
            this.dayN = daySelect.nextInt();
            if (dayN == 1) {
                String apB = "Monday 1PM to 3PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 2) {
                String apB = "Tuesday 6PM to 8PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 3) {
                String apB = "Wednesday  8AM to 10AM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 4) {
                String apB = "Thursday  4PM to 5PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 0) {
                selectDoctor(option, p_id, p_name);
            } else {
                System.out.println("Wrong Day Selected");
            }
        } else if (weekN == 2) {
            System.out.println("Select Appointment");
            System.out.println("Press 1 for Monday, 6PM to 8PM");
            System.out.println("Press 2 for Tuesday, 1PM to 3PM");
            System.out.println("Press 3 for Wednesday,4PM to 5PM");
            System.out.println("Press 4 for Thursday,8AM to 10AM");
            System.out.println("Press 0 to Go Back");
            Scanner daySelect = new Scanner(System.in);
            this.dayN = weekSelect.nextInt();
            if (dayN == 1) {
                String apB = "Monday  6PM to 8PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 2) {
                String apB = "Tuesday  1PM to 3PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 3) {
                String apB = "Wednesday  4PM to 5PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 4) {
                String apB = "Thursday  8AM to 10AM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 0) {
                selectDoctor(option, p_id, p_name);
            } else {
                System.out.println("Wrong Day Selected");
            }

        } else if (weekN == 3) {
            System.out.println("Select Appointment");
            System.out.println("Press 1 for Monday, 8AM to 10AM");
            System.out.println("Press 2 for Tuesday, 1PM to 3PM");
            System.out.println("Press 3 for Wednesday,4PM to 5PM");
            System.out.println("Press 4 for Thursday,6PM to 8PM");
            System.out.println("Press 0 to Go Back");
            Scanner daySelect = new Scanner(System.in);
            this.dayN = weekSelect.nextInt();
            if (dayN == 1) {
                String apB = "Monday  8AM to 10AM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 2) {
                String apB = "Tuesday  1PM to 3PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 3) {
                String apB = "Wednesday  4PM to 5PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 4) {
                String apB = "Thursday  6PM to 8PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 0) {
                selectDoctor(option, p_id, p_name);
            } else {
                System.out.println("Wrong Day Selected");

            }

        } else if (weekN == 4) {
            System.out.println("Select Appointment");
            System.out.println("Press 1 for Monday, 9AM to 11AM");
            System.out.println("Press 2 for Tuesday, 4PM to 5PM");
            System.out.println("Press 3 for Wednesday,1PM to 3PM");
            System.out.println("Press 4 for Thursday,6PM to 8PM");
            System.out.println("Press 0 to Go Back");
            Scanner daySelect = new Scanner(System.in);
            this.dayN = weekSelect.nextInt();
            if (dayN == 1) {
                String apB = "Monday  9AM to 11AM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 2) {
                String apB = "Tuesday  4PM to 5PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 3) {
                String apB = "Wednesday  1PM to 3PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 4) {
                String apB = "Thursday  6PM to 8PM";
                bookingValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 0) {
                selectDoctor(option, p_id, p_name);
            } else {
                System.out.println("Wrong Day Selected");
            }


        } else if (weekN == 0) {
            patientBookingOpt(p_id, p_name);

        } else {
            System.out.println("Wrong Week Selected");
        }


    }

    public void visitorBookingOpt(String p_id, String p_name) {
        System.out.println("Book your Appointment");
        System.out.println("Press 1 to Search by Physician");
        System.out.println("Press 2 to Search by Expertise");
        System.out.println("Press 0 to Go Back to Main Menu");
        Scanner bookOption = new Scanner(System.in);  // Input to Identify the patient history
        this.bOption = bookOption.nextInt();  // Read user input
        if (bOption == 1) {
            System.out.println("Press 1 for Dr. Ali");
            System.out.println("Press 2 for Dr. Rasthana");
            System.out.println("Press 3 for Dr. Murli Parsad Sharma");
            System.out.println("Press 4 for Dr. Samuel Martin");
            System.out.println("Press 5 for Dr. Katherine");
            System.out.println("Press 0 to Go Back");
            Scanner drChoice = new Scanner(System.in);
            this.drSelect = drChoice.nextInt();  // Read user input
            if (drSelect == 1) {
                String[] d1Data = {"1", "Dr.Ali", "Neural mobilisation", "123456789", "N.M Ward"};
                System.out.println("Book Appointment");
                selectDoctorC(d1Data, p_id, p_name);
            } else if (drSelect == 2) {
                String[] d2Data = {"2", "Dr.Rasthana", "Acupuncture", "123456789", "Acupunture Ward"};
                System.out.println("Book Appointment");
                selectDoctorC(d2Data, p_id, p_name);
            } else if (drSelect == 3) {
                String[] d3Data = {"3", "Dr.M.P Sharma", "Pool Rehabilitation", "123456789", "Swimming Pool"};
                System.out.println("Book Appointment");
                selectDoctorC(d3Data, p_id, p_name);
            } else if (drSelect == 4) {
                String[] d4Data = {"4", "Dr.Steve Ellison", "Massage", "123456789", "Massage Room"};
                System.out.println("Book Appointment");
                selectDoctorC(d4Data, p_id, p_name);
            } else if (drSelect == 5) {
                String[] d5Data = {"5", "Dr.Susan Kate", "Mobilisation", "123456789", "General Ward"};
                System.out.println("Book Appointment");
                selectDoctorC(d5Data, p_id, p_name);
            } else if (drSelect == 0) {
                visitorBookingOpt("V", p_name);
            } else {
                System.out.println("Wrong Option");
            }
        } else if (bOption == 2) {
            System.out.println("Press 1 for Neural mobilisation");
            System.out.println("Press 2 for Acupuncture");
            System.out.println("Press 3 for Massage");
            System.out.println("Press 4 for Mobilisation of the spine and joints");
            System.out.println("Press 5 for Pool Rehabilitation");
            System.out.println("Press 0 to Go Back");
            Scanner AoEChoice = new Scanner(System.in);
            this.drSelect = AoEChoice.nextInt();  // Read user input
            if (drSelect == 1) {
                String[] d1Data = {"1", "Dr.Ali", "Neural mobilisation", "123456789", "N.M Ward"};
                System.out.println("Book Appointment");
                selectDoctorC(d1Data, p_id, p_name);
            } else if (drSelect == 2) {
                String[] d2Data = {"2", "Dr.Rasthana", "Acupuncture", "123456789", "Acupunture Ward"};
                System.out.println("Book Appointment");
                selectDoctorC(d2Data, p_id, p_name);
            } else if (drSelect == 3) {
                String[] d3Data = {"3", "Dr.M.P Sharma", "Pool Rehabilitation", "123456789", "Swimming Pool"};
                System.out.println("Book Appointment");
                selectDoctorC(d3Data, p_id, p_name);
            } else if (drSelect == 4) {
                String[] d4Data = {"4", "Dr.Steve Ellison", "Massage", "123456789", "Massage Room"};
                System.out.println("Book Appointment");
                selectDoctorC(d4Data, p_id, p_name);
            } else if (drSelect == 5) {
                String[] d5Data = {"5", "Dr.Susan Kate", "Mobilisation", "123456789", "General Ward"};
                System.out.println("Book Appointment");
                selectDoctorC(d5Data, p_id, p_name);
            } else if (drSelect == 0) {
                visitorBookingOpt("V", p_name);
            } else {
                System.out.println("Wrong Option");
            }
        } else if (bOption == 0) {
            Start();
        } else {
            System.out.println("Invalid Option");
        }

    }

    public void selectDoctorC(String[] option, String p_id, String p_name) {
        System.out.println("Select Week (1 or 2 or 3 or 4)");
        System.out.println("Press 0 to Go Back");
        Scanner weekSelect = new Scanner(System.in);
        this.weekN = weekSelect.nextInt();
        if (weekN == 1) {
            System.out.println("Select Consultation");
            System.out.println("Day Available: Friday");
            System.out.println("Press 1 1:00PM to 1:30PM");
            System.out.println("Press 2 1:30PM to 2:00PM");
            System.out.println("Press 3 2:00PM to 2:30PM");
            System.out.println("Press 4 2:30PM to 3:00PM");
            System.out.println("Press 0 to Go Back");
            Scanner daySelect = new Scanner(System.in);
            this.dayN = daySelect.nextInt();
            if (dayN == 1) {
                String apB = "1:00PM to 1:30PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 2) {
                String apB = "1:30PM to 2:00PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 3) {
                String apB = "2:00PM to 2:30PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 4) {
                String apB = "2:30PM to 3:00PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 0) {
                selectDoctorC(option, p_id, p_name);
            } else {
                System.out.println("Wrong Day Selected");
            }

        } else if (weekN == 2) {
            System.out.println("Select Consultation");
            System.out.println("Day Available: Saturday");
            System.out.println("Press 1 1:00PM to 1:30PM");
            System.out.println("Press 2 1:30PM to 2:00PM");
            System.out.println("Press 3 2:00PM to 2:30PM");
            System.out.println("Press 4 2:30PM to 3:00PM");
            System.out.println("Press 0 to Go Back");
            Scanner daySelect = new Scanner(System.in);
            this.dayN = daySelect.nextInt();
            if (dayN == 1) {
                String apB = "1:00PM to 1:30PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 2) {
                String apB = "1:30PM to 2:00PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 3) {
                String apB = "2:00PM to 2:30PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 4) {
                String apB = "2:30PM to 3:00PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 0) {
                selectDoctorC(option, p_id, p_name);
            } else {
                System.out.println("Wrong Day Selected");
            }

        } else if (weekN == 3) {
            System.out.println("Select Consultation");
            System.out.println("Day Available: Friday");
            System.out.println("Press 1 1:00PM to 1:30PM");
            System.out.println("Press 2 1:30PM to 2:00PM");
            System.out.println("Press 3 2:00PM to 2:30PM");
            System.out.println("Press 4 2:30PM to 3:00PM");
            System.out.println("Press 0 to Go Back");
            Scanner daySelect = new Scanner(System.in);
            this.dayN = daySelect.nextInt();
            if (dayN == 1) {
                String apB = "1:00PM to 1:30PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 2) {
                String apB = "1:30PM to 2:00PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 3) {
                String apB = "2:00PM to 2:30PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 4) {
                String apB = "2:30PM to 3:00PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 0) {
                selectDoctorC(option, p_id, p_name);
            } else {
                System.out.println("Wrong Day Selected");
            }


        } else if (weekN == 4) {
            System.out.println("Select Consultation");
            System.out.println("Day Available: Friday");
            System.out.println("Press 1 1:00PM to 1:30PM");
            System.out.println("Press 2 1:30PM to 2:00PM");
            System.out.println("Press 3 2:00PM to 2:30PM");
            System.out.println("Press 4 2:30PM to 3:00PM");
            System.out.println("Press 0 to Go Back");
            Scanner daySelect = new Scanner(System.in);
            this.dayN = daySelect.nextInt();
            if (dayN == 1) {
                String apB = "1:00PM to 1:30PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 2) {
                String apB = "1:30PM to 2:00PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 3) {
                String apB = "2:00PM to 2:30PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 4) {
                String apB = "2:30PM to 3:00PM";
                visitorValidation(option, apB, weekN, p_id, p_name);
            } else if (dayN == 0) {
                selectDoctorC(option, p_id, p_name);
            } else {
                System.out.println("Wrong Day Selected");
            }


        } else if (weekN == 0) {
            visitorBookingOpt(p_id, p_name);

        } else {
            System.out.println("Wrong Week Selected");
        }


    }
}
