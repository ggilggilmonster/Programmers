package com.example.programmers

class Solution {
    fun solution(phone_number: String): String {

        var tel = StringBuilder()

        phone_number.forEachIndexed { index, num ->

            if(index in (0 .. phone_number.length - 5)) {
                tel.append("*")
            } else {
                tel.append(num)
            }
        }
        return tel.toString()
    }
}