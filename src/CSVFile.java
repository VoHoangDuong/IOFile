import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVFile {
    public static void main(String[] args) {
        writeCSV("D:\\TextFile\\CSV.csv");
        System.out.println(readCSV("D:\\TextFile\\CSV.csv"));
        
    }
    private String startID;
    private String endID;
    private String startCas;
    private String endCas;
    private String countryID;
    private String country;
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "String startID, String endID, String startCas, String endCas, String countryID, String country";

    public String getStartID() {
        return startID;
    }

    public CSVFile(String startID, String endID, String startCas, String endCas, String countryID, String country){
        this.country = country;
        this.endCas = endCas;
        this.countryID = countryID;
        this.endID = endID;
        this.startID = startID;
        this.startCas = startCas;
    }

    public void setStartID(String startID) {
        this.startID = startID;
    }

    public String getEndID() {
        return endID;
    }

    public void setEndID(String endID) {
        this.endID = endID;
    }

    public String getStartCas() {
        return startCas;
    }

    public void setStartCas(String startCas) {
        this.startCas = startCas;
    }

    public String getEndCas() {
        return endCas;
    }

    public void setEndCas(String endCas) {
        this.endCas = endCas;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return startID+","+endID+","+startCas+","+endCas+","+countryID+","+country+"\n";
    }

    public static void writeCSV(String path){
        //
        CSVFile csv1 = new CSVFile("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia");
        CSVFile csv2 = new CSVFile("1.0.1.0","1.0.3.255","16777472","16778239","CN","China");
        CSVFile csv3 = new CSVFile("1.0.4.0","1.0.7.255","16778240","16779263","AU","Australia");
        CSVFile csv4 = new CSVFile("1.0.8.0","1.0.15.255","16779264","16781311","CN","China");
        CSVFile csv5 = new CSVFile("1.0.16.0","1.0.31.255","16781312","16785407","JP","Japan");
        CSVFile csv6 = new CSVFile("1.0.32.0","1.0.63.255","16785408","16793599","CN","China");
        CSVFile csv7 = new CSVFile("1.0.64.0","1.0.127.255","16793600","16809983","JP","Japan");
        CSVFile csv8 = new CSVFile("1.0.128.0","1.0.255.255","16809984","16842751","TH","Thailand");

        List<CSVFile> countries = new ArrayList<>();
        countries.add(csv1);
        countries.add(csv2);
        countries.add(csv3);
        countries.add(csv4);
        countries.add(csv5);
        countries.add(csv6);
        countries.add(csv7);
        countries.add(csv8);

        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter("D:\\TextFile\\CSV.csv");
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (CSVFile c : countries) {
                fileWriter.append(c.toString());
            }
            System.out.println("CSV file was created successfully !!!");
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<CSVFile> readCSV(String path){
        FileReader fileReader = null;
        BufferedReader bf = null;
        ArrayList<CSVFile> csvFiles = new ArrayList<>();
        try{
            fileReader = new FileReader(path);
            bf = new BufferedReader(fileReader);

            String line;
            while ((line = bf.readLine()) != null){
                String[] str = line.split(",");
                CSVFile csvFile = new CSVFile(str[0],str[1],str[2],str[3],str[4],str[5]);
                csvFiles.add(csvFile);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return csvFiles;
    }
}
