import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;


public class WordCount {
    public static void main(String[] args){
        if(args.length != 2) {
            System.out.println("参数有误");
            System.exit(1);
        }

        String a = args[0];
        String testTxt = args[1];

        int count =0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(testTxt));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int ch = 0;
        if(a.equals("-c")){
            while(true){
                try {
                    if ((ch = reader.read()) == -1) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                count++;
            }

            System.out.println("字符数 =" + count);
        }else if(a.equals("-w")){
            while(true){
                try {
                    if ((ch = reader.read()) == -1) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if(Character.isWhitespace((char) ch)){
                    count++;
                }
            }

            count++;

            System.out.println("单词数 =" + count);
        }else {
            System.out.println("输入指令有误");
        }
    }
}