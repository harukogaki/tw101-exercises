package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node prev;
    private Node next;

    public Node(String name)
    {
        this.name = name;
        this.next = null;
        this.prev = null;
    }

    public String getName(){ return this.name; }

    public void add(String nameOfNewNode) {

        //new node precedes this node
        if (name.compareTo(nameOfNewNode) > 0){
            if (this.prev != null)
                this.prev.add(nameOfNewNode);
            else
                this.prev = new Node (nameOfNewNode);
        }

        //new node comes after this node
        if (name.compareTo(nameOfNewNode) < 0){
            if (this.next != null)
                this.next.add(nameOfNewNode);
            else
                this.next = new Node (nameOfNewNode);
        }


    }

    // recursive method that performs an in-order traversal of the root node
    // inserting all the names into an ArrayList defined and passed by the caller
    private void names_(List<String> names, Node root){
        if (root.prev != null)
            names_(names, root.prev);

        names.add(root.getName());

        if (root.next != null)
            names_(names, root.next);

    }

    public List<String> names() {
        List<String> allNames = new ArrayList<>();
        names_(allNames, this);

        return allNames;
    }
}
