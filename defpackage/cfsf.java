package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsf {
    public final cfse a;
    public final ezol b;
    public final fbrg c;

    public cfsf(cfse cfseVar, ezol ezolVar, fbrg fbrgVar) {
        this.a = cfseVar;
        this.b = ezolVar;
        this.c = fbrgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cfsf)) {
            return false;
        }
        cfsf cfsfVar = (cfsf) obj;
        return fdbq.f(this.a, cfsfVar.a) && fdbq.f(this.b, cfsfVar.b) && fdbq.f(this.c.toString(), cfsfVar.c.toString());
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ProxyMetadata(channelConfiguration=" + this.a + ", receiverIdentity=" + this.b + ", headers=" + this.c + ")";
    }
}
