import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
public class Docente {
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String dataNascita;
	@Column(nullable = false)
	private String luogoNascita;
	@Id
	private String partitaIva;
	@OneToMany(mappedBy = "docente", fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<Corso> corsi;

	public Docente() {
	}

	public Docente(String nome, String cognome, String dataNascita, String luogoNascita, String partitaIva,
			List<Corso> corsi) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.partitaIva = partitaIva;
		this.corsi = corsi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

}

/*
 * in questa classe sono sicuramente interessato a visualizzare i corsi del
 * docente, inoltre se un docente viene rimosso deve essere rimosso anche il
 * corso dato che esso può avere un solo docente, mentre se viene aggiunto è
 * utile controllare se bisogna aggiungere i rispettivi corsi
 */
