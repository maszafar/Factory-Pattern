package com.factory;
import com.types.*;
import java.util.*;

public class Factory {

    //Сreation of objects
    public static Data createType(String input)
    {
        Scanner scan = new Scanner(System.in);

        if(input == null)
        {
            return null;
        }
        else if(input.equalsIgnoreCase("STRING"))
        {
            System.out.println("Enter character string:");
            return new SymString(scan.next());
        }
        else if(input.equalsIgnoreCase("BINARY"))
        {
            System.out.println("Enter binary string:");
            return new BinString(scan.next());
        }

        return null;
    }

    //Deletion of objects
    public static Data delete()
    {
        return null;
    }
}
