package one.digitalinovation.tipos.wrappers;

import com.sun.jdi.ShortType;

public class Wrappers {
    public static void main(String[] args) {
        //Autoboxing

        Byte nullByte = null;
        Byte b; //8 bits
        Byte b1 = 127;
        Byte b2= -128;
        //Obs: se o tipo primçitaivo tiver que aceitar null
        //deve ser utilizado os Wrappers

        Character c= 'A';

        Short s = 32767;

        Integer i = 212122;

        Long l = 2112342343L;

        Float f = 56.0f;

        Double d = 10124.99;

        Boolean bo = true;

        //Seguem todos os limites de bits e
        //apresentam métodos
    }
}
