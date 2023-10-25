package com.raghadan.lms.models;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibraryModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "library_name")
	private String library_name;
	
	@Column(name="library_location")
	private String library_location;
	
	@Column(name = "total_books_count")
	private Long total_books_count;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<BookModel> books;
}
