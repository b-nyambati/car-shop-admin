import React from 'react'
import {TextField, ReferenceField, Datagrid, List} from 'react-admin';

const Price = ({record}) => {
    return <span>{ record ? `${record.price}` : ''}</span>
}

const CustomerName = ({record}) => {
    return <span>{ record ? `${record.firstName + " " + record.lastName}` : ''}</span>
}

const CarList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <ReferenceField label="Owner" source="ownerId" reference="customers">
                <CustomerName/>   
            </ReferenceField>
            <TextField source="color" />
            <TextField source="make" />
            <TextField source="model" />
            <TextField source="year" />
            <Price source="Price" />
        </Datagrid>
    </List>
);

export default(CarList)