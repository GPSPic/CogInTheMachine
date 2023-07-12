import { useEffect, useState } from 'react';
import './App.css';

function App() {

  const [employees, setEmployees] = useState([])

  useEffect(() => {
    fetch("http://localhost:8080/employees")
    .then(res => res.json())
    .then((data) => setEmployees(data))
  }, []);

  console.log(employees);
  const bob = employees[0]?.firstName

  return (
    <div className="App">
      {employees.length > 0 ? <p>Hello {bob}</p> : <p>Hello World</p>}
    </div>
  );
}

export default App;
