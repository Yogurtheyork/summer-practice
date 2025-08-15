import { useState } from 'react'
import Card from './Card.jsx'

function App() {

  const [infos, setInfo] = useState([])

  const handleClick = (event) =>{
    const buttonValue = event.target.value
    fetch( 'http://localhost:8080/SightAPI?zone=' + buttonValue) 
    .then(res => res.json()) 
    .then(data => {
          /*接到request data後要做的事情*/
      const dataWithIds = data.map((item, index) => ({
        ...item,
        id: `${buttonValue}-${index}` // 或使用 crypto.randomUUID()
      }));
      setInfo(dataWithIds) // 更新狀態
      console.log(dataWithIds) // 印出資料以供檢查
    })
    .catch(e => {
        /*發生錯誤時要做的事情*/
        console.log("error")
    })
  }

  return (
    <>
      <div>
        <button value = "中山" onClick={handleClick}>中山區</button>
        <button value = "信義" onClick={handleClick}>信義區</button>
        <button value = "仁愛" onClick={handleClick}>仁愛區</button>
        <button value = "中正" onClick={handleClick}>中正區</button>
        <button value = "安樂" onClick={handleClick}>安樂區</button>
        <button value = "七堵" onClick={handleClick}>七堵區</button>
        <button value = "暖暖" onClick={handleClick}>暖暖區</button>
      </div>
      <div>
        {infos.map((info)=>(
          <Card
            key={info.id}
            sightName = {info.sightInfo}
            title = {info.title}
            category = {info.category}
            photoURL = {info.photoURL} 
            address = {info.address}
            description = {info.description}
          />
        ))}
      </div>
    </>
  )
}

export default App
