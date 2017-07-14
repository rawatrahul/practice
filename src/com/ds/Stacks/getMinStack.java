/*
package com.ds.Stacks;

import java.util.Stack;

*/
/**
 * Created by rahul.rawat on 6/26/2017.
 *//*

public class getMinStack {
    public int minElement;
    Stack<Integer> s = new Stack<>();
    public void getMin(){
    if(s.empty())
        System.out.println("Stack Empty");
    else
        System.out.println(minElement);
    }
    public void push(int x){
        if(s.empty()){
            minElement=x;
            s.push(x);
        }
        if(x>=minElement)
            s.push(x);
        if(x<minElement){
            s.push(2*x-minElement);
            minElement=x;
        }
        }
    public int pop(){
        if(s.empty())
        System.out.println("Stack is empty");
        int temp = s.pop();
        if(temp<minElement)
            minElement=2*minElement-temp;

    }
    }

}
*/
