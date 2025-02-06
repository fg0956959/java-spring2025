/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.playerobjclass;


/**
 *
 * @author Franklin Gainer
 * CIS-171
 * 01-19-2025
 * professor
 */
 class player
    {
        private String initials;//private feilds
        private Integer score;
        
        public player(String Playername, Integer Playerscore)//constructor for initializing feilds
        {
            this.initials = Playername;
            this.score = Playerscore;
        }
        
        public String getPlayerInitials()//getters and setters for player feilds
        {
            return initials;
        }
        
        public void setPlayerInitials(String PlayerName)
        {
            this.initials = PlayerName;
        }
        
        public Integer getPlayerScore()
        {
            return score;
        }
        
        public void setPlayerScore(Integer PlayerScore)
        {
            this.score = PlayerScore;
        }
        
        
    }

public class playerobjClass 
{

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
          player player1 = new player("fg", 5);//new player object with variables put in the constuctors
          System.out.println("Name: " + player1.getPlayerInitials() + " and Score: " + player1.getPlayerScore());//print line displaying the output of the 
    }
    
}
