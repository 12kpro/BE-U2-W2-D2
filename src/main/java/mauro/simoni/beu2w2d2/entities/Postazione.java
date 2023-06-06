package mauro.simoni.beu2w2d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mauro.simoni.beu2w2d2.TipoPostazione;


import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Postazione {
    private UUID id ;
    private String descrizione;
    private TipoPostazione tipo;
    private Integer occupanti;
}
