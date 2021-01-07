package day12.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand nirvana = new MusicBand("Nirvana",
                1987,
                Arrays.asList(new MusicArtist("Kurt Cobain", 29 ),
                        new MusicArtist("Krist Novoselic", 30),
                        new MusicArtist("Dave Grohl", 28)));
        MusicBand theProdigy = new MusicBand("The Prodigy",
                1990,
                Arrays.asList(new MusicArtist("Keith Flint", 30),
                        new MusicArtist( "Liam Howlett", 27),
                        new MusicArtist("Leeroy Thornhill", 29)));

        //Смерть вокалиста Nirvana
        nirvana.deleteMember("Kurt Cobain");

        //Переход музыкантов Nirvana в другую группу :)
        MusicBand.transferMembers(nirvana, theProdigy);

        System.out.println(nirvana);
        System.out.println(theProdigy);

    }
}
