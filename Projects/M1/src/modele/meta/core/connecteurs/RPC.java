package modele.meta.core.connecteurs;

import modele.meta.core.Connecteur;
import modele.meta.core.composants.Client;
import modele.meta.core.composants.Server;


public class RPC extends Connecteur{
	
	public class RPCin extends Connecteur.Glue {
		public class ClientCaller extends Connecteur.Glue.RoleEntree {
			private Client.SendRequest sendRequest;
		}
		
		public class ServerCalled extends Connecteur.Glue.RoleSortie {
			private Server.ReceiveRequest receiveResponse;
		}
	}
	
	public class RPCout extends Connecteur.Glue {
		public class ServerCaller extends Connecteur.Glue.RoleSortie {
			private Server.SendResponse sendResponse;
		}
		
		public class ClientCalled extends Connecteur.Glue.RoleEntree {
			private Client.GetResponse getResponse;
		}
	}

}
