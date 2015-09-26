package packageTwo;

import packageOne.classOne;

/**
 * Created by Aung Naing Oo on 9/26/2015.
 */
public class classFour extends classOne {

    /*Private is not inherited*/
    public int getiV1() { return iV1; }

    /*Protected is inherited*/
    public int getiV2() {
        return iV2;
    }

    /*Default is not inherited*/
    public int getiV3() { return iV3; }

    /*Public is also inherited*/
    public int getiV4() {
        return iV4;
    }


}
