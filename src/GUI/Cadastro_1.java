/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "cadastro", catalog = "pci_v2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cadastro_1.findAll", query = "SELECT c FROM Cadastro_1 c")
    , @NamedQuery(name = "Cadastro_1.findByCodCad", query = "SELECT c FROM Cadastro_1 c WHERE c.codCad = :codCad")
    , @NamedQuery(name = "Cadastro_1.findByNome", query = "SELECT c FROM Cadastro_1 c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cadastro_1.findByEmail", query = "SELECT c FROM Cadastro_1 c WHERE c.email = :email")
    , @NamedQuery(name = "Cadastro_1.findByTel", query = "SELECT c FROM Cadastro_1 c WHERE c.tel = :tel")
    , @NamedQuery(name = "Cadastro_1.findByCel", query = "SELECT c FROM Cadastro_1 c WHERE c.cel = :cel")
    , @NamedQuery(name = "Cadastro_1.findByCpf", query = "SELECT c FROM Cadastro_1 c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "Cadastro_1.findByLogradouro", query = "SELECT c FROM Cadastro_1 c WHERE c.logradouro = :logradouro")
    , @NamedQuery(name = "Cadastro_1.findByNumero", query = "SELECT c FROM Cadastro_1 c WHERE c.numero = :numero")
    , @NamedQuery(name = "Cadastro_1.findByBairro", query = "SELECT c FROM Cadastro_1 c WHERE c.bairro = :bairro")
    , @NamedQuery(name = "Cadastro_1.findByCidade", query = "SELECT c FROM Cadastro_1 c WHERE c.cidade = :cidade")
    , @NamedQuery(name = "Cadastro_1.findByEstado", query = "SELECT c FROM Cadastro_1 c WHERE c.estado = :estado")
    , @NamedQuery(name = "Cadastro_1.findByCep", query = "SELECT c FROM Cadastro_1 c WHERE c.cep = :cep")})
public class Cadastro_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_cad")
    private Integer codCad;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "tel")
    private String tel;
    @Column(name = "cel")
    private String cel;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "numero")
    private String numero;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    @Column(name = "cep")
    private String cep;

    public Cadastro_1() {
    }

    public Cadastro_1(Integer codCad) {
        this.codCad = codCad;
    }

    public Cadastro_1(Integer codCad, String nome) {
        this.codCad = codCad;
        this.nome = nome;
    }

    public Integer getCodCad() {
        return codCad;
    }

    public void setCodCad(Integer codCad) {
        Integer oldCodCad = this.codCad;
        this.codCad = codCad;
        changeSupport.firePropertyChange("codCad", oldCodCad, codCad);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        String oldTel = this.tel;
        this.tel = tel;
        changeSupport.firePropertyChange("tel", oldTel, tel);
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        String oldCel = this.cel;
        this.cel = cel;
        changeSupport.firePropertyChange("cel", oldCel, cel);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        String oldLogradouro = this.logradouro;
        this.logradouro = logradouro;
        changeSupport.firePropertyChange("logradouro", oldLogradouro, logradouro);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCad != null ? codCad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastro_1)) {
            return false;
        }
        Cadastro_1 other = (Cadastro_1) object;
        if ((this.codCad == null && other.codCad != null) || (this.codCad != null && !this.codCad.equals(other.codCad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.Cadastro_1[ codCad=" + codCad + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
