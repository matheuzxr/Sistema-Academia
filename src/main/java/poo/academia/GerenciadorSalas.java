/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.academia;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class GerenciadorSalas {
    private ArrayList<Sala> salas = new ArrayList<>();
    
    public void cadastrarSalas(Sala nova_sala) {
        salas.add(nova_sala);
    }
    
    public ArrayList<Sala> getSalas() {
        return salas;
    }
}
