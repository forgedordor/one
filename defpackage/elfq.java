package defpackage;

import j$.time.Duration;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class elfq implements Serializable {
    public static final Duration d = Duration.ofMillis(-1);

    public static elfq c(Duration duration, double d2, int i) {
        duration.getClass();
        return new elfm(duration, d2, i);
    }

    static /* bridge */ /* synthetic */ void d(int i) {
        ejwl.h(i >= 0, "%s (%s) must be >= 0", "tries", i);
    }

    static /* bridge */ /* synthetic */ void e(int i) {
        ejwl.h(i > 0, "%s (%s) must be > 0", "numAttempts", i);
    }

    public abstract Duration a(int i);

    public boolean b(int i) {
        return a(i).compareTo(Duration.ZERO) >= 0;
    }
}
