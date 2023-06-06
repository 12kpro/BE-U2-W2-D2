package mauro.simoni.beu2w2d2.controllers;

import mauro.simoni.beu2w2d2.exceptions.ReqException;
import mauro.simoni.beu2w2d2.services.InfoPrenotazioniSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/infoprenotazioni")
public class InfoController {
    @Autowired
    InfoPrenotazioniSrv infoPrenotazioniSrv;
    @GetMapping("/{lang}")
    public String getMsg(@PathVariable String lang){
        return infoPrenotazioniSrv.getInfoMSg(lang).orElseThrow(() -> new ReqException(lang));
    }
}