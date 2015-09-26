package packageOne;

/**
 * Created by Aung Naing Oo on 9/26/2015.
 */
public class classOne {

    private int iV1 = 100;
    protected int iV2 = 200;
    int iV3 = 300;      //this means default access denoted by ~ (Stay within the family)
    public int iV4 = 400;


    public int getiV1() { return iV1; }

    public int getiV2() {
        return iV2;
    }

    public int getiV3() {
        return iV3;
    }

    public int getiV4() {
        return iV4;
    }


}
