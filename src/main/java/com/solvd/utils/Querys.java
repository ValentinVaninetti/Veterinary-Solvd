package com.solvd.utils;

public class Querys {
    /**
     * Accesory
     **/
    public static final String INSERTACCESORY = "INSERT INTO accesorie (accesorieName , accesorieType , accesorieStock) VALUES (?,?,?)";
    public static final String UPDATEACCESORY = "UPDATE accesorie SET accesorieName = ?, accesorieType = ?, accesorieStock = ? WHERE id_accesorie = ?";
    public static final String DELETEACCESORY = "DELETE FROM accesorie WHERE id_accesorie = ?";
    public static final String GETALLACCESORY = "SELECT * FROM accesorie";
    public static final String GETACCESORYBYID = "SELECT * FROM accesorie WHERE id_accesorie = ?";

    /**
     * Client
     **/
    public static final String INSERTCLIENT = "INSERT INTO client (clientName, clientAge, clientPet) VALUES (?,?,?)";
    public static final String UPDATECLIENT = "UPDATE client SET clientName=?, clientAge=?, clientPet=? WHERE id_client=?";
    public static final String DELETECLIENT = "DELETE FROM client WHERE id_client";
    public static final String GETALLCLIENTS = "SELECT * FROM client";
    public static final String GETCLIENTBYID = "SELECT *  FROM client WHERE id_client = ?";

    /**
     * Doctor
     **/
    public static final String INSERTDOCTOR = "INSERT INTO doctor (doctorName, doctorAge, doctorExperience) VALUES (?,?,?)";
    public static final String UPDATEDOCTOR = "UPDATE doctor SET doctorName=?, doctorAge=?, doctorExperience=? WHERE id_doctor=?";
    public static final String DELETEDOCTOR = "DELETE FROM doctor WHERE id_doctor";
    public static final String GETALLDOCTORS = "SELECT * FROM doctor";
    public static final String GETDOCTORBYID = "SELECT * FROM doctor WHERE id_doctor =?";

    /**
     * Equipment
     **/
    public static final String INSERTEQUIPMENT = "INSERT INTO equipment (equipmentType, equipmentUsageDate) VALUES (?,?)";
    public static final String UPDATEEQUIPMENT = "UPDATE equipment SET equipmentType=?, equipmentUsageDate=? WHERE id_equipment=?";
    public static final String DELETEEQUIPMENT = "DELETE FROM equipment WHERE id_equipment=?";
    public static final String GETALLEQUIPMENT = "SELECT * FROM equipment";
    public static final String GETEQUIPMENTBYID = "SELECT * FROM equipment WHERE id_equipment=?";

    /**
     * Food
     **/
    public static final String INSERTFOOD = "INSERT INTO food (foodName, foodQuality, foodPrice, foodStock, foodType) VALUES (?,?,?,?,?)";
    public static final String UPDATEFOOD = "UPDATE food SET foodName=?, foodQuality=?, foodPrice=?, foodStock=?, foodType WHERE id_food=?";
    public static final String DELETEFOOD = "DELETE FROM food WHERE id_food=?";
    public static final String GETALLFOOD = "SELECT * FROM food";
    public static final String GETFOODBYID = "SELECT * FROM food WHERE id_food = ?";

    /**
     * Medicine
     **/

    public static final String INSERTMED = "INSERT INTO medicine (medName, medStock, medPrice) VALUES (?,?,?)";
    public static final String UPDATEMED = "UPDATE medicine SET medName=?, medStock=?, medPrice=? WHERE id_med=?";
    public static final String DELETEMED = "DELETE FROM medicine WHERE id_med";
    public static final String GETALLMED = "SELECT * FROM medicine";
    public static final String GETMEDBYID = "SELECT * FROM medicine WHERE id_med=?";

    /**
     * Payment
     **/

    public static final String INSERTPAYMENT = "INSERT INTO payment (paymentMethod, paymentPrice, paymentInfo, paymentDate) VALUES (?,?,?,?)";
    public static final String UPDATEPAYMENT = "UPDATE payment SET paymentName=?, paymentPrice=?, paymentInfo=?, paymentDate=? WHERE id_payment=?";
    public static final String DELETEPAYMENT = "DELETE FROM payment WHERE id_payment=?";
    public static final String GETALLPAYMENT = "SELECT * FROM payment";
    public static final String GETPAYMENTBYID = "SELECT * FROM payment WHERE id_payment=?";

    /**
     * Pet
     **/

    public static final String INSERTPET = "INSERT INTO pet (petSpecie, petName, petAge, petOwner) VALUES (?,?,?,?)";
    public static final String UPDATEPET = "UPDATE pet SET petSpecie=?, petName=?, petAge=?, petOwner=? WHERE id_pet";
    public static final String DELETEPET = "DELETE FROM pet WHERE id_pet =?";
    public static final String GETALLPET = "SELECT * FROM pet";
    public static final String GETPETBYID = "SELECT * FROM pet WHERE id_pet = ?";

    /**
     * Treatment
     **/
    public static final String INSERTTREATMENT = "INSERT INTO treatment (treatmentName, treatedPet, treatmentDate, treatmentPrice, treatedBy) VALUES (?,?,?,?,?)";
    public static final String UPDATETREATMENT = "UPDATE treatment SET treatmentName=?, treatedPet=?, treatmentDate=?, treatmentPrice=?, treatedBy=? WHERE id_treatment=?";
    public static final String DELETETREATMENT = "DELETE FROM treatment WHERE id_treatment=?";
    public static final String GETALLTREATMENT = "SELECT * FROM treatment";
    public static final String GETTREATMENTBYID = "SELECT * FROM treatment WHERE id_treatment=?";
    /**
     * Veterinary
     **/
    public static final String INSERTVETERINARY = "INSERT INTO veterinary (veterinaryName, veterinaryCity, veterinaryAddress) VALUES (?,?,?) ";
    public static final String UPDATEVETERINARY = "UPDATE veterinary SET veterinaryName = ?, veterinaryCity = ?, veterinaryAddress = ? WHERE id_veterinary =? ";
    public static final String DELETEVETERINARY = "DELETE FROM veterinary WHERE id_veterinary = ?";
    public static final String GETALLVETS = "SELECT * FROM veterinary";
    public static final String GETVETERINARYBYID = "SELECT * FROM veterinary WHERE id_veterinary = ?";
}
