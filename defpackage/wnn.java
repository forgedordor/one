package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnn {
    public final doin a;
    public final doht b;
    public final Long c;

    public wnn(doin doinVar, doht dohtVar, Long l) {
        doinVar.getClass();
        this.a = doinVar;
        this.b = dohtVar;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnn)) {
            return false;
        }
        wnn wnnVar = (wnn) obj;
        return this.a == wnnVar.a && fdbq.f(this.b, wnnVar.b) && fdbq.f(this.c, wnnVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Long l = this.c;
        return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "VariationOptions(quality=" + this.a + ", mediaCapabilities=" + this.b + ", maxAttachmentSizeBytes=" + this.c + ")";
    }
}
