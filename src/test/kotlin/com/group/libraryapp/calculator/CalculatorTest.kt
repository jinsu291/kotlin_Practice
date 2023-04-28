package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()

}

class CalculatorTest {

    fun addTest() {

        //given, when, then 방식

        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        if (calculator.number != 8) {
            throw IllegalStateException()
        }
    }

    fun minusTest() {

        //given, when, then 방식

        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(3)

        // then
        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {

        //given, when, then 방식

        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        if (calculator.number != 15) {
            throw IllegalStateException()
        }
    }

//    이 방법은 data로 했을 때 적는 방법
//    fun addTest() {
//        val calculator = Calculator(5)
//        calculator.add(3)
//        val expectedCalculator = Calculator(8)
//        if (calculator != expectedCalculator) {
//            throw IllegalStateException()
//        }
//    }

}