package co.com.ayepark.aye_park_back.invoice;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import co.com.ayepark.aye_park_back.park.Park;
import co.com.ayepark.aye_park_back.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="park_id")
    Park park;

    @Column(name = "date_in")
    LocalDateTime dateIn;

    @Column(name = "date_out")
    LocalDateTime dateOut;

    @Column(name = "plate")
    String plate;

    @Column(name = "vehicle_type")
    String vehicleType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="attendee_in_id")
    User attendeeIn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="attendee_out_id")
    User attendeeOut;

    @Column(name = "parking_status")
    Integer parkingStatus;

    @Column(name = "payment_amount")
    Long paymentAmount;

    @Column(name = "barcode")
    String barcode;

    @CreatedDate
    LocalDateTime createdAt;

    @LastModifiedDate
    LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="created_by")
    User createdBy;
    
}
