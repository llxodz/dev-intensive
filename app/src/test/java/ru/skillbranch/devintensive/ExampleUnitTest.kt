package ru.skillbranch.devintensive

import org.junit.Assert.assertEquals
import org.junit.Test
import ru.skillbranch.devintensive.models.User
import java.util.*

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
    fun test_instance() {
//        val user2 = User("2", "John", "Weak")
    }

    @Test
    fun test_factory() {
//        val user = User.makeUser("John Weak")
//        val user1 = User.makeUser("John Doe")
//        val user = User.makeUser("John Weak")
//        val user2 = user.copy(id="2", lastName = "Cena", lastVisit = Date())
//        print("$user \n$user2")
    }

    @Test
    fun test_decomposition() {
        val user = User.makeUser("John Weak")

        fun getUserInfo() = user

        val (id, firstName, lastName) = getUserInfo()

        println("$id $firstName $lastName")
        println("${user.component1()} ${user.component2()} ${user.component3()}")
    }

    @Test
    fun test_copy() {
        val user = User.makeUser("John Weak")
        val user2 = user.copy(id="2", lastVisit = Date())

        if(user.equals(user2)){
            println("equals ${user.hashCode()} ${user2.hashCode()} \n$user \n$user2")
        }else {
            println("not equals ${user.hashCode()} ${user2.hashCode()} \n$user \n$user2")
        }
    }
}