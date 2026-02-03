package defpackage;

import j$.time.Instant;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eonw {
    static {
        Instant.ofEpochMilli(Long.MAX_VALUE);
        Instant.ofEpochMilli(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        c(Long.MAX_VALUE);
        c(Long.MIN_VALUE);
        Instant.MIN.getEpochSecond();
        Instant.MAX.getEpochSecond();
    }

    public static long a(Instant instant) {
        return instant.getEpochSecond() < -9223372036854L ? eolp.b(eolp.c(instant.getEpochSecond() + 1, 1000000L), (instant.getNano() / 1000) - 1000000) : eolp.b(eolp.c(instant.getEpochSecond(), 1000000L), instant.getNano() / 1000);
    }

    public static Instant b(long j) {
        return Instant.ofEpochSecond(eolp.e(j, 1000000L, RoundingMode.FLOOR), eolp.a(j, 1000000) * 1000);
    }

    public static void c(long j) {
        Instant.ofEpochSecond(eolp.e(j, 1000000000L, RoundingMode.FLOOR), eolp.a(j, 1000000000));
    }
}
