package projectIDS.dmd.repository.PuntoVenditaUtilitiesRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import projectIDS.dmd.model.puntovenditautilities.ComunicazionePromozionale;
import projectIDS.dmd.model.puntovenditautilities.PuntoVendita;

/**
 * ComunicazionePromozionaleRepository è un'interfaccia che estende JpaRepository<ComunicazionePromozionale, Integer>,
 * indicando che è un repository per l'entità ComunicazionePromozionale con un identificatore di tipo Integer.
 * Fornisce operazioni di accesso ai dati per gestire gli oggetti ComunicazionePromozionale.
 */
public interface ComunicazionePromozionaleRepository extends JpaRepository<ComunicazionePromozionale, Integer> {
    List<ComunicazionePromozionale> findByPuntoVenditaMittente(PuntoVendita puntoVendita);

}

