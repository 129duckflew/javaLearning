package cn.duckflew;

import java.util.*;
public class CalWordNum
{
    public static String[] data=
            {
                    "中山路武昌火车站","白沙洲大道栅栏口","武泰闸","江民路","烽火寸"
                    , "余家湾","乔木湾","张家湾","青菱乡"
                    ,"罗家村","凌吴墩","白沙洲大道农产品市场","豹子山公交停车场"
                    ,"华中城建材物流大市场","汉城路公交停车场","汉城路芳草路口"
                    ,"芳草路四新北路","四新北路四新中路","四新北路凤仪路","凤仪路四新北路"
                    ,"凤仪路书台路","三青路墨水湖小学","三青路凤举路"
                    ,"洲头南路晴川大道","白沙洲大道龚家铺","黄家湖三街","三青路连通港路"
            };
    public static int getStation(String stationName)
    {
        int i=0;
        for (String datum : data)
        {
            if (datum.equals(stationName)||datum.contains(stationName))
            {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Map<Set<String>,Integer> map=new HashMap();
        Scanner scanner = new Scanner(System.in);
        int num=1;
        while (scanner.hasNext())
        {
            String nextLine = scanner.nextLine();
            if (nextLine.contains("#"))break;
            String busName=nextLine.substring(0,nextLine.indexOf(":"));
            String data=nextLine.substring(nextLine.indexOf(":")+1);
            String[] stationsOfOneLine = data.split("->");
            Random random = new Random();
            for (int i = 0; i < stationsOfOneLine.length-1; i++)
            {
                String curStation = stationsOfOneLine[i];
                String nextStation = stationsOfOneLine[i + 1];
                int curIndex = getStation(curStation);
                int nextIndex = getStation(nextStation);
                int busNumber;
                int baseNumber = Integer.parseInt(String.valueOf(busName.charAt(0)));
                if (busName.contains("上"))
                    busNumber= baseNumber *2-2;
                else busNumber= baseNumber *2-1;
                Set<String>set=new HashSet<>();
                set.add(curStation);
                set.add(nextStation);
                int distance;
                if (map.containsKey(set))distance=map.get(set);
                else distance=random.nextInt(700)+300;
                System.out.println(","+busNumber+","+curIndex+","+nextIndex+","+distance+"//"+busName+"  "+curStation+"->"+nextStation);
            }
        }
    }
}


