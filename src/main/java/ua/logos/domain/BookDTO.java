package ua.logos.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class BookDTO {

	private String title;
	private String description;
	private BigDecimal price;
	private String imageUrl;
	private String isbn;
	private String author;
	private Long id;

}
