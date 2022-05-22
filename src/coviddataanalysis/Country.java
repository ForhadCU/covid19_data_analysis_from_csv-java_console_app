
package coviddataanalysis;
import java.util.ArrayList;

public class Country {

    String iso3;
    String continent;
    String countryName;
    String nuts;
    double lat;
    double longg;

    public void uniqIso3(String[] Iso3) {

        ArrayList<String> list1 = new ArrayList<>();

        for (String str1 : Iso3) {
            if (!list1.contains(str1)) {
                list1.add(str1);
            }

        }

        for (String str1 : list1) {
            System.out.println(str1);
        }

    }

    public void uniContinent(String[] Continent) {

        ArrayList<String> list2 = new ArrayList<>();

        for (String str1 : Continent) {
            if (!list2.contains(str1)) {
                list2.add(str1);
            }

        }

        for (String str1 : list2) {
            System.out.println(str1);
        }

    }

    public void uniqCountry(String[] CountryName) {

        ArrayList<String> list1 = new ArrayList<>();

        for (String str1 : CountryName) {
            if (!list1.contains(str1)) {
                list1.add(str1);
            }

        }

        for (String str1 : list1) {
            System.out.println(str1);
        }

    }
    
    

    public void uniqNuts(String[] nuts) {

         ArrayList<String>list1=new ArrayList<>();
      
          
        for (String str1 : nuts) {
            if (!list1.contains(str1)) {
                list1.add(str1);
            }
           
        }
        
        for(String str1:list1){
            System.out.println(str1);
        }
        
        
    }

}