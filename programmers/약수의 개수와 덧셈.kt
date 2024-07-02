package com.example.programmers

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for(i in left .. right) {
            var c = 0
            for(j in 1 .. i) {
                if(i % j == 0) {
                    c++
                }
            }
            if(c % 2 == 0) {
                answer += i
            } else answer -= i
        }
        return answer
    }
}