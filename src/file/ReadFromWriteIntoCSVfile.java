package file;

import java.io.*;

public class ReadFromWriteIntoCSVfile {

    public static void main (String [] args) throws IOException
    {
        String path = "D:/Java soft/CW.csv";
        String PATH = "D:/Java soft/write.csv";

            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = "";
            BufferedWriter bw = new BufferedWriter(new FileWriter(PATH));

            while ((line=br.readLine())!=null)
            {
                String [] values =line.split(",");
                bw.write(values[0]+"\n");
            }
        System.out.println("Written");
    }
}
