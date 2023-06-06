package mauro.simoni.beu2w2d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Utente {
    private UUID id;
    private String nome;
    private String cognome;
    private String email;
}
