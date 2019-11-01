import java.util.*;
import java.lang.*;
import java.io.*;
public class SortbyCost implements Comparator<Item>
{
    public int compare(Item a, Item b)
    {
        return Double.compare(a.getCost(), b.getCost());
    }
}
