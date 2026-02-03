package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxv extends gxw {
    public final ibx a;
    public final ibx b;
    private final boolean c;

    public gxv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxv)) {
            return false;
        }
        gxv gxvVar = (gxv) obj;
        boolean z = gxvVar.c;
        return fdbq.f(this.a, gxvVar.a) && fdbq.f(this.b, gxvVar.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 38347) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
    }

    public /* synthetic */ gxv(byte[] bArr) {
        ibx ibxVar = ibw.j;
        this.c = false;
        this.a = ibxVar;
        this.b = ibxVar;
    }
}
