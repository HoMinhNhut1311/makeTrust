import { useState } from 'react';
import './HotNewSp.scss';
import EmojiEventsIcon from '@mui/icons-material/EmojiEvents';

function HotNewSp() {

    const [activeTab, setActiveTab] = useState('Ngày');

    const handleTabClick = (tabName) => {
        setActiveTab(tabName);
    };

    return (
        <div className="container hnew_sp mt-3">
            <div className="d-flex hnew_sp_container justify-content-around">
                <div className="content-left">
                    <img src="/images/hotNewMain.jpeg" alt="" />
                </div>

                <div className="content-middle row mx-2">
                    <div className="img-50">
                        <img src="/images/hotNewSub_1.png" alt="" className='img-fluid pb-2' />
                    </div>

                    <div className="img-50">
                        <img src="/images/hotNewSub_2.png" alt="" className='img-fluid pt-2' />
                    </div>
                </div>

                <div className="content-right">
                    <div className="rank-container p-2">
                        <div className="rank-header">
                            <div className="header__title">
                                <EmojiEventsIcon className='header__tilte-icon' />
                                <span>Top nạp tháng 8</span>
                            </div>

                            <div className="header__tab">
                                <div className="header__tab-list d-flex justify-content-between m-2">
                                    <button
                                        className={`header_tab-item ${activeTab === 'Ngày' ? 'active' : ''}`}
                                        onClick={() => handleTabClick('Ngày')}
                                    >
                                        Ngày
                                    </button>
                                    <button
                                        className={`header_tab-item ${activeTab === 'Tuần' ? 'active' : ''}`}
                                        onClick={() => handleTabClick('Tuần')}
                                    >
                                        Tuần
                                    </button>
                                    <button
                                        className={`header_tab-item ${activeTab === 'Tháng' ? 'active' : ''}`}
                                        onClick={() => handleTabClick('Tháng')}
                                    >
                                        Tháng
                                    </button>
                                </div>
                            </div>
                        </div>
                        <div className="tab-content m-2">
                                <div className="tab-item">
                                    <span className='tab-item __index'>1</span>
                                    <span className='tab-item __id'>ID 0398114</span>
                                    <span className='tab-item __price'>600.000đ</span>
                                </div>

                                <div className="tab-item">
                                    <span className='tab-item __index'>2</span>
                                    <span className='tab-item __id'>ID 0098114</span>
                                    <span className='tab-item __price'>700.000đ</span>
                                </div>

                                <div className="tab-item">
                                    <span className='tab-item __index'>3</span>
                                    <span className='tab-item __id'>ID 0128114</span>
                                    <span className='tab-item __price'>600.000đ</span>
                                </div>
                      </div>
                      
                    </div>
                </div>
            </div>
        </div>
    );
}

export default HotNewSp;
