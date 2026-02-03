package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dklt {
    public final fdau a;
    public final fdat b;
    public final fdau c;

    public dklt() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dklt)) {
            return false;
        }
        dklt dkltVar = (dklt) obj;
        return fdbq.f(this.a, dkltVar.a) && fdbq.f(this.b, dkltVar.b) && fdbq.f(this.c, dkltVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        fdau fdauVar = this.c;
        return (iHashCode * 31) + (fdauVar == null ? 0 : fdauVar.hashCode());
    }

    public final String toString() {
        return "MetatextStyleData(getColor=" + this.a + ", getReadIconTint=" + this.b + ", textTruncator=" + this.c + ")";
    }

    public dklt(fdau fdauVar, fdat fdatVar, fdau fdauVar2) {
        this.a = fdauVar;
        this.b = fdatVar;
        this.c = fdauVar2;
    }

    public /* synthetic */ dklt(byte[] bArr) {
        this(dklr.a, dkls.a, null);
    }
}
