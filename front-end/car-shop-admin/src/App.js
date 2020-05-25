import React from 'react';
import CustomerList from './customers/customers'
import CarsList from './purchased/cars'
import { Admin, Resource, ListGuesser } from 'react-admin';
import dataProvider from './fetch';
import Dashboard from './dashboard/Dashboard';
import { createMuiTheme } from '@material-ui/core/styles';
import StockList from './in-stock/stock';
import ListItemIcon from '@material-ui/icons/AttachMoneyOutlined';
import UserIcon from '@material-ui/icons/Group';
import {CarCreate} from './in-stock/createCar';
import {CarEdit} from './in-stock/editCar';
import indigo from '@material-ui/core/colors/indigo';
import blue from '@material-ui/core/colors/blue';
import red from '@material-ui/core/colors/red';
import { CustomerCreate } from './customers/createCustomer';
import authProvider from './authentication/authProvider';
import DollarIcon from '@material-ui/icons/AttachMoney';
import { CustomerEdit } from './customers/editCustomer';


// import jsonServerProvider from 'ra-data-json-server';


const theme = createMuiTheme({
  palette: {
    type: 'light',
    primary: blue,
    secondary: red,
    error: red,
    contrastThreshold: 3,
    tonalOffset: 0.2, // Switching the dark mode on is a single property value change.
  },
});

// const dataProvider = jsonServerProvider('https://jsonplaceholder.typicode.com');

const App = () => (
  <Admin theme={theme}
    authProvider={authProvider} 
    dataProvider={dataProvider}>

    <Resource name="customers"
      list={CustomerList}
      icon={UserIcon}
      create={CustomerCreate}
      edit={CustomerEdit}/>
    
    <Resource options={{ label: 'Purchased' }}
      name="cars/purchased" 
      icon={DollarIcon} 
      list={CarsList}/>

    <Resource name="cars"
      options={{label: 'Stock'}}
      list={StockList} 
      create={CarCreate}
      edit={CarEdit}/>

  </Admin>
);
  
  

export default App;
