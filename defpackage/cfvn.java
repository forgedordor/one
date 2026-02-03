package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfvn {
    public final ezkl a;
    public final cfse b;
    public final fbrg c;

    public cfvn(ezkl ezklVar, cfse cfseVar, fbrg fbrgVar) {
        this.a = ezklVar;
        this.b = cfseVar;
        this.c = fbrgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfvn)) {
            return false;
        }
        cfvn cfvnVar = (cfvn) obj;
        return fdbq.f(this.a, cfvnVar.a) && fdbq.f(this.b, cfvnVar.b) && fdbq.f(this.c, cfvnVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TachyonPersistentChannelConnectionRequest(receiveMessagesRequest=" + this.a + ", channelConfig=" + this.b + ", headers=" + this.c + ")";
    }
}
