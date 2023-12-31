package src.Assignments;


import java.util.Scanner;

public class countVowelsandConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        //String str = "Satyaansh is a super kid";
        int vcount =0;
        int ccount = 0;
        str= str.toLowerCase();
        for(int i=0;i<=str.length()-1;i++)
        {
            if (str.charAt(i)== 'a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
            {
              vcount++;
            }
            else
            {
                if(str.charAt(i)>='a' && str.charAt(i)<= 'z')
                {
                    ccount++;
                }
            }
        }
        System.out.println("Vowel Count" + vcount);
        System.out.println("Consonant Count" + ccount);

    }

}
