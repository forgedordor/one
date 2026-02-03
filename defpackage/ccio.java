package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccio {
    public final evqs a;
    public final evqs b;

    public ccio(evqs evqsVar, evqs evqsVar2) {
        this.a = evqsVar;
        this.b = evqsVar2;
    }

    public final boolean a() {
        return this.a.H() || this.b.H();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccio)) {
            return false;
        }
        ccio ccioVar = (ccio) obj;
        return fdbq.f(this.a, ccioVar.a) && fdbq.f(this.b, ccioVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SignatureKeyPair(publicKey=" + this.a + ", privateKey=" + this.b + ")";
    }
}
