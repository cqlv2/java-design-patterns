package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

public class ReservationService {

	/** DAO permettant d'accéder à la table des types de réservation */
	private TypeReservationDao typeReservationDao = new TypeReservationDao();
	
	
	public TypeReservation getTypeResvation(String typeReservation) {
		return typeReservationDao.extraireTypeReservation(typeReservation);
	}
	
	public Reservation getReservation(LocalDateTime dateReservation,int nbPlaces,Client client) {
		Reservation reservation = new Reservation();
		reservation.setDate(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		return reservation;
	}
	
	public double calculTarif(int nbPlaces, Client client, Reservation reservation, TypeReservation type) {
		double total = type.getMontant() * nbPlaces;
		if (client.isPremium()) {
			reservation.setTotal(total*(1-type.getReductionPourcent()/100.0));
		}
		else {
			reservation.setTotal(total);
		}
		return total;
	}
	
}
