package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>(members);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }

    public void addMember(String name, int age) {
        members.add(new MusicArtist(name, age));
    }

    public void deleteMember(String name) {
        getArtistByName(name);
        members.remove(getArtistByName(name));
    }

    public MusicArtist getArtistByName(String name) {
        MusicArtist tempArtist = null;
        for (MusicArtist artist : members) {
            if (artist.getName().equals(name)) {
                tempArtist = artist;
            }
        }
        return tempArtist;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.members.addAll(band1.members);
        band1.members.clear();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
