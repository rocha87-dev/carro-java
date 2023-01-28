package estudando_java;



public class estudosJava {

	public static void main(String[] args) {
			carro c1=new carro("Golf");
			carro c2=new carro("HRV");
			carrocombate c3=new carrocombate("Leopardo", 100);
			carrocombate c4=new carrocombate("Pantera", 50);
			
			c3.atirar();
			c3.atirar();
			c3.atirar();
			c4.sofrerDano(30);
			c1.sofrerDano(5);
			
			
			c1.info();
			c2.info();
			c3.info();
			c4.info();
			
	}

}
