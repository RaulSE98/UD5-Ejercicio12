import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pw = "java2";
		Scanner sc = new Scanner(System.in);
		boolean c = false;
		int i = 3;
		
		while (c == false && i > 0) {
			System.out.println("Introduce la contraseña. Te quedan " +i+ " intentos.");
			if (pw.equals(sc.next())) {
				System.out.println("Enhorabuena");
				c = true;
			}else {
				System.out.println("Contraseña incorrecta");
				i--;
			}
		}

	}

}
