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
    static int temp;
    public static void main(String[] args) throws IOException {
       String dataFile = "CK.chop";
       byte[] bin;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader input = openFile(dataFile)) {
            String line;
            String src2=new String();
            
            while ((line = input.readLine()) != null) {
                       
                        src2=line.replace(" ","");
                        bin=src2.getBytes();
                        System.out.println("imprimir el archivo\n"+src2);
                        System.out.println("impresion contenido en binary\n"+bin);
                        StringBuilder s3=new StringBuilder();
                        for(byte b:bin)
                        {
                            s3.append(String.format("%02X",b));
                        }
                        System.out.println("impresion del archivo en hex\n"+s3.toString());
                        System.out.println("tamanio de hex\n"+s3.length());
                        int totalpares=s3.length()/2;
                        System.out.println("pares totales:\n"+totalpares);
                       
                        int count;
                     for(count=10;count<s3.length();count+=2)
                     {
                        //falta aqui diviir el S3 en pares para que entren al case
                        
                        
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
                    }
             
            }
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
  
           
}