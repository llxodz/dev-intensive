package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parse: List<String>? = fullName?.split(" ")

        val firstName = parse?.getOrNull(0)
        val lastName = parse?.getOrNull(1)
        return firstName to lastName
    }

//    fun Utils.transliteration(payload: String, divider: String = " "): String {
//        return TODO()
//    }

    fun Utils.toInitials(firstName: String?, lastName: String?): String? {
        val a :Char? = firstName?.trimStart()?.firstOrNull()?.toUpperCase()
        val b :Char?  = lastName?.trimStart()?.firstOrNull()?.toUpperCase()

        return if (a == null && b == null) null
        else if (a==null) b.toString()
        else if (b==null) a.toString()
        else a.toString() + b
    }


}
