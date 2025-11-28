
import {React , useState}  from "react"
import Banner from "../Components/Banner"

import Collection from "../Components/Collection"
import Footer from "../Components/Footer"
import Header from "../Components/Header"
import { Gents } from "../data"


const MainPage = () => {
const [GentsFashion , setGentsFashin] = useState(Gents)
return (
 <div className="AppBackground">
  
    <Header />
    <Banner />
    <Collection  GentsFashion = {GentsFashion}/>
    <Footer />
  </div>
);
      
}
export default MainPage
