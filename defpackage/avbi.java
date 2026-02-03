package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avbi {
    public final cogw a;
    public double b;
    public Instant c;
    public AtomicReference d;
    public Instant e;
    private final fcsu f;
    private final long g;
    private final Duration h;
    private final double i;

    public avbi(cogw cogwVar, fcsu fcsuVar, long j, Duration duration) {
        this.a = cogwVar;
        this.f = fcsuVar;
        this.g = j;
        this.h = duration;
        if (j <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (duration.compareTo(Duration.ZERO) <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        double d = j;
        this.i = ((Number) fcsuVar.b()).doubleValue() * d;
        this.b = d;
        this.c = Instant.MIN;
        this.d = new AtomicReference(false);
        this.e = Instant.MIN;
    }

    public final double a() {
        Duration.between(this.c, Instant.ofEpochMilli(this.a.a())).getClass();
        return Math.min(this.g, this.b + (eonv.a(r0) / eonv.a(this.h)));
    }

    public final void b() {
        synchronized (this) {
            this.b = this.g;
            cogw cogwVar = this.a;
            this.c = Instant.ofEpochMilli(cogwVar.a());
            this.d.set(false);
            this.e = Instant.ofEpochMilli(cogwVar.a());
        }
    }

    public final boolean c() {
        synchronized (this) {
            if (!((Boolean) this.d.get()).booleanValue()) {
                return false;
            }
            if (Duration.between(this.e, Instant.ofEpochMilli(this.a.a())).compareTo(Duration.ofSeconds(60L)) < 0) {
                return true;
            }
            if (a() < this.i) {
                return true;
            }
            this.d.set(false);
            return false;
        }
    }
}
