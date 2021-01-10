import { BrowserRouter, Switch, Route } from "react-router-dom";
import Home from "./Home/home";
import Navbar from "./Navbar/navbar";
import Orders from "./Orders/orders";

function Routes() {

    return (
        <BrowserRouter>
            <Navbar />
            <Switch>
                <Route path='/orders'>
                    <Orders />
                </Route>
                <Route path='/'>
                    <Home />
                </Route>
            </Switch>
        </BrowserRouter>
    )

}

export default Routes;