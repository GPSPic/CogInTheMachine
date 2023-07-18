import { useEffect, useState } from 'react';
import './App.css';

function App() {

  const [employees, setEmployees] = useState([])

  useEffect(() => {
    fetch("http://localhost:8080/employees")
    .then(res => res.json())
    .then((data) => setEmployees(data))
  }, []);

  const helloBob = <p>Hello {employees[0]?.firstName}</p> 
  
  return (
    <div className="App">
      {helloBob}
    </div>
  );
}

export default App;
