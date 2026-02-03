package defpackage;

import j$.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auxn {
    public final String a;
    public final AtomicInteger b;
    public Instant c;
    public Instant d;
    public final Runnable e;

    public auxn(String str, AtomicInteger atomicInteger, Instant instant, Instant instant2, Runnable runnable) {
        this.a = str;
        this.b = atomicInteger;
        this.c = instant;
        this.d = instant2;
        this.e = runnable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auxn)) {
            return false;
        }
        auxn auxnVar = (auxn) obj;
        return fdbq.f(this.a, auxnVar.a) && fdbq.f(this.b, auxnVar.b) && fdbq.f(this.c, auxnVar.c) && fdbq.f(this.d, auxnVar.d) && fdbq.f(this.e, auxnVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "WorkItem(tag=" + this.a + ", debouncedCount=" + this.b + ", insertTimestamp=" + this.c + ", firstDebounceTimestampForLogging=" + this.d + ", runnable=" + this.e + ")";
    }
}
