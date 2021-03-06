package com.log.fileservice.monitor.monitor;

import lombok.Data;

import java.io.FileFilter;
import java.util.List;

@Data
public class MonitorParameter {
    private List<String> roots;
    private FileFilter fileFilter;
}
