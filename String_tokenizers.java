import java.util.StringTokenizer;
import java.util.Scanner;
public class String_tokenizers 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A STRING TO TOKENIZE : ");
        String sname=s.nextLine();
        StringTokenizer tokenizer= new StringTokenizer(sname);
        
        int count=0;
        while(tokenizer.hasMoreTokens())
        {
            String token=tokenizer.nextToken();
            count++;
            System.out.println("Token " + count+":"+token);
        }
        System.out.println("TOTAL NUMBER OF TOKENS :" +count);
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.insert(6,"Java ");
        System.out.println(sb);
        sb.replace(6,10," C++" );
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("Welcome");
        sb1.append(" to Java");
        System.out.println(sb1);
        sb1.delete(0, 8);
        System.out.println(sb1);
        s.close();   
    }
    
}
