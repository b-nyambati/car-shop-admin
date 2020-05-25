import React from 'react';
import {SimpleForm, 
    SelectInput, 
    ReferenceInput, 
    TextInput,
    Edit,
    EditButton
} from 'react-admin';

export const CustomerEdit = props =>(
    <Edit {...props}>
        <SimpleForm>
            <TextInput disabled source="id"/>
            {/* <ReferenceInput source="id" reference="cars">
                <SelectInput optionText="name" />
            </ReferenceInput> */}
            <TextInput source="firstName" />
            <TextInput source="lastName" />
            <TextInput source="email" />
            <TextInput source="phoneNumber"/>
        </SimpleForm>
    </Edit>
);