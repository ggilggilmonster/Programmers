package com.example.programmers

class Solution {
    fun solution(s: String): String {
        var midStr = s.length / 2
        if(s.length % 2 == 0) {
            return s.substring(midStr-1, midStr+1)
        } else {
            return s.substring(midStr, midStr+1)
        }
    }
}