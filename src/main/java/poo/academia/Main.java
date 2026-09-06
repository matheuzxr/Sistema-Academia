/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.academia;


/**
 *
 * @author User
 */


public class Main {
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
       
       academia.cadastrarSala(spinning);
       academia.cadastrarSala(musculacao);
       academia.cadastrarSala(fit_dance);
       academia.cadastrarSala(pilates);
       
       academia.exibirSalas();
    }
    
}
