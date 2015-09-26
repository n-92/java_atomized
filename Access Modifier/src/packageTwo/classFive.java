package packageTwo;

import packageOne.classOne;

/**
 * Created by Aung Naing Oo on 9/26/2015.
 */
public class classFive {

    classOne o = new classOne();

//    Private not accessible
    public int getiV1() {
        return o.iV1;
    }

//    Protected not accessible
    public int getiV2() {
        return o.iV2;
    }

//    default not accessible
    public int getiV3() {
        return o.iV3;
    }

//    only public is accessible
    public int getiV4() {
        return o.iV4;
    }

}
