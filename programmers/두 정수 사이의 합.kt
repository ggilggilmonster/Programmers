package com.example.programmers

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer : Long = 0
        if(a < b) {
            for(i in a .. b) {
                answer += i
            }
        } else if(a > b) {
            for(i in b .. a) {
                answer += i
            }
        } else answer = a.toLong()
        return answer
    }
}