package biginteger;

/**
 *
 * @author matychp
 */
public class DoubleNode < E extends Comparable >
{
   private E info;
   private DoubleNode <E> next, previous;
   
   public DoubleNode ( )
   {
   }
   
   public DoubleNode (E e, DoubleNode <E> n, DoubleNode <E> p)
   {
     info = e;
     next = n;
     previous = p;
   }
   
   public DoubleNode <E> getNext()
   {
     return next;
   }
   
   public void setNext(DoubleNode <E> n)
   {
     next = n;
   }
   
   public E getInfo()
   {
     return info;
   }
   
   public void setInfo(E p)
   {
     info = p;
   }
   
   public DoubleNode <E> getPrevious()
   {
       return previous;
   }

   public void setPrevious(DoubleNode <E> p)
   {
       previous = p;
   }
   
   @Override
   public String toString()
   {
     return info.toString();   
   }
}

