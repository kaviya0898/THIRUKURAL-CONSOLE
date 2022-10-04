import java.io.FileInputStream;
import java.util.Scanner;

public class secondDetails {
    public static void basicInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO திருக்குறள்");
        System.out.println("HERE WE ARE GOING TO SEE ABOUT அறத்துப்பால்");
        System.out.println("Enter the below options to know basics about திருக்குறள்");
        boolean bool = false;
        while (!bool) {
            System.out.println("1.Basic details about author திருவள்ளுவர்");
            System.out.println("2.Facts about திருக்குறள்");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String fileName1 = "basic.txt";
                    try {
                        var myFile = new FileInputStream(fileName1);
                        int index;
                        while ((index = myFile.read()) != -1) {
                            System.out.print((char) index);
                        }
                    } catch (Exception e) {
                        System.out.println("file error");
                    }
                    System.out.println();
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("To know more press 1 or to exit press 2");
                    int index=sc.nextInt();
                    if(index==1)
                    {
                        bool=false;
                    }
                    else {
                        bool=true;
                    }
                    break;
                case 2:
                    String fileName2 = "thirukuralfacts.txt";
                    try {
                        var myFile = new FileInputStream(fileName2);
                        int ind;
                        while ((ind = myFile.read()) != -1) {
                            System.out.print((char) ind);
                        }
                    } catch (Exception e) {
                        System.out.println("file error");
                    }
                    System.out.println();
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                    bool=true;
                    break;
            }
        }
    }
}
