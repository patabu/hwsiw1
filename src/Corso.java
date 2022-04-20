import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import java.util.*;

public class Corso {
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private Date dataInizio;
	@Column(nullable = false)
	private int durataMesi;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Docente docente;
	@ManyToMany(mappedBy = "corsi", cascade = CascadeType.PERSIST)
	private List<Allievo> allievi;

	public Corso() {
	}

	public Corso(String nome, Date dataInizio, int durataMesi, Docente docente) {
		super();
		this.nome = nome;
		this.dataInizio = dataInizio;
		this.durataMesi = durataMesi;
		this.docente = docente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getDurataMesi() {
		return durataMesi;
	}

	public void setDurataMesi(int durataMesi) {
		this.durataMesi = durataMesi;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}
/*ogni volta che voglio rendere persistente un corso è utile verificare la presenza del
 * docente associato e degli allievi che lo frequentano
 */
}
