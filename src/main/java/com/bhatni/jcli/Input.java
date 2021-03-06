/*
 * This file is part of the jCLI project, licensed under MIT License.
 * See LICENSE.txt file in root folder of jCLI sources.
 */

package com.bhatni.jcli;

import java.util.List;

/**
 * Input provider for Shell.
 * Shell asks Input, "What does the user want to execute?", and Input reads and returns line from the user.
 * @author ASG
 */
public interface Input {

    String readCommand(List<String> path);

}
