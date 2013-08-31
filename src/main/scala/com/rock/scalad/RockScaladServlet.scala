package com.rock.scalad

import org.scalatra._
import scalate.ScalateSupport

class RockScaladServlet extends RockScaladStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
