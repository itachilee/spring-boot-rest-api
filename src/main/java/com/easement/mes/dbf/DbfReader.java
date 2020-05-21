package com.easement.mes.dbf;

import java.io.*;
import java.nio.charset.Charset;

import com.linuxense.javadbf.*;


/**
 * @author leon
 */
public class DbfReader {
    public static void main(String[] args) throws IOException {

//        dbfWriter();
//        dbfReader();
        txtToDbf();
    }

    public static void dbfReader() throws FileNotFoundException {
        InputStream in = new FileInputStream("D:\\testDbf.dbf");
        Charset charset = Charset.forName("GBK");
        DBFReader reader = new DBFReader(in, charset);
        for (int i = 0; i < reader.getFieldCount(); i++) {
            DBFField field = reader.getField(i);
            System.out.print(field.getName() + "|");
        }
        System.out.print("\r\n");
        Object[] values;
        while ((values = reader.nextRecord()) != null) {
            for (Object value : values) {
                System.out.print(value.toString() + "|");
            }
            System.out.print("\r\n");
        }
    }

    public static String dbfReader(String file) throws IOException {
        InputStream in = new FileInputStream(file);
        Charset charset = Charset.forName("GBK");
        DBFReader reader = new DBFReader(in, charset);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < reader.getFieldCount(); i++) {
            DBFField field = reader.getField(i);
            stringBuffer.append(field.getName() + "|");
            System.out.print(field.getName() + "|");
        }
        stringBuffer.append("\r\n");
        System.out.print("\r\n");
        Object[] values;
        while ((values = reader.nextRecord()) != null) {
            for (Object value : values) {
                System.out.print(value.toString() + "|");
                stringBuffer.append(value.toString() + "|");
            }
            System.out.print("\r\n");
            stringBuffer.append("\r\n");
        }
        dbfTotxt(stringBuffer.toString());
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

        DBFWriter writer = new DBFWriter(new FileOutputStream("D:\\testDbf.dbf"), charset);
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

    public static void dbfTotxt(String outPut) throws IOException {
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        // 构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        writer.append(outPut);

        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        fop.close();
        // 关闭输出流,释放系统资源

        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();
        // 关闭读取流

        fip.close();
        // 关闭输入流,释放系统资源
    }

    public static void txtToDbf() throws IOException {
        FileReader fileReader = new FileReader("D:\\test.txt");
        LineNumberReader reader = new LineNumberReader(fileReader);
        int number = 1; //设置指定行数
        String txt = "";
        int lines = 0;
        DBFField[] fields = new DBFField[18];
        Charset charset = Charset.forName("GBK");
        fields[0] = new DBFField();
        fields[0].setName("用户编号");
        fields[0].setType(DBFDataType.CHARACTER);
        fields[0].setLength(50);


        fields[1] = new DBFField();
        fields[1].setName("用户姓名");
        fields[1].setType(DBFDataType.CHARACTER);
        fields[1].setLength(80);

        fields[2] = new DBFField();
        fields[2].setName("电话");
        fields[2].setType(DBFDataType.CHARACTER);
        fields[2].setLength(50);

        fields[3] = new DBFField();
        fields[3].setName("地址");
        fields[3].setType(DBFDataType.CHARACTER);
        fields[3].setLength(50);

        fields[4] = new DBFField();
        fields[4].setName("楼栋");
        fields[4].setType(DBFDataType.CHARACTER);
        fields[4].setLength(50);

        fields[5] = new DBFField();
        fields[5].setName("单元");
        fields[5].setType(DBFDataType.CHARACTER);
        fields[5].setLength(50);

        fields[6] = new DBFField();
        fields[6].setName("楼层");
        fields[6].setType(DBFDataType.CHARACTER);
        fields[6].setLength(50);

        fields[7] = new DBFField();
        fields[7].setName("装表楼侧");
        fields[7].setType(DBFDataType.CHARACTER);
        fields[7].setLength(50);

        fields[8] = new DBFField();
        fields[8].setName("表号");
        fields[8].setType(DBFDataType.CHARACTER);
        fields[8].setLength(50);

        fields[9] = new DBFField();
        fields[9].setName("换表标志");
        fields[9].setType(DBFDataType.CHARACTER);
        fields[9].setLength(50);

        fields[10] = new DBFField();
        fields[10].setName("表状态");
        fields[10].setType(DBFDataType.CHARACTER);
        fields[10].setLength(50);

        fields[11] = new DBFField();
        fields[11].setName("上期抄数");
        fields[11].setType(DBFDataType.NUMERIC);
        fields[11].setLength(31);

        fields[12] = new DBFField();
        fields[12].setName("上期抄时");
        fields[12].setType(DBFDataType.CHARACTER);
        fields[12].setLength(50);

        fields[13] = new DBFField();
        fields[13].setName("本期抄数");
        fields[13].setType(DBFDataType.NUMERIC);
        fields[13].setLength(31);

        fields[14] = new DBFField();
        fields[14].setName("本期抄时");
        fields[14].setType(DBFDataType.CHARACTER);
        fields[14].setLength(50);

        fields[15] = new DBFField();
        fields[15].setName("抄表标志");
        fields[15].setType(DBFDataType.CHARACTER);
        fields[15].setLength(50);

        fields[16] = new DBFField();
        fields[16].setName("抄表工单id");
        fields[16].setType(DBFDataType.CHARACTER);
        fields[16].setLength(50);

        fields[17] = new DBFField();
        fields[17].setName("抄表次序");
        fields[17].setType(DBFDataType.CHARACTER);
        fields[17].setLength(50);

        DBFWriter writer = new DBFWriter(new FileOutputStream("D:\\test.dbf"), charset);
        writer.setFields(fields);
        String[] contents = new String[10];
        while (txt != null) {
            lines++;
            txt = reader.readLine();
            if (lines == number) {
                System.out.println("第" + reader.getLineNumber() + "的内容是：" + txt + "\n");
                continue;
            }

            if (txt == null | "".equals(txt)) {
                continue;
            }
            contents = txt.split("\\|");

//            writer.setFields(fields);
            Object rowData[] = new Object[18];
//            for(int i=0;i<contents.length;i++){
            // 用户编号
            rowData[0] = contents[1];
            // 用户姓名
            rowData[1] = contents[3];
            // 电话
            rowData[2] = "";
            // 地址
            rowData[3] = contents[2];
            // 楼栋
            rowData[4] = "";
            // 单元
            rowData[5] = "";
            // 楼层
            rowData[6] = "";
            // 装表楼侧
            rowData[7] = "";
            // 表号
            rowData[8] = contents[4];
            // 换标标志
            rowData[9] = "";
            // 表状态
            rowData[10] = "";

            // 上期抄时
            rowData[12] = contents[6];
            // 上期抄数
            rowData[11] = convertToDouble(contents[7]);
            // 本期抄数
            rowData[13] = 0.00;
            // 本期抄时

            rowData[14] = "";
            // 换标标志
            rowData[15] = "";
            // 抄表工单id
            rowData[16] = contents[0];
            // 抄表次序
            rowData[17] = contents[5];

//            }

            writer.addRecord(rowData);

        }
        // write to file
        writer.close();

        reader.close();
        fileReader.close();

    }

    public static double convertToDouble(String string) {
        try {
            Double aDouble = new Double(string);
            return aDouble;
        } catch (Exception e) {
            return 0;
        }
    }
}
