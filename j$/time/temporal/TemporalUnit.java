package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes9.dex */
public interface TemporalUnit {
    long between(Temporal temporal, Temporal temporal2);

    Temporal f(Temporal temporal, long j);

    Duration getDuration();

    boolean isDurationEstimated();
}
