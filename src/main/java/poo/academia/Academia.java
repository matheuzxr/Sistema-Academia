/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.academia;

/**
 *
 * @author User
 */

import java.util.ArrayList;

public class Academia {
    private  String nome = "Milho Maromba";
    private String endereco = "Rua A, numero 123";
    private GerenciadorSalas gerenciador = new GerenciadorSalas();
    private GerenciadorEquipe gerenciador_equipe = new GerenciadorEquipe();
    
    public String getNomeAcademia() {
        return nome;
    }

    public static void main(String[] args) {
        
       Academia academia = new Academia();

       Sala spinning = new Sala();
       spinning.setId(1);
       spinning.setDescricao("Spinning");
       spinning.setCapacidade(20);

       Sala musculacao = new Sala();
       musculacao.setId(2);
       musculacao.setDescricao("Musculacao");
       musculacao.setCapacidade(40);

       Sala fit_dance = new Sala();
       fit_dance.setId(3);
       fit_dance.setDescricao("Fit Dance");
       fit_dance.setCapacidade(25);

       Sala pilates = new Sala();
       pilates.setId(4);
       pilates.setDescricao("Pilates");
       pilates.setCapacidade(35);
        
       academia.gerenciador.cadastrarSalas(spinning);
       academia.gerenciador.cadastrarSalas(musculacao);
       academia.gerenciador.cadastrarSalas(fit_dance);
       academia.gerenciador.cadastrarSalas(pilates);
       
       ArrayList<Sala> lista_salas = academia.gerenciador.getSalas();
       
      Funcionario a = new Funcionario();
      
      
       
       for (Sala s : lista_salas) {
           System.out.println("ID da sala: " + s.getId() + "\nDescricao: " + s.getDescricao() + "\nCapacidade: " + s.getCapacidade());
           System.out.println();
       }
    }
}