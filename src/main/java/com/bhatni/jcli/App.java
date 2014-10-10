/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhatni.jcli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for App. Allows to specify the name of a command, otherwise method's name is used.
 * @author virendra
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface App {
    /**
     * Allows to override default App name, which is derived from class's name
     * @return "" or null if default name is used, user-specified name otherwise.
     */
    String name() default ""; // if "" then Null is assumed.

    /**
     * Specify the description of the app. Default description (if this
     * property is not set) says "methodName(Arg1Type, Arg2Type,...) : ReturnType".
     * @return command's description or "" if not set.
     */
    String description() default "";
    
    /**
     * Specify the shell prompt of the app. Default description (if this
     * property is not set) says "methodName(Arg1Type, Arg2Type,...) : ReturnType".
     * @return command's description or "" if not set.
     */
    String shellPrompt() default "";
}
