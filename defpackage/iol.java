package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iol extends ipk {
    public iiy a;
    public float e;
    public iiy f;
    public float j;
    public float l;
    public boolean o;
    public ikd p;
    private ind q;
    private final ikd r;
    private final fctc s;
    public float b = 1.0f;
    public List c = ipr.a;
    public float d = 1.0f;
    public int g = 0;
    public int h = 0;
    public float i = 4.0f;
    public float k = 1.0f;
    public boolean m = true;
    public boolean n = true;

    public iol() {
        iik iikVar = new iik((byte[]) null);
        this.r = iikVar;
        this.p = iikVar;
        this.s = fctd.b(3, iok.a);
    }

    private final void c() {
        if (this.j == 0.0f && this.k == 1.0f) {
            this.p = this.r;
            return;
        }
        ikd ikdVar = this.p;
        ikd ikdVar2 = this.r;
        if (fdbq.f(ikdVar, ikdVar2)) {
            this.p = new iik((byte[]) null);
        } else {
            int iA = this.p.a();
            this.p.l();
            this.p.m(iA);
        }
        d().b(ikdVar2, false);
        float fA = d().a();
        float f = this.j;
        float f2 = this.l;
        float f3 = ((f + f2) % 1.0f) * fA;
        float f4 = ((this.k + f2) % 1.0f) * fA;
        if (f3 <= f4) {
            d().c(f3, f4, this.p);
        } else {
            d().c(f3, fA, this.p);
            d().c(0.0f, f4, this.p);
        }
    }

    private final iim d() {
        return (iim) this.s.a();
    }

    @Override // defpackage.ipk
    public final void b(imz imzVar) {
        imz imzVar2;
        ind indVar;
        if (this.m) {
            ipj.a(this.c, this.r);
            c();
        } else if (this.o) {
            c();
        }
        this.m = false;
        this.o = false;
        iiy iiyVar = this.a;
        if (iiyVar != null) {
            imzVar2 = imzVar;
            imy.m(imzVar2, this.p, iiyVar, this.b, null, 56);
        } else {
            imzVar2 = imzVar;
        }
        iiy iiyVar2 = this.f;
        if (iiyVar2 != null) {
            ind indVar2 = this.q;
            if (this.n || indVar2 == null) {
                ind indVar3 = new ind(this.e, this.i, this.g, this.h, 16);
                this.q = indVar3;
                this.n = false;
                indVar = indVar3;
            } else {
                indVar = indVar2;
            }
            imy.m(imzVar2, this.p, iiyVar2, this.d, indVar, 48);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
