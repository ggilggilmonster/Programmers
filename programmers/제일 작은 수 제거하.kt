package com.example.programmers

class Solution {
    fun solution(arr: IntArray): IntArray {
        var minNum = arr.minOrNull()
        var minException = arr.filter { it != minNum }.toIntArray()

        if(minException.isEmpty()) {
            return intArrayOf(-1)
        } else {
            return minException
        }
    }
}