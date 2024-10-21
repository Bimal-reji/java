import java.io.*;
import java.util.*;

class filehandling {
    public static void main(String args[]) throws IOException {
        String s = "";
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("output.txt");
        System.out.println("Enter lines of text (type 'stop' to end)");
       
        do {
            s = sc.nextLine();
            if (!s.equals("stop")) {
                fw.write(s);
                fw.write("\n");
            }
        } while (!s.equals("stop"));
       
        fw.close();
       
        try {
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Content in the file is:");
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
    }
}



