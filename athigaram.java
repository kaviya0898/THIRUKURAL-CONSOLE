import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class athigaram {
    public void print() throws IOException {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[38];
        int i = 0;
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter1.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter2.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter3.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter4.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter5.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter6.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter7.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter8.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter9.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter10.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter11.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter12.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter13.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter14.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter15.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter16.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter17.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter18.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter19.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter20.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter21.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter22.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter23.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter24.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter25.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter26.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter27.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter28.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter29.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter30.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter31.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter32.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter33.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter34.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter35.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter36.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter37.txt";
        arr[i++] = "C:\\Users\\kaviy\\Downloads\\chapter38.txt";
        System.out.println();
        System.out.println("குறள் பால்: அறத்துப்பால்");
        boolean bool = false;
        while (!bool) {
            System.out.println("1.பாயிரவியல்");
            System.out.println("2.இல்லறவியல்");
            System.out.println("3.துறவறவியல்");
            System.out.println("4.ஊழியல்");
            System.out.println("Enter 0 to exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("choose chapters from 1 to 4");
                System.out.println("Chapter 1:கடவுள் வாழ்த்து.");
                System.out.println("Chapter 2:வான்சிறப்பு.");
                System.out.println("Chapter 3:நீத்தார் பெருமை.");
                System.out.println("Chapter 4:அறன்வலியுறுத்தல்.");

                int chapter = sc.nextInt();
                switch (chapter) {
                    case 1:
                        printFile(arr[chapter - 1]);

                        break;
                    case 2:
                        printFile(arr[chapter - 1]);

                        break;
                    case 3:
                        printFile(arr[chapter - 1]);
                        break;
                    case 4:
                        printFile(arr[chapter - 1]);
                        break;
                }
            }
            if (choice == 2) {
                System.out.println("Choose chapters from 5 to 24");
                System.out.println("Chapter 5:இல்வாழ்க்கை.");
                System.out.println("Chapter 6:வாழ்க்கைத் துணைநலம்.");
                System.out.println("Chapter 7:மக்கட்பேறு.");
                System.out.println("Chapter 8:அன்புடைமை.");
                System.out.println("Chapter 9:விருந்தோம்பல்.");
                System.out.println("Chapter 10:இனியவைகூறல்.");
                System.out.println("Chapter 11:செய்ந்நன்றி அறிதல்.");
                System.out.println("Chapter 12:நடுவு நிலைமை.");
                System.out.println("Chapter 13:அடக்கமுடைமை.");
                System.out.println("Chapter 14:ஒழுக்கமுடைமை.");
                System.out.println("Chapter 15:பிறனில் விழையாமை.");
                System.out.println("Chapter 16:பொறையுடைமை.");
                System.out.println("Chapter 17:அழுக்காறாமை.");
                System.out.println("Chapter 18:வெஃகாமை.");
                System.out.println("Chapter 19:புறங்கூறாமை.");
                System.out.println("Chapter 20: பயனில சொல்லாமை");
                System.out.println("Chapter 21:தீவினையச்சம்");
                System.out.println("Chapter 22:ஒப்புரவறிதல்.");
                System.out.println("Chapter 23: ஈகை.");
                System.out.println("Chapter 24: புகழ்.");
                int chapter = sc.nextInt();
                switch (chapter) {
                    case 5:
                        printFile(arr[chapter - 1]);
                        break;
                    case 6:
                        printFile(arr[chapter - 1]);
                        break;
                    case 7:
                        printFile(arr[chapter - 1]);
                        break;
                    case 8:
                        printFile(arr[chapter - 1]);
                        break;
                    case 9:
                        printFile(arr[chapter - 1]);
                        break;
                    case 10:
                        printFile(arr[chapter - 1]);
                        break;
                    case 11:
                        printFile(arr[chapter - 1]);
                        break;
                    case 12:
                        printFile(arr[chapter - 1]);
                        break;
                    case 13:
                        printFile(arr[chapter - 1]);
                        break;
                    case 14:
                        printFile(arr[chapter - 1]);
                        break;
                    case 15:
                        printFile(arr[chapter - 1]);
                        break;
                    case 16:
                        printFile(arr[chapter - 1]);
                        break;
                    case 17:
                        printFile(arr[chapter - 1]);
                        break;
                    case 18:
                        printFile(arr[chapter - 1]);
                        break;
                    case 19:
                        printFile(arr[chapter - 1]);
                        break;
                    case 20:
                        printFile(arr[chapter - 1]);
                        break;
                    case 21:
                        printFile(arr[chapter - 1]);
                        break;
                    case 22:
                        printFile(arr[chapter - 1]);
                        break;
                    case 23:
                        printFile(arr[chapter - 1]);
                        break;
                    case 24:
                        printFile(arr[chapter - 1]);
                        break;


                }
            }
            if (choice == 3) {
                System.out.println("Choose chapters 25-37");
                System.out.println("Chapter 25:அருளுடைமை.");
                System.out.println("Chapter 26:புலான்மறுத்தல்.");
                System.out.println("Chapter 27:தவம்.");
                System.out.println("Chapter 28:கூடாவொழுக்கம்.");
                System.out.println("Chapter 29:கள்ளாமை.");
                System.out.println("Chapter 30:வாய்மை.");
                System.out.println("Chapter 31:வெகுளாமை.");
                System.out.println("Chapter 32:இன்னாசெய்யாமை.");
                System.out.println("Chapter 33:கொல்லாமை.");
                System.out.println("Chapter 34:நிலையாமை.");
                System.out.println("Chapter 35:துறவு.");
                System.out.println("Chapter 36:மெய்யுணர்தல்.");
                System.out.println("Chapter 37:அவாவறுத்தல்.");
                int chapter = sc.nextInt();
                switch (chapter) {
                    case 25:
                        printFile(arr[chapter - 1]);
                        break;
                    case 26:
                        printFile(arr[chapter - 1]);
                        break;
                    case 27:
                        printFile(arr[chapter - 1]);
                        break;
                    case 28:
                        printFile(arr[chapter - 1]);
                        break;
                    case 29:
                        printFile(arr[chapter - 1]);
                        break;
                    case 30:
                        printFile(arr[chapter - 1]);
                        break;
                    case 31:
                        printFile(arr[chapter - 1]);
                        break;
                    case 32:
                        printFile(arr[chapter - 1]);
                        break;
                    case 33:
                        printFile(arr[chapter - 1]);
                        break;
                    case 34:
                        printFile(arr[chapter - 1]);
                        break;
                    case 35:
                        printFile(arr[chapter - 1]);
                        break;
                    case 36:
                        printFile(arr[chapter - 1]);
                        break;
                    case 37:
                        printFile(arr[chapter - 1]);
                        break;


                }


            }
            if (choice == 4) {
                System.out.println("chapter 38");
                System.out.println("chapter 38:ஊழ்.");
                int chapter = sc.nextInt();
                switch (chapter) {
                    case 38:
                        printFile(arr[chapter - 1]);
                        break;
                }
            }
         if(choice==0)
         {
             System.exit(0);
         }
        }

    }

    public  void printFile(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        int index;
        while ((index = reader.read()) != -1) {
            System.out.print((char) index);
        }
    }
}