/**
 * ChargeapiPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package chargeapi_pkg;

public interface ChargeapiPort extends java.rmi.Remote {
    public java.lang.String deviceStatus(java.lang.String key, java.lang.String timeStamp, java.lang.String device_code) throws java.rmi.RemoteException;
    public java.lang.String deviceStrategy(java.lang.String key, java.lang.String timeStamp, java.lang.String device_code, java.lang.String type) throws java.rmi.RemoteException;
    public java.lang.String startCharge(java.lang.String key, java.lang.String timeStamp, java.lang.String device_code, java.lang.String type, java.lang.String pay_fee, java.lang.String charge_time, java.lang.String port, java.lang.String user_phone, java.lang.String user_id) throws java.rmi.RemoteException;
    public java.lang.String chargeStatus(java.lang.String key, java.lang.String timeStamp, java.lang.String order_no) throws java.rmi.RemoteException;
}
