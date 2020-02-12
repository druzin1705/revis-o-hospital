
package revisao;


public class Revisao {


    public static void main(String[] args) {
     
        Paciente p = new Paciente ();
        p.setNome("astolfo");
        p.setRG("098.067.234-1");
        p.setCPf("297592759");
        p.setIdade(20);
        p.setCodPaciente(02);
        p.setSenha("25");
        
        Funcionario  n = new Funcionario ();
        n.setNome("rodolfo");
        n.setRG("098.045.234-1");
        n.setCPf("2973592759");
        n.setIdade(25);
        n.setMatricula(14);
        n.setSenha("07");
        
        Enfermeiro  e = new Enfermeiro ();
        e.setNome("luisa");
        e.setRG("123.045.234-1");
        e.setCPf("324592759");
        e.setIdade(30);
        e.setCoren("9753tyh");

        
       Medico  m= new Medico();
        m.setNome("armaldo");
        m.setRG("098.045.345-1");
        m.setCPf("2973592759");
        m.setIdade(45);
        m.setCRM("7675835t");
        m.setEspecialidade("odontologia");
    
        
        
        System.out.println("Informações: ");
        System.out.println("Paciente: "  + p.getNome()+ ", Idade: " +p.getIdade() +", RG: "
                +p.getRG()+", CPF: "+ p.getCPf()+", COD.Paciente: " +p.getCodPaciente()+", Senha: "+ p.getSenha());
         System.out.println("Funcionario: " + n.getNome()+ ", Idade: " +n.getIdade() +", RG: "
                +n.getRG()+", CPF: "+ n.getCPf()+", Matricula: " +n.getMatricula()+", Senha: "+ n.getSenha());
         System.out.println("Enfermeiro: " + e.getNome()+ ", Idade: " +e.getIdade() +", RG: "
                +e.getRG()+", CPF: "+ e.getCPf()+", Coren: " +e.getCoren());
         System.out.println("Medico: "  + m.getNome()+ ", Idade: " +m.getIdade() +", RG: "
                +m.getRG()+", CPF: "+ m.getCPf()+", CRM: " +m.getCRM()+", Especialização: "+ m.getEspecialidade());
    }
    
}
