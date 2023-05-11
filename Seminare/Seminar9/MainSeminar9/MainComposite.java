package MainSeminar9;

import Composite.IComponentaAbstract;
import Composite.Loc;
import Composite.Tribuna;

public class MainComposite {

	public static void main(String[] args) throws Exception {
		IComponentaAbstract tribunaP = new Tribuna("Tribuna Principala");
		IComponentaAbstract tribunaC=new Tribuna("Tribuna Copii");
        IComponentaAbstract tribunaA=new Tribuna("Tribuna Adulti");
        
        IComponentaAbstract loc1 = new Loc(2,1);
        IComponentaAbstract loc2 = new Loc(2,2);
        IComponentaAbstract loc3 = new Loc(2,3);
        
        tribunaP.adaugaNod(tribunaC);
        tribunaP.adaugaNod(tribunaA);
        tribunaC.adaugaNod(loc1);
        tribunaA.adaugaNod(loc2);
        tribunaP.adaugaNod(loc3);
        tribunaP.afiseazaComponenta(" ");
	}

}
