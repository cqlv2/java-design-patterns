package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.services.ClientService;
import fr.diginamic.tp_grasps.services.ReservationService;
import fr.diginamic.tp_grasps.services.iClientService;
import fr.diginamic.tp_grasps.services.iReservationService;
import fr.diginamic.tp_grasps.utils.DateUtils;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController{
	
	private iClientService clientServ = new ClientService();
	private iReservationService reservServ = new ReservationService();	
	
	
	/** Méthode qui créée une réservation pour un client à partir des informations transmises
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */
	public Reservation creerReservation(Params params) {
		
		// 1) Récupération des infos provenant de la classe appelante
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		int nbPlaces = params.getNbPlaces();
		
		// 2) Conversion de la date de réservation en LocalDateTime
		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);

		
		// 3) Extraction de la base de données des informations client
		Client client = clientServ.getClient(identifiantClient);
		
		// 4) Extraction de la base de données des infos concernant le type de la réservation
		TypeReservation type = reservServ.getTypeResvation(typeReservation);
		
		// 5) Création de la réservation
		Reservation reservation = reservServ.getReservation(dateReservation, nbPlaces, client);
		
		// 6) Ajout de la réservation au client
		
		client.getReservations().add(reservation);
		
		// 7) Calcul du montant total de la réservation qui dépend:
		//    - du nombre de places
		//    - de la réduction qui s'applique si le client est premium ou non
		
			reservation.setTotal(reservServ.calculTarif(nbPlaces, client, reservation, type));
		return reservation;
	}
}
