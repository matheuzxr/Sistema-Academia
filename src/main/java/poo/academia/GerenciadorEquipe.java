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

public class GerenciadorEquipe {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public void cadastrarFuncionario(Funcionario novo_funcionario) {
        funcionarios.add(novo_funcionario);
    }
}
