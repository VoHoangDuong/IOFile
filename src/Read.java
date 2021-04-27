import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\TextFile\\test.txt");
//            if (!file.exists()){
//                file.createNewFile();
//            }else {
//                System.out.println("File is exists");
//            }
            FileReader fileReader = new FileReader("D:\\TextFile\\test.txt");
            Scanner scanner = new Scanner(fileReader);
//            System.out.println(scanner.hasNextLine());

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
//            int check;

//            while ((check = fileReader.read()) != -1){
//                System.out.print((char) check);
//            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
