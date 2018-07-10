package clinica;

public class Medico {
    
    private String nome;
    private String crm;
    private String especialidade;
    private String endereco;
    private String telefone;
    private String celular;
    
    public Medico(String nome, String crm, String especialidade,String endereco, String telefone, String celular){
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.celular = celular;
        
    }
    
    public Medico(){
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
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
     * @return the celular
     */
    public String getCelular() {
        return celular;
    
    }
    
    
    
}
