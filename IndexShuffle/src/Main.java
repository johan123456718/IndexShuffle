/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.indexShuffle("holiday"));
    }
    
    public String indexShuffle(String str){
        char[] letters = str.toCharArray();
        char value;
        String evenString = "", oddString = "";
        
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < letters.length; i++){
            
            if(i % 2 == 0){
                evenString += letters[i];
            }
            
            if(i % 2 == 1){
                oddString += letters[i];
            }
           
        }
        
        builder.append(evenString);
        builder.append(oddString);
        return builder.toString();
        
    }
    
}
