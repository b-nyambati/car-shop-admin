import React from 'react';
// import { List, Datagrid, TextField, EmailField, UrlField } from 'react-admin';
import { List, Datagrid, TextField, EmailField } from 'react-admin';
import MyUrlField from './MyUrlField';

const CustomerName = ({record}) => {
    return <span>{ record ? `${record.firstName + " " + record.lastName}` : ''}</span>
}

export const UserList = props => (
    // list is the main component, grabs data from the api
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="id"/>
            {/* <TextField source="firstName"/>
            <TextField source="lastName"/> */}
            <CustomerName source="name"/>
            <EmailField source="email"/>
            <TextField source="phone"/>
            <MyUrlField source="website" />
            <TextField source="company.name"/>
        </Datagrid>
    </List>
);
