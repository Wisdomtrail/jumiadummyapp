package com.example.jumia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Collection<Integer> collections = new ArrayList<>(Arrays.asList(1,2,3,4,5,8));
        LinkedList<Integer> head = new LinkedList<>(collections);
        System.out.println(reverseLinkedList(head, 4, 2));
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> head, int left, int right){
        if (head == null || left == right){
            return head;
        }

        int counter = Math.max(left, right);
        LinkedList<Integer> answer = new LinkedList<>();
        answer.add(head.get(0));
        int toBeMinus = head.size() - counter;
        for (int i = 1; i < head.size()-toBeMinus; i++) {
            answer.add(i, head.get(counter-1));
            counter-=1;
        }
        answer.add(head.get(head.size()-1));
        return answer;
    }
}
