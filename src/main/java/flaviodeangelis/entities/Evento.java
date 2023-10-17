package flaviodeangelis.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private long id;
    private String titolo;
    private Date dataEvento;
    private String descrizione;
    private TipoEvento tipoEvento;
    private int numeroMassimoPartecipanti;


public Evento(String titolo,Date dataEvento,String descrizione,TipoEvento tipoEvento,int numeroMassimoPartecipanti){
    this.titolo = titolo;
    this.dataEvento = dataEvento;
    this.descrizione = descrizione;
    this.tipoEvento = tipoEvento;
    this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;

}
    public String getTitolo() {
        return titolo;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public long getId() {
        return id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}
