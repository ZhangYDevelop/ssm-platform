package com.zy.platform.enums;

public enum  DataSourceEnum {

    MASTER("master", "phoenix_dev"),
    SLAVE("slave", "phoenix_dev_slave");

    private  String dataSourceType;
    private String dataSourceName;

    DataSourceEnum(String type, String dataSourceName)  {
        this.dataSourceType = type;
        this.dataSourceName = dataSourceName;
    }

    public String getDataSourceType() {
       return  this.dataSourceType;
    }

    public String getDataSourceName() {
        return  this.dataSourceName;
    }
}
