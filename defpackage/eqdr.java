package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdr {
    public final ezol a;
    public final Optional b;

    public /* synthetic */ eqdr(ezol ezolVar, Optional optional, int i) {
        optional = (i & 2) != 0 ? Optional.empty() : optional;
        ezolVar.getClass();
        optional.getClass();
        this.a = ezolVar;
        this.b = optional;
        felm felmVar = felm.GROUP_ID;
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVar != (felmVarB == null ? felm.UNRECOGNIZED : felmVarB)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqdr)) {
            return false;
        }
        eqdr eqdrVar = (eqdr) obj;
        return fdbq.f(this.a, eqdrVar.a) && fdbq.f(this.b, eqdrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GroupId(id=" + this.a + ", conferenceUri=" + this.b + ")";
    }
}
