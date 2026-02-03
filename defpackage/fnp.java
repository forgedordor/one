package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnp {
    public final long a;
    public final long b;

    public fnp(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnp)) {
            return false;
        }
        long j = this.a;
        fnp fnpVar = (fnp) obj;
        long j2 = fnpVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, fnpVar.b);
    }

    public final int hashCode() {
        long j = ije.a;
        return (fctr.a(this.a) * 31) + fctr.a(this.b);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) ije.g(this.a)) + ", selectionBackgroundColor=" + ((Object) ije.g(this.b)) + ')';
    }
}
