/*
 * This file is part of the jCLI project, licensed under MIT License.
 * See LICENSE.txt file in root folder of jCLI sources.
 */

package com.bhatni.jcli;

/**
 * Exception pointing at the token which caused it.
 * Used to report invalid parameter types.
 *
 * @author ASG
 */
public class TokenException extends CLIException {
    private Token token;

    public Token getToken() {
        return token;
    }

    public TokenException(Token token) {
        super();
        this.token = token;
    }
    public TokenException(Token token, String message) {
        super(message);
        this.token = token;
    }
    public TokenException(Token token, Throwable cause) {
        super(cause);
        this.token = token;
    }
    public TokenException(Token token, String message, Throwable cause) {
        super(message, cause);
        this.token = token;
    }
}
