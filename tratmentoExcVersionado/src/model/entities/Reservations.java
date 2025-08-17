package model.entities;

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

    public Reservations(Integer roomNumber, Date checkin, Date checkout) {
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

    public void updateDates(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString(){
         return "Room " + roomNumber
                 + ", checkin: " + sdf.format(checkin)
                 + ", checkout: " + sdf.format(checkout)
                 + durations() + " nights.";
    }
}
