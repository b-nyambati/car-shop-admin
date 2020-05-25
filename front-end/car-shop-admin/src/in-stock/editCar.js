import React from 'react';
import {SimpleForm, 
    SelectInput, 
    ReferenceInput, 
    TextInput,
    Edit
} from 'react-admin';

export const CarEdit = props =>(
    <Edit {...props}>
        <SimpleForm>
            <TextInput disabled source="id"/>
            {/* <ReferenceInput source="id" reference="cars">
                <SelectInput optionText="name" />
            </ReferenceInput> */}
            <TextInput source="color" />
            <TextInput source="make" />
            <TextInput source="model" />
            <TextInput source="price"/>
        </SimpleForm>
    </Edit>
    
);