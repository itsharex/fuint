package com.fuint.exception;

/**
 * Exception for bad request.
 * This exception will be throwed by framework on:
 *  - json parsing error
 *  - bean validation error
 *
 * It can also be thrown by service implementation when you think there is a bad request
 *
 * @author Harrison han
 */
public class BadRequestException extends HttpStatusException {

  private static final Integer STATUS_CODE = 400;

  public BadRequestException() {

    super.setStatus(STATUS_CODE);
    super.setMessage("bad request");

  }

  public BadRequestException(String message) {

    super.setStatus(STATUS_CODE);
    super.setMessage(message);

  }

  public BadRequestException(String message, Exception cause) {

    super(cause);
    super.setStatus(STATUS_CODE);
    super.setMessage(message);

  }

}
