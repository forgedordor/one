package defpackage;

import j$.util.Optional;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eaxi extends eaxg {
    public final eayr a;
    public final OptionalInt b;
    public final OptionalInt c;
    private final long d;
    private final ejsu e;
    private final Optional f;

    public eaxi(eayr eayrVar, long j, ejsu ejsuVar, OptionalInt optionalInt, OptionalInt optionalInt2, Optional optional) {
        this.a = eayrVar;
        this.d = j;
        this.e = ejsuVar;
        this.b = optionalInt;
        this.c = optionalInt2;
        this.f = optional;
    }

    @Override // defpackage.eaxg
    public final long a() {
        return this.d;
    }

    @Override // defpackage.eaxg
    public final eayr b() {
        return this.a;
    }

    @Override // defpackage.eaxg
    public final ejsu c() {
        return this.e;
    }

    @Override // defpackage.eaxg
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.eaxg
    public final OptionalInt e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaxg) {
            eaxg eaxgVar = (eaxg) obj;
            if (this.a.equals(eaxgVar.b()) && this.d == eaxgVar.a() && this.e.equals(eaxgVar.c()) && this.b.equals(eaxgVar.f()) && this.c.equals(eaxgVar.e()) && this.f.equals(eaxgVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eaxg
    public final OptionalInt f() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.d;
        return (((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        OptionalInt optionalInt = this.c;
        OptionalInt optionalInt2 = this.b;
        ejsu ejsuVar = this.e;
        return "AggregateData{eventVector=" + this.a.toString() + ", systemProfileHash=" + this.d + ", systemProfile=" + ejsuVar.toString() + ", minDayIndex=" + String.valueOf(optionalInt2) + ", maxDayIndex=" + String.valueOf(optionalInt) + ", aggregateValue=" + optional.toString() + "}";
    }
}
