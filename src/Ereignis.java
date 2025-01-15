import java.util.Date;

public class Ereignis {
    int id;
    String name;
    Haus haus;
    String Ereignis;
    Date datum;

    public Ereignis(int id, String name, Haus haus, String ereignis, Date datum) {
        this.id = id;
        this.name = name;
        this.haus = haus;
        Ereignis = ereignis;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Haus getHaus() {
        return haus;
    }

    public void setHaus(Haus haus) {
        this.haus = haus;
    }

    public String getEreignis() {
        return Ereignis;
    }

    public void setEreignis(String ereignis) {
        Ereignis = ereignis;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Ereignis{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", haus=" + haus +
                ", Ereignis='" + Ereignis + '\'' +
                ", datum=" + datum +
                '}';
    }
}
