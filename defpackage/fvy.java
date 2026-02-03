package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvy {
    public final jyq a;
    public final jyq b;
    public final jyq c;
    public final jyq d;
    private final jyq e;
    private final jyq f;
    private final jyq g;
    private final jyq h;
    private final jyq i;
    private final jyq j;
    private final jyq k;
    private final jyq l;
    private final jyq m;

    public fvy(jyq jyqVar, jyq jyqVar2, jyq jyqVar3, jyq jyqVar4, jyq jyqVar5, jyq jyqVar6, jyq jyqVar7, jyq jyqVar8, jyq jyqVar9, jyq jyqVar10, jyq jyqVar11, jyq jyqVar12, jyq jyqVar13) {
        this.e = jyqVar;
        this.f = jyqVar2;
        this.g = jyqVar3;
        this.h = jyqVar4;
        this.i = jyqVar5;
        this.j = jyqVar6;
        this.a = jyqVar7;
        this.k = jyqVar8;
        this.l = jyqVar9;
        this.b = jyqVar10;
        this.c = jyqVar11;
        this.d = jyqVar12;
        this.m = jyqVar13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvy)) {
            return false;
        }
        fvy fvyVar = (fvy) obj;
        return fdbq.f(this.e, fvyVar.e) && fdbq.f(this.f, fvyVar.f) && fdbq.f(this.g, fvyVar.g) && fdbq.f(this.h, fvyVar.h) && fdbq.f(this.i, fvyVar.i) && fdbq.f(this.j, fvyVar.j) && fdbq.f(this.a, fvyVar.a) && fdbq.f(this.k, fvyVar.k) && fdbq.f(this.l, fvyVar.l) && fdbq.f(this.b, fvyVar.b) && fdbq.f(this.c, fvyVar.c) && fdbq.f(this.d, fvyVar.d) && fdbq.f(this.m, fvyVar.m);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.e.hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.a.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "Typography(h1=" + this.e + ", h2=" + this.f + ", h3=" + this.g + ", h4=" + this.h + ", h5=" + this.i + ", h6=" + this.j + ", subtitle1=" + this.a + ", subtitle2=" + this.k + ", body1=" + this.l + ", body2=" + this.b + ", button=" + this.c + ", caption=" + this.d + ", overline=" + this.m + ')';
    }
}
