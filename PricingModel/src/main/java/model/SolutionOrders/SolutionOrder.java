/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.SolutionOrders;

import model.MarketModel.MarketChannelAssignment;
import model.ProductManagement.SolutionOffer;

/**
 *
 * @author KAILASH
 */
public class SolutionOrder {
    SolutionOffer selectedsolutionoffer;
  //  CustomerProfile customerprofile;
    MarketChannelAssignment marketChannelAssignment; 
    public SolutionOrder(SolutionOffer so,  MarketChannelAssignment mca){
        selectedsolutionoffer = so;
        marketChannelAssignment = mca;

    }
    
    public int getSolutionPrice(){
        return selectedsolutionoffer.getSolutionPrice();
    }
    public MarketChannelAssignment getMarketChannelCombo(){
        
        return marketChannelAssignment;
                
    }
}
