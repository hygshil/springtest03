package springzuoyecglib;

public class LiuLanQia {
    private String GongNeng="浏览器不能访问谷歌";
    public String FangWen(){
        System.out.println(GongNeng);
        return this.GongNeng;
    }

    public String getGongNeng() {
        return GongNeng;
    }

    public void setGongNeng(String gongNeng) {
        GongNeng = gongNeng;
    }
}
