package coviddataanalysis;

import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CovidDataAnalysis {

    public static void main(String[] args) throws FileNotFoundException, IOException {
          
        int i=0;
        int j=0;
        
        String line = "";
        String splitBy = ",";
        BufferedReader br = new BufferedReader(new FileReader("D:\\dataset.csv"));
       
        Country[] country;
        country=new Country[1000];
     
      
        
  
        
        try {
//parsing a CSV file into BufferedReader class constructor  

            while ((line = br.readLine()) != null) //returns a Boolean value  
            {
                String[] dataRecord = line.split(splitBy);    // use comma as separator  
                if(i==0) continue;
                
                
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
