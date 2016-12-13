package factory;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * Created by kimha on 12/12/16.
 */
public class Main {
    public static void main(String [] args){
        //Hämtar tecken kodning från factory
        Charset charset = Charset.forName("UTF-8");

        //Strängar att testa på
        String k = "köööken";
        String k2 = k;

        //Kodar strängarna
        ByteBuffer bb = charset.encode(k);
        ByteBuffer bb2 = charset.encode(k2);

        //Byter teckenkodning i runtime
        charset = Charset.forName("ASCII");


        //Decodar den första till ASCII, vi kan inte se "ö"
        System.out.println(charset.decode(bb));

        //Byter tillbaka till Unicode
        charset = Charset.forName("UTF-8");

        //Decodar den andra till Unicode , vi kan see "ö"
        System.out.println(charset.decode(bb2));
    }
}
