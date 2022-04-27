/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes;

import Comportamientos.CTickerReceptor;
import jade.core.Agent;
/**
 *
 * @author physi
 */
public class ClienteReceptorContestadorTicker extends Agent{
    public void setup()
    {
        addBehaviour(new CTickerReceptor(this, 8000));
        
    }
}
