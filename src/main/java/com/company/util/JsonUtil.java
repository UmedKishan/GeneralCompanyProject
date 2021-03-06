package com.company.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.company.model.UserEntity;

import java.util.List;

/**
 * Created by puyangsky on 2016/6/23.
 */
public class JsonUtil {
    public static String toJsonString(UserEntity userEntity) {
        JSONObject jo = new JSONObject();
        if(userEntity == null) {
            jo.put("result", "null");
            return jo.toString();
        }
        jo.put("id", userEntity.getId());
        jo.put("gender", userEntity.getGender());
        jo.put("birthday", userEntity.getBirthday());
        jo.put("realname", userEntity.getRealname());
        jo.put("avatar", userEntity.getAvatar());
        jo.put("tel", userEntity.getTel());
        jo.put("idnum", userEntity.getIdnum());
        jo.put("email", userEntity.getEmail());
        jo.put("xueli", userEntity.getXueli());
        jo.put("hunyin", userEntity.getHunyin());
        jo.put("xuexing", userEntity.getXuexing());
        jo.put("jiankangzheng", userEntity.getJiankangzheng());
        jo.put("hight", userEntity.getHight());
        jo.put("weight", userEntity.getWeight());
        jo.put("wishsalary", userEntity.getWishsalary());
        jo.put("address", userEntity.getAddress());
        jo.put("addressnum", userEntity.getAddressnum());
        jo.put("hujiaddress", userEntity.getHujiaddress());
        jo.put("hujiaddressnum", userEntity.getHujiaddressnum());
        jo.put("huji", userEntity.getHuji());
        jo.put("shenfen", userEntity.getShenfen());
        jo.put("worktime", userEntity.getWorktime());
        jo.put("workhours", userEntity.getWorkhours());
        jo.put("starttime", userEntity.getStarttime());
        jo.put("distance", userEntity.getDistance());
        jo.put("wishoffer", userEntity.getWishoffer());
        jo.put("vehicle", userEntity.getVehicle());
        jo.put("a11", userEntity.getA11());
        jo.put("a12", userEntity.getA12());
        jo.put("a13", userEntity.getA13());
        jo.put("a14", userEntity.getA14());
        jo.put("a15", userEntity.getA15());
        jo.put("a21", userEntity.getA21());
        jo.put("a22", userEntity.getA22());
        jo.put("a23", userEntity.getA23());
        jo.put("a24", userEntity.getA24());
        jo.put("a25", userEntity.getA25());
        jo.put("a31", userEntity.getA31());
        jo.put("a32", userEntity.getA32());
        jo.put("a33", userEntity.getA33());
        jo.put("a34", userEntity.getA34());
        jo.put("a35", userEntity.getA35());
        jo.put("z1", userEntity.getZ1());
        jo.put("z2", userEntity.getZ2());
        jo.put("z3", userEntity.getZ3());
        jo.put("z4", userEntity.getZ4());
        jo.put("z5", userEntity.getZ5());
        jo.put("b11", userEntity.getB11());
        jo.put("b12", userEntity.getB12());
        jo.put("b13", userEntity.getB13());
        jo.put("b14", userEntity.getB14());
        jo.put("b15", userEntity.getB15());
        jo.put("b21", userEntity.getB21());
        jo.put("b22", userEntity.getB22());
        jo.put("b23", userEntity.getB23());
        jo.put("b24", userEntity.getB24());
        jo.put("b25", userEntity.getB25());
        jo.put("b31", userEntity.getB31());
        jo.put("b32", userEntity.getB32());
        jo.put("b33", userEntity.getB33());
        jo.put("b34", userEntity.getB34());
        jo.put("b35", userEntity.getB35());
        jo.put("b41", userEntity.getB41());
        jo.put("b42", userEntity.getB42());
        jo.put("b43", userEntity.getB43());
        jo.put("b44", userEntity.getB44());
        jo.put("b45", userEntity.getB45());
        jo.put("b51", userEntity.getB51());
        jo.put("b52", userEntity.getB52());
        jo.put("b53", userEntity.getB53());
        jo.put("b54", userEntity.getB54());
        jo.put("b55", userEntity.getB55());
        jo.put("c11", userEntity.getC11());
        jo.put("c12", userEntity.getC12());
        jo.put("c13", userEntity.getC13());
        jo.put("c14", userEntity.getC14());
        jo.put("c15", userEntity.getC15());
        jo.put("c16", userEntity.getC16());
        jo.put("c17", userEntity.getC17());
        jo.put("c21", userEntity.getC21());
        jo.put("c22", userEntity.getC22());
        jo.put("c23", userEntity.getC23());
        jo.put("c24", userEntity.getC24());
        jo.put("c25", userEntity.getC25());
        jo.put("c26", userEntity.getC26());
        jo.put("c27", userEntity.getC27());
        jo.put("c31", userEntity.getC31());
        jo.put("c32", userEntity.getC32());
        jo.put("c33", userEntity.getC33());
        jo.put("c34", userEntity.getC34());
        jo.put("c35", userEntity.getC35());
        jo.put("c36", userEntity.getC36());
        jo.put("c37", userEntity.getC37());
        jo.put("c41", userEntity.getC41());
        jo.put("c42", userEntity.getC42());
        jo.put("c43", userEntity.getC43());
        jo.put("c44", userEntity.getC44());
        jo.put("c45", userEntity.getC45());
        jo.put("c46", userEntity.getC46());
        jo.put("c47", userEntity.getC47());
        jo.put("c51", userEntity.getC51());
        jo.put("c52", userEntity.getC52());
        jo.put("c53", userEntity.getC53());
        jo.put("c54", userEntity.getC54());
        jo.put("c55", userEntity.getC55());
        jo.put("c56", userEntity.getC56());
        jo.put("c57", userEntity.getC57());
        jo.put("updatetime", userEntity.getUpdatetime());
        jo.put("status", userEntity.getStatus());
        return jo.toString();
    }

    public static JSONArray listToJsonString(List<UserEntity> userEntities) {
        JSONArray json = new JSONArray();
        for (UserEntity userEntity : userEntities) {
            JSONObject jo = new JSONObject();
            jo.put("id", userEntity.getId());
            jo.put("gender", userEntity.getGender());
            jo.put("birthday", userEntity.getBirthday());
            jo.put("realname", userEntity.getRealname());
            jo.put("avatar", userEntity.getAvatar());
            jo.put("tel", userEntity.getTel());
            jo.put("idnum", userEntity.getIdnum());
            jo.put("email", userEntity.getEmail());
            jo.put("xueli", userEntity.getXueli());
            jo.put("hunyin", userEntity.getHunyin());
            jo.put("xuexing", userEntity.getXuexing());
            jo.put("jiankangzheng", userEntity.getJiankangzheng());
            jo.put("hight", userEntity.getHight());
            jo.put("weight", userEntity.getWeight());
            jo.put("wishsalary", userEntity.getWishsalary());
            jo.put("address", userEntity.getAddress());
            jo.put("addressnum", userEntity.getAddressnum());
            jo.put("hujiaddress", userEntity.getHujiaddress());
            jo.put("hujiaddressnum", userEntity.getHujiaddressnum());
            jo.put("huji", userEntity.getHuji());
            jo.put("shenfen", userEntity.getShenfen());
            jo.put("worktime", userEntity.getWorktime());
            jo.put("workhours", userEntity.getWorkhours());
            jo.put("starttime", userEntity.getStarttime());
            jo.put("distance", userEntity.getDistance());
            jo.put("wishoffer", userEntity.getWishoffer());
            jo.put("vehicle", userEntity.getVehicle());
            jo.put("a11", userEntity.getA11());
            jo.put("a12", userEntity.getA12());
            jo.put("a13", userEntity.getA13());
            jo.put("a14", userEntity.getA14());
            jo.put("a15", userEntity.getA15());
            jo.put("a21", userEntity.getA21());
            jo.put("a22", userEntity.getA22());
            jo.put("a23", userEntity.getA23());
            jo.put("a24", userEntity.getA24());
            jo.put("a25", userEntity.getA25());
            jo.put("a31", userEntity.getA31());
            jo.put("a32", userEntity.getA32());
            jo.put("a33", userEntity.getA33());
            jo.put("a34", userEntity.getA34());
            jo.put("a35", userEntity.getA35());
            jo.put("z1", userEntity.getZ1());
            jo.put("z2", userEntity.getZ2());
            jo.put("z3", userEntity.getZ3());
            jo.put("z4", userEntity.getZ4());
            jo.put("z5", userEntity.getZ5());
            jo.put("b11", userEntity.getB11());
            jo.put("b12", userEntity.getB12());
            jo.put("b13", userEntity.getB13());
            jo.put("b14", userEntity.getB14());
            jo.put("b15", userEntity.getB15());
            jo.put("b21", userEntity.getB21());
            jo.put("b22", userEntity.getB22());
            jo.put("b23", userEntity.getB23());
            jo.put("b24", userEntity.getB24());
            jo.put("b25", userEntity.getB25());
            jo.put("b31", userEntity.getB31());
            jo.put("b32", userEntity.getB32());
            jo.put("b33", userEntity.getB33());
            jo.put("b34", userEntity.getB34());
            jo.put("b35", userEntity.getB35());
            jo.put("b41", userEntity.getB41());
            jo.put("b42", userEntity.getB42());
            jo.put("b43", userEntity.getB43());
            jo.put("b44", userEntity.getB44());
            jo.put("b45", userEntity.getB45());
            jo.put("b51", userEntity.getB51());
            jo.put("b52", userEntity.getB52());
            jo.put("b53", userEntity.getB53());
            jo.put("b54", userEntity.getB54());
            jo.put("b55", userEntity.getB55());
            jo.put("c11", userEntity.getC11());
            jo.put("c12", userEntity.getC12());
            jo.put("c13", userEntity.getC13());
            jo.put("c14", userEntity.getC14());
            jo.put("c15", userEntity.getC15());
            jo.put("c16", userEntity.getC16());
            jo.put("c17", userEntity.getC17());
            jo.put("c21", userEntity.getC21());
            jo.put("c22", userEntity.getC22());
            jo.put("c23", userEntity.getC23());
            jo.put("c24", userEntity.getC24());
            jo.put("c25", userEntity.getC25());
            jo.put("c26", userEntity.getC26());
            jo.put("c27", userEntity.getC27());
            jo.put("c31", userEntity.getC31());
            jo.put("c32", userEntity.getC32());
            jo.put("c33", userEntity.getC33());
            jo.put("c34", userEntity.getC34());
            jo.put("c35", userEntity.getC35());
            jo.put("c36", userEntity.getC36());
            jo.put("c37", userEntity.getC37());
            jo.put("c41", userEntity.getC41());
            jo.put("c42", userEntity.getC42());
            jo.put("c43", userEntity.getC43());
            jo.put("c44", userEntity.getC44());
            jo.put("c45", userEntity.getC45());
            jo.put("c46", userEntity.getC46());
            jo.put("c47", userEntity.getC47());
            jo.put("c51", userEntity.getC51());
            jo.put("c52", userEntity.getC52());
            jo.put("c53", userEntity.getC53());
            jo.put("c54", userEntity.getC54());
            jo.put("c55", userEntity.getC55());
            jo.put("c56", userEntity.getC56());
            jo.put("c57", userEntity.getC57());
            jo.put("updatetime", userEntity.getUpdatetime());
            jo.put("status", userEntity.getStatus());

            json.add(jo);
        }
        return json;
    }
}
