package br.senac.rn.model;

import br.senac.rn.dao.PersistDB;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_clientes")
public class Cliente implements PersistDB, Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "cli_id")
    private int id;
    @Column(name = "cli_nome")
    private String nome;
    @Column(name = "cli_cpf")
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "cli_sex_id")
    private Sexo sexo;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + '}';
    }
    
}
