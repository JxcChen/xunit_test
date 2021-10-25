package entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JJJJ
 * @Title:
 * @date 2021/10/25下午9:32
 * @Description:
 */
public class ResultList {


    private ArrayList<Result> resultList;

    public ArrayList<Result> getResultList() {
        return resultList;
    }

    public void setResultList(ArrayList<Result> resultList) {
        this.resultList = resultList;
    }

}
