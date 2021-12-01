package cliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import interfacee.chatCliente;
import interfacee.chatServidor;

public class implementacionClienteChat extends UnicastRemoteObject implements chatCliente, Runnable{

	chatServidor servidor;
	ClienteInfo cliente;
	boolean bandera = true;
	
	
	implementacionClienteChat(ClienteInfo cliente, chatServidor servidor) throws RemoteException {
		this.cliente = cliente;
		this.servidor = servidor;
		this.cliente.imp = this;
		servidor.registro(cliente);
	}

	@Override
	public void run() {
		while(bandera) {
			try {
				servidor.mensaje("" + cliente.tam);
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("ERROR ***********");
			}
		}
	}

	@Override
	public void mensajeCliente(String mensaje) throws RemoteException {
		System.err.println(mensaje);
		bandera = false;
	}
}