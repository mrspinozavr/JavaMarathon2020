package day12.task4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand nirvana = new MusicBand("Nirvana", 1987, Arrays.asList("Kurt Cobain", "Krist Novoselic", "Dave Grohl"));
        MusicBand theProdigy = new MusicBand("The Prodigy", 1990, Arrays.asList("Keith Flint", "Liam Howlett", "Leeroy Thornhill"));

        nirvana.printMembers();
        theProdigy.printMembers();

        //Смерть вокалиста Nirvana
        nirvana.deleteMember("Kurt Cobain");

        //Переход музыкантов Nirvana в другую группу :)
        MusicBand.transferMembers(nirvana, theProdigy);

        nirvana.printMembers();
        theProdigy.printMembers();


    }
}
