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

  get("/awesome/:user") {
  	// If they don't include awesomeness, they're clearly not awesome
  	val awesomeness:Int = params.getOrElse("awesomeness", "0").toInt

  	// If they don't send a user, they'll find themselves in no man's land (404)
  	val user:String = params("user")

  	<html>
  		<body>
  			<p>Hello {user}, your awesomeness is looking to be about {awesomeness}</p>
  		</body>
		</html>
  }

  get("/halt") {
  	// If you don't pass in the secret param, you'll get an invalid request response (400)
  	val secret:String = params.getOrElse(
  		"whoGoesThere", 
  		halt(
  			400,
  			<h1>Aha! You tried to be sneaky. Mediocre attempt</h1>)
  		)
  	<h1>Ahoy, Matey!</h1>
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
