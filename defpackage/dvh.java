package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvh extends duu {
    public dvi a;
    public dwm b;
    public boolean c;
    public fdau d;
    public fdau l;
    public boolean m;

    public dvh(dvi dviVar, fdap fdapVar, dwm dwmVar, boolean z, ebk ebkVar, boolean z2, fdau fdauVar, fdau fdauVar2, boolean z3) {
        super(fdapVar, z, ebkVar, dwmVar);
        this.a = dviVar;
        this.b = dwmVar;
        this.c = z2;
        this.d = fdauVar;
        this.l = fdauVar2;
        this.m = z3;
    }

    @Override // defpackage.duu
    public final Object e(fdat fdatVar, fcxy fcxyVar) {
        Object objA = this.a.a(dod.b, new dve(fdatVar, this, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.duu
    public final void h(long j) {
        if (!this.C || fdbq.f(this.d, dvc.a)) {
            return;
        }
        fdil.d(E(), null, fdjz.d, new dvf(this, j, null), 1);
    }

    @Override // defpackage.duu
    public final void i(long j) {
        if (!this.C || fdbq.f(this.l, dvc.b)) {
            return;
        }
        fdil.d(E(), null, fdjz.d, new dvg(this, j, null), 1);
    }

    @Override // defpackage.duu
    public final boolean n() {
        return this.c;
    }
}
