import React from 'react'
import {TextField, EditButton, ReferenceField, Datagrid, List} from 'react-admin';

const Price = ({record}) => {
    return <span>{ record ? `${record.price}` : ''}</span>
}

const CustomerName = ({record}) => {
    return <span>{ record ? `${record.firstName + " " + record.lastName}` : ''}</span>
}

const StockList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="color" />
            <TextField source="make" />
            <TextField source="model" />
            <TextField source="year" />
            <Price source="Price" />
            <EditButton/>
        </Datagrid>
    </List>
);

export default StockList;