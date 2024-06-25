package com.example.programmers

class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        var num = numbers.sum()
        answer = 45 - num
        return answer
    }
}