
package oop_lab4;
import java.util.*;


public class Oop_Lab4 {

    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Soru:");
        System.out.println("Cümleyi Giriniz:");
        String str1 = scan.nextLine();
        
        //Bugün hava güzel. Yürüyüş yoluna gidelim.
        
        int whiteSpaceCount, upperCaseCount, dotCount;
        whiteSpaceCount = upperCaseCount = dotCount = 0;
       
        for(int i = 0; i < str1.length(); i++){
            char character = str1.charAt(i);
            
            if (character == ' '){
                whiteSpaceCount++;
            }else if(Character.isUpperCase(character)) {
              upperCaseCount++;
            }else if (character == '.'){
                dotCount++;
            }
        }
        
        int lowerCaseCount = str1.length() - whiteSpaceCount - upperCaseCount - dotCount;
        System.out.println("Bosluk Sayisi: " + whiteSpaceCount);
        System.out.println("Kucuk Harf Sayisi: " + lowerCaseCount);
        
        System.out.println("2.Soru:");
        
        String str2 =  "Dersi Java 2012 Programlama Fall ";
        System.out.print("Default String: ");
        System.out.println(str2);
        str2 = ReplaceString(str2, "Dersi", "Programlama");
        str2 = ReplaceString(str2, "2012", "Fall");
        System.out.print("New String: ");
        System.out.println(str2);
    }
    
    
    public static String ReplaceString(String defaultString, String strToReplace, String goesAfterTheWord) {
        
        
        int beginningOfReplacement = defaultString.indexOf(strToReplace);
        int endOfReplacement = defaultString.indexOf(strToReplace) + strToReplace.length() + 1;
         defaultString = defaultString.substring(0, beginningOfReplacement) +defaultString.substring(endOfReplacement); 
         
         int newPosition = defaultString.indexOf(goesAfterTheWord) + goesAfterTheWord.length() +1;
         
         String strNew = defaultString.substring(0, newPosition) + strToReplace + " " + defaultString.substring(newPosition);
         
         return strNew;
   }
   
}
