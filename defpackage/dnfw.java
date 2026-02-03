package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnfw extends dnft {
    public final String a;
    private final dnce b;
    private final Instant c;

    public dnfw(dnce dnceVar, Instant instant, String str) {
        this.b = dnceVar;
        this.c = instant;
        this.a = str;
    }

    @Override // defpackage.dnft
    public final dnce a() {
        return this.b;
    }

    @Override // defpackage.dnft
    public final Instant b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnfw)) {
            return false;
        }
        dnfw dnfwVar = (dnfw) obj;
        return fdbq.f(this.b, dnfwVar.b) && fdbq.f(this.c, dnfwVar.c) && fdbq.f(this.a, dnfwVar.a);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        String str = this.a;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UsageMetadata(context=" + this.b + ", time=" + this.c + ", searchTerm=" + this.a + ")";
    }
}
