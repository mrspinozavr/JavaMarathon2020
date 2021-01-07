package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Nirvana", 1987));
        bands.add(new MusicBand("The Prodigy", 1990));
        bands.add(new MusicBand("HIM", 1991));
        bands.add(new MusicBand("Iron Maiden", 1975));
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("DaBro", 2013));
        bands.add(new MusicBand("MORGERNSHTERN", 2010));
        bands.add(new MusicBand("Zivert", 2017));
        bands.add(new MusicBand("Little Big", 2013));
        bands.add(new MusicBand("Billie Eilish", 2015));

        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
