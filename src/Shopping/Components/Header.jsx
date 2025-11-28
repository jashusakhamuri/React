import React from "react"

const Header = () => {

      return(
        <div className="HeaderSection">
          <div className="left">
            <div className="Tittle">
              <h2>
                Jaswanth Store
              </h2>

            </div>
          </div>
          <div className="Center">
            <ul>
              <li>Kids</li>
              <li>Men</li>
              <li>Women</li>
              <li>GrandParents</li>
            </ul>
            
          </div>
          <div className="Search">
              <input type = "text" placeholder="Search"/>
            </div>

          <div className="Right">
            <div className="signin">
              signIn/signup
            </div>
            <div className="Cart">
              cart
            </div>
          </div>

        </div>
      )
}
export default Header