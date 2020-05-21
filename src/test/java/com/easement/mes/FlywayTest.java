package com.easement.mes;

import org.flywaydb.core.Flyway;

public class FlywayTest {



    public static void main(String[] args) {

        String url = "jdbc:sqlserver://localhost;DatabaseName=top;SelectMethod=Cursor";
        String user = "sa";
        String password = "123456";
        Flyway flyway = Flyway.configure().dataSource(url, user, password).load();
        // 创建 flyway_schema_history 表
		flyway.baseline();

        // 删除 flyway_schema_history 表中失败的记录
		flyway.repair();

        // 检查 sql 文件
		flyway.validate();

        // 执行数据迁移
        flyway.migrate();

        // 删除当前 schema 下所有表
//		flyway.clean();

    }

}