import java.lang.String;
public class Film {
    public String titolo, genere;
    public int anno, durata;
    Regista regista;

    //Costruttori
    Film(String titolo, Regista regista, String genere, int anno, int durata){
        this.titolo = titolo;
        this.regista = regista;
        this.genere = genere;
        this.anno = anno;
        this.durata = durata;
    }

    //Setter
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setRegista(Regista regista){
        this.regista = regista;
    }
    public void setGenere(String genere){
        this.genere = genere;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }
    public void setDurata(int durata){
        this.durata = durata;
    }

    //Getter
    public String getTitolo(){
        return titolo;
    }
    public Regista getRegista(){
        return  regista;
    }
    public String getGenere(){
        return  genere;
    }
    public int getAnno(){
        return  anno;
    }
    public int getDurata(){
        return  durata;
    }

    //Metodi
    public boolean compareRegista(Regista regista){
        if(this.regista.getCF().equals(regista.getCF())){
            return true;
        }
        else return false;
    }
    public boolean compareAnno(int anno){
        if(this.anno == anno){
            return true;
        }
        else return false;
    }
    public boolean overYear(int anno){
        if(this.anno < anno){
            return true;
        }
        return false;
    }
    public float compareFilm(Film film1, Film film2){
        if(this.getRegista().equals(film1.getRegista()) && this.equals(film2.getRegista()) && film1.getRegista().equals(film2.getRegista())){
            return (this.getDurata() + film1.getDurata() + film2.getDurata()) / 3;
        }
        return -1;
    }
    public boolean compareDurata(int durata){
        if(this.getDurata() == durata)
            return true;
        return false;
    }
    public float mediaDurate(Film movie1, Film movie2){
        return (movie1.getDurata() + movie2.getDurata() + this.getDurata())/3;
    }
    public float maxDurata(Film movie1, Film movie2){
        return Math.max(Math.max(movie1.getDurata(), movie2.getDurata()), this.getDurata());
    }
}