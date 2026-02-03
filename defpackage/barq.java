package defpackage;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class barq {
    public static long a(Instant instant) {
        if (instant == null) {
            return 0L;
        }
        return instant.toEpochMilli();
    }

    public static Instant b(long j) {
        ejwl.b(j >= 0, "Milliseconds passed cannot be negative.");
        return j == 0 ? Instant.EPOCH : Instant.ofEpochMilli(j).truncatedTo(ChronoUnit.DAYS);
    }
}
