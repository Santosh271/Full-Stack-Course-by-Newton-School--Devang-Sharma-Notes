import './App.css';
import Header from './Components/Header';
import {About} from './Components/About';
import {Footer} from './Components/Footer';

function App() {
  //let num=123;
  return (
    <>
      <Header title="Devang Todos" />
      <About />
      <Footer/>
    </>
  );
}

export default App;
