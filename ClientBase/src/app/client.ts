export interface Client {
    id: number;
    name: string;
    street: string;
    city: string;
    postalCode: string;
    acBrand: string;
    acModel: string;
    acPower: number;
    acCode: string;
    dateOfInstalation: Date;
    inspected: boolean;
}