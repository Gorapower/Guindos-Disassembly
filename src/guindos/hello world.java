import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
 
public class realdeal {
     static ArrayList<String> data = new ArrayList<String>();
    static StringBuffer output = new StringBuffer();
    static int pairsToRead;
    static StringBuffer message = new StringBuffer();
    static int temp;
    static String tempString;
    static int bin;
    public static void main(String[] args) throws IOException {
        
       String dataFile  = "hello.chop";
       byte[] bin;
       
         int temp3=0;
         int count;
         StringBuilder sb = new StringBuilder();
         StringBuilder s3=new StringBuilder();
         String line;
            String src2=new String();
        try (BufferedReader input = openFile(dataFile )) {
            
            
            while ((line = input.readLine()) != null) {
                       
                        src2=line.replace(" ","");
                        bin=src2.getBytes();
                        System.out.println("imprimir el archivo\n"+src2);
                        System.out.println("impresion contenido en binary\n"+bin);
                        
                        
                        for(byte b:bin)
                        {
                            s3.append(String.format("%02X",b));
                        
                        }
                        
                        
                        System.out.println("tamanio de hex\n"+s3.length());
                        int totalpares=s3.length()/2;
                        System.out.println("pares totales:\n"+totalpares);
                      
                               for(String part:getParts(s3.toString(),2))
                        {
                            //string full almacena el par actual
                            String full=part;
                            data.add(full);//imprime pares bandera decimal
                        }
                   
                        //ciclo para divir en pares
                      
             
            }
            System.out.println("impresion del archivo en hex\n"+s3.toString());
        }
         for(int e=24;e<data.size();e++)
         {
            System.out.println("par: " +e+ " el par es :" +data.get(e));
            }
            int d=24;
            String temp1;
            
                message.append("(C)CHUNKUN\n");
         while(d<data.size())
            {
                temp1=data.get(d);
                System.out.println(temp1);
                switch(temp1){
                                case "00":
                                 message.append("HALT");
                                message.append("\n");
                                //write to file "HALT"
                                    break;
                                case "01":
                                //write to file "PRTCR"
                                 message.append("prtcr");
                                d=d+1;
                                message.append("\n");
                                    break;
                                case "02":
                                //write to file "PRTC"
                                    break;
                                case "03":
                                //write to file "PRTI"
                                message.append("prti  var");
                                d=d+3;
                                message.append("\n");
                                   break;
                                case "04":
                                //write to file "PRTF"
                                    break;
                                case "05":
                                //write to file "PRTD"
                                    break;
                                case "06":
                                //write to file "PRTS"
                                message.append("prts var");
                                d=d+3;
                                message.append("\n");
                                    break;
                                case "07":
                                //write to file "PRTAC"
                                    break;
                                case "08":
                               //write to file "PRTAI"
                                    break;
                                case "09":
                                //write to file "PRTAF"
                                    break;
                                case "0A":
                                //write to file "PRTAD"
                                    break;
                                case "0B":
                               //write to file "PRTAS"
                                    break;
                                case "0C":
                                //write to file "PUSHC"
                                    break;
                                case "0D":
                                 //write to file "PUSHI"
                                   message.append("pushi var");
                                d=d+3;
                                message.append("\n");
                                    break;
                                case "0E":
                                 //write to file "PUSHF"
                                    break;
                                case "0F":
                                //write to file "PUSHD"
                                    break;
                                case "10":
                                //write to file "PUSHS"
                                    break;
                                case "11":
                                 //write to file "PUSHAC"
                                    break;
                                case "12":
                                //write to file "PUSHAI"
                                message.append("pushai var");
                                d=d+3;
                                message.append("\n");
                                    break;
                                case "13":
                               //write to file "PUSHAF"
                                    break;
                                case "14":
                                //write to file "PUSHAD"
                                    break;
                                case "15":
                                //write to file "PUSHAS"
                                    break;
                                case "16":
                                //write to file "PUSHKC"
                                    break;
                                case "17":
                                 //write to file "PUSHKI"
                                   message.append("pushiki");
                                d=d+5;
                                message.append("\n");
                                    break;
                                case "18":
                                 //write to file "PUSHKF"
                                    break;
                                case "19":
                                  //write to file "PUSHKD"
                                    break;
                                case "1A":
                                  //write to file "PUSHKS"
                                     message.append("pushks ");
                                  String temp20=data.get(d+1);
                                  String temp30;
                                  d=d+2;
                                  int y = Integer.parseInt(temp20);
                                 int conttemp=0;
                                  int contemp2;
                                  char cc;
                                  while(conttemp<y)
                                  {
                                      contemp2=d+(conttemp);
                                      temp30=data.get(contemp2);
                                      int decimal = Integer.parseInt(temp30, 16);
                                      cc = (char)decimal;
                                      message.append(cc);
                                      conttemp=conttemp+1;
                                    }
                                    d=d+y;
                                    message.append("\n");
                                    break;
                                case "1B":
                                 //write to file "POPC"
                                    break;
                                case "1C":
                                 //write to file "POPI"
                                   message.append("popi var");
                                d=d+3;
                                message.append("\n");
                                    break;
                                case "1D":
                               //write to file "POPF"
                                    break;
                                case "1E":
                                 //write to file "POPD"
                                    break;
                                case "1F":
                                message.append("pops var");
                                d=d+3;
                                message.append("\n");
                                //write to file "POPS"
                                    break;
                                case "20":
                                //write to file "POPX"
                                    break;
                                case "21":
                               //write to file "POPAC"
                                    break;
                                case "22":
                                //write to file "POPAI"
                                    break;
                                case "23":
                               //write to file "POPAF"
                                    break;
                                case "24":
                                //write to file "POPAD"
                                    break;
                                case "25":
                                //write to file "POPAS"
                                    break;
                                case "26":
                               //write to file "RDC"
                                    break;
                                case "27":
                                //write to file "RDI"
                                  message.append("pushi var");
                                d=d+3;
                                message.append("\n");
                                    break;
                                case "28":
                                 //write to file "RDF"
                                    break;
                                case "29":
                                //write to file "RDD"
                                    break;
                                case "2A":
                                //write to file "RDS"
                                    break;
                                case "2B":
                                 //write to file "RDAC"
                                    break;
                                case "2C":
                                 //write to file "RDAI"
                                    break;
                                case "2D":
                                 //write to file "RDAF"
                                    break;
                                case "2E":
                                 //write to file "RDAD"
                                    break;
                                case "2F":
                                 //write to file "RDAS"
                                    break;
                                case "30":
                                //write to file "JMP"
                                  message.append("jmp loop");
                                d=0;
                                message.append("\n");
                                    break;
                                case "31":
                                 //write to file "JMPEQ"
                                    break;
                                case "32":
                                  //write to file "JMPNE"
                                    break;
                                case "33":
                                 //write to file "JMPGT"
                                    break;
                                case "34":
                                  //write to file "JMPGE"
                                    break;
                                case "35":
                                  //write to file "JMPLT"
                                    message.append("jmplt fin");
                                d=14;
                                message.append("\n");
                                    break;
                                case "36":
                                  //write to file "JMPLE"
                                    break;
                                case "37":
                                  //write to file "STX"
                                    break;
                                case "38":
                                  //write to file "STKX"
                                    break;
                                case "39":
                                 //write to file "INC"
                                   message.append("INC");
                                d=d+1;
                                message.append("\n");
                                    break;
                                case "3A":
                                 //write to file "DEC"
                                    break;
                                case "3B":
                                //write to file "ADD"
                                  message.append("add");
                                d=d+1;
                                message.append("\n");
                                    break;
                                case "3C":
                                //write to file "SUB"
                                break;
                                 case "3D":
                                //write to file "MUL"
                                break;
                                 case "3E":
                                //write to file "DIV"
                                break;
                                 case "3F":
                                //write to file "MOD"
                                break;
                                 case "40":
                                //write to file "CMP"
                                  message.append("cmp");
                                d=d+1;
                                message.append("\n");
                                    break;
                                default:
                                    break;
                            }
                            
                            System.out.print(message);
                        }
                        
    }
 
    private static BufferedReader openFile(String fileName)
            throws IOException {
        // Don't forget to add buffering to have better performance!
        return new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName),
                        StandardCharsets.UTF_8));
    }
      private static List<String> getParts(String string, int partitionSize) {
        List<String> parts = new ArrayList<String>();
        int len = string.length();
        for (int i=0; i<len; i+=partitionSize)
        {
            parts.add(string.substring(i, Math.min(len, i + partitionSize)));
        }
        return parts;
    }
   
           
}
