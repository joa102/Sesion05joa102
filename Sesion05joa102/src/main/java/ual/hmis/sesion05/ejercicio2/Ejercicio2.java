package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {

	public boolean login (String username, String password){
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty())
			return false;
		
		// comprobar que la longitud sea < 30
		if (username.length()>= 30 || password.length()>=30)
			return false;
		
		// comprobar que el password tenga al menos una letra mayúscula, una minúscula y un dígito
		int countUC = 0, countLC = 0, countD = 0;
		
		for (int i = 0; i < password.length(); i++) {
			
			if (Character.isUpperCase(password.charAt(i))) {
				countUC++;
			}
			
			if (Character.isLowerCase(password.charAt(i))) {
				countLC++;
			}
			
			if (Character.isDigit(password.charAt(i))) {
				countD++;
			}
			
		}
		
		if ((countUC < 1) || (countLC < 1) || (countD < 1)) {
			return false;
		}
		
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);
	}
	
	public boolean compruebaLoginEnBD (String username, String password){
		// método mock (simulado)
		if (username.equals("user") && password.equals("Pass1"))
			return true;
		else
			return false;
	}
}
