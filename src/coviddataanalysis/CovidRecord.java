
package coviddataanalysis;
import java.util.ArrayList;

public class CovidRecord {
    
    String date;
    int cumulativePositive;
    int cumulativeDeceased;
    int cumulativeRecoverd;
    int currentlyPositive;
    
    int hospitalized;
    int intensiveCare;
    Country country;
    

public void uniqDate(String[] Date){

    
     ArrayList<String>list1=new ArrayList<>();
      
          
        for (String str1 : Date) {
            if (!list1.contains(str1)) {
                list1.add(str1);
            }
           
        }
        
        for(String str1:list1){
            System.out.println(str1);
        }
    
}


}