package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxg {
    public static final mxg a = new mxf().a();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public mxg(mxf mxfVar) {
        this.b = mxfVar.a;
        this.c = mxfVar.b;
        this.d = mxfVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mxg mxgVar = (mxg) obj;
            if (this.b == mxgVar.b && this.c == mxgVar.c && this.d == mxgVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.b;
        boolean z2 = this.c;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.d ? 1 : 0);
    }
}
