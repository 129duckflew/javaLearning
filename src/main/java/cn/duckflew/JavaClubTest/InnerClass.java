package cn.duckflew.JavaClubPrepare;

import lombok.Data;

public class InnerClass
{
    private Integer outerData;
    @Data
    public class Inner
    {
        public void show()
        {
            System.out.println(outerData);
        }
    }
}
