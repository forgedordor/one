package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkxm implements dkxl {
    public final long a;
    public final ixk b;
    public final float c;
    public final float d;
    public final int e;
    private final ixk f;
    private final ixk g;
    private final ixk h;
    private final ixk i;
    private final ixk j;
    private final ixk k;

    public dkxm(long j, ixk ixkVar, ixk ixkVar2, ixk ixkVar3, ixk ixkVar4, ixk ixkVar5, ixk ixkVar6, ixk ixkVar7, float f, float f2, int i) {
        ixkVar.getClass();
        ixkVar2.getClass();
        ixkVar3.getClass();
        ixkVar4.getClass();
        ixkVar5.getClass();
        ixkVar6.getClass();
        ixkVar7.getClass();
        this.a = j;
        this.f = ixkVar;
        this.g = ixkVar2;
        this.h = ixkVar3;
        this.i = ixkVar4;
        this.j = ixkVar5;
        this.k = ixkVar6;
        this.b = ixkVar7;
        this.c = f;
        this.d = f2;
        this.e = i;
    }

    @Override // defpackage.dkxl
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dkxl
    public final ixk b() {
        return this.k;
    }

    @Override // defpackage.dkxl
    public final ixk c() {
        return this.i;
    }

    @Override // defpackage.dkxl
    public final ixk d() {
        return this.j;
    }

    @Override // defpackage.dkxl
    public final ixk e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkxm)) {
            return false;
        }
        dkxm dkxmVar = (dkxm) obj;
        return kil.g(this.a, dkxmVar.a) && fdbq.f(this.f, dkxmVar.f) && fdbq.f(this.g, dkxmVar.g) && fdbq.f(this.h, dkxmVar.h) && fdbq.f(this.i, dkxmVar.i) && fdbq.f(this.j, dkxmVar.j) && fdbq.f(this.k, dkxmVar.k) && fdbq.f(this.b, dkxmVar.b) && Float.compare(this.c, dkxmVar.c) == 0 && Float.compare(this.d, dkxmVar.d) == 0 && this.e == dkxmVar.e;
    }

    @Override // defpackage.dkxl
    public final ixk f() {
        return this.g;
    }

    @Override // defpackage.dkxl
    public final ixk g() {
        return this.h;
    }

    public final int hashCode() {
        return (((((((((((((((((((kij.a(this.a) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.b.hashCode()) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + this.e;
    }

    public final String toString() {
        return "RichCardTextMeasurablesExpressive(constraints=" + kil.e(this.a) + ", spacer=" + this.f + ", title=" + this.g + ", titleMore=" + this.h + ", desc=" + this.i + ", descMore=" + this.j + ", bottomSpacer=" + this.k + ", action=" + this.b + ", actionHeight=" + this.c + ", dividerHeight=" + this.d + ", actionCount=" + this.e + ")";
    }
}
