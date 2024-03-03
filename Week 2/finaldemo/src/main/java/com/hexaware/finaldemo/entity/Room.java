package com.hexaware.finaldemo.entity;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Room_Details")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

   

    @Column(name = "room_size")
    private String roomSize;

    @Column(name = "bed_type")
    private String bedType;

    @Column(name = "max_occupancy")
    private int maxOccupancy;

    @Column(name = "base_fare")
    private BigDecimal baseFare;

    @Column(name = "is_ac")
    private boolean isAC;

    @Column(name = "availability_status")
    private String availabilityStatus;

	public Room() {
		super();
	}

	public Room(Long roomId, String roomSize, String bedType, int maxOccupancy, BigDecimal baseFare, boolean isAC,
			String availabilityStatus) {
		super();
		this.roomId = roomId;
		this.roomSize = roomSize;
		this.bedType = bedType;
		this.maxOccupancy = maxOccupancy;
		this.baseFare = baseFare;
		this.isAC = isAC;
		this.availabilityStatus = availabilityStatus;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public String getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(String roomSize) {
		this.roomSize = roomSize;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public int getMaxOccupancy() {
		return maxOccupancy;
	}

	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}

	public BigDecimal getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(BigDecimal baseFare) {
		this.baseFare = baseFare;
	}

	public boolean isAC() {
		return isAC;
	}

	public void setAC(boolean isAC) {
		this.isAC = isAC;
	}

	public String getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomSize=" + roomSize + ", bedType=" + bedType + ", maxOccupancy="
				+ maxOccupancy + ", baseFare=" + baseFare + ", isAC=" + isAC + ", availabilityStatus="
				+ availabilityStatus + "]";
	}

	
    
   
}

