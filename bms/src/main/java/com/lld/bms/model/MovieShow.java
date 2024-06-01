package com.lld.bms.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class MovieShow {

    private Movie show;
    private boolean isRunning;
    private Map<String, List<Seat>> seatMap;
    private LocalDateTime showStartTiming;
    private LocalDateTime showEndTiming;
}
