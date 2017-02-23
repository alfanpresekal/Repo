
/**
 * Sample
 */

import java.io.*;

public class FileRW
{
    
    String DataRW;
    
    public static void main(String args[]){
        System.out.println("Echo . . . ");
        FileRW object = new FileRW();
        object.ReadData();
        object.WriteData();
        
        
    }
    
    void WriteData(){
        try{
            String dataText = "Contoh Data";
            FileWriter tulis = new FileWriter("output.txt", false);
            tulis.write(DataRW);
            tulis.close();
        }
        catch (IOException e) {
            System.out.print("Exception");
        }
    }
    
    void ReadData(){
        // Target File yang akan dibuka dan dibaca
        String fileName = "input.txt";
        // Text untuk setiap baris
        String line = null;

        try {
            // FileReader class membaca file
            FileReader fileReader = 
                new FileReader(fileName);

            // Implementasi Buffer Reader
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                DataRW = line;
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
    }
    

}
