package clinica;

import java.util.ArrayList;

public class Paciente {
    
    private String nome;
    private String cpf;
    private String idade;
    private String sexo;
    private String endereco;
    private String telefone;
    private String celular;

    public Paciente( String nome, String cpf, String idade, String sexo, String endereco, String telefone, String celular){
        
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.celular = celular;
    } 

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }
    
    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }
     
    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }
    
    /**
     * @return the cidade
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @return the profissao
     */
    public String getCelular() {
        return celular;
    }
    
}

