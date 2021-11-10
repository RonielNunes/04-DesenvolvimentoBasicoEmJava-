package one.digitalinovation.tipos.primitivos;

public class Primitivos {
    public static void main(String[] args) {
        //Inteiros

        //byte nullByte = null
        byte b; //8 bits
        byte b1 = 127;
        byte b2= -128;
        //byte b3 = 129 //to large

        char c; //16 bits
        char c1 = 'A';
        char c2 = 13;
        //char c3 = 'AA'; //NOK
        //char c4 = -100; //NOK

        short s; //16 bits
        short s1 = 32767;
        short s2 = -32768;

        int i = 2147483647; //32 bits
        int i2 =-2147483648;

        long l = 922372036854775807L; //64 bits
        long l2 = -922372036854775808L;

        //Flutuantes

        float f = 65f; //32 bits
        float f2 = 65.0f;
        float f3 = 0.5f; // 1.4 e-45

        double d = 1024.9901; // 64 bits

        //Boleano
        boolean bo = true;
        boolean bo2 = false;

        //void v; //void não é um tipo
        //System.out.println("byte: " + b)
    }
}
