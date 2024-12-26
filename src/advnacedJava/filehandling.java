package advnacedJava;
import java.io.*;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) {
        File myFile = new File("cpt.txt");
        //creating a file
        try {
            myFile.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }

        //writing a file
        try {
            FileWriter fileWriter = new FileWriter("cpt.txt");
            fileWriter.write("hello my name is safal lama");
        fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        //readig a file
        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        //deleting  a fiile
        if(myFile.delete()){
            System.out.println(" deleted uscees file");
        }else {
            System.out.println("some error occured");
        }
    }
}
