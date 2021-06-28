package io.Eduard;
import java.util.Objects;
/**
Company Service Test Ja
 */
public class Company {
    private final Company parent;
    private final long employeeCount;
    private final int id;

    public Company(final int id, final Company parent, final long employeeCount) {
        this.id = id;
        this.parent = parent;
        this.employeeCount = employeeCount;
    }

    public Company getParent() {
        return this.parent;
    }

    public long getEmployeeCount() {
        return this.employeeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

