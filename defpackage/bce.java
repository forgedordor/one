package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bce implements bnh, bkt {
    public final bli a;

    public bce() {
        this(bli.a());
    }

    static bce a(bjq bjqVar) {
        return new bce(bli.b(bjqVar));
    }

    public final bch b() {
        blr blrVarC = c();
        bks.d(blrVarC);
        return new bch(blrVarC);
    }

    @Override // defpackage.bnh
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final blr c() {
        return new blr(blo.f(this.a));
    }

    @Override // defpackage.azw
    public final bli f() {
        return this.a;
    }

    @Override // defpackage.bkt
    @Deprecated
    public final /* bridge */ /* synthetic */ void g(Size size) {
        this.a.c(bku.J, size);
    }

    @Override // defpackage.bkt
    public final /* bridge */ /* synthetic */ void h(int i) {
        bli bliVar = this.a;
        bjo bjoVar = blr.G;
        Integer numValueOf = Integer.valueOf(i);
        bliVar.c(bjoVar, numValueOf);
        bliVar.c(bku.H, numValueOf);
    }

    public final void i(azv azvVar) {
        this.a.c(bkr.o, azvVar);
    }

    @Override // defpackage.bkt
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(bvc bvcVar) {
        this.a.c(bku.N, bvcVar);
    }

    public final void k(String str) {
        this.a.c(blr.m, str);
    }

    private bce(bli bliVar) {
        this.a = bliVar;
        Class cls = (Class) bliVar.n(brm.n, null);
        if (cls != null && !cls.equals(bch.class)) {
            throw new IllegalArgumentException(a.i(cls, this, "Invalid target class configuration for ", ": "));
        }
        bliVar.c(bni.y, bnk.PREVIEW);
        bliVar.c(blr.n, bch.class);
        if (bliVar.n(blr.m, null) == null) {
            k(a.w(bch.class));
        }
        bjo bjoVar = bku.I;
        if (((Integer) bliVar.n(bjoVar, -1)).intValue() == -1) {
            bliVar.c(bjoVar, 2);
        }
    }
}
