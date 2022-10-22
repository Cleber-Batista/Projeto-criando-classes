
public class Caneta {
	//public static void main(String[] args) {
		public String modelo ;
		public float ponta ;
		
		
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		
		public float getPonta() {
			return ponta;
		}
		public void setPonta(float ponta) {
			this.ponta = ponta;
		}
		
		public void status () {
			System.out.println("Sobre a caneta ");
            System.out.println ("modelo" + this.modelo);
            System.out.println("ponta" + this.ponta);
		}
	}
	
	

