package com.algorithm.datastructure.linkedlist;

import com.algorithm.datastructure.stack.Stack;

public class LinkedListAdder {

    public Stack sum(Stack first, Stack second){
        int num1 = convertFrom(first);
        int num2 = convertFrom(second);

        int sum = num1 + num2;

        return convertTo(sum);
    }

    private int convertFrom(Stack stack) {
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            int num = stack.pop();
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }

    private Stack convertTo(int number) {
        Stack forward = new Stack();
        Stack backward = new Stack();

        while (number > 0){
            forward.push(number % 10);
            number = number / 10;
        }

        while (!forward.isEmpty()){
            backward.push(forward.pop());
        }
        return backward;
    }


}
