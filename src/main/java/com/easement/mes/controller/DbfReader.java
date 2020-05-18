package com.easement.mes.controller;

import java.io.*;
import java.nio.charset.Charset;

import com.linuxense.javadbf.*;


/**
 * @author leon
 */
public class DbfReader {
    public static void main(String[] args) throws FileNotFoundException {
        dbfReader();
        dbfWriter();
    }

    public static void dbfReader() throws FileNotFoundException {
        InputStream in = new FileInputStream("D:\\testDbf.dbf");
        Charset charset = Charset.forName("GBK");
        DBFReader reader = new DBFReader(in,charset);
        for(int i = 0; i < reader.getFieldCount(); i++){
            DBFField field = reader.getField(i);
            System.out.print(field.getName() + "|");
        }
        System.out.print("\r\n");
        Object[] values;
        while ( (values = reader.nextRecord()) != null ){
            for(Object value : values){
                System.out.print(value.toString() + "|");
            }
            System.out.print("\r\n");
        }
    }
    public static String dbfReader(String file) throws FileNotFoundException {
        InputStream in = new FileInputStream(file);
        Charset charset = Charset.forName("GBK");
        DBFReader reader = new DBFReader(in,charset);
        StringBuffer stringBuffer=new StringBuffer();
        for(int i = 0; i < reader.getFieldCount(); i++){
            DBFField field = reader.getField(i);
            stringBuffer.append(field.getName()+"|");
            System.out.print(field.getName() + "|");
        }
        stringBuffer.append("\r\n");
        System.out.print("\r\n");
        Object[] values;
        while ( (values = reader.nextRecord()) != null ){
            for(Object value : values){
                System.out.print(value.toString() + "|");
                stringBuffer.append(value.toString() + "|");
            }
            System.out.print("\r\n");
            stringBuffer.append("\r\n");
        }
        return stringBuffer.toString();
    }
    public static void dbfWriter() throws FileNotFoundException {

        DBFField[] fields = new DBFField[3];
        Charset charset = Charset.forName("GBK");
        fields[0] = new DBFField();
        fields[0].setName("中文");
        fields[0].setType(DBFDataType.CHARACTER);
        fields[0].setLength(20);

        fields[1] = new DBFField();
        fields[1].setName("中文2");
        fields[1].setType(DBFDataType.CHARACTER);
        fields[1].setLength(20);

        fields[2] = new DBFField();
        fields[2].setName("中文三");
        fields[2].setType(DBFDataType.NUMERIC);
        fields[2].setLength(12);
        fields[2].setDecimalCount(2);

        DBFWriter writer = new DBFWriter(new FileOutputStream("D:\\testDbf.dbf"),charset);
        writer.setFields(fields);

        // now populate DBFWriter

        Object rowData[] = new Object[3];
        rowData[0] = "啊啊啊啊啊啊啊啊啊啊啊";
        rowData[1] = "John";
        rowData[2] = new Double(5000.00);

        writer.addRecord(rowData);

        rowData = new Object[3];
        rowData[0] = "";
        rowData[1] = null;
        rowData[2] = new Double(3400.00);

        writer.addRecord(rowData);

        rowData = new Object[3];
        rowData[0] = "呜呜呜";
        rowData[1] = "Rohit";
        rowData[2] = new Double(7350.00);

        writer.addRecord(rowData);

        // write to file
        writer.close();
    }

}
