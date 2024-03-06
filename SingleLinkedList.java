// import org.w3c.dom.Node;

// public class SingleLinkedList {

//     private static class Node<E>{
//         private E data;
//         private Node<E> next;

//         private Node(E dataItem){
//             data = dataItem;
//             next = null;
//         }

//         private Node (E dataItem, Node<E> nodeRef){
//             data = dataItem;
//             next = nodeRef;
//         }
//     }

//     public class kWSingleLinkedList<E>{
//         private Node<E> head = null;
//         private int size = 0;

//         public void addFirst(E item){
//             head = new Node<> (item, head);
//             size++;
            
//             kWSingleLinkedList<String> names = new kWSingleLinkedList<>();

           

//             names.addFirst("Sam");
//             names.addFirst("Harry");
//             names.addFirst("Dick");
//             names.addFirst("Tom");
    
            
//         }

//         private void addAfter(Node<E> node, E item){
//             node.next = new Node<>(item, node.next);
//             size++;
//         }

//         private E removeAfter(Node<E> node){
//             Node<E> temp = node.next;
//             if(temp != null){
//                 node.next = temp.next;
//                 size--;
//                 return temp.data;
//             } else{
//                 return null;
//             }
//         }

//         private E removeFirst(){
//             Node<E> temp = head;
//             if(head != null){
//                 head = head.next;
//             }
//             if (temp != null) {
//                 size--;
//                 return temp.data;
//             } else{
//                 return null;
//             }
//         }

//     }

//     public static void main(String[] args) {
//         Node<String> tom = new Node<>("Tom");
//         Node<String> dick = new Node<>("Dick");
//         Node<String> harry = new Node<>("Harry");
//         Node<String> sam = new Node<>("Sam");
//         Node<String> bob = new Node<>("bob");
//         bob.next = harry.next;
//         harry.next = bob;

//         tom.next = dick;
//         dick.next = harry;
//         harry.next = sam;
        
        

//         }
        

        
    
// }

public class SingleLinkedList {

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

    private Node<String> head = null;
    private int size = 0;

    public void addFirst(String item) {
        head = new Node<>(item, head);
        size++;
    }

    private void addAfter(Node<String> node, String item) {
        node.next = new Node<>(item, node.next);
        size++;
    }

    private String removeAfter(Node<String> node) {
        Node<String> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    private String removeFirst() {
        Node<String> temp = head;
        if (head != null) {
            head = head.next;
        }
        if (temp != null) {
            size--;
            return temp.data;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        // a. insert "Bill" before "Tom"
        singleLinkedList.addFirst("Tom");
        Node<String> current = singleLinkedList.head;
        while (current != null && !current.data.equals("Tom")) {
            current = current.next;
        }
        singleLinkedList.addAfter(current, "Bill");

        // b. insert "Sue" before "Sam"
        current = singleLinkedList.head;
        while (current != null && !current.data.equals("Sam")) {
            current = current.next;
        }
        singleLinkedList.addAfter(current, "Sue");

        // c. remove "Bill"
        current = singleLinkedList.head;
        while (current != null && !current.data.equals("Bill")) {
            current = current.next;
        }
        singleLinkedList.removeAfter(current);

        // d. remove "Sam"
        current = singleLinkedList.head;
        while (current != null && !current.data.equals("Sam")) {
            current = current.next;
        }
        singleLinkedList.removeAfter(current);
    }
}
