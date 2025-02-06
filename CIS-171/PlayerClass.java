/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.playerclass;

/**
 *
 * @author Franklin Gainer
 * CIS-171
 * 01-19-2025
 * professor
 */
 class player
    {
        private String initials;
        private Integer score;
        
        public player(String Playername, Integer Playerscore)
        {
            this.initials = Playername;
            this.score = Playerscore;
        }
        
        public String getPlayerInitials()
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

public class PlayerClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
          player player1 = new player("fg", 5);
          System.out.println("Name: " + player1.getPlayerInitials() + " and Score: " + player1.getPlayerScore());
    }
    
}

