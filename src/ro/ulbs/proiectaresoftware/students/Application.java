package ro.ulbs.proiectaresoftware.students;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Application {
    public static void main()
    {
        Student s1 = new Student(112, "Ioan", "Popa", "TI21/1");
        Student s2 = new Student(112, "Maria", "Oprea", "TI21/1");
        Student s3 = new Student(120, "Alis", "Popa", "TI21/2");
        Student s4 = new Student(122, "Mihai", "Vecerdea", "TI21/1");
        Student s5 = new Student(122, "Eugen", "Uritescu", "TI21/2");

        IO.println(String.format("%15s %20s %s", "numar matricol", "prenume nume", "formatie de studiu"));
        /*IO.println(s1.toString());
        IO.println(s2.toString());
        IO.println(s3.toString());
        IO.println(s4.toString());
        IO.println(s5.toString());*/

        List<Student> listStudenti = new ArrayList<Student>();

        listStudenti.add(s1);
        listStudenti.add(s2);
        listStudenti.add(s3);
        listStudenti.add(s4);
        listStudenti.add(s5);

        for(Student s : listStudenti)
        {
            IO.println(s + " ");
        }

        Student cautaStudent1 = new Student(120, "Alis", "Popa", "TI21/2");
        Student cautaStudent2 = new Student(112, "Maria", "Popa", "TI21/1");

        IO.println("Cautare pt liste varianta 1: ");
        if(cautaStudent1.verifPrezenta(listStudenti))
        {
            IO.println("Studentul(a) " + cautaStudent1.nume + " " + cautaStudent1.prenume + " este in lista.");
        }
        else
        {
            IO.println("Studentul(a) " + cautaStudent1.nume + " " + cautaStudent1.prenume + " nu este in lista.");
        }
        if(cautaStudent2.verifPrezenta(listStudenti))
        {
            IO.println("Studentul(a) " + cautaStudent2.nume + " " + cautaStudent2.prenume + " este in lista.");
        }
        else
        {
            IO.println("Studentul(a) " + cautaStudent2.nume + " " + cautaStudent2.prenume + " nu este in lista.");
        }

        IO.println("Cautare pt liste varianta 2: ");
        if(cautaStudent1.verifPrezenta3(listStudenti))
        {
            IO.println("Studentul(a) " + cautaStudent1.nume + " " + cautaStudent1.prenume + " este in lista.");
        }
        else
        {
            IO.println("Studentul(a) " + cautaStudent1.nume + " " + cautaStudent1.prenume + " nu este in lista.");
        }
        if(cautaStudent2.verifPrezenta3(listStudenti))
        {
            IO.println("Studentul(a) " + cautaStudent2.nume + " " + cautaStudent2.prenume + " este in lista.");
        }
        else
        {
            IO.println("Studentul(a) " + cautaStudent2.nume + " " + cautaStudent2.prenume + " nu este in lista.");
        }

        Set<Student> setStudenti = new HashSet<Student>();

        setStudenti.add(s1);
        setStudenti.add(s2);
        setStudenti.add(s3);
        setStudenti.add(s4);
        setStudenti.add(s5);

        IO.println("Cautare pt seturi: ");
        if(cautaStudent1.verifPrezenta2(setStudenti))
        {
            IO.println("Studentul(a) " + cautaStudent1.nume + " " + cautaStudent1.prenume + " este in lista.");
        }
        else
        {
            IO.println("Studentul(a) " + cautaStudent1.nume + " " + cautaStudent1.prenume + " nu este in lista.");
        }
        if(cautaStudent2.verifPrezenta2(setStudenti))
        {
            IO.println("Studentul(a) " + cautaStudent2.nume + " " + cautaStudent2.prenume + " este in lista.");
        }
        else
        {
            IO.println("Studentul(a) " + cautaStudent2.nume + " " + cautaStudent2.prenume + " nu este in lista.");
        }
    }
}
