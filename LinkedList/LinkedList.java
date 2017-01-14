/**
 * Created by dead1 on 1/13/2017.
 */
public class LinkedList {
    //Here is the node first
    private Node first;
    private Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public void add(int value){
        Node n = new Node(value);
        if(first == null){
            first = n;
            last = n;
        }else{
            last.next = n;
            last = n;
        }
    }

    public int contain(int value){
        if(first!=null){
            int position = 0;
            Node traverse = first;
            do {
                if(traverse.getData()==value)
                    return position;
                traverse = traverse.getNext();
                position++;
            }while(traverse.hasNext());
        }
        return -1;
    }

    public int value(int position){
        if(first != null) {
            Node traverse = first;
            for (int i = 0; i < position&&traverse!=null; i++) {
                traverse = traverse.getNext();
            }
            if(traverse!=null)
                return traverse.getData();
        }
        throw new OutOfMemoryError();
    }

    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            //When a node is created, you have no idea who is the next, since it should be the latest one
            //as it is initialized, so its next points to next.
        }

        public Node() {

        }

        public Node getNext(){
            if(this.next != null){
                return this.next;
            }
            return null;
        }

        public boolean hasNext(){
            return !(this.next == null);
        }

        public int getData() {
            return data;
        }


    }

}
