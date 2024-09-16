package org.fileprocessing.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DependencyHandler {

    private final Map<String, List<String>> dependencies = new HashMap<>();

    public void addDependency(String file, String requiredFile) {
        dependencies.computeIfAbsent(file, k -> new ArrayList<>()).add(requiredFile);
    }

    public Map<String, List<String>> getDependencies() {
        return dependencies;
    }

    public boolean hasDependencies(String file) {
        return dependencies.containsKey(file);
    }

    public List<String> getDependentFiles(String file) {
        return dependencies.getOrDefault(file, new ArrayList<>());
    }

}
