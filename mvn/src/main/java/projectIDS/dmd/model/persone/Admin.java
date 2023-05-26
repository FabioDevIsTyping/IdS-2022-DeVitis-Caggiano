package projectIDS.dmd.model.persone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import projectIDS.dmd.model.puntovenditautilities.PuntoVendita;

@Entity
@Table (name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;

    private String cognome;

    private String username;

    private String password;

    private String email;

    private String numeroTelefonico;
    
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "puntoVendita_id", referencedColumnName = "id")
    private PuntoVendita puntoVendita;
    
    /**
     * Returns the ID of this admin user.
     *
     * @return the ID of this admin user.
     */
    public int getId()
    {
        return this.id;
    }
    
    /**
     * Returns the name of this admin user.
     *
     * @return the name of this admin user.
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * Sets the name of this admin user.
     *
     * @param newName the new name of this admin user.
     */
    public void setNome(String newName){
        this.nome=newName;
    
    }
    
    /**
     * Returns the surname of this admin user.
     *
     * @return the surname of this admin user.
     */
    public String getCognome(){
        return this.cognome;
    }
    
    /**
     * Sets the surname of this admin user.
     *
     * @param newCognome the new surname of this admin user.
     */
    public void setCognome(String newCognome){
        this.cognome=newCognome;
    }
    
    /**
     * Returns the store associated with this admin user.
     *
     * @return the store associated with this admin user.
     */
     public PuntoVendita getPuntoVendita()
     {
        return this.puntoVendita;
    }
    
     /**
     * Sets the store associated with this admin user.
     *
     * @param newPuntoVendita the new store associated with this admin user.
     */
    public void setPuntoVendita(PuntoVendita newPuntoVendita)
    {
        this.puntoVendita=newPuntoVendita;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    

    

    
}