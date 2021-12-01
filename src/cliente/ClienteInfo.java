package cliente;

import interfacee.chatServidor;
import servidor.implementacionChat;

public class ClienteInfo {
	public String nombre;
	public int tam;
	public int[] vector;
	public boolean is_ready;
	public chatServidor servidor;
	public implementacionClienteChat imp;
	public int op; //0=secuencial, 1=fork, 2=exec
	
	public ClienteInfo(String nombre, chatServidor servidor) {
		this.nombre = nombre;
		this.servidor = servidor;
		this.is_ready = false;
		this.tam = 1;
	}
	
	public void set_vector(int[] vector) {
		this.vector = vector;
	}
	
	public void set_tam(int i) {
		this.tam = i;
	}
	
	public void set_op(int i) {
		this.op = i;
	}
	
}
