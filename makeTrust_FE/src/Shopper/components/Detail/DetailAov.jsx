import AddShoppingCartIcon from '@mui/icons-material/AddShoppingCart';
import ShoppingBasketIcon from '@mui/icons-material/ShoppingBasket';
import LocalFireDepartmentIcon from '@mui/icons-material/LocalFireDepartment';

import './DetaiAov.scss'
function DetailAov() {
    return (
        <div style={{ height: '100vh', backgroundColor: '#f4f4f5' }}>
            <div className="detail-aov mt-5 container" style={{ height: '300px' }}>
                <h5>Chi tiết tài khoản liên quân</h5>
                <div className="row m-4 detail-aov__container p-3">
                    <div className="col-5">
                        <div className="py-3 bg-dark" style={{ borderRadius: '4px' }}>
                            <img src="https://s3-hcm-r1.s3cloud.vn/static/2u3787gkbYllPMQ.jpeg" alt="" className='img-fluid'
                                style={{ height: '300px' }}
                            />
                        </div>
                    </div>

                    <div className="col-7">
                        <span className='d-block' style={{ fontSize: '14px' }}>Trò chơi : <span className='text-danger'>Liên quân</span></span>
                        <span className='d-block fw-bold mt-1' style={{ fontSize: '14px' }}>Mã số : 575138</span>

                        <div className="row mt-2 p-2">
                            <div className="col-9 reivew-payment rounded p-2 mb-0">
                                <div className="row">
                                    <div className="col">
                                        <span>ATM, Momo</span>
                                        <h3>380, 000đ</h3>
                                        <span>425,000đ</span>
                                    </div>
                                    <div className="col">
                                        <span>Thẻ cào (Card)</span>
                                        <h3>425,000đ</h3>
                                        <span>Giá gốc : 850,000đ</span>
                                    </div>
                                </div>
                            </div>

                            <div className="action-payment col-3 d-flex">
                                <div className='m-auto text-center'>
                                    <AddShoppingCartIcon className='' />
                                    <button className='btn btn-outline-success d-block mt-3'>Thêm vào giỏ</button>
                                </div>
                            </div>
                        </div>

                        <span style={{ fontSize: '12px' }}>Đã có 10 người đã thêm vào yêu thích</span>

                        <div className="info mt-3">
                            <h5 className='text-uppercase ' style={{ fontSize: '1rem' }}>Thông tin chi tiết</h5>
                            <div className='info-item row mb-1 g-1'>
                                <div className='info-item__attribute py-2 col-4'>
                                    <span className='ms-2'>Tướng</span>
                                </div>
                                <div className='info-item__value py-2 col-8'>
                                    <span className='ms-2'>109</span>
                                </div>
                            </div>

                            <div className='info-item row mb-1 g-1'>
                                <div className='info-item__attribute py-2 col-4'>
                                    <span className='ms-2'>Trang phục</span>
                                </div>
                                <div className='info-item__value py-2 col-8 blur'>
                                    <span className='ms-2'>127</span>
                                </div>
                            </div>

                            <div className='info-item row mb-1 g-1'>
                                <div className='info-item__attribute py-2 col-4'>
                                    <span className='ms-2'>Rank</span>
                                </div>
                                <div className='info-item__value py-2 col-8'>
                                    <span className='ms-2'>Tinh Anh</span>
                                </div>
                            </div>

                            <div className='info-item row mb-1 g-1'>
                                <div className='info-item__attribute py-2 col-4'>
                                    <span className='ms-2'>Trạng thái</span>
                                </div>
                                <div className='info-item__value py-2 col-8 blur'>
                                    <span className='ms-2'>Email, Sdt chết</span>
                                </div>
                            </div>

                            <span className='sale-text py-2 d-block'>
                                <LocalFireDepartmentIcon className='text-danger' />  Khuyến mãi tặng 12% khi nạp qua ATM/MOMO</span>
                        </div>

                        <button className='btn btn-outline-danger px-5 py-2 mt-2'>
                            <ShoppingBasketIcon /> Mua ngay</button>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default DetailAov;