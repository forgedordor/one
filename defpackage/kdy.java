package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdy {
    public static final kdy a = new kdy(false, 0, true, 1, 1, kfu.a);
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final kfu g;
    private final keo h = null;

    public /* synthetic */ kdy(boolean z, int i, boolean z2, int i2, int i3, kfu kfuVar) {
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = i2;
        this.f = i3;
        this.g = kfuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdy)) {
            return false;
        }
        kdy kdyVar = (kdy) obj;
        if (this.b != kdyVar.b || !kec.b(this.c, kdyVar.c) || this.d != kdyVar.d || !ked.b(this.e, kdyVar.e) || !kdw.b(this.f, kdyVar.f)) {
            return false;
        }
        keo keoVar = kdyVar.h;
        return fdbq.f(null, null) && fdbq.f(this.g, kdyVar.g);
    }

    public final int hashCode() {
        return (((((((((kdx.a(this.b) * 31) + this.c) * 31) + kdx.a(this.d)) * 31) + this.e) * 31) + this.f) * 961) + this.g.hashCode();
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.b + ", capitalization=" + ((Object) kec.a(this.c)) + ", autoCorrect=" + this.d + ", keyboardType=" + ((Object) ked.a(this.e)) + ", imeAction=" + ((Object) kdw.a(this.f)) + ", platformImeOptions=null, hintLocales=" + this.g + ')';
    }
}
