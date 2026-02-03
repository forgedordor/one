package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cynk extends cynm {
    public final String a;
    public final Instant b;
    public final int c;
    public final int d;
    public final int e;

    public cynk(String str, Instant instant, int i, int i2, int i3) {
        str.getClass();
        this.a = str;
        this.b = instant;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cynk)) {
            return false;
        }
        cynk cynkVar = (cynk) obj;
        return fdbq.f(this.a, cynkVar.a) && fdbq.f(this.b, cynkVar.b) && this.c == cynkVar.c && this.d == cynkVar.d && this.e == cynkVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "RunningWorkerUiData(queueName=" + this.a + ", startTime=" + this.b + ", inQueue=" + this.c + ", currentlyExecuting=" + this.d + ", succeededSoFar=" + this.e + ")";
    }
}
