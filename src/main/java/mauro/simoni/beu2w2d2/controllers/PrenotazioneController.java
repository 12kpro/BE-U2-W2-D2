package mauro.simoni.beu2w2d2.controllers;

import mauro.simoni.beu2w2d2.exceptions.ReqException;
import mauro.simoni.beu2w2d2.services.InfoPrenotazioniSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

//    @Autowired
//    InfoPrenotazioniSrv infoPrenotazioniSrv;
//    @GetMapping("/{postazione}")
//    public String getMsg(@PathVariable String p, @RequestParam String d){
//        return infoPrenotazioniSrv.getInfoMSg(lang).orElseThrow(() -> new ReqException(lang));
//    }

}
