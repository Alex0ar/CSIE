package acs.ase.ro.dpstructurale.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CustomCharacterFactory {
    private Map<Character, TextCharacter> collection = new HashMap<>();
    private int charactersCreated = 0;

    public TextCharacter getCharacter(char asciiCod){
        if(!collection.containsKey(asciiCod)){
            TextCharacter character = new CustomCharacter(new byte[]{100, 110}, asciiCod);
            charactersCreated++;
            collection.put(asciiCod, character);
        }
        return collection.get(asciiCod);
    }

    public int getCharactersCreated(){
        return charactersCreated;
    }
}
