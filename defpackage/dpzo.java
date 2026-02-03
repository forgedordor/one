package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzo {
    public final dpzk a;
    public final Duration b;
    public final long c;
    public final jyq d;

    public dpzo(dpzk dpzkVar, Duration duration, long j, jyq jyqVar) {
        jyqVar.getClass();
        this.a = dpzkVar;
        this.b = duration;
        this.c = j;
        this.d = jyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpzo)) {
            return false;
        }
        dpzo dpzoVar = (dpzo) obj;
        if (!fdbq.f(this.a, dpzoVar.a) || !fdbq.f(this.b, dpzoVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = dpzoVar.c;
        long j3 = ije.a;
        return fcts.a(j, j2) && fdbq.f(this.d, dpzoVar.d);
    }

    public final int hashCode() {
        dpzk dpzkVar = this.a;
        int iHashCode = ((dpzkVar == null ? 0 : dpzkVar.hashCode()) * 31) + this.b.hashCode();
        long j = this.c;
        long j2 = ije.a;
        return (((iHashCode * 31) + fctr.a(j)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TimerData(dotData=" + this.a + ", time=" + this.b + ", textColor=" + ije.g(this.c) + ", textStyle=" + this.d + ")";
    }

    public /* synthetic */ dpzo(Duration duration, long j, jyq jyqVar) {
        this(null, duration, j, jyqVar);
    }
}
