package com.group.libraryapp.calculator

// private을 Test에서 받으려면 방법 3가지
// class 앞에 data를 적는 방법, private를 public으로 받는 방법, 그리고 현재 private를 놔두고 get으로 받는 방법

class Calculator(
    private var _number: Int
) {
    val number: Int
        get() = this._number

    fun add(operand: Int) {
        this._number += operand
    }

    fun minus(operand: Int) {
        this._number -= operand
    }

    fun multiply(operand: Int) {
        this._number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("0으로 나눌 수 없습니다")
        }
        this._number /= operand
    }
}