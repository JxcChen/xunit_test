package entity;

import lombok.Data;

/**
 * @author JJJJ
 * @Title:
 * @date 2021/10/25下午9:23
 * @Description:
 */
@Data
public class Result {


    private String caseName;
    private Boolean result;

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}
