/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoBatalha;

/**
 *
 * @author Rogerio
 */

class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 90, 20);
    }

    public void atirarFlecha(Personagem oponente) {
        oponente.vida -= this.ataque;
        System.out.println(this.nome + " atirou flecha em " + oponente.nome + " causando " + this.ataque + " dano!");
    }
}