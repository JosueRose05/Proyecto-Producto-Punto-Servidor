package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import interfacee.chatCliente;
import interfacee.chatServidor;

public class implementacionChat extends UnicastRemoteObject implements chatServidor{

	public ArrayList<chatCliente> clientes;
	public float n1=0, n2=0;
	public boolean n1_vacio=true, n2_vacio=true;
	
	implementacionChat() throws RemoteException {
		clientes = new ArrayList<chatCliente>();
	}

	@Override
	public void registro(chatCliente cliente) throws RemoteException {
		this.clientes.add(cliente);
		
	}

	@Override
	public void mensaje(String mensaje) throws RemoteException {
		int a = 0;

		while(a < clientes.size()) {
			clientes.get(a++).mensajeCliente(mensaje);
		}
		
			
		
	}
}