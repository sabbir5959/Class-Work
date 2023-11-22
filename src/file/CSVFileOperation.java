package file;

import java.io.*;

public class CSVFileOperation {

    public static void main(String[] args) throws IOException{

        String path ="D:/Java soft/CW.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = "";

            while ((line=br.readLine())!=null)
            {
                String [] values =line.split(",");
                System.out.println(values[0]);
            }

        String PATH = "D:/Java soft/write.csv";

            BufferedWriter bw = new BufferedWriter(new FileWriter(PATH));

            bw.write("Name: \n Md. Sabbir Hossain \n Kawsar Arafat \n Diner Ahmed");
            bw.close();

            System.out.println("Successfully Written");
    }
}