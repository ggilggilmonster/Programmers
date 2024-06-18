package com.example.programmers

class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n = num.toLong()

        for(i in 1 .. 500) {
            if(n == 1L) {
                return answer
            }
            if(n % 2 == 0L) {
                n /= 2
            }
            else {
                n = n * 3 + 1
            }
            answer++
        }
        return -1
    }
}