package dev.lpa;

public class FuzzyLinkedList<T> { //using generics for data type T
    private double membershipValue;
    private T data; //Data type is now generic
    private FuzzyLinkedList<T> next;

    //Default constructor
    public FuzzyLinkedList() {
        this.data = null;
        this.membershipValue = 0.0;
        this.next = null;
    }
    //Parameterized constructor
    public FuzzyLinkedList(T data, double membershiValue){
        this.data = data;
        this.membershipValue = membershiValue;
        this.next = null;
    }
    //Getters and setters
    public T getData(){
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public double getMembershipValue(){
        return membershipValue;
    }

    public void setMembershipValue(double membershipValue){
        this.membershipValue = membershipValue;
    }

    public FuzzyLinkedList<T> getNext(){ //Return type is FuzzyLinkedList<T>
        return next;

    }

    public void setNext(FuzzyLinkedList<T> next){ //Parameter type is FuzzyLinkedList<T>
        this.next = next;
    }

    //Add node at the end of the list
    public void addNode(T data, double membershipValue) {
        FuzzyLinkedList<T>newNode = new FuzzyLinkedList<>(data, membershipValue);
        if (this.data == null && this.next == null && this.membershipValue == 0.0){
            this.data = newNode.data;
            this.membershipValue = newNode.getMembershipValue();
            this.next = null;
            return;
        }
        //Otherwise traverse to the end and append
        FuzzyLinkedList<T>temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    //Print the linked list
    public void printList(){
        FuzzyLinkedList<T>temp = this.next;
        while (temp != null && temp.data != null){
            System.out.println(temp.toString());
            temp = temp.getNext();
        }
    }

    @Override
    public String toString(){
        return "Data: " + data + ", Memership Value: " + membershipValue;
    }
}
