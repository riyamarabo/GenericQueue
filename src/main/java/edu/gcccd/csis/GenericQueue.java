package edu.gcccd.csis;

import java.util.ArrayList;

public class GenericQueue<T>
{
     private ArrayList<T> genericList;

     public GenericQueue()
     {
         genericList = new ArrayList<>();
     }

     public void enqueue(T input)
     {
         genericList.add(input);
     }

     public T dequeue()
     {
         if (genericList.isEmpty())
         {
             System.out.println("There are no elements to remove");
             return null;

         }else
             {
             T firstElement = genericList.get(0);
         genericList.remove(0);
         return firstElement;
         }
     }

     public int length()
     {
         return genericList.size();
     }


     public boolean isEmpty()
     {
         return genericList.isEmpty();
     }

    }


