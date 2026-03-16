package ro.ulbs.proiectaresoftware.students;
import java.util.List;
import java.util.ArrayList;

public class Student {
    int numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;

    public Student (int numarMatricol, String prenume, String nume, String formatieDeStudiu)
    {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }

    int getNumarMatricol ()
    {
        return this.numarMatricol;
    }

    String getPrenume()
    {
        return this.prenume;
    }

    String getNume()
    {
        return this.nume;
    }

    String getFormatieDeStudiu()
    {
        return this.formatieDeStudiu;
    }

    public String toString()
    {
        return String.format("%15d %20s %s", this.numarMatricol, this.prenume + " " + this.nume, this.formatieDeStudiu);
    }

    public boolean verifPrezenta(List<Student> lista)
    {
        for (Student s : lista)
        {
            if((s.numarMatricol == this.numarMatricol) && s.nume.equals(this.nume) && s.prenume.equals(this.prenume) && s.formatieDeStudiu.equals(this.formatieDeStudiu))
                return true;
        }

        return false;
    }

}
