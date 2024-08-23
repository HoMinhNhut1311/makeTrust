import React from 'react';
import WhatshotIcon from '@mui/icons-material/Whatshot';
import './FlashSale.scss';
import CardFlashSale from './CardFlashSale';

function FlashSale() {

    const flashSales = [
        {
            title : 'Thử vận may 5k',
            des : 'Danh sách ngẫu nhiên các tài khoản Liên Quân chỉ từ 5.000Vnđ'
        },

        {
            title : 'Thử vận may VIP',
            des : 'Danh sách ngẫu nhiên các tài khoản Liên Quân từ 100.000VNđ'
        },

        {
            title : 'Quân Huy 50k',
            des : 'Ngẫu nhiên nhận được từ 200-30000 quân huy'
        },
        {
            title : 'Code ngẫu nhiên',
            des : 'Nhận được Code có giá trị ngẫu nhiên cùng các phần quà đặc biệt'
        },
        

    ]

    return (  
        <>
            <div className="flash-sale__container mt-4">
                <div className="flash-sale__header bg-danger p-2">
                    <span className='fs-5 fw-bold text-white text-capitalize'>
                        <WhatshotIcon fontSize='medium' className='mb-1 me-2'/>
                        Khung giờ flash sale
                    </span>
                </div>

                <div className="flash-sale__content bg-danger">
                    <div className="row g-2">
                        <div className="col-4">
                         <div className="flash-sale__content-item px-5 py-2 text-center">
                            <span className='d-block fs-4'>9 : 00</span>
                            <span>Đã diễn ra</span>
                             </div>
                        </div>

                        <div className="col-4">
                         <div className="flash-sale__content-item px-5 py-2 text-center">
                            <span className='d-block fs-4'>9 : 00</span>
                            <span>Đã diễn ra</span>
                             </div>
                        </div>

                        <div className="col-4">
                         <div className="flash-sale__content-item px-5 py-2 text-center">
                            <span className='d-block fs-4'>9 : 00</span>
                            <span>Đã diễn ra</span>
                             </div>
                        </div>

                        <div className="col-4">
                         <div className="flash-sale__content-item px-5 py-2 text-center">
                            <span className='d-block fs-4'>9 : 00</span>
                            <span>Đã diễn ra</span>
                             </div>
                        </div>             
                    </div>

                    <div className="flash-sale__category">
                            <div className="row">
                                {flashSales.map((fs) => {
                                    return (
                                        <div className="col-3">
                                        <CardFlashSale title={fs.title} des={fs.des}/>
                                        </div>
                                    )
                                })}
                          
                            </div>
                    </div>  
                </div>
            </div>
        </>
    );
}

export default FlashSale;
