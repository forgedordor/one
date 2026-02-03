package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chcp {
    public final axcm a;
    public final awpx b;

    public chcp(axcm axcmVar, awpx awpxVar) {
        axcmVar.getClass();
        awpxVar.getClass();
        this.a = axcmVar;
        this.b = awpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chcp)) {
            return false;
        }
        chcp chcpVar = (chcp) obj;
        return fdbq.f(this.a, chcpVar.a) && fdbq.f(this.b, chcpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Context(myIdentityToken=" + this.a + ", groupToken=" + this.b + ")";
    }
}
