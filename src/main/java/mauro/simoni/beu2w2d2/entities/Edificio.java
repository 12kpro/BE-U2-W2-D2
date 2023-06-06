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

public class Edificio {
    private UUID id;
    private String name;
    private String indirizzo;
    private Citta citta;
}
