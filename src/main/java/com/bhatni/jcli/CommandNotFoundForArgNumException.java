/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhatni.jcli;

/**
 *
 * @author virendra
 */
class CommandNotFoundForArgNumException extends CLIException {

    public CommandNotFoundForArgNumException(String commandName, int argCount) {
        super("There's no command " + Token.escapeString(commandName)
                + " taking " + argCount + " arguments");
    }

}
