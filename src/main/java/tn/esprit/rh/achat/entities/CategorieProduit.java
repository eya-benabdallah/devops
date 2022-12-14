package tn.esprit.rh.achat.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CategorieProduit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorieProduit;
	private String codeCategorie;
	private String libelleCategorie;
	@OneToMany(mappedBy = "categorieProduit")
	@JsonIgnore
	private Set<Produit> produits;
	
	public Long getIdCategorieProduit() {
		return idCategorieProduit;
	}
	public void setIdCategorieProduit(Long idCategorieProduit) {
		this.idCategorieProduit = idCategorieProduit;
	}
	public String getCodeCategorie() {
		return codeCategorie;
	}
	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}
	public String getLibelleCategorie() {
		return libelleCategorie;
	}
	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}
	public Set<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CategorieProduit(long l, Object object, Object object2, Object object3) {
		super();
	}
	public CategorieProduit(Long idCategorieProduit, String codeCategorie, String libelleCategorie,
			Set<Produit> produits) {
		this.idCategorieProduit = idCategorieProduit;
		this.codeCategorie = codeCategorie;
		this.libelleCategorie = libelleCategorie;
		this.produits = produits;
	}
	public CategorieProduit() {
	}
	
	
	
}
