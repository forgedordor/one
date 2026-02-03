package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyh {
    public final juo a;
    public final jyq b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final kio g;
    public final kji h;
    public final kbi i;
    public final long j;

    public jyh(juo juoVar, jyq jyqVar, List list, int i, boolean z, int i2, kio kioVar, kji kjiVar, kbi kbiVar, long j) {
        this.a = juoVar;
        this.b = jyqVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = kioVar;
        this.h = kjiVar;
        this.i = kbiVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyh)) {
            return false;
        }
        jyh jyhVar = (jyh) obj;
        return fdbq.f(this.a, jyhVar.a) && fdbq.f(this.b, jyhVar.b) && fdbq.f(this.c, jyhVar.c) && this.d == jyhVar.d && this.e == jyhVar.e && khx.a(this.f, jyhVar.f) && fdbq.f(this.g, jyhVar.g) && this.h == jyhVar.h && fdbq.f(this.i, jyhVar.i) && kil.g(this.j, jyhVar.j);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.e;
        return (((((((((((((iHashCode * 31) + this.d) * 31) + (true != z ? 1237 : 1231)) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + kij.a(this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (khx.a(i, 1) ? "Clip" : khx.a(i, 2) ? "Ellipsis" : khx.a(i, 5) ? "MiddleEllipsis" : khx.a(i, 3) ? "Visible" : khx.a(i, 4) ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) kil.e(this.j));
        sb.append(')');
        return sb.toString();
    }
}
