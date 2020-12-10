package fr.diginamic.tp_grasps.services;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.daos.ClientDao;

public class ClientService implements iClientService {

	/** DAO permettant d'accéder à la table des clients */
	private ClientDao clientDao = new ClientDao();
	
	
	@Override
	public Client getClient(String identifiantClient) {
		return clientDao.extraireClient(identifiantClient);
	}
	
	
	
	
}
