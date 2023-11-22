package components.logo

import react.*
import react.dom.*

@JsModule("src/components/logo/react.svg")
external val reactLogo: dynamic
@JsModule("src/components/logo/kotlin.svg")
external val kotlinLogo: dynamic

fun RBuilder.logo(height: Int = 100) {
  div("Logo") {
    attrs.jsStyle.height = height
    img(alt = "React components.logo.components.logo", src = reactLogo, classes = "Logo-react") {}
    img(alt = "Kotlin components.logo.components.logo", src = kotlinLogo, classes = "Logo-kotlin") {}
  }
}
