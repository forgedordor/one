package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbti {
    public final evqs a;
    public final cbtf b;

    public cbti(evqs evqsVar, cbtf cbtfVar) {
        this.a = evqsVar;
        this.b = cbtfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbti)) {
            return false;
        }
        cbti cbtiVar = (cbti) obj;
        return fdbq.f(this.a, cbtiVar.a) && fdbq.f(this.b, cbtiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EncryptedBytes(bytes=" + this.a + ", metadata=" + this.b + ")";
    }
}
