package com.example.programmers

class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        if (s.length != 4 && s.length != 6) {
            answer = false
        }
        for (char in s) {
            if (!char.isDigit()) {
                answer = false
            }
        }
        return answer
    }
}