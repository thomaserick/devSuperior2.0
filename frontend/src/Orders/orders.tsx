import { useEffect, useState } from 'react'
import { fetchProducts } from '../api';
import Footer from '../Footer/footer';
import OrderLocation from './OrderLocation';
import './orders.css'
import OrderSummary from './OrderSummary';
import ProductsList from './ProductsList'
import StepsHeader from './StepsHeader'
import { OrderLocationdata, Product } from './types';


function Orders() {

    const [products, setProducts] = useState<Product[]>([]);
    const [orderLocation, setOrderLocation] = useState<OrderLocationdata>();

    useEffect(() => {
        fetchProducts()
            .then(response => setProducts(response.data))
            .catch(error => console.log(error))
    }, [])


    return (
        <>
            <div className='orders-container'>
                <StepsHeader />
                <ProductsList products={products} />
                <OrderLocation onChangeLocation={location => setOrderLocation(location)} />
                <OrderSummary />
            </div>
            <Footer />
        </>
    )

}

export default Orders;