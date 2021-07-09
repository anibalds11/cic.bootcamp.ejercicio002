package ejercicio002;

public class Motor {

	public int potencia = (int) (Math.random()*40)+20;
	
	public int arrancar()
	{
		return potencia/7;
	}
}
