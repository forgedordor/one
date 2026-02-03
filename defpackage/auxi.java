package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auxi {
    public final int a;
    public final Instant b;
    public final Runnable c;

    public auxi(int i, Instant instant, Runnable runnable) {
        instant.getClass();
        this.a = i;
        this.b = instant;
        this.c = runnable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auxi)) {
            return false;
        }
        auxi auxiVar = (auxi) obj;
        return this.a == auxiVar.a && fdbq.f(this.b, auxiVar.b) && fdbq.f(this.c, auxiVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DeferredWorkItem(debouncedCount=" + this.a + ", firstDebounceTimestamp=" + this.b + ", runnable=" + this.c + ")";
    }
}
