import logo from "./logo.svg";
import "./App.css";
import CreateEmployee from "./components/employee/CreateEmployee";
import ListEmployee from "./components/employee/ListEmployee";
import { BrowserRouter as Router, Route, Link, Switch } from "react-router-dom";
import EditEmployee from "./components/employee/EditEmployee";

function App() {
  return (
    <div className="App">
      <Router>
        <div className="container">
          <nav className="btn btn-warning navbar navbar-expand-lg navheader">
            <div className="collapse navbar-collapse">
              <ul className="navbar-nav mr-auto">
                <li className="nav-item">
                  <Link to={"/Createemployee"} className="nav-link">
                    Add Employee
                  </Link>
                </li>

                <li className="nav-item">
                  <Link to={"/EmployeeList"} className="nav-link">
                    Employee List
                  </Link>
                </li>
              </ul>
            </div>
          </nav>{" "}
          <br />
          <Switch>
            <Route exact path="/Createemployee" component={CreateEmployee} />

            <Route exact path="/edit/:id" component={EditEmployee} />

            <Route exact path="/EmployeeList" component={ListEmployee} />
          </Switch>
        </div>
      </Router>
    </div>
  );
}

export default App;
