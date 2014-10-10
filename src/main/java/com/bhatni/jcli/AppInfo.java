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
public class AppInfo {

    private String name;
    private String shellPrompt;
    private String description;
    
    public AppInfo(Class app) {
        name = app.getSimpleName();
        shellPrompt = name;
        description = "Command line shell for " + name;
        if (app.isAnnotationPresent(App.class)) {
            App appinfo = (App)app.getAnnotation(App.class);
            if (!appinfo.name().isEmpty())
                name = appinfo.name();
            if (!appinfo.description().isEmpty())
                description = appinfo.description();
            if (!appinfo.shellPrompt().isEmpty())
                shellPrompt = appinfo.shellPrompt();
        }
        
    }
    
    public String getName() {
        return name;
    }

    /**
     * @return the shellPrompt
     */
    public String getShellPrompt() {
        return shellPrompt;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    
}
