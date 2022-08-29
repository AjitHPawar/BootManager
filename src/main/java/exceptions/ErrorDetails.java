package exceptions;

import java.util.Date;

import lombok.Data;

@Data
public class ErrorDetails {

	private Date date;
	private String msg;
	private String details;
}
