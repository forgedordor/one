package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqee {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final eqcz d;

    public eqee() {
        this(null, null, null, null, 15);
    }

    public final boolean a() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqee)) {
            return false;
        }
        eqee eqeeVar = (eqee) obj;
        return fdbq.f(this.a, eqeeVar.a) && fdbq.f(this.b, eqeeVar.b) && fdbq.f(this.c, eqeeVar.c) && fdbq.f(this.d, eqeeVar.d);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        eqcz eqczVar = this.d;
        return (iHashCode * 31) + (eqczVar == null ? 0 : eqczVar.hashCode());
    }

    public final String toString() {
        return "GroupPropertiesUpdate(name=" + this.a + ", icon=" + this.b + ", inviteLink=" + this.c + ", traceId=" + this.d + ")";
    }

    public /* synthetic */ eqee(Optional optional, Optional optional2, Optional optional3, eqcz eqczVar, int i) {
        optional = (i & 1) != 0 ? Optional.empty() : optional;
        optional2 = (i & 2) != 0 ? Optional.empty() : optional2;
        optional3 = (i & 4) != 0 ? Optional.empty() : optional3;
        eqczVar = (i & 8) != 0 ? null : eqczVar;
        optional.getClass();
        optional2.getClass();
        optional3.getClass();
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = eqczVar;
    }
}
