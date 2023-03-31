package com.poly.dax.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * The persistent class for the mail_notification database table.
 * 
 */
@Table(name="notification")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="MailNotification.findAll", query="SELECT m FROM MailNotification m")
public class MailNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Lob
	private String data;

	private int executed;

	@Column(name="receiver_id")
	private int receiverId;

	@Column(name="sender_id")
	private int senderId;

	@Column(name="type_id")
	private int typeId;

	@Column(name="updated_at")
	private Timestamp updatedAt;


}