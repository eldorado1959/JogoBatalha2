/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoBatalha;

/**
 *
 * @author Rogerio
 */
class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 100, 15);
    }
    
    @Override
    public void atacar(Personagem oponente) {
        oponente.vida -= this.ataque + 15;
        System.out.println(this.nome + " atacou " + oponente.nome + " causando " + (this.ataque + 15) + " dano");
    }
}
