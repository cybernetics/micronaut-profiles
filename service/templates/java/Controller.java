${packageName ? 'package ' + packageName + ';' : '' }

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/${propertyName}")
public class ${className} {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}