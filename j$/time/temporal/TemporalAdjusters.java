package j$.time.temporal;

import j$.time.DayOfWeek;

/* loaded from: classes9.dex */
public final class TemporalAdjusters {
    public static TemporalAdjuster next(DayOfWeek dayOfWeek) {
        return new j(dayOfWeek.getValue(), 0);
    }
}
