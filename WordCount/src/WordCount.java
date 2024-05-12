import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String fileName= JOptionPane.showInputDialog("Please the name of a file");

        try
        {
            //创建文件对象和读取对象
            File in=new File(fileName);
            FileReader reader=new FileReader(in);

            //读取文本文件到字符数组letters
            char[] letters=new char[(int)in.length()];
            reader.read(letters);

            //统计单词数量
            String s=String.valueOf(letters);//char[]转String
            /*
             * 下面几个函数的含义：
             * replaceAll(String regex, String replacement):用replacement替换所有的regex匹配项
             * trim():去掉一段String首尾空格
             * split():根据给定正则来分割字符串
             */
            String[ ] words=s.replaceAll("[^a-zA-Z]+"," ").trim( ).split(" ");

            System.out.println("字符数量："+letters.length);
            System.out.println("\n单词数量："+words.length);
            reader.close();
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }
}