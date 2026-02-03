package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbtm extends eqfu {
    public final String a;
    public final eyya b;

    public cbtm(String str, eyya eyyaVar) {
        this.a = str;
        this.b = eyyaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbtm)) {
            return false;
        }
        cbtm cbtmVar = (cbtm) obj;
        return fdbq.f(this.a, cbtmVar.a) && fdbq.f(this.b, cbtmVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "E2eeOpaqueData(messageId=" + this.a + ", serverMlsControlMessage=" + this.b + ")";
    }
}
