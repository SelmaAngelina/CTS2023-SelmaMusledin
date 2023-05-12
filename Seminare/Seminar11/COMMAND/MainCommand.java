package COMMAND;

public class MainCommand {

	public static void main(String[] args) {
		ManagerComenzi operator = new ManagerComenzi();
		
		Automobil autobuz1 = new Autobuz(13);
		
		operator.invocaComanda(new ComandaPlecareCursa(11,new Autobuz(1)));
		
		operator.invocaComanda(new ComandaPlecareCursa(10,autobuz1));
		
		operator.invocaComanda(new ComandaPlecareCursa(12,new Autobuz(2)));
		
		operator.invocaComanda(new ComandaPlecareCursa(10,autobuz1));
		
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		


	}

}
