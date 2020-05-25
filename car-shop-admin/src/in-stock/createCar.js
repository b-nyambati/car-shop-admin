import React from 'react';
import {SimpleForm, 
    SelectInput, 
    ReferenceInput, 
    TextInput,
    Create,
    EditButton
} from 'react-admin';

export const CarCreate = props => (
    <Create {...props}>
        <SimpleForm>
            {/* <ReferenceInput source="id" reference="cars">
                <SelectInput optionText="name" />
            </ReferenceInput> */}
            <TextInput source="color"/>
            <TextInput source="make"/>
            <TextInput source="model"/>
            <TextInput source="year"/>
            <TextInput source="price"/>
        </SimpleForm>
    </Create>
);