/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agentes;

import Comportamientos.CTickerEmisor;
import jade.core.Agent;
/**
 *
 * @author physi
 */
public class ClienteEmisorTicker extends Agent{
    public void setup()
    {
        addBehaviour(new CTickerEmisor(this, 5000));
        
    }
}
