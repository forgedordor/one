package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbue {
    public final evvp a;
    public final evvp b;

    public cbue(evvp evvpVar, evvp evvpVar2) {
        this.a = evvpVar;
        this.b = evvpVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbue)) {
            return false;
        }
        cbue cbueVar = (cbue) obj;
        return fdbq.f(this.a, cbueVar.a) && fdbq.f(this.b, cbueVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CertificateMetadata(notBefore=" + this.a + ", notAfter=" + this.b + ")";
    }
}
