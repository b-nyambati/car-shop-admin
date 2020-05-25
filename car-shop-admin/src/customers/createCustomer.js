import React from 'react';
import {SimpleForm, 
    SelectInput, 
    ReferenceInput, 
    TextInput,
    Create
} from 'react-admin';

export const CustomerCreate = props => (
    <Create {...props}>
        <SimpleForm>
            <TextInput source="firstName"/>
            <TextInput source="lastName"/>
            <TextInput source="email"/>
            <TextInput source="phoneNumber"/>
        </SimpleForm>
    </Create>
);