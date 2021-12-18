import { useEffect, useState } from "react";
import { getCustomerById, getCustomerList } from "./Customer.service";

export default () => {
  const [customerList, setCustomerList] = useState([]);

  useEffect(() => {
    getCustomerList().then((Response) => {
      if (Response && Response.data) {
        setCustomerList(Response.data);
      }
    });
  }, []);

  const onGetClickHandler = (customerId) => {
    getCustomerById(customerId).then((Response) => {
      if (Response && Response.data) {
        alert("Name: " + Response.data.customerName);
      }
    });
  };

  return (
    <>
      <h1 className="text.center">Customer List</h1>
      <table className="table">
        <thead>
          <tr>
            <th>Name</th>
            <th>Mobile</th>
          </tr>
        </thead>
        <tbody>
          {customerList.map((customer) => {
            return (
              <tr key={customer.customerId}>
                <td>{customer.customerName}</td>
                <td>{customer.customercontact}</td>
                <td>
                  <button
                    onClick={() => {
                      onGetClickHandler(customer.customerId);
                    }}
                  >
                    submit
                  </button>
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};
