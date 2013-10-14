package modele.meta.core.composants;

import modele.meta.core.Composant;
import modele.meta.core.connecteurs.RPC;
import modele.meta.core.miscellaneous.Attribut;

public class Client extends Composant{
	
//	CodeSource codeSource;
//	Visualisateur visualisateur;
	
	public class SendRequest extends Composant.PortFourni {
		private RPC.RPCin.ClientCaller clientCaller;
	}
	
	public class GetResponse extends Composant.PortRequis {
		private RPC.RPCout.ClientCalled clientCalled;
	}
	
	public class Visualisateur extends Attribut {
		
	}
	
	public class CodeSource extends Attribut {
		
	}


}
