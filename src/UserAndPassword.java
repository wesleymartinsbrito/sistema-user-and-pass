import java.util.Scanner;

public class UserAndPassword {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String username;
        String password;
        boolean valid = false;

        do {
            System.out.println("Digite um nome de usuário: ");
            username = scan.next();
            System.out.println("Digite uma senha: ");
            password = scan.next();

            if (password.equalsIgnoreCase(username)){
                System.out.println("Digite uma senha válida!");
            } else {
                System.out.println("Usuário cadastrado com sucesso! :)");
                valid = true;
            }
        } while (!valid);
    }
}
