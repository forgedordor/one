package defpackage;

import j$.time.Instant;
import j$.time.ZoneId;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwzc {
    public final Instant a;
    private final String b;
    private final long c;
    private final cwze d;
    private final bbaj e;
    private final Map f;

    public cwzc(String str, long j, Instant instant, cwze cwzeVar, bbaj bbajVar, Map map) {
        cwzeVar.getClass();
        this.b = str;
        this.c = j;
        this.a = instant;
        this.d = cwzeVar;
        this.e = bbajVar;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwzc)) {
            return false;
        }
        cwzc cwzcVar = (cwzc) obj;
        return fdbq.f(this.b, cwzcVar.b) && this.c == cwzcVar.c && fdbq.f(this.a, cwzcVar.a) && this.d == cwzcVar.d && fdbq.f(this.e, cwzcVar.e) && fdbq.f(this.f, cwzcVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = this.c;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        String str = this.b;
        Long lValueOf = Long.valueOf(this.c);
        Instant instant = this.a;
        return fcva.aF(fcva.g(str, lValueOf, instant, instant.atZone(ZoneId.systemDefault()), this.d.name(), this.e, this.f), ", ", null, null, new fdap() { // from class: cwza
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return a.h(obj, "\"", "\"");
            }
        }, 30);
    }
}
