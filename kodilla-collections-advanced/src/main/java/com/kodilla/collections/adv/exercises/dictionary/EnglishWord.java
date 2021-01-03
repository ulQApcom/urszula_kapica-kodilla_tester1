package com.kodilla.collections.adv.exercises.dictionary;

import java.util.Objects;

public class EnglishWord {
    private PartOfSpeech partOfSpeech;
    private String world;

    public EnglishWord(PartOfSpeech partOfSpeech, String world) {
        this.partOfSpeech = partOfSpeech;
        this.world = world;
    }
    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }
    public String getWorld() {
        return world;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return partOfSpeech == that.partOfSpeech &&
                Objects.equals(world, that.world);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partOfSpeech, world);
    }
}
