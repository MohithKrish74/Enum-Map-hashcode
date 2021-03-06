package com.keyword;

import java.util.EnumMap;

enum Moves{VERTICAL,HORIZONTAL,MAJOR_DIAGONAL,MINOR_DIAGONAL}
public class EnumMapHashcode
{
    public static void main(String[] args)
    {
        EnumMap<Moves,String> map = new EnumMap<Moves, String>(Moves.class);
        map.put(Moves.VERTICAL,"Vertical Movement");
        map.put(Moves.HORIZONTAL,"Horizontal Movement");
        map.put(Moves.MAJOR_DIAGONAL,"Diagonal from Top Left to Bottom Right");
        map.put(Moves.MINOR_DIAGONAL,"Diagonal from Top Right to Bottom Left");
        System.out.println("The Map is "+map);
        System.out.println("The Hashcode of the Map is "+map.hashCode());
        map.clear();
        System.out.println("The Hashcode of the Map after clearing is "+map.hashCode());


    }
}
