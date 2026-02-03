package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjx {
    public final ymx a;
    public final boolean b;
    public final bvdk c;
    public final zqk d;
    public final ynj e;
    public final boolean f;

    public zjx(ymx ymxVar, boolean z, bvdk bvdkVar, zqk zqkVar, ynj ynjVar, boolean z2) {
        this.a = ymxVar;
        this.b = z;
        this.c = bvdkVar;
        this.d = zqkVar;
        this.e = ynjVar;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjx)) {
            return false;
        }
        zjx zjxVar = (zjx) obj;
        return fdbq.f(this.a, zjxVar.a) && this.b == zjxVar.b && this.c == zjxVar.c && fdbq.f(this.d, zjxVar.d) && fdbq.f(this.e, zjxVar.e) && this.f == zjxVar.f;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + zjw.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        ynj ynjVar = this.e;
        return (((iHashCode * 31) + (ynjVar == null ? 0 : ynjVar.hashCode())) * 31) + zjw.a(this.f);
    }

    public final String toString() {
        return "MultiPartMessageArgs(messageWithMetadata=" + this.a + ", isGroupConversation=" + this.b + ", archiveStatus=" + this.c + ", selectionData=" + this.d + ", searchData=" + this.e + ", enableSwipeToShowTimestamps=" + this.f + ")";
    }
}
