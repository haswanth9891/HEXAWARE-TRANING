package com.hexaware.finaldemo.entity;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Reservation_Details")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Long reservationId;

    @Column(name = "check_in_date")
    private Date checkInDate;

    @Column(name = "check_out_date")
    private Date checkOutDate;

    @Column(name = "num_adults")
    private int numberOfAdults;

    @Column(name = "num_children")
    private int numberOfChildren;

    @Column(name = "total_amount")
    private double totalAmount;

    @Column(name = "reservation_status")
    private String reservationStatus;
    
    @OneToMany(mappedBy = "Reservation", cascade = CascadeType.ALL)
    @JoinColumn(name="Reservation_id")
    private Set<Room>reservation= new HashSet<Room>() ;

	public Reservation() {
		super();
	}

	public Reservation(Long reservationId, Date checkInDate, Date checkOutDate, int numberOfAdults,
			int numberOfChildren, double totalAmount, String reservationStatus, Set<Room> reservation) {
		super();
		this.reservationId = reservationId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildren = numberOfChildren;
		this.totalAmount = totalAmount;
		this.reservationStatus = reservationStatus;
		this.reservation = reservation;
	}

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public Set<Room> getReservation() {
		return reservation;
	}

	public void setReservation(Set<Room> reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", numberOfAdults=" + numberOfAdults + ", numberOfChildren=" + numberOfChildren
				+ ", totalAmount=" + totalAmount + ", reservationStatus=" + reservationStatus + ", reservation="
				+ reservation + "]";
	}

	
   
}

