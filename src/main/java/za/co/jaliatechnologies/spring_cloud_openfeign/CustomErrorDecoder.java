package za.co.jaliatechnologies.spring_cloud_openfeign;

import feign.Response;
import feign.codec.ErrorDecoder;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;


public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {

        switch (response.status()){
            case 400:
                return new BadRequestException();
            case 404:
                return new NotFoundException();
            default:
                return new Exception("Generic error");
        }
    }
}
