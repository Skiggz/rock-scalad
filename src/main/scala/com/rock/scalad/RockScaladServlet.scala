package com.rock.scalad

import org.scalatra._
import scalate.ScalateSupport

class RockScaladServlet extends RockScaladStack {

  get("/") {
    <html>
      <body>
        <h1>Welcome to Rock Scalad!</h1>
        <h3>Nothing you wouldn't show your own mother so far, but this is only the beginning.</h3>
        <p>Please don't <a href="no-way-jose">click random things</a>.</p>
      </body>
    </html>
  }

  notFound {
  	<html>
  		<body>
  			<h1>Woah, there...</h1>
  			<p>The page you request was not found. <a href="/">Go home surfer, you're drunk</a></p>
  		</body>
  	</html>
  }
  
}
