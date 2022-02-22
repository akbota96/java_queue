public class Node<Item> {
    private Item data;
    private Node prevNode, nextNode;

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node(Item data, Node prev, Node next) {
        this.data = data;
        this.prevNode = prev;
        this.nextNode = next;
    }
}