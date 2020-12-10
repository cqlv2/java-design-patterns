package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.daos.ClientDao;

public class ClientService {

	/** DAO permettant d'accéder à la table des clients */
	private ClientDao clientDao = new ClientDao();
	
	
	public Client getClient(String identifiantClient) {
		return clientDao.extraireClient(identifiantClient);
	}
	
	
	
	
}
