import { useEffect, useState } from 'react'
import { fetchProducts } from '../api';
import Footer from '../Footer/footer';
import { checkIsSelected } from './helpers';
import OrderLocation from './OrderLocation';
import './orders.css'
import OrderSummary from './OrderSummary';
import ProductsList from './ProductsList'
import StepsHeader from './StepsHeader'
import { OrderLocationdata, Product } from './types';


function Orders() {

    const [products, setProducts] = useState<Product[]>([]);
    const [selectedProducts, setSelectedProducts] = useState<Product[]>([]);
    const [orderLocation, setOrderLocation] = useState<OrderLocationdata>();

    useEffect(() => {
        fetchProducts()
            .then(response => setProducts(response.data))
            .catch(error => console.log(error))
    }, [])


    const handleSelectProduct = (product: Product) => {
        //Verifica se o produto é selecionado
        const isAlreadySelected = checkIsSelected(selectedProducts, product)

        if (isAlreadySelected) {
            const selected = selectedProducts.filter(item => item.id !== product.id);
            setSelectedProducts(selected);
        } else {
            setSelectedProducts(previous => [...previous, product]);
        }
    }


    return (
        <>
            <div className='orders-container'>
                <StepsHeader />
                <ProductsList
                    products={products}
                    onSelectProduct={handleSelectProduct}
                    selectedProducts={selectedProducts}
                />
                <OrderLocation onChangeLocation={location => setOrderLocation(location)} />
                <OrderSummary />
            </div>
            <Footer />
        </>
    )

}

export default Orders;