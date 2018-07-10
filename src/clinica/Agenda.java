package clinica;

import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<ArrayList<Paciente>> agenda;

    public Agenda(){
        for(int i=0; i<31; i++){
            this.agenda.add(new ArrayList<Paciente>());
        }
    }
   
}
