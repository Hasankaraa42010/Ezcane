import java.util.List;

public class Ilac {
    private String isim;
    private int id;
    private List<String> yanEtkileri;
    private boolean recete;
    private String aciklama;
    private List<String> yorumlar;


    public Ilac(){

    }

    public Ilac(String isim, int id, List<String> yanEtkileri, String aciklama) {
        this.isim = isim;
        this.id = id;
        this.yanEtkileri = yanEtkileri;
        this.aciklama = aciklama;
    }
}
