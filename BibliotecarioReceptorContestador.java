/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes;

import Comportamientos.CSimpleReceptor;
import jade.core.Agent;
/**
 *
 * @author physi
 */
public class BibliotecarioReceptorContestador extends Agent{
    
    public void setup()
    {
        addBehaviour(new CSimpleReceptor(this));
    }
}
