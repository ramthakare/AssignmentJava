import axios from "axios";

const BASE_URL = "http://localhost:8080";

export const getCustomerList = () => {
  return axios.get(BASE_URL + "/Customer/list");
};

export const getCustomerById = (CustomerId) => {
  return axios.get(BASE_URL + "/Customer/get/" + CustomerId);
};
