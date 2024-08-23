import SecurityIcon from '@mui/icons-material/Security';
import './CardAov.scss'
import { Link } from 'react-router-dom';
function CardAov({id, price, hero, skin, rank, linkinfo}) {
            return ( 
                <>
                    <div className="card p-2">
                        <div className="card-aov__img pb-2">
                                <img src="/images/AcAov.png" alt="" className="img-fluid"/>
                                <span className='card-aov__id'><span className='fw-bold text-white'> ID</span> 
                                {id}</span>
                        </div>

                        <div className="card-aov__info border-bottom pb-3">
                            <div className="card-aov__info-price d-flex justify-content-between px-2 py-2 border-bottom">
                                <span className="text-danger fw-bold fs-5">{price}</span>
                                <Link className="btn btn-danger" to={'detail'}>Xem ngay</Link>
                            </div>

                            <div className="card-aov__info-attribute d-flex flex-column justify-content-around">
                                <ul className='pt-2 mb-0'>
                                <li>Tướng :  <span className='fw-bold'>{hero}</span ></li>
                                <li>Trang phục : <span className='fw-bold'>{skin}</span ></li>
                                <li>Rank : <span className='fw-bold'>{rank}</span ></li>
                                </ul>
                            </div>
                        </div>

                        <div className="card-aov__linkinfo py-2">
                            <SecurityIcon className='text-info me-2'/> 
                            <span className='text-success fw-bold'>{linkinfo}</span>
                        </div>
                    </div>
                </>
            );
        }

        export default CardAov;