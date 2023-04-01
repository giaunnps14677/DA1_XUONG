package edu.home.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the payment methods database table.
 * 
 */
@Entity
@Table(name="paymentmethods")
@Data
public class Paymentmethod implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String code;

	private String description;

	@Column(name="image_name")
	private String imageName;

	@Column(name="is_display")
	private boolean isDisplay;

	private String name;

	//bidirectional many-to-one association to Order
	@JsonIgnore
	@OneToMany(mappedBy="paymentmethod")
	private List<Order> orders;
}