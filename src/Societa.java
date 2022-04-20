import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Societa {
	@Column(length = 2000)
	private String ragioneSociale;
	private String indirizzo;
	private String sede;
	private int nCivico;
	private String comune;
	private String cap;
	private String provincia;
	@Column(nullable = false)
	private String telefono;

	public Societa() {
	}

	public Societa(String ragioneSociale, String indirizzo, String sede, int nCivico, String comune, String cap,
			String provincia, String telefono) {
		super();
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
		this.sede = sede;
		this.nCivico = nCivico;
		this.comune = comune;
		this.cap = cap;
		this.provincia = provincia;
		this.telefono = telefono;
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

	public int getnCivico() {
		return nCivico;
	}

	public void setnCivico(int nCivico) {
		this.nCivico = nCivico;
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
}
