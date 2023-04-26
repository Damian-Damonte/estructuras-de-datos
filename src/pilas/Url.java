package pilas;

public class Url {
    private String utl;

    public String getUtl() {
        return utl;
    }

    public void setUtl(String utl) {
        this.utl = utl;
    }

    public Url(String utl) {
        this.utl = utl;
    }

    @Override
    public String toString() {
        return "Url{" +
                "utl='" + utl + '\'' +
                '}';
    }
}
