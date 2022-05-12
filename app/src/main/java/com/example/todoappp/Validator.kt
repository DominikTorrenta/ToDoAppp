package com.example.todoappp

import android.text.Editable


class Validator {

    fun emailvalid(text:Editable?)=
        if( text?.isEmpty() == false && text.length!! >= 7 && text.contains(other = "@")) null
        else "not enough symbols"

    fun passwordvalid(text:Editable?)=
        if( text?.isEmpty() == false && text.length!! >= 8 ) null
        else "not enough symbols"
}