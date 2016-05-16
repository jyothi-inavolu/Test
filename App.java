package com.games24x7.Test;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String args[])
    {
	List l1=getLinkedList();
	System.out.println("Testing new branch !!!! ");
	if(l1 instanceof ArrayList)
	{
	System.out.println("This is arrayList");	
	
    }
	if(l1 instanceof LinkedList)
    {
    	System.out.println("This is LinkedList");
    }
	System.out.println("Bingo!!");
    }

public static List getArrayList()
{
	List l=new ArrayList();
	return l;
}

public static List getLinkedList()
{
	List l=new LinkedList();
	return l;
}
}
