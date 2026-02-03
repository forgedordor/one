package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqcs {
    public static final eqcs a = new eqcs(eqcp.q, eqcr.a);
    public final eqcp b;
    public final eqcr c;

    public eqcs(eqcp eqcpVar, eqcr eqcrVar) {
        eqcpVar.getClass();
        eqcrVar.getClass();
        this.b = eqcpVar;
        this.c = eqcrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqcs)) {
            return false;
        }
        eqcs eqcsVar = (eqcs) obj;
        return this.b == eqcsVar.b && this.c == eqcsVar.c;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TachygramErrorReason(tachygramError=" + this.b + ", recoveryType=" + this.c + ")";
    }
}
