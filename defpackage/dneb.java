package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dneb extends dnft {
    public final Object a;
    public final dnce b;
    public final Instant c;
    public final String d;

    public dneb(Object obj, dnce dnceVar, Instant instant, String str) {
        dnceVar.getClass();
        instant.getClass();
        this.a = obj;
        this.b = dnceVar;
        this.c = instant;
        this.d = str;
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
        if (!(obj instanceof dneb)) {
            return false;
        }
        dneb dnebVar = (dneb) obj;
        return fdbq.f(this.a, dnebVar.a) && fdbq.f(this.b, dnebVar.b) && fdbq.f(this.c, dnebVar.c) && fdbq.f(this.d, dnebVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = ((((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "EntityUsage(entity=" + this.a + ", context=" + this.b + ", time=" + this.c + ", searchTerm=" + this.d + ")";
    }
}
