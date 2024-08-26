package Taller2SRP.model.valueObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValue {
    private final LocalDate value;

    public DateValue(LocalDate value) {
        this.value = value;
    }

    public static DateValue of(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate date = LocalDate.parse(dateString, formatter);
            return new DateValue(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de la fecha invalido, verifica que sea [yyyy-MM-dd] : " + dateString);
        }
    }

    public LocalDate getValue() {
        return value;
    }
}
