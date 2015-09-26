package packageOne;

/**
 * Created by Aung Naing Oo on 9/26/2015.
 */
public class classThree extends classOne{

    /*Private is not inherited*/
    public int getiV1() { return iV1; }

    public int getiV2() {
        return iV2;
    }

//    defautlt is inherited
    public int getiV3() {
        return iV3;
    }

    public int getiV4() {
        return iV4;
    }



}
