package modele.meta.core.composants;

import modele.meta.core.Composant;
import modele.meta.core.connecteurs.RPC;

public class Server extends Composant{
	
	public class ReceiveRequest extends Composant.PortFourni {
		private RPC.RPCin.ServerCalled serverCalled;
	}
	
	public class SendResponse extends Composant.PortRequis {
		private RPC.RPCout.ServerCaller serverCaller;
	}


}
