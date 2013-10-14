package modele.meta.core;

import modele.meta.core.miscellaneous.Attribut;


public class Composant extends ComposantSupreme{
	
	Attribut attribut;
	
//	PortRequis portRecquis;
//	PortFourni portFourni;
	
	public class PortRequis {
		private Connecteur.Glue.RoleSortie roleSortie;	
		private Configuration.PortConfigurationRequis bindingConfigurationPortRequis;
	}
	
	public class PortFourni {
		private Connecteur.Glue.RoleEntree roleEntree;
		private Configuration.PortConfigurationFourni bindingConfigurationPortFourni;
	}

}
