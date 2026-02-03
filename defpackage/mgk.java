package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgk implements mbs {
    public final long a;
    public final long b;
    public final long c;

    public mgk(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ mau a() {
        return null;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgk)) {
            return false;
        }
        mgk mgkVar = (mgk) obj;
        return this.a == mgkVar.a && this.b == mgkVar.b && this.c == mgkVar.c;
    }

    public final int hashCode() {
        return ((((eone.a(this.a) + 527) * 31) + eone.a(this.b)) * 31) + eone.a(this.c);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ void b(mbq mbqVar) {
    }
}
