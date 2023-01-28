package estudando_java;

public class carrocombate extends carro{
	
	private final int MAX_ARMAMENTO=100;    //ATRIBUTOS
	private final int MIN_ARMAMENTO=0;
	private int qtdeArmamento;
	
	public carrocombate(String nome,int blindagem) {  /*<<<----Construtor da CLASSE FILHO (carrocombate)*/
		
		super(nome);      /* <<<------ Ele chama o Construtor da CLASSE PAI*/
		setArmamento(true);
		setBlindagem(blindagem);
		this.qtdeArmamento=100;
	}
	public void setQtdeArmamento(int qtdeArmamento) {
		this.qtdeArmamento+=qtdeArmamento;
		if(this.qtdeArmamento > MAX_ARMAMENTO) {
			this.qtdeArmamento=MAX_ARMAMENTO;
		}
		if(this.qtdeArmamento < MIN_ARMAMENTO) {
			this.qtdeArmamento=MIN_ARMAMENTO;
		}
	}
	public int getQtdeArmamento() {
		return this.qtdeArmamento;
	}
	public void atirar() {
		if(this.qtdeArmamento > MIN_ARMAMENTO) {
			setQtdeArmamento(-1);
		}else {
			System.out.println("Sem Munição");
		}
		
	}
	public void info() {
		super.info();   /*Puxa o methodo info() da CLASSE PAI */
		System.out.printf("Qtde.Arm......%d%n", this.qtdeArmamento);
		
		
	}
			
}
