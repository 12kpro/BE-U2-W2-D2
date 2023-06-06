package mauro.simoni.beu2w2d2.services;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class InfoPrenotazioniSrv {
    private Map<String, String> infoPrenotazioniMsg = Map.of(
            "it", "Queste sono le regole per la prenotazione:....",
            "en", "This is the booking rules:....."
    );
    public Optional<String>  getInfoMSg(String lang){
        return Optional.ofNullable(infoPrenotazioniMsg.get(lang));
    }

}
