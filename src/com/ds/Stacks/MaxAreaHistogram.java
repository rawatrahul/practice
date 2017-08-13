package com.ds.Stacks;

import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int a[] = {2, 2, 2, 6, 1, 5, 4, 2, 2, 2, 2};
        System.out.println(maxHistogram(a));
    }

    private static int maxHistogram(int[] a) {
        int top = 0, maxArea = -1, area = 0, i;
        Stack<Integer> stack = new Stack<>();
        for (i = 0; i < a.length; ) {

            // If this bar is higher than the bar on top stack, push it to stack
            if (stack.isEmpty() || a[stack.peek()] < a[i]) {
                stack.push(i++);
            }
            // If this bar is lower than top of stack, then calculate area of rectangle
            // with stack top as the smallest (or minimum height) bar. 'i' is
            // 'right index' for the top and element before top in stack is 'left index'
            else {
                top = stack.peek();
                stack.pop();

                //if stack is empty means everything till i has to be
                //greater or equal to input[top] so get area by
                //input[top] * i;
                if (stack.isEmpty()) {
                    area = a[top] * i;
                    maxArea = maxArea < area ? area : maxArea;
                }

                //if stack is not empty then everythin from i-1 to input.peek() + 1
                //has to be greater or equal to input[top]
                //so area = input[top]*(i - stack.peek() - 1);
                else {
                    area = a[top] * (i - 1 - stack.peek());
                    maxArea = maxArea < area ? area : maxArea;
                }
            }
        }
        while (stack.isEmpty()) {
            top = stack.peek();
            stack.peek();
            if (stack.isEmpty()) {
                area = a[top] * i;
                maxArea = maxArea < area ? area : maxArea;
            }

            //if stack is not empty then everythin from i-1 to input.peek() + 1
            //has to be greater or equal to input[top]
            //so area = input[top]*(i - stack.peek() - 1);
            else {
                area = a[top] * (i - 1 - stack.peek());
                maxArea = maxArea < area ? area : maxArea;
            }
        }

        return maxArea;
    }
}
