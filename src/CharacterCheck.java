import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");

        char ch =sc.next().charAt(0);

        if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch+ " is Alphabet:");
        }
        else if (ch>='0' && ch<='9'){
            System.out.println(ch+" is digit");
        }
        else {
            System.out.println(ch+" its Special character");
        }
    }
}
