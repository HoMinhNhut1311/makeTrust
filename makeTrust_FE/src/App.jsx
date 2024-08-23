
import './App.css'
import {BrowserRouter, Route, Routes} from 'react-router-dom'
import HomeSp from './Shopper/pages/HomeSp'
import DetailAov from './Shopper/components/Detail/DetailAov'

function App() {

  return (
    <>
    <BrowserRouter>
        <Routes>
          <Route path='' element={<HomeSp/>}/>
          <Route path='/detail' element={<DetailAov/>}/>
        </Routes>
    </BrowserRouter>
    </>
  )
}

export default App
