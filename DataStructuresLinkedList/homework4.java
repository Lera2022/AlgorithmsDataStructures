public void rotateLeft() {
  if (head != null) {                       
    Node temp = head;
    if (head.getNext() != null) {           
        head = head.getNext();
    }

    Node tail;
    if (head.getNext() != null) {
        //more than 2 items in the list
        tail = head.getNext();
    } else {
        //only 2 items in the list
        tail = head;
    }
    while (tail.getNext() != null) {
        if (tail.getNext() != null) {
            tail = tail.getNext();
        }
    }
    tail.setNext(temp);
    temp.setNext(null);
  }
}

public void rotateRight() {
  if (head != null) {                      
    Node tail = null;
    Node current = head;

    while (current.getNext() != null) {
        tail = current;
        current = current.getNext();
    }
    if (tail != null) {             
        tail.setNext(null);
        current.setNext(head);
        head = current;
    }
  }
}

public class LinkedList {

  Node head;

  public LinkedList() {
      this.head = null;
  }

  public LinkedList(Node head) {
      this.head = head;
  }

  public void rotateLeft() {
      System.out.println("<-");
      if (head != null) { 
          Node temp = head;
          if (head.getNext() != null) { 
              head = head.getNext();
          }

          Node tail;
          if (head.getNext() != null) {
             
              tail = head.getNext();
          } else {
             
              tail = head;
          }
          while (tail.getNext() != null) {
              if (tail.getNext() != null) {
                  tail = tail.getNext();
              }
          }
          tail.setNext(temp);
          temp.setNext(null);
      }
  }

  public void rotateRight() {
      System.out.println("->");
      if (head != null) { 
          Node tail = null;
          Node current = head;

          while (current.getNext() != null) {
              tail = current;
              current = current.getNext();
          }
          if (tail != null) { 
              tail.setNext(null);
              current.setNext(head);
              head = current;
          }
      }
  }

  public void printList() {
      Node cursor = head;
      while (cursor != null) {
          System.out.print(cursor.data + ", ");
          cursor = cursor.getNext();
      }
      System.out.println();
  }

  public void add(Object data) {
      Node temp = new Node(data);

      if (head == null) {
          head = temp;
      } else {
          Node current = head;

          while (current.getNext() != null) {
              current = current.getNext();
          }

          current.setNext(temp);
      }
  }

  public static void main(String[] args) {
      LinkedList r = new LinkedList();
      r.add(1);
      r.add(2);
      r.add(3);
      r.add(4);
      r.add(4);
      r.add(5);
      r.printList();
      r.rotateLeft();
      r.printList();
      r.rotateLeft();
      r.printList();
      r.rotateRight();
      r.printList();
      r.rotateRight();
      r.printList();
  }

}