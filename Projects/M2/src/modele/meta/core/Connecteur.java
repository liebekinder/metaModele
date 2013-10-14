package modele.meta.core;

public class Connecteur extends ComposantSupreme{
	
//	Glue glue;
	
	public class Glue {
		
//		RoleSortie roleSortie;
//		RoleEntree roleEntree;
		
		public class RoleSortie {
			private Composant.PortRequis portRecquis;
		}
		
		public class RoleEntree {
			private Composant.PortFourni portFourni;
		}
	}

}
