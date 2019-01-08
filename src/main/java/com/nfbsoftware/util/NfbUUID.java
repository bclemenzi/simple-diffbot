package com.nfbsoftware.util;

import java.util.UUID;
import java.util.Random;

/**
 * 
 * @author Brendan Clemenzi
 *
 */
public class NfbUUID
{
    public static String generateGUID()
    {
        UUID uid = UUID.randomUUID();
        
        return uid.toString();
    }

    public static String generateGUIDOfLength(int length)
    {
        String uidStr = "";
        
        UUID uid = UUID.randomUUID();

        if (uid.toString().length() >= length) 
        {
            uidStr = uid.toString().replace("-", "").substring(0, length);
        } 
        else 
        {
            uidStr = uid.toString().replace("-", "");
        }
        
        return uidStr;
    }

    public static long generateUniqueNumber() throws Exception
    {
        final Random gen = new Random();
        final Integer part1 = Math.abs(gen.nextInt());
        final Integer part2 = Math.abs(gen.nextInt());
        
        Long parts = Long.parseLong((part1.toString() + part2.toString()).substring(0, 16).trim());
        
        return parts;
    }

    public static long generateUniqueNumber(int size) throws Exception
    {
        final Random gen = new Random();
        final Integer part1 = Math.abs(gen.nextInt());
        final Integer part2 = Math.abs(gen.nextInt());
        
        String part1String = part1.toString().substring(size/2);
        String part2String = part2.toString().substring(size/2);
        
        Long parts = Long.parseLong((part1String + part2String).substring(0, size).trim());
        
        return parts;
    }
}
