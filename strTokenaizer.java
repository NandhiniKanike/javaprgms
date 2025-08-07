import java.util.StringTokenizer;

public class strTokenaizer 
{
      public static void main(String[] args) 
{
String data = "Java,Python,C++,HTML";
StringTokenizer st = new StringTokenizer(data, ",");
while (st.hasMoreTokens()) {
System.out.println(st.nextToken());
}
}
}
