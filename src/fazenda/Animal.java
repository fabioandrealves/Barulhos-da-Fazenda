/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fazenda;

/**
 *
 * @author fabiojunior
 */
public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }


    public void fazerSom() {
        System.out.println("O " + nome + " faz: ");
    }
}
