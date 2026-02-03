package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkxn implements dkxl {
    public final long a;
    public final List b;
    private final ixk c;
    private final ixk d;
    private final ixk e;
    private final ixk f;
    private final ixk g;
    private final ixk h;

    public dkxn(long j, ixk ixkVar, ixk ixkVar2, ixk ixkVar3, ixk ixkVar4, ixk ixkVar5, ixk ixkVar6, List list) {
        ixkVar.getClass();
        ixkVar2.getClass();
        ixkVar3.getClass();
        ixkVar4.getClass();
        ixkVar5.getClass();
        ixkVar6.getClass();
        this.a = j;
        this.c = ixkVar;
        this.d = ixkVar2;
        this.e = ixkVar3;
        this.f = ixkVar4;
        this.g = ixkVar5;
        this.h = ixkVar6;
        this.b = list;
    }

    @Override // defpackage.dkxl
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dkxl
    public final ixk b() {
        return this.h;
    }

    @Override // defpackage.dkxl
    public final ixk c() {
        return this.f;
    }

    @Override // defpackage.dkxl
    public final ixk d() {
        return this.g;
    }

    @Override // defpackage.dkxl
    public final ixk e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkxn)) {
            return false;
        }
        dkxn dkxnVar = (dkxn) obj;
        return kil.g(this.a, dkxnVar.a) && fdbq.f(this.c, dkxnVar.c) && fdbq.f(this.d, dkxnVar.d) && fdbq.f(this.e, dkxnVar.e) && fdbq.f(this.f, dkxnVar.f) && fdbq.f(this.g, dkxnVar.g) && fdbq.f(this.h, dkxnVar.h) && fdbq.f(this.b, dkxnVar.b);
    }

    @Override // defpackage.dkxl
    public final ixk f() {
        return this.d;
    }

    @Override // defpackage.dkxl
    public final ixk g() {
        return this.e;
    }

    public final int hashCode() {
        return (((((((((((((kij.a(this.a) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RichCardTextMeasurablesOriginal(constraints=" + kil.e(this.a) + ", spacer=" + this.c + ", title=" + this.d + ", titleMore=" + this.e + ", desc=" + this.f + ", descMore=" + this.g + ", bottomSpacer=" + this.h + ", actions=" + this.b + ")";
    }
}
