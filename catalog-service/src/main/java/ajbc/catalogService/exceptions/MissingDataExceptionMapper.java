package ajbc.catalogService.exceptions;


import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class MissingDataExceptionMapper implements ExceptionMapper<MissingDataException>{
	@Override
	public Response toResponse(MissingDataException e) {
		ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), InternalErrorCode.INVALID_ID);
		return Response.status(Status.NOT_FOUND)
		.entity(errorMessage)
		.build();
	}
	

}
