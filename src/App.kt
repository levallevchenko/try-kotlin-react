package app

import kotlinx.css.Color
import kotlinx.css.Color.Companion.white
import kotlinx.css.TextAlign
import kotlinx.css.backgroundColor
import kotlinx.css.color
import kotlinx.css.fontSize
import kotlinx.css.height
import kotlinx.css.paddingBottom
import kotlinx.css.paddingLeft
import kotlinx.css.paddingRight
import kotlinx.css.paddingTop
import kotlinx.css.px
import kotlinx.css.textAlign
import react.*
import react.dom.*
import components.logo.*
import components.ticker
import styled.css
import styled.styledDiv
import styled.styledP

class App : RComponent<RProps, RState>() {
  override fun RBuilder.render() {
    styledDiv {
      css {
        textAlign = TextAlign.center
      }
      styledDiv {
        css {
          backgroundColor = Color("#000")
          height = 160.px
          paddingTop = 20.px
          paddingRight = 20.px
          paddingBottom = 20.px
          paddingLeft = 20.px
          color = white
        }
        logo()
        h2 {
          +"Welcome to React with Kotlin"
        }
      }
      styledP {
        css {
          fontSize = 18.px
        }
        +"To get started, edit "
        code { +"App.kt" }
        +" and save to reload."
      }
      styledP {
        css {
          fontSize = 16.px
        }
        ticker()
      }
    }
  }
}

fun RBuilder.app() = child(App::class) {}
