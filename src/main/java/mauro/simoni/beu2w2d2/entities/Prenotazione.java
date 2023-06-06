package mauro.simoni.beu2w2d2.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Prenotazione {
    private UUID id;
    private LocalDate data;
    private Postazione postazione;
    private Utente utente;
}
