package fr.diginamic.tp_grasps.services;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public interface iReservationService {

	TypeReservation getTypeResvation(String typeReservation);

	Reservation getReservation(LocalDateTime dateReservation, int nbPlaces, Client client);

	double calculTarif(int nbPlaces, Client client, Reservation reservation, TypeReservation type);

}