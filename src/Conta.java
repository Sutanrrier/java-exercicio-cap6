
public class Conta {
	
	String titular, agencia;
	int numero;
	double saldo;
	
	public void deposita(double valor) {
		saldo += valor;
	}
	public void saca(double valor) {
		saldo -= valor;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}
