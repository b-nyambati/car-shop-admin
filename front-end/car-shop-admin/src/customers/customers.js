import React from 'react';
import {
    List,
    Datagrid, 
    TextField,
    EmailField,
    EditButton
} from 'react-admin';
import { useMediaQuery } from '@material-ui/core';
import { withStyles } from '@material-ui/core/styles';

const styles = {
    button: {
        fontWeight: 'bold',
        // This is JSS syntax to target a deeper element using css selector, here the svg icon for this button
        '& svg': { color: 'orange' }
    },
};

const MyEditButton = withStyles(styles)(({ classes, ...props }) => (
    <EditButton
        className={classes.button}
        {...props}
    />
));

export const CustomerName = ({record}) => {
    return <span>{ record ? `${record.firstName + " " + record.lastName}` : ''}</span>
}


const CustomerList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <CustomerName source="name"/>
            <EmailField source="email" />
            <TextField source="phoneNumber"/>
            <EditButton/>
        </Datagrid>
    </List>
);

export default(CustomerList)
