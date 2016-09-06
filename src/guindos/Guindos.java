/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guindos;

import java.util.ArrayList;
/**
 *
 * @author alexis
 */
public class Guindos {

    static ArrayList<String> data = new ArrayList<String>();
    static StringBuffer output = new StringBuffer();
    static int pairsToRead;
    static StringBuffer message = new StringBuffer();
    static int temp;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test
        
        data.add("E1");
        data.add("11");
        data.add("21");
        data.add("31");
        data.add("41");
        data.add("51");
        data.add("AD");
        data.add("F1");
        pairsToRead = 8;
        output.append(ReadString(data,pairsToRead));
        System.out.print(output);
        //End test
        
        //read file
        
        //end read file
        
        //translate data
        //for(int i=0; i<data.size();){
            //read first data
            
            //end read fisr data
            
            //output.append(ReadString(data,pairsToRead));
            
            // init cases
            
            
            //end cases
            
        //}
        //end translate data
        
        //write to file
        
        //end write to file
    }

    private static StringBuffer ReadString(ArrayList<String> data, int pairsToRead) {
        
        for(int i=0;i<pairsToRead;i++){
            temp = Integer.parseInt(data.get(0), 16);
            message.append((char) temp);
            data.remove(0);
        }
        
        
        
        
        return message;
    }
    
}
