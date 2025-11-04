package entities;

import java.util.Objects;

public class Candidates {
    private String name;
    private Integer nomberOfVotes;

    public Candidates(String name, Integer nomberOfVotes) {
        this.name = name;
        this.nomberOfVotes = nomberOfVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNomberOfVotes() {
        return nomberOfVotes;
    }

    public void setNomberOfVotes(Integer nomberOfVotes) {
        this.nomberOfVotes = nomberOfVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidates that = (Candidates) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
