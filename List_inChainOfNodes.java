/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
      The default constructor is fine:
      take zero arguments
      do nothing
     */

    /**
      @return the number of elements in this list
     */
    public int size() {
        // recursive approach seems more perspicuous
        if( headReference == null) return 0;
        else return size( headReference);
    }

    // recursively-called helper
    private int size( Node startingAt) {
        Node next = startingAt.getReferenceToNextNode();
        if( next == null) return 1;
        else return 1+ size( next);
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        String stringRep = size() + " elements [";

        for( Node node = headReference
           ; node != null
           ; node = node.getReferenceToNextNode() )
            stringRep += node.getCargoReference() + ",";
        return stringRep + "]";
    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean addAsHead( Object val) {
        headReference = new Node( val, headReference);
        return true;
    }

    public boolean add( int index, Object val) {
        Node newNode = new Node(val);
        for (int i = 0; i < index ; i++) {
            current = current.getReferenceToNextNode();
        }

        current.setReferenceToNextNode(newNode);

                //iterate to the rest of the list, reassign references
        }
    }

    public void set( int index, Object newValue ) {
        Node current = headReference;
        for (int i = 0; i < index ; i++) {
            current = current.getReferenceToNextNode();
        }
        current.setCargoReference(newValue);
    }

    public Object get( int index){
        Node current = headReference;
        for (int i = 0; i < index ; i++) {
            current = current.getReferenceToNextNode();
        }
        return current.getCargoReference();
    }

}
