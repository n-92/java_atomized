package packageOne;

/**
 * Created by Aung Naing Oo on 9/26/2015.
 */
public class classTwo {

    classOne o = new classOne();

//    Private not accessible
    public int getiV1() {
        return o.iV1;
    }

    public int getiV2() {
        return o.iV2;
    }

    public int getiV3() {
        return o.iV3;
    }

    public int getiV4() {
        return o.iV4;
    }

}
