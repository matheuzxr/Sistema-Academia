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
    private String nome = "Milho Maromba";
    private String endereco = "Rua A, numero 123";
    private GerenciadorSalas gerenciador = new GerenciadorSalas();
    
    public String getNomeAcademia() {
        return nome;
    }
    
    public void cadastrarSala(Sala s) {
        gerenciador.cadastrarSalas(s);
    }
    
    public void excluirSala(int id) {
        gerenciador.excluirSala(id);
    }
    
    public void exibirSalas() {
        ArrayList<Sala> salas = gerenciador.getSalas();
        for (Sala s : salas){
            System.out.println("\nID da sala: " + s.getId() + "\nDescricao: " + s.getDescricao() + "\nCapacidade: " + s.getCapacidade());
        }
    }
}