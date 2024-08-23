import SportsEsportsIcon from '@mui/icons-material/SportsEsports';
import DeliveryDiningIcon from '@mui/icons-material/DeliveryDining';
import ThumbUpAltIcon from '@mui/icons-material/ThumbUpAlt';
import PaidIcon from '@mui/icons-material/Paid';
import NotificationsNoneIcon from '@mui/icons-material/NotificationsNone';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import AnnouncementIcon from '@mui/icons-material/Announcement';
import './HeaderSp.scss'
function HeaderSp() {
    return ( 
        <>
            <div className="header-sp">
                    <div className="header-sp__top p-3 mx-3">
                         <div className="container">
                         <div className="d-flex justify-content-between">
                                <div className="content-left">
                                    <SportsEsportsIcon className='  -success'/> <span>Hàng ngàn tài khoản liên quân</span>
                                </div>

                                <div className="content-middle">
                                    <DeliveryDiningIcon className='text-info'/> <span>Săn sale tài khoản hàng ngày</span>
                                </div>

                                <div className="content-right">
                                    <ThumbUpAltIcon className='text-danger'/> <span>Uy tín - Giá tốt nhất thị trường</span>
                                </div>
                            </div>
                         </div>
                    </div>

                    <div className="header-sp__bottom container mt-2 mb-3">
                        <div className="d-flex justify-content-between">
                            <div className="content-left m-2">
                                <img src="/images/logoShop.png" alt="" height={50}/>
                            </div>

                            <div className="content-middle m-2">
                                <div className="form-search d-flex justify-content-between">
                                    <input type="text" placeholder='Nhập tìm kiếm...'/>
                                    <button>Tìm kiếm</button>
                                </div>
                            </div>

                            <div className="content-right d-flex justify-content-between m-2">
                                    <div className="right-item">
                                        <button className='btn btn-outline-success'>
                                            <PaidIcon/> <span>Nạp tiền</span>
                                        </button>
                                    </div>

                                    <div className="right-item">
                                        <button className='btn btn-outline-info'>
                                            <NotificationsNoneIcon/>
                                            <span>Thông báo</span>
                                        </button>
                                    </div>

                                    <div className="right-item">
                                        <div className="account d-flex justify-content-around">
                                            <button className='btn btn-outline-danger'>
                                                <AccountCircleIcon className='account-icon'/>
                                                <span>Tài khoản</span>
                                                </button>
                                        </div>
                                    </div>
                            </div>
                        </div>
                    </div>

                    <div className="header-sp__info bg-success p-2">
                        <div className="container">
                          <AnnouncementIcon className='info-icon mx-2'/> 
                           <span className='info-title'>Siêu sự kiện tháng 6 : </span> 
                          <span className='info-des'>Chào hè, Đón sale - Tài khoản 
                            <span className='info-mark'> Ngon </span>, giảm 
                            <span className='info-mark'> Shock </span>
                            </span>
                        </div>
                    </div>
            </div>
        </>
     );
}

export default HeaderSp;