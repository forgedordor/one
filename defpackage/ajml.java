package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajml implements ajmm {
    public final aoer a;
    public final fhaz b;
    public final anhj c;
    private final Instant d;

    public ajml(aoer aoerVar, Instant instant, fhaz fhazVar, anhj anhjVar) {
        this.a = aoerVar;
        this.d = instant;
        this.b = fhazVar;
        this.c = anhjVar;
    }

    @Override // defpackage.ajmm
    public final Instant a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajml)) {
            return false;
        }
        ajml ajmlVar = (ajml) obj;
        return fdbq.f(this.a, ajmlVar.a) && fdbq.f(this.d, ajmlVar.d) && fdbq.f(this.b, ajmlVar.b) && fdbq.f(this.c, ajmlVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AddedOptimisticReaction(selfIdentity=" + this.a + ", timestamp=" + this.d + ", traceId=" + this.b + ", reaction=" + this.c + ")";
    }
}
