import java.lang.*;
class String7{
 public static void main(String args[]){
   //String buffer

   StringBuffer str= new StringBuffer("Shweta Davari");
   System.out.println("Original string: "+str);
   System.out.println("String lenth: "+str.length());

   for(int i=0;i<str.length();i++)
   {
   int p=i+1;
   System.out.println("Character at position: " +p+ " is "+str.charAt(i));
   }

   //String buffer to string

   String str1= new String(str.toString());
   int pos=str1.indexOf(" D");
   str.insert(pos,"Pandit");  
   System.out.println("Modified String: "+str);

   str.setCharAt(6,':');
   System.out.println("Modified String: "+str);

   str.append(" (Kolhapur)");
   System.out.println("Appending String: "+str);

 }
}