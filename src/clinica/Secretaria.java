package clinica;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Secretaria {
    
    private Paciente paciente;
    private Medico medico;
    private ArrayList <Paciente> listPacientes = new ArrayList <Paciente>();
    private ArrayList <Medico> listMedicos = new ArrayList <Medico>();
    
    public Secretaria(){
        
    }
    
    public void cadPaciente(String nome, String cpf, String idade, String sexo, String endereco, 
            String telefone, String celular) throws IOException{
        
        FileWriter arq = new FileWriter("listPac.txt", true);
        BufferedWriter escritor = new BufferedWriter(arq);

        escritor.write(nome);
        escritor.write(" | ");
        escritor.flush();
        escritor.write(cpf);
        escritor.write(" | ");
        escritor.flush();
        escritor.write(idade);
        escritor.write(" | ");
        escritor.flush();
        escritor.write(sexo);
        escritor.write(" | ");
        escritor.flush();
        escritor.write(endereco);
        escritor.write(" | ");
        escritor.flush();
        escritor.write(telefone);
        escritor.write(" | ");
        escritor.flush();
        escritor.write(celular);
        escritor.write(" ");
        escritor.flush();
        escritor.newLine();
        escritor.flush();

        arq.close();
        
        paciente = new Paciente(nome, cpf, idade, sexo, endereco, telefone, celular);
        listPacientes.add(paciente);
        
    }
    
    public void cadMedico(String nome, String crm, String especialidade, String endereco, 
            String telefone, String celular) throws IOException{
        
        FileWriter arq = new FileWriter("listMed.txt", true);
        BufferedWriter escritor = new BufferedWriter(arq);
        
        escritor.write(nome);
        escritor.write(" |");
        escritor.flush();
        escritor.write(crm);
        escritor.write(" |");
        escritor.flush();
        escritor.write(especialidade);
        escritor.write(" |");
        escritor.flush();
        escritor.write(endereco);
        escritor.write(" |");
        escritor.flush();
        escritor.write(telefone);
        escritor.write(" |");
        escritor.flush();
        escritor.write(celular);
        escritor.write(" |");
        escritor.flush();
        escritor.newLine();
        escritor.flush();
        
        arq.close();
        
        medico = new Medico(nome, crm, especialidade, endereco, telefone, celular);
        listMedicos.add(medico);
     
    }
    
    public void excPaciente(String nome) throws FileNotFoundException, IOException{
        
        FileReader arq = new FileReader("listPac.txt");
        BufferedReader leitor = new BufferedReader(arq);
        FileWriter arq2 = new FileWriter("listPacTemp.txt");
        BufferedWriter escritor = new BufferedWriter(arq2);
        String linha;
        
        linha = leitor.readLine();
        while(linha != null){
            if(linha.contains(nome)){
                
            }else{
                escritor.write(linha);
                escritor.newLine();
                escritor.flush();
            }
            linha = leitor.readLine();
        }
        arq.close();        
        arq2.close();
        new File("listPac.txt").delete();
        new File("listPacTemp.txt").renameTo(new File("listPac.txt"));

        /*for(int i=0; i < listPacientes.size(); i++){
            if(listPacientes.get(i).getNome().equals(nome)){
                listPacientes.remove(i);
            }
        }*/
        
    }
    
    public void excMedico(String nome) throws FileNotFoundException, IOException{
        
        FileReader arq = new FileReader("listMed.txt");
        BufferedReader leitor = new BufferedReader(arq);
        FileWriter arq2 = new FileWriter("listMedTemp.txt");
        BufferedWriter escritor = new BufferedWriter(arq2);
        String linha;
        
        linha = leitor.readLine();
        while(linha != null){
            if(linha.contains(nome)){
                
            }else{
                escritor.write(linha);
                escritor.newLine();
                escritor.flush();
            }
            linha = leitor.readLine();
        }
        arq.close();        
        arq2.close();
        new File("listMed.txt").delete();
        new File("listMedTemp.txt").renameTo(new File("listMed.txt"));
        
        for(int i=0; i < listMedicos.size(); i++){
            if(listMedicos.get(i).getNome().equals(nome)){
                listMedicos.remove(i);
            }
        }
        
    }

}
