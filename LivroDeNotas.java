//alta coesão

public class LivroDeNotas {

  private String nomeDisciplina;

  public void setNomeDisciplina(String nome){
    nomeDisciplina = nome;
  }

  public void exibirMensagem() {
    System.out.println("Bem vindo ao livro de notas " + nomeDisciplina);
    
  }
    
} 