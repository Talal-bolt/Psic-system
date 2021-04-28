package com.company;

import java.nio.*;
import java.util.*;
import java.time.*;
import java.io.*;  // Import the File class

public class Center {
    int count;
    public void patientDataStorage(String patient_Name, String patient_Address, int patientTel_num) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Patient_Record.csv"));
            String input;
            String line = "";
            this.count = 0;
            int countD = 0;
            while ((line = bufferedReader.readLine()) != null) {
                countD++;
                String[] row = line.split(",");
                count++;
            }
            String patientID = Integer.toString(count);
            String pTel_Num = Integer.toString(patientTel_num);
            FileWriter myWriter = new FileWriter("Patient_Record.csv", true);
//            BufferedWriter myWriter = new BufferedWriter(new FileWriter("file.txt", true));
            myWriter.write(patientID);
            myWriter.write(',');
            myWriter.write(patient_Name);
            myWriter.write(',');
            myWriter.write(patient_Address);
            myWriter.write(',');
            myWriter.write(pTel_Num);
            myWriter.write("\n");
            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//            System.out.println("Count : " + count);
            System.out.println("Your User ID is:" + count);
            System.out.println("Patient Registered Successfully ");
            Physician pObj = new Physician();
            pObj.patientBookingOpt(patientID, patient_Name);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void DataReader(String fileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String input;
            String line = "";
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] row = line.split(",");
//                for (int i = 0; i < countD; i++) {
//                    for (int i = 0; i < countD; i++) {
//                        String[][] record = row;
//                        System.out.println(record[0][0]);
//                    }
//                }
                for (String index : row) {
                    System.out.printf("%-30s", index);
                }
                System.out.println();
                count++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public void patientDataCheck(int patientID, String fileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = "";
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                count++;
            }
            String[] row = {};
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            if (patientID < count) {
                for (int ii = 0; ii <= patientID; ii++) {
                    line = br.readLine();
                    row = line.split(",");
                }
                for (String index : row) {
                    System.out.printf("%-30s", index);
                }
                System.out.println();
                Physician pObj = new Physician();
                pObj.patientBookingOpt(row[0], row[1]);
            } else {
                System.out.println("You are not registered");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void bookingDataStorage(String[] option, String apB, int weekN, String p_id, String p_name) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("reports.csv"));
            String input;
            String line = "";
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] row = line.split(",");
                count++;
            }
            String weekN1 = Integer.toString(weekN);
            FileWriter myWriter = new FileWriter("reports.csv", true);
//            BufferedWriter myWriter = new BufferedWriter(new FileWriter("file.txt", true));
            myWriter.write(option[0]);
            myWriter.write(',');
            myWriter.write(option[1]);
            myWriter.write(',');
            myWriter.write(option[2]);
            myWriter.write(',');
            myWriter.write(p_id);
            myWriter.write(',');
            myWriter.write(p_name);
            myWriter.write(',');
            myWriter.write(apB);
            myWriter.write(',');
            myWriter.write(weekN1);
            myWriter.write(',');
            myWriter.write(option[4] + "," + "Process");
            myWriter.write("\n");
            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//            System.out.println("Count : " + count);

        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void patientbookingDataStorage(String[] option, String apB, int weekN, String p_id, String p_name) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("patient_reports.csv"));
            String input;
            String line = "";
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] row = line.split(",");
                count++;
            }
            String weekN1 = Integer.toString(weekN);
            FileWriter myWriter = new FileWriter("patient_reports.csv", true);
//            BufferedWriter myWriter = new BufferedWriter(new FileWriter("file.txt", true));
            myWriter.write(option[0]);
            myWriter.write(',');
            myWriter.write(option[1]);
            myWriter.write(',');
            myWriter.write(option[2]);
            myWriter.write(',');
            myWriter.write(p_id);
            myWriter.write(',');
            myWriter.write(p_name);
            myWriter.write(',');
            myWriter.write(apB);
            myWriter.write(',');
            myWriter.write(weekN1);
            myWriter.write(',');
            myWriter.write(option[4] + "," + "Process");
            myWriter.write("\n");
            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//            System.out.println("Count : " + count);s
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void bookingValidation(String[] option, String apB, int weekN, String p_id, String p_name) {
        ArrayList<String> linesList1 = new ArrayList<>();
        String weekN1 = Integer.toString(weekN);
        int docID = Integer.parseInt(option[0]);
        int P_id = Integer.parseInt(p_id);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("patient_reports.csv"));
            String result = "";
            String input = "Cancelled";
            String line = "";
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                linesList1.add(line);
            }

            for (int u = 0; u < linesList1.size(); u++) {
                String[] data = linesList1.get(u).split(",");
                String col0 = data[0];
                String col1 = data[3];
                String col11 = data[4];
                String col2 = data[5];
                String col3 = data[6];
                String col8 = data[7];
                boolean dID = option[0].equals(col0);
                boolean patID = p_id.equals(col1);
                boolean timeSlot = apB.equals(col2);
                boolean wNumber = weekN1.equals(col3);
                boolean status = input.equals(col8);
                if (dID == true && patID == true && timeSlot == true && wNumber == true && status == false) {
                    result = "exist";
                    System.out.println("You already signed in for this time");
                    System.out.println("Press 1 to change Booking");
                    System.out.println("Press 2 to cancel Booking");
                    int uu = u - 1;
                    Scanner bookAlter = new Scanner(System.in);
                    int bAlter = bookAlter.nextInt();
                    if (bAlter == 1) {
                        FileWriter writer = new FileWriter("instructions.txt", true);
                        writer.write("Remove Booking Number:" + u);
                        writer.write("\n");
                        writer.close();
                        Physician p1Obj = new Physician();
                        p1Obj.patientBookingOpt(col1, col11);
                    } else if (bAlter == 2) {
                        FileWriter writer = new FileWriter("instructions.txt", true);
                        writer.write("Cancel Booking Number:" + u);
                        writer.write("\n");
                        writer.close();
                        System.out.println("Appointment will be cancelled on approval by admin shortly");
                    }
                } else if (dID == true && patID == false && timeSlot == true && wNumber == true && status == false) {
                    System.out.println("Booking Not Available");
                    System.out.println("Book Another Booking");
                    result = "exist";
                } else {


                }


            }
            boolean resultCh = result.equals("exist");
            if (resultCh == false) {
                bookingDataStorage(option, apB, weekN, p_id, p_name);
                patientbookingDataStorage(option, apB, weekN, p_id, p_name);
                System.out.println("Appointment Booked Successfully ");
            } else {

            }

        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void visitorValidation(String[] option, String apB, int weekN, String p_id, String p_name) {
        ArrayList<String> linesListV = new ArrayList<String>();
        String weekN1 = Integer.toString(weekN);
        try {
            BufferedReader bufferedReader11 = new BufferedReader(new FileReader("reports.csv"));
            String line = "";
            int count = 0;
            while ((line = bufferedReader11.readLine()) != null) {
                linesListV.add(line);
            }
            String result = "";

            for (int ux = 0; ux < linesListV.size(); ux++) {
                String[] data1 = linesListV.get(ux).split(",");
                String col0 = data1[0];
                String col1 = data1[3];
                String col2 = data1[5];
                String col3 = data1[6];
                boolean dID = option[0].equals(col0);
                boolean vID = col1.equals("V");
                boolean timeSlot = apB.equals(col2);
                boolean wNumber = weekN1.equals(col3);
                if (dID == true && vID == true && timeSlot == true && wNumber == true) {
                    result = "Already Booked";

                } else {
                    result = "Not Booked";
                }
            }
            boolean resultCh = result.equals("Already Booked");
            if (resultCh == false) {
                bookingDataStorage(option, apB, weekN, p_id, p_name);
                System.out.println("Consultation Booked Successfully ");
            } else {
                System.out.println("Already Booked");
            }


        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


}
