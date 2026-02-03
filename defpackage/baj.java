package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baj extends bdr {
    public static final /* synthetic */ int c = 0;
    bak a;
    bmd b;
    private final Object d;
    private Rect e;
    private Matrix f;
    private bjz g;
    private bme h;

    static {
        bko bkoVar = bah.a;
    }

    public baj(bko bkoVar) {
        super(bkoVar);
        this.d = new Object();
    }

    public final int a() {
        return ((bko) this.l).H();
    }

    public final int b() {
        return ((Integer) blz.c((bko) this.l, bko.b, 6)).intValue();
    }

    public final int c() {
        return ((Integer) blz.c((bko) this.l, bko.d, 1)).intValue();
    }

    @Override // defpackage.bdr
    public final bms d(bjq bjqVar) {
        this.b.h(bjqVar);
        R(bac.a(this.b.b()));
        bmr bmrVarG = this.m.g();
        ((bhn) bmrVarG).b = bjqVar;
        return bmrVarG.a();
    }

    @Override // defpackage.bdr
    public final bnh e(bjq bjqVar) {
        return bag.a(bjqVar);
    }

    @Override // defpackage.bdr
    public final bni f(boolean z, bnm bnmVar) {
        bko bkoVar = bah.a;
        bjq bjqVarA = bnmVar.a(bnf.g(bkoVar), 1);
        if (z) {
            bjqVarA = bjn.a(bjqVarA, bkoVar);
        }
        if (bjqVarA == null) {
            return null;
        }
        return bag.a(bjqVarA).c();
    }

    @Override // defpackage.bdr
    protected final bni g(bir birVar, bnh bnhVar) {
        synchronized (this.d) {
        }
        return bnhVar.c();
    }

    public final Boolean h() {
        return (Boolean) blz.c((bko) this.l, bko.e, null);
    }

    final void i() {
        box.b();
        bme bmeVar = this.h;
        if (bmeVar != null) {
            bmeVar.b();
            this.h = null;
        }
        bjz bjzVar = this.g;
        if (bjzVar != null) {
            bjzVar.d();
            this.g = null;
        }
    }

    @Override // defpackage.bdr
    public final void j() {
        i();
        synchronized (this.d) {
            bak bakVar = this.a;
            bakVar.m = false;
            bakVar.d();
            this.a = null;
        }
    }

    @Override // defpackage.bdr
    public final void k(Matrix matrix) {
        super.k(matrix);
        synchronized (this.d) {
            bak bakVar = this.a;
            if (bakVar != null) {
                bakVar.f(matrix);
            }
            this.f = matrix;
        }
    }

    @Override // defpackage.bdr
    public final void l(Rect rect) {
        this.n = rect;
        synchronized (this.d) {
            bak bakVar = this.a;
            if (bakVar != null) {
                bakVar.g(rect);
            }
            this.e = rect;
        }
    }

    public final void m() {
        synchronized (this.d) {
            biu biuVarF = F();
            if (biuVarF != null) {
                this.a.a = A(biuVarF);
            }
        }
    }

    public final boolean n() {
        return ((Boolean) blz.c((bko) this.l, bko.f, false)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.bmd o(defpackage.bko r14, defpackage.bms r15) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baj.o(bko, bms):bmd");
    }

    @Override // defpackage.bdr
    protected final void p(bms bmsVar, bms bmsVar2) {
        bbs.a("ImageAnalysis", a.i(null, bmsVar, "onSuggestedStreamSpecUpdated: primaryStreamSpec = ", ", secondaryStreamSpec "));
        bko bkoVar = (bko) this.l;
        H();
        bmd bmdVarO = o(bkoVar, bmsVar);
        this.b = bmdVarO;
        R(bac.a(bmdVarO.b()));
    }

    public final String toString() {
        return "ImageAnalysis:".concat(I());
    }
}
