package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservations {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservations() {
    }

    public Reservations(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
        //Podemos inclusive propagar uma excessão que seja possivel ocorer no construtor.

        if (!checkout.after(checkin)) {
            throw new DomainException("Checkout date must not bo before checkin date.");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long durations(){
        //.getTime recebe a data em milisegundos...
        long diff = checkout.getTime() - checkin.getTime();
        //então precisamos converter esses milisegundos para uma data;
        //convertemos essas datas ´para dias conforme abaixo.
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout) throws DomainException{
        //O compilador exige que tratemos a excessao ou a propaguemos, uma vez que ela Extend Exceptions
        //Então precisamos propaga-la com o throws, uma vez que o tratamento ocore no programa principal.
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)) {
            throw new DomainException("Reservation dates must be future dates.");
        }

        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString(){
         return "Room " + roomNumber
                 + ", checkin: " + sdf.format(checkin)
                 + ", checkout: " + sdf.format(checkout) + " "
                 + durations() + " nights.";
    }
}
