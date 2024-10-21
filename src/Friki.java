import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundo = sc.nextInt();
        String temps;
        int dia = (segundo / 86400) + 1;
        int segundosRestantes = (segundo % 86400);
        if (segundosRestantes < 43200){
            temps = "mati ";
        } else {
            temps = "nit";
        }
        System.out.println(temps+" del dia "+dia);
    }
}//este es el cambio en la rama 2