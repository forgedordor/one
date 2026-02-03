package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erog extends erqt {
    public final eroe a;
    public final eroc b;
    public final erod c;
    public final erof d;

    public erog(eroe eroeVar, eroc erocVar, erod erodVar, erof erofVar) {
        this.a = eroeVar;
        this.b = erocVar;
        this.c = erodVar;
        this.d = erofVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.d != erof.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof erog)) {
            return false;
        }
        erog erogVar = (erog) obj;
        return erogVar.a == this.a && erogVar.b == this.b && erogVar.c == this.c && erogVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(erog.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        return "ECDSA Parameters (variant: " + this.d.e + ", hashType: " + this.c.d + ", encoding: " + this.a.c + ", curve: " + this.b.d + ")";
    }
}
