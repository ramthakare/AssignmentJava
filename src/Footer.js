import { Component } from "react";
import { Link } from "react-router-dom";

export default class Footer extends Component {
  render() {
    return (
      <>
        <div class="container">
          <div class="row">
            <div class="col-4 col-lg-2"></div>
            <div class="col-md-8">
              <div className="nsp_header"></div>
            </div>
          </div>
        </div>

        <div className="nsp_header">
          <div class="col"></div>
        </div>

        <div class="shadow p-3 mb-5 bg-body rounded">
          <div class="container-md">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
              <div class="container-fluid">
                <div
                  class="collapse navbar-collapse"
                  id="navbarSupportedContent"
                >
                  <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                      <Link class="nav-link" to={"/Features"}>
                        Features
                      </Link>
                    </li>

                    <li class="nav-item">
                      <Link class="nav-link" to={"/Calculator"}>
                        Calculator
                      </Link>
                    </li>

                    <li class="nav-item">
                      <Link class="nav-link" to={"/Document"}>
                        Document
                      </Link>
                    </li>
                  </ul>
                  <form class="d-flex">
                    <input
                      class="form-control me-2"
                      type="search"
                      placeholder="Search"
                      aria-label="Search"
                    ></input>
                    <button class="btn btn-outline-success" type="submit">
                      Search
                    </button>
                  </form>
                </div>
              </div>
            </nav>
          </div>
        </div>
      </>
    );
  }
}
