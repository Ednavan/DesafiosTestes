package Financeiro;

public class Conta {
	private int saldo;
	 private int vl_recarga;
	 public Conta(int saldo){
	 this.saldo = saldo;
	 }
	 public void setSaldo(int saldo) {
	 this.saldo = saldo;
	 }
	 public int getSaldo() {
	 return this.saldo;
	 }
	 public void setRecarga(int vl_recarga) {
	 this.vl_recarga = vl_recarga;
	 }
	 public int getRecarga() {
	 return this.vl_recarga;
	 }
	 
	 void recarga(int vl_recarga){ //funcao recarga
			this.saldo = this.saldo - vl_recarga;
		}
	}
	
