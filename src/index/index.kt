package index

import react.dom.h1
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("root")

    render(rootDiv) {
        h1{
            +"Blackjack"
        }
    }
}