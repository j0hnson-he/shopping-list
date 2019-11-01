import java.util.*;
import java.lang.*;
import java.io.*;
public class SortbyType implements Comparator<Item>
{
    public int compare(Item a, Item b)
    {
        return a.getType() - b.getType();
    }
}