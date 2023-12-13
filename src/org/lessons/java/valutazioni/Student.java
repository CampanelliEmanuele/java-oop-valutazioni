package org.lessons.java.valutazioni;

public class Student {
    private int id;
    private int absencesPercentage;
    private double gradeAverage;

    /* CONTRACTORS */

    public Student(int id, int absencesPercentage, double gradeAverage) throws IllegalArgumentException {
        setId(id);
        setAbsencesPercentage(absencesPercentage);
        setGradeAverage(gradeAverage);
    }

    /* MAIN FUNCTIONS */

    public boolean isPassed() {
        if (absencesPercentage > 50)            /* 100 >= absencesPercentage > 50 */
            return false;
        else if (absencesPercentage >= 25)      /* 50 >= absencesPercentage >= 25 */
            return gradeAverage > 2;
        else                                    /* 25 > absencesPercentage >= 0 */
            return gradeAverage >= 2;
    }

    /* VALIDATORS */

    private void validId(int id) {
        if (id <= 0)
            throw new IllegalArgumentException("Error: student id cannot be a negative number or equal to 0.");
    }

    private void validAbsencesPercentage(int absencesPercentage) {
        if (absencesPercentage < 0 || absencesPercentage > 100)
            throw new IllegalArgumentException("Error: student absences percentage must be between 0 and 100 (inclusive).");
    }

    private void validGradeAverage(double gradeAverage) {
        if (gradeAverage < 0 || gradeAverage > 5)
            throw new IllegalArgumentException("Error: student grade average must be between 0 and 5 (inclusive).");
    }

    /* GETTERS AND SETTERS */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        validId(id);
        this.id = id;
    }

    public int getAbsencesPercentage() {
        return absencesPercentage;
    }

    public void setAbsencesPercentage(int absencesPercentage) {
        validAbsencesPercentage(absencesPercentage);
        this.absencesPercentage = absencesPercentage;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) {
        validGradeAverage(gradeAverage);
        this.gradeAverage = gradeAverage;
    }
}
