package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fij {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final jyi f;

    public fij(long j, int i, int i2, int i3, int i4, jyi jyiVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = jyiVar;
    }

    public final int a() {
        return d().length();
    }

    public final fik b(int i) {
        return new fik(fkc.b(this.f, i), i, this.a);
    }

    public final fil c(int i, int i2) {
        return new fil(b(i), b(i2), i > i2);
    }

    public final String d() {
        return this.f.a.a.b;
    }

    public final boolean e(fij fijVar) {
        return (this.a == fijVar.a && this.c == fijVar.c && this.d == fijVar.d) ? false : true;
    }

    public final int f() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append('-');
        jyi jyiVar = this.f;
        sb.append((Object) khj.a(fkc.b(jyiVar, i)));
        sb.append(',');
        int i2 = this.d;
        sb.append(i2);
        sb.append('-');
        sb.append((Object) khj.a(fkc.b(jyiVar, i2)));
        sb.append("), prevOffset=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
