import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//Se una società viene rimossa, vengono rimossi gli allievi associati

@Entity
public class Societa {
	
	@Id
	private Long id;
	private String ragioneSociale;
	private String indirizzo;
	private String sede;
	private String comune;
	private String cap;
	private int numeroCivico;
	private String provincia;
	@Column(nullable = false)
	private String telefono;
	@OneToMany(cascade = CascadeType.REMOVE)
	private List<Allievo> allievi;

	public Societa() {
	}

	public Societa(Long id, String ragioneSociale, String indirizzo, String sede, int numeroCivico, String comune, String cap,
			String provincia, String telefono) {
		super();
		this.id = id;
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
		this.sede = sede;
		this.numeroCivico = numeroCivico;
		this.comune = comune;
		this.cap = cap;
		this.provincia = provincia;
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public int getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}
	
}
