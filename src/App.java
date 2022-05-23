import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// import com.opencsv.CSVReader;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String file = "/home/forhad/Desktop/demoset.csv";
        // String file = "/home/forhad/VsCode/Java Project/My_java/Covid_data_analysis/src/dataset.csv";
        BufferedReader reader = null;

        String line = "";
        String delemeter = ",";
        List<DemoRocord> demoList = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] userdata = line.split(delemeter);

                // System.out.println(userdata[0]);
                // DemoRocord demoRocord = new DemoRocord(userdata[0], userdata[1], userdata[2]);
                // DemoRocord demoRocord = new DemoRocord(userdata[0], userdata[1], userdata[2]);

                demoList.add(new DemoRocord(userdata[0], userdata[1], userdata[2] ));

                /* for (int i = 1; i < row.length; i++) {
                     System.out.printf("%-10s", row[0]);
                } */

               /*  for (String index : row) {
                    System.out.printf("%-10s", index);
                } */
                System.out.println();

            }
            DemoRocord demoRocord = demoList.get(1);

            System.out.println(demoRocord.serial);

            //print this
          /*   for (int i = 0; i < demoList.size(); i++) {
                DemoRocord demoRocord = demoList.get(1);

                System.out.println(demoRocord.serial);
                
            } */
            
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        finally{
            try {
                   reader.close();
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }

         
        }

/* 
CSVReader reader = null;  
try  
{  
// reader = new CSVReader(new FileReader("F:\\CSVDemo.csv"));    
reader = new CSVReader(new FileReader("/home/forhad/Desktop/dataset.csv"));    
String [] nextLine;  
//read one line at a time  
while ((nextLine = reader.readNext()) != null)  
{  
for(String token : nextLine)  
{  
System.out.println(token);  
}  
System.out.print("\n");  
}  
}  
catch (Exception e)   
{  
e.printStackTrace();  
}  
 */
    }
}
