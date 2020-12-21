package projetoLocadora;

public class BluRays extends Filme{
    private String idiomas;

    public BluRays(String idiomas){
        this.idiomas = idiomas;
    }
    public String getIdiomas() {
        return idiomas;
    }
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
}
