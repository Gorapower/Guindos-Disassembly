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
        
        //translate data -- comment this area to compile for now
        for(int i=0; i<data.size();){
            //read first data
            
            //end read first data
            
            temp = Integer.parseInt(data.get(0), 16);
            data.remove(0);
            
            /* Use this line of code in the cases that you need to read a String
            output.append(ReadString(data,pairsToRead));
            */
            
            // init cases
            switch(temp){
                case 0:
                //write to file "HALT"
                    break;
                case 1:
                //write to file "PRTCR"
                    break;
                case 2:
                //write to file "PRTC"
                    break;
                case 3:
                //write to file "PRTI"
                    break;
                case 4:
                //write to file "PRTF"
                    break;
                case 5:
                //write to file "PRTD"
                    break;
                case 6:
                //write to file "PUSHC"
                    break;
                case 7:
                //write to file "PUSHI"
                    break;
                case 8:
                //write to file "PUSHF"
                    break;
                case 9:
                //write to file "PUSHD"
                    break;
                case 10:
                //write to file "PUSHS"
                    break;
                case 11:
                //write to file "PUSHAC"
                    break;
                case 12:
                //write to file "PUSHAI"
                    break;
                case 13:
                //write to file "PUSHAF"
                    break;
                case 14:
                //write to file "PUSHAD"
                    break;
                case 15:
                //write to file "PUSHAD"
                    break;
                case 16:
                //write to file "PUSHAS"
                    break;
                case 17:
                //write to file "PUSHKC"
                    break;
                case 18:
                //write to file "PUSHKI"
                    break;
                case 19:
                //write to file "PUSHKF"
                    break;
                case 20:
                //write to file "PUSHKD"
                    break;
                case 21:
                //write to file "PUSHKS"
                    break;
                case 22:
                //write to file "POPC"
                    break;
                case 23:
                //write to file "POPI"
                    break;
                case 24:
                //write to file "POPF"
                    break;
                case 25:
                //write to file "POPD"
                    break;
                case 26:
                //write to file "POPS"
                    break;
                case 27:
                //write to file "POPX"
                    break;
                case 28:
                 //write to file "POPAI"
                    break;
                case 29:
                //write to file "POPAF"
                    break;
                case 30:
                 //write to file "POPAD"
                    break;
                case 31:
                //write to file "POPAS"
                    break;
                case 32:
                 //write to file "RDC"
                    break;
                case 33:
                //write to file "RDI"
                    break;
                case 34:
                //write to file "RDF"
                    break;
                case 35:
                //write to file "RDD"
                    break;
                case 36:
                //write to file "RDS"
                    break;
                case 37:
                //write to file "RDAC"
                    break;
                case 38:
                //write to file "RDAI"
                    break;
                case 39:
                //write to file "RDAF"
                    break;
                case 40:
                //write to file "RDAD"
                    break;
                case 41:
                //write to file "RDAS"
                    break;
                case 42:
                //write to file "JMP"
                    break;
                case 43:
                //write to file "JMPEQ"
                    break;
                case 44:
                //write to file "JMPNE"
                    break;
                case 45:
                //write to file "JMPGT"
                    break;
                case 46:
                //write to file "JMPGE"
                    break;
                case 47:
                //write to file "JMPLT"
                    break;
                case 48:
                //write to file "JMPLE"
                    break;
                case 49:
                //write to file "STX"
                    break;
                case 50:
                //write to file "STKX"
                    break;
                case 51:
                //write to file "INC"
                    break;
                case 52:
                //write to file "DEC"
                    break;
                case 53:
                //write to file "ADD"
                    break;
                case 54:
                //write to file "SUB"
                    break;
                case 55:
                //write to file "MUL"
                    break;
                case 56:
                //write to file "DIV"
                    break;
                case 57:
                //write to file "MOD"
                    break;
                case 58:
                //write to file "CMP"
                    break;
                default:
                    break;
            }
            
            //end cases
            
        }
        //end translate data -- commnet to here for compile
        
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
