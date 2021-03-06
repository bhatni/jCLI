/*
 * This file is part of the jCLI project, licensed under MIT License.
 * See LICENSE.txt file in root folder of jCLI sources.
 */

package com.bhatni.jcli;

/**
 * Output for Shell to direct its output to.
 * Something like the Builder pattern.
 * @author ASG
 */
public interface Output {

    void output(Object obj, OutputConversionEngine oce);

    void outputException(String input, TokenException error);

    void outputException(Throwable e);

    void outputExceptionMessage(Throwable e);

    void outputHeader(String text); 

}
