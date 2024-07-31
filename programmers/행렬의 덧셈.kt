package com.example.programmers

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array<IntArray>(arr1.size){ IntArray(arr1[0].size){ 0 } }

        for(i in 0 until arr1.size) {
            for(j in 0 until arr1[0].size) {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        return answer
    }
}