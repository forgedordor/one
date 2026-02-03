package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cynj extends cynm {
    public final String a;
    public final Instant b;
    public final Instant c;
    public final int d;
    public final int e;

    public cynj(String str, Instant instant, Instant instant2, int i, int i2) {
        this.a = str;
        this.b = instant;
        this.c = instant2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cynj)) {
            return false;
        }
        cynj cynjVar = (cynj) obj;
        return fdbq.f(this.a, cynjVar.a) && fdbq.f(this.b, cynjVar.b) && fdbq.f(this.c, cynjVar.c) && this.d == cynjVar.d && this.e == cynjVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "FinishedWorkerUiData(queueName=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ", executed=" + this.d + ", outcome=" + ((Object) cbmp.a(this.e)) + ")";
    }
}
