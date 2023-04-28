package string;

public class builder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("kunal");       //sb name ki string jiksa type han stringbuilder 
System.out.println(sb);

// char at 0 index
System.out.println(sb.charAt(0));
// setcahr at index
sb.setCharAt(0,'y');                
System.out.println(sb);

//insert string
sb.insert(2,'h');
System.out.println(sb);

// to delete
sb.delete(0, 1);
System.out.println(sb);


//append in string
sb.append("j");
System.out.println(sb);
    }


}
