    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.playerfromfile;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Iterable;
import java.util.Collections;
import java.util.Comparator;

//libraries to imort



/**
 *
 * @author Franklin Gainer
 * 
 */

class player//class player object to use to put in the cvs file
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
public class PlayerFromFile {    
    
    
    public static void main(String[] args) {
        String WorkingDir = System.getProperty("User.dir");
        String filePath = WorkingDir + "\\src\\main\\java\\com\\mycompany\\PlayerData.cvs";//directory and path for the cvs file
        List<List<player>> playerRecords = new ArrayList<>();
        
        try
        {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath,true));//new printwriter to write the players in
            
            player player1 = new player("aaa", 10000000);
            player player12 = new player("aaa", 900000);
            player player3 = new player("bbb", 800000);
            player player4 = new player("ccc", 7000);
            player player5 = new player("ddd", 6000);
            player player6 = new player("eee", 5000);
            player player7 = new player("fff",400);
            player player8 = new player("ggg", 250);
            player player9 = new player("hhh", 400);
            player player10 = new player("iii", 10);
            player player11 = new player("mmm", 300);//default player objects that get put in the file
            
            for(List<player> playerIritirat: playerRecords)
            {
                playerRecords.add(playerIritirat);
                System.out.println(playerIritirat.toString());
            }//for-loop that itirates the player objects in the file and adds them to the list
            
            Collections.sort(playerRecords, Collections.reverseOrder());//collection sort line to sort the list from decendng
        }
      catch(IOException e)
      {
          System.out.println(e.getMessage());
      }
    }
}
