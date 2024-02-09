import java.util.Scanner;

public class WhileTrue {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name;

        while(true) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            if(name.equals("dennis")) {
                System.out.println("welcome , "+ name );
                break;
            }
            System.out.println("wrong, you are not " + name);
        }




    }
}
