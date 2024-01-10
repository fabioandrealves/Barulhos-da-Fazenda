/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fazenda;

/**
 *
 * @author fabiojunior
 */
public class Fazenda {
  
 private Animal[] animais;

    public Fazenda() {
        animais = new Animal[]{new Galinha(), new Cachorro(), new Pato(), new Boi()};
    }

    // Método para emitir os sons de todos os animais na fazenda
    public void verAnimais() {
        System.out.println("Barulhos da fazenda:");
        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }    
}
