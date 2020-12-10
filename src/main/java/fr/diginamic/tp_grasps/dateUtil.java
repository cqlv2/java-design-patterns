package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface dateUtil {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	default LocalDateTime toDate(String dateStr) {
		return LocalDateTime.parse(dateStr, formatter);
	}
}

