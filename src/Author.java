import java.util.Objects;


public class Author {

    private String namefirst;
    private String namelast;

    public Author(String лев, String толстой) {
        this.namefirst = namefirst;
        this.namelast = namelast;

    }

    public String getNamefirst() {
        return namefirst;
    }

    public String getNamelast() {
        return namelast;

    }

    @Override
    public String toString() {
        return "Autho{" + "namefirst='" + namefirst + '\'' + ", namelast='" + namelast + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author autho = (Author) o;
        return namefirst.equals(autho.namefirst) && namelast.equals(autho.namelast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namefirst, namelast);
    }
}

