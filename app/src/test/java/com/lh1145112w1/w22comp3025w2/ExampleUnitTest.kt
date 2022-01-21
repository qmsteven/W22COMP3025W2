package com.lh1145112w1.w22comp3025w2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun readOnly() {
        //val means immutable. Once it has a value, it cannot be changed
        //in Java, this would look like -> final String pizzaTopping = "pineapple"
        val pizzaTopping = "pineapple"
//        pizzaTopping = "banana"
        println("One of the best pizza toppings is $pizzaTopping")
    }

    @Test
    fun changeVar() {
        //var are said to be "mutable" which means the value CAN change
        var pizzaPlace = "Pizza Hut"
        pizzaPlace = "Little Italy Pizzario"
        println("A great place for pizza is $pizzaPlace")
    }

    @Test
    fun allowForNull() {
        //in Java would look like String flavour;
        var flavour : String?

        flavour = null

        //in Java, the following would trigger a null pointer exception, but in Kotlin,
        //it recognizes that if it is null, the if statement must be false and jumps to
        //the else statement
        if (flavour.equals("Meat Lovers"))
            println("Bring on the meat!")
        else
            println(flavour)
    }

    @Test
    fun elvisOperator() {
        var flavour : String? = null

        //elvis operator ?: if it's null, assign another value
        println(flavour ?: "something else")

        flavour = "veggie"

        println(flavour ?: "something else")
    }

    //In Java public int multiply(int left, int right){...}
    fun multiply(left : Int, right : Int = 10) : Int {
        println("left: $left * right: $right = " + left*right)
        return left*right
    }

    @Test
    fun testMultiply() {
        assertEquals(12, multiply(6, 2))
        assertEquals(60, multiply(6))
        assertEquals(15, multiply(right = 5, left = 3))
    }
}