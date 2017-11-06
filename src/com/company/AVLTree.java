package com.company;

import java.util.ArrayList;

public class AVLTree {
  private AVLTree left, right, parent;
  private Comparable data;
  private int balance;
  public AVLTree(Comparable data){
    this.data = data;
    this.balance = 0;
  }
  public static boolean search(AVLTree tree, Comparable object){
    return false;
  }

  //make recursive by insterting at tree == null
  public static AVLTree insert(AVLTree tree, Comparable object){
    if(tree == null){
      tree = new AVLTree(object);
    }else if(object.compareTo(tree.data) == -1){
      insert(tree.left, object);
      tree.left.parent = tree;
      tree.balance--;
    }else if(object.compareTo(tree.data) == 0 || object.compareTo(tree.data) == 1){
      insert(tree.right, object);
      tree.right.parent = tree;
      tree.balance++;
    }
    checkBalance(tree);
    return tree;
  }

  private static void checkBalance(AVLTree tree){

  }

  public static AVLTree delete(AVLTree tree, Comparable object){
    return tree;
  }

  public static ArrayList<Comparable> inOrder(AVLTree tree){
    return new ArrayList<>();
  }

  //Comparable to and Comparable from are inclusive
  public static int count(AVLTree tree, Comparable to, Comparable from){
    return 0;
  }

}
