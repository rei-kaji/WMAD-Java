package ca.ciccc.wmad202.assignment6.question1;

import java.util.ArrayList;

public class Material {
    Integer MaterialCode;
    String MaterialName;

    public Material(Integer MaterialCode,String MaterialName) {
        this.MaterialCode = MaterialCode;
        this.MaterialName = MaterialName;
    }

    public Integer getCode() {
        return MaterialCode;
    }

    public void setCode(Integer code) {
        this.MaterialCode = code;
    }
}
