package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //Bobbos mamma skall läsa en saga men hon är långsam och läser bara en bokstav i taget
        FileReader mamma = new FileReader("src/decorator/bobbos_favoriter.txt");
        //Därför säger bobbo till mami han vill se mami dra några lines så
        //hon blir "dekorerad" med sin senaste superkraft i runtime
        BufferedReader superMamma = new BufferedReader(mamma);
        //Mamma läser som aldrig förr!
        superMamma.lines().forEach(System.out::println);

    }
}
