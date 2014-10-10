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
public class CommandNotFoundException extends CLIException {
    public CommandNotFoundException(String commandName) {
        super("Unknown command: " + Token.escapeString(commandName));
        this.commandName = commandName;
    }    
}
