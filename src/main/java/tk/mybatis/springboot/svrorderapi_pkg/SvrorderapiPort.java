/**
 * SvrorderapiPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tk.mybatis.springboot.svrorderapi_pkg;

public interface SvrorderapiPort extends java.rmi.Remote {
    public java.lang.String create(java.lang.String key, java.lang.String timeStamp, java.lang.String user_account, java.lang.String user_nickname, java.lang.String user_phone, java.lang.String user_id, java.lang.String user_lng, java.lang.String user_lat, java.lang.String user_addr, java.lang.String user_image, java.lang.String type) throws java.rmi.RemoteException;
    public java.lang.String detail(java.lang.String key, java.lang.String timeStamp, java.lang.String order_no) throws java.rmi.RemoteException;
    public java.lang.String printStr(java.lang.String name) throws java.rmi.RemoteException;
}
