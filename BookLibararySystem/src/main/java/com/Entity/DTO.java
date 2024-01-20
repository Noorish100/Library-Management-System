package com.Entity;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class DTO {
	
	private Integer id;
	private String title;
	private Integer isbn;
	private Integer quantity;
	private String name;
	private Date birthDate;

}
