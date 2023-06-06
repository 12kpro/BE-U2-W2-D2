package mauro.simoni.beu2w2d2.services;


import org.springframework.stereotype.Service;

@Service
public class PrenotazioneSrv {
//    @Autowired
//    private PrenotazioneRepo prenotazioneRepo;
//
//    public void create(Prenotazione p) {
//        this.findByDataAndPostazione(p.getData(), p.getPostazione() );
//        this.findByUtenteAndData(p.getUtente(), p.getData());
//        prenotazioneRepo.save(p);
//    }
//
//    public void findByUtenteAndData(Utente utente, LocalDate data) throws PrenotazioneNotPossibleException{
//        prenotazioneRepo.findByUtenteAndData(utente, data).ifPresent(value -> new PrenotazioneNotPossibleException("L'utente ha già una prenotazione attiva nella data richiesta"));
//    }
//    public void findByDataAndPostazione(LocalDate data, Postazione postazione) throws PrenotazioneNotPossibleException {
//        prenotazioneRepo.findByDataAndPostazione(data, postazione).ifPresent(value -> new PrenotazioneNotPossibleException("Postazione già occupata nella data richiesta!"));
//    }
//    public Prenotazione findById(UUID id) throws IdNotFoundException{
//        return prenotazioneRepo.findById(id).orElseThrow(() -> new IdNotFoundException(id));
//    }
//    public void findByIdAndDelete(UUID id) {
//        Prenotazione found = this.findById(id);
//        prenotazioneRepo.delete(found);
//    }

}
