import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String fileName= JOptionPane.showInputDialog("Please the name of a file");

        try
        {

            File in=new File(fileName);
            FileReader reader=new FileReader(in);

            char[] letters=new char[(int)in.length()];
            reader.read(letters);


            String s=String.valueOf(letters);//char[]转String

            String[ ] words=s.replaceAll("[^a-zA-Z]+"," ").trim( ).split(" ");

            System.out.println("字符数量："+letters.length+"\n单词数量："+words.length);
            reader.close();
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }
}