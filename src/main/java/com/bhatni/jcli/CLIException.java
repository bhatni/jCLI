/*
 * This file is part of the jCLI project, licensed under MIT License.
 * See LICENSE.txt file in root folder of jCLI sources.
 */

package com.bhatni.jcli;

/**
 *
 * Root exception for jCLI.
 *
 * @author ASG
 */
public class CLIException extends Exception {
    
    protected String commandName;
    
    public CLIException() {
        super();
    }
    protected CLIException(String message) {
        super(message);
    }
    public CLIException(Throwable cause) {
        super(cause);
    }
    public CLIException(String message, Throwable cause) {
        super(message, cause);
    }

}
