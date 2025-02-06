




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

public class PlayerClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
          player player1 = new player("fg", 5);//new player object with variables put in the constuctors
          System.out.println("Name: " + player1.getPlayerInitials() + " and Score: " + player1.getPlayerScore());//print line displaying the output of the 
    }
    
     /* String workingDirecrt = System.getProperty(key);
        try {
            BufferedWriter PlayerFiles = new BufferedWriter(new FileWriter(cvsFilePath));
            PlayerFiles.write("aaa 10000000");
            PlayerFiles.write("bbb 9000000");
            PlayerFiles.write("ccc 8000000");
            PlayerFiles.write("ddd 7000000");
            PlayerFiles.write("eee 6000000");
            PlayerFiles.write("fff 5000000");
            PlayerFiles.write("ggg 4000000");
            PlayerFiles.write("hhh 3000000");
            PlayerFiles.write("iii 2000000");
            PlayerFiles.write("jjj 1000000");
            
            for(int i = 0; i <playerRecords.size();i++)
            {
                System.out.println(playerRecords.get(i));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        
          //System.out.println("Hello World!");*/
}

