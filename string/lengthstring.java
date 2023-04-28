package string;
public class lengthstring {
    public  static void main(String[]args){
String name= "kunal";
String last="chauhan";
String full= name +"@" + last;
    //System.out.println(full.length());       // to find tyhe length of string 


    // to write a each letter of string  or  to acess each word
    for(int i=0;i<full.length();i++)
{
     System.out.println(full.charAt(i));
} 


    }
    
}
