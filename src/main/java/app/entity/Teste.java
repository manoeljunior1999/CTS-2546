package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela TESTE
* @generated
*/
@Entity
@Table(name = "\"TESTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Teste")
public class Teste implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataExpiracao", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date dataExpiracao;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataHora", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date dataHora;

    /**
    * Construtor
    * @generated
    */
    public Teste(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Teste setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém dataExpiracao
    * return dataExpiracao
    * @generated
    */
    
    public java.util.Date getDataExpiracao(){
        return this.dataExpiracao;
    }

    /**
    * Define dataExpiracao
    * @param dataExpiracao dataExpiracao
    * @generated
    */
    public Teste setDataExpiracao(java.util.Date dataExpiracao){
        this.dataExpiracao = dataExpiracao;
        return this;
    }
    /**
    * Obtém dataHora
    * return dataHora
    * @generated
    */
    
    public java.util.Date getDataHora(){
        return this.dataHora;
    }

    /**
    * Define dataHora
    * @param dataHora dataHora
    * @generated
    */
    public Teste setDataHora(java.util.Date dataHora){
        this.dataHora = dataHora;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Teste object = (Teste)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}