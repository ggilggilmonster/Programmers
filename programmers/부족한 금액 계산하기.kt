package com.example.programmers

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        for(i in 1..count) {
            answer += price * i
        }
        answer -= money

        return if(answer > 0) {
            answer
        } else 0
    }
}