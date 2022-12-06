
package oop_lab6;
import java.util.*;

public class Oop_Lab6 {
    public static int KarakterSayısı(Scanner scan) {
        System.out.println("Cümleyi giriniz:");
                String cumle;
                cumle = scan.nextLine();
                int charCount = 0;
                for (int i = 0; i < cumle.length(); i++) {
                    if(cumle.charAt(i) != ' '){
                        charCount++;
                    }
                }
                System.out.println(charCount);
        return 0;
    }
    
    public static char[] OrtakKarakter(Scanner scan) {
        System.out.println("1. kelimeyi girin:");
        String str1 = scan.nextLine();
        System.out.println("2. kelimeyi girin:");
        String str2 = scan.nextLine();
        char arr[] = new char[100];
        String smallStr, bigStr;
        if(str1.length() < str2.length()){
            smallStr = str1;
            bigStr = str2;
        }else{
            smallStr = str2;
            bigStr = str1;
        }
        boolean isContains = false;
        for (int i = 0; i < smallStr.length(); i++) {
            for (int j = 0; j < bigStr.length(); j++) {
                if(smallStr.charAt(i) == bigStr.charAt(j)){
                    //Check if the arr[] contains the character arr[i]. 
                   for (int k = 0; k < arr.length; k++) {
                        if(arr[k] == smallStr.charAt(i)){
                            isContains = true;
                        }
                    }
                   //if arr[] does not contain the character arr[i] add it to the arr[].
                  if(!isContains){
                        arr[i] = smallStr.charAt(i);
                    }
                   isContains = false;
                }
            }
        }
        return arr;
    }
    public static void CevirToArrayList(Scanner scan) {
        ArrayList<String> kelimeler = new ArrayList<String>(100);
        System.out.println("Cümleyi Giriniz:");
        String cumle = scan.nextLine();
        int kelimeBaslangicIndex = 0, kelimeSonIndex = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i) != ' ' && cumle.charAt(i) != '.' && i != cumle.length()-1)
            {
                kelimeSonIndex = i;
            }else {
                kelimeSonIndex = i;
                kelimeler.add(cumle.substring(kelimeBaslangicIndex, kelimeSonIndex));
                kelimeBaslangicIndex = i + 1;
                kelimeSonIndex++;
            }
        } 
        System.out.print("Kelimeler: \n[");
        for (int i = 0; i < kelimeler.size(); i++) {
            System.out.print((i == kelimeler.size()-1) ? kelimeler.get(i) : kelimeler.get(i) + ", ");
        } 
        System.out.println("]");
        System.out.println("To String Ciktisi:");
        System.out.println(kelimeler.toString());
        Menu();
    }
    
    public static void Menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("1.Karakter sayısını say.");
        System.out.println("2.İki kelime arasındaki ortak karakterleri bul.");
        System.out.println("3.Cümleyi ArrayList'e dönüştür.");
        System.out.println("4.Çıkış.");
        System.out.println("Lütfen yapmak istediğiniz işlemin numarasını girin.");
        
         int islemNumarasi = scan.nextInt();
        scan.nextLine();
        switch(islemNumarasi){
            case 1 -> {
                KarakterSayısı(scan);
                Menu();
                break;
            }
            case 2 -> {
                char[] arr = OrtakKarakter(scan);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println(" ");
                Menu();
                break;
            }
            case 3 -> {
                CevirToArrayList(scan);
                break;
            }
            case 4 -> {
                System.exit(0);
            }
         }
    }
    
    public static void main(String[] args) {
        Menu();
    }
}
