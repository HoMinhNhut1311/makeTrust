

function FilterSp() {

    const filterPrice = [
        'Dưới 100.000đ','Dưới 200.000đ','100.000đ đến 300.000đ','300.000 đến 500.000đ',
        '500.000đ đến 1.000.000đ','2.000.000 đến 4.000.000đ'
    ]

    const filterRank = [
        'Sắt','Đồng','Bạc','Vàng','Bạch Kim','Kim Cương','Tinh Anh','Cao Thủ','Thách Đấu'
    ]
    return ( 
        <>
            <h4>Bộ lọc</h4>

            <div className="filter-sp p-2">
                <div className="filter-sp__container">
                    <div className="d-flex justify-content-around" style={{gap : 10}}>
                        <input type="text" className="form-control p-2"  placeholder="Id"/>
                        <select name="" id="" className="form-control">
                                <option defaultChecked>Giá tiền</option>
                                {
                                    filterPrice.map((fp) => {
                                        return (
                                            <option value={fp}>{fp}</option>
                                        )
                                    })
                                }
                        </select>
                        <select name="" id="" className="form-control">
                            <option defaultChecked>Hạng(Rank)</option>
                            {
                                filterRank.map((fR) => {
                                    return (
                                        <option value={fR}>{fR}</option>
                                    )
                                })
                            }
                        </select>
                        <button className="btn btn-danger">Áp dụng</button>
                    </div>
                </div>
            </div>
        </>
     );
}

export default FilterSp;