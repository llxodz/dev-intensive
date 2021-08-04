package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parse: List<String>? = fullName?.split(" ")

        var firstName = parse?.getOrNull(0)
        var lastName = parse?.getOrNull(1)
        return firstName to lastName
    }
}