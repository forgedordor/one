package defpackage;

import j$.time.Duration;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxi implements Closeable {
    private final cogw a;
    private final Duration b;
    private Duration c;

    public cnxi(cogw cogwVar) {
        this.a = cogwVar;
        this.b = Duration.ofMillis(cogwVar.a());
    }

    public final Duration a() {
        Duration durationOfMillis = this.c;
        if (durationOfMillis == null) {
            durationOfMillis = Duration.ofMillis(this.a.a());
        }
        Duration durationMinus = durationOfMillis.minus(this.b);
        durationMinus.getClass();
        return durationMinus;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c != null) {
            throw new IllegalArgumentException("Timer has already been closed");
        }
        this.c = Duration.ofMillis(this.a.a());
    }
}
