import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Nadeem\\Downloads\\emailpassword.txt"));
        ArrayList<String> list = new ArrayList<>();
        boolean b1=false;
        String s;
        while ((s = br.readLine()) != null) {
            list.add(s);
            System.out.println(s);
        }
        System.out.println("PRINTING ARRAY LIST");
        for (String str : list)
            System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data:");
        String data = sc.nextLine();



        for (String str : list) {
            str.equals(data);
            b1 = true;

            }

        if(b1)
            System.out.println("FOUND");
        else
            System.out.println("NOT");
        }
    }
