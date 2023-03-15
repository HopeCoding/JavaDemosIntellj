package workingWithFiles.src;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();

    }

    public static void createFile(){
        File file=new File("D:\\javademos\\files\\student.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void getFileInfo(){
        File file=new File("D:\\javademos\\files\\student.txt");
        // file.exists() Dosya varsa true yoksa false dönüyor.
        if(file.exists()){
            System.out.println("Dosya adı: "+file.getName()); // Dosyanın adını verir.
            System.out.println("Dosya yolu: "+file.getAbsolutePath()); //Dosyanın yolunu verir.
            System.out.println("Dosya yazılabilir mi: "+file.canWrite()); //Dosyaya yazılabilir mi?
            System.out.println("Dosya okunabilir mi: "+file.canRead()); //Dosya okunabilir mi ?
            System.out.println("Dosya boyutu (byte): "+file.length()); // Dosya büyüklüğü

        }
    }

    public static void readFile(){
        File file=new File("D:\\javademos\\files\\student.txt");
        try {
            Scanner reader=new Scanner(file);
            while (reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\javademos\\files\\student.txt",true));
            writer.write("\nEda çok tembel");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
