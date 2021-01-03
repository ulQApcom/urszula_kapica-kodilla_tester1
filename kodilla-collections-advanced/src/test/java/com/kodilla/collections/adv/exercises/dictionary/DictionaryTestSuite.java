package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord(){
        //given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        //when
        dictionary.addword(polishWord,englishWord);
        //then
        assertEquals(1,dictionary.size());
    }
    @Test
    public void testFindEnglishWords(){
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addword("stos", new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addword("gra", new EnglishWord(PartOfSpeech.NOUN,"play"));
        dictionary.addword("gra",new EnglishWord(PartOfSpeech.NOUN,"game"));
        dictionary.addword("grać",new EnglishWord(PartOfSpeech.VERB,"play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWord("gra");
        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"game"));
        assertEquals(2,result.size());

    }

}