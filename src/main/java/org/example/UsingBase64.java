package org.example;

import org.apache.commons.codec.binary.Base64;

public class UsingBase64 {

    public String method() {
        byte[] bytes = {1,2};
        // This method exists in commons-codec 1.10, but IntelliJ is picking up the commons-codec 1.3
        // that is a dependency of the google HTTP client that subproj depends on.
        // Note that gradle build on the command line works.
        return Base64.encodeBase64String(bytes);
    }
}
