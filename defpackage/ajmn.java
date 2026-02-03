package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajmn implements ajmm {
    public final aoer a;
    private final Instant b;
    private final fhaz c;

    public ajmn(aoer aoerVar, Instant instant, fhaz fhazVar) {
        this.a = aoerVar;
        this.b = instant;
        this.c = fhazVar;
    }

    @Override // defpackage.ajmm
    public final Instant a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajmn)) {
            return false;
        }
        ajmn ajmnVar = (ajmn) obj;
        return fdbq.f(this.a, ajmnVar.a) && fdbq.f(this.b, ajmnVar.b) && fdbq.f(this.c, ajmnVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RemovedOptimisticReaction(selfIdentity=" + this.a + ", timestamp=" + this.b + ", traceId=" + this.c + ")";
    }
}
