package com.geshaofeng.springbootmybatisdemo.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TimestampHandler extends BaseTypeHandler<String> {

    public static final String PATTERN_TIME_PROPERTY_NAME = "shaofeng.patternTime";

    private final SimpleDateFormat sdf = new SimpleDateFormat(configuration.getVariables().getProperty(PATTERN_TIME_PROPERTY_NAME));

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        ps.setTimestamp(i, timestamp);
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnName);
        String timeStr = sdf.format(timestamp);
        return timeStr;
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnIndex);
        String timeStr = sdf.format(timestamp);
        return timeStr;
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
