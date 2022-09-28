package com.solvd.enums;

public enum TableColumn {

    /** Accesorie **/
    ACCESORYID(1),
    ACCESORYNAME(1),
    ACCESORYTYPE(2),
    ACCESORYSTOCK(3),

    /** Client **/
    CLIENTID(1),

    CLIENTNAME(1),
    CLIENTAGE(2),
    CLIENTPETNAME(3),

    /** Doctor **/

    DOCTORNAME(1),
    DOCTORAGE(2),
    DOCTOREXPERIENCE(3),

    /** Equipment **/
    EQUIPMENTTYPE(1),
    EQUIPMENTDATE(2),

    /** Food **/

    FOODNAME(1),
    FOODQUALITY(2),
    FOODPRICE(3),
    FOODSTOCK(4),
    FOODTYPE(5),

    /** Medicine **/

    MEDNAME(1),
    MEDSTOCK(2),
    MEDPRICE(3),

    /** Payment **/
    PAYMENTMETHOD(1),
    PAYMENTPRICE(2),
    PAYMENTINFO(3),
    PAYMENTDATE(4),

    /** Pet **/

    PETSPECIE(1),
    PETNAME(2),
    PETAGE(3),
    PETOWNER(4),

    /** Treatment **/

    TREATMENTNAME(1),
    TREATEDPET(2),
    TREATMENTDATE(3),
    TREATMENTPRICE(4),
    TREATEDBY(5),


    /** Veterinary **/
    VETERINARYNAME(1),
    VETERINARYCITY(2),
    VETERINARYADDRESS(3);


    public final int index;

    private TableColumn(int index){
        this.index = index;
    }
}
