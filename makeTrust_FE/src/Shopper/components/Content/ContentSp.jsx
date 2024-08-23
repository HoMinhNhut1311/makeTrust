import CardAov from "../Card/CardAov";
import FilterSp from "../Filter/FilterSp";
import FlashSale from "../FlashSale/FlashSale";
import HotNewSp from "../HotNewSp";
import './Content.scss';
import SportsEsportsIcon from '@mui/icons-material/SportsEsports';

function ContentSp() {
    const cardAov = [
        {
            id: '50824',
            hero: 50,
            skin: 30,
            linkinfo: 'Trắng thông tin',
            price: '500,000 VND',
            rank: 'Kim Cương',
        },
        {
            id: '50987',
            hero: 45,
            skin: 25,
            linkinfo: 'Gmail - Sdt',
            price: '450,000 VND',
            rank: 'Bạch Kim',
        },
        {
            id: '51234',
            hero: 55,
            skin: 35,
            linkinfo: 'Gmail',
            price: '600,000 VND',
            rank: 'Cao Thủ',
        },
        {
            id: '51345',
            hero: 60,
            skin: 40,
            linkinfo: 'Facebook',
            price: '700,000 VND',
            rank: 'Thách Đấu',
        },
        {
            id: '51456',
            hero: 48,
            skin: 28,
            linkinfo: 'PornHub',
            price: '480,000 VND',
            rank: 'Kim Cương',
        },
        {
            id: '51567',
            hero: 52,
            skin: 32,
            linkinfo: 'Google',
            price: '550,000 VND',
            rank: 'Bạch Kim',
        },
        {
            id: '51678',
            hero: 58,
            skin: 38,
            linkinfo: 'Google - Facebook',
            price: '650,000 VND',
            rank: 'Cao Thủ',
        },
        {
            id: '51789',
            hero: 65,
            skin: 45,
            linkinfo: 'Garena',
            price: '750,000 VND',
            rank: 'Thách Đấu',
        },
    ];

    return (  
        <div className="content-container p-2">
            <div className="container">
                <HotNewSp/>
                <FlashSale/>
                <div className="row">
                    <div className="title pt-4">
                        <h5><SportsEsportsIcon className="text-primary fs-2 me-2"/> Danh sách tài khoản liên quân</h5>
                        <p style={{fontWeight: '100', fontSize: '0.9rem'}}>Hàng ngàn tài khoản Liên Quân ngon, giá cả hợp lý - Là sự lựa chọn phù hợp cho bạn</p>
                    </div>
                    {cardAov.map((card, index) => (
                        <div className="col-3" key={index}>
                            <CardAov 
                                id={card.id} 
                                hero={card.hero} 
                                skin={card.skin} 
                                linkinfo={card.linkinfo} 
                                price={card.price} 
                                rank={card.rank} 
                            />
                        </div>
                    ))}
                </div>
                <FilterSp/>
            </div>
        </div>
    );
}

export default ContentSp;
