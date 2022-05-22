package coviddataanalysis;

import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CovidDataAnalysis {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Country[] country = new Country[100000000];
        country = new Country[100000];

        int i = 0;

        String line = "";
        String splitBy = ",";

        String[] insertDate = new String[1000000];
        String[] insertCountry = new String[1000000];
        String[] insertIso3 = new String[1000000];
        String[] insertContinent = new String[1000000];
        String[] insertNuts=new String[1000000];

        BufferedReader br = new BufferedReader(new FileReader("D:\\dataset.csv"));

        line = br.readLine();  //for skipping the 1st record

        try {
            //parsing a CSV file into BufferedReader class constructor  

            while ((line = br.readLine()) != null) //returns a Boolean value  
            {
                String[] dataRecord = line.split(splitBy);    // use comma as separator  

                insertDate[i] = dataRecord[0];
                insertIso3[i] = dataRecord[1];
                insertContinent[i] = dataRecord[2];
                insertCountry[i] = dataRecord[3];
                insertNuts[i]=dataRecord[12];
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void southAmerica(String[] countryName) {

    }

    public void northAmerica(String[] countryName) {

    }

    public void oceania(String[] countryName) {

    }

    public void asia(String[] countryName) {

    }

    public void africa(String[] countryName) {

    }

    public void europe(String[] countryName) {

    }

}