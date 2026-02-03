package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bch extends bdr {
    public static final /* synthetic */ int d = 0;
    private static final Executor e;
    bmd a;
    public btv b;
    bdp c;
    private bcg f;
    private Executor g;
    private bjz h;
    private bug i;
    private bme t;

    static {
        blr blrVar = bcf.a;
        e = bpn.a();
    }

    public bch(blr blrVar) {
        super(blrVar);
        this.g = e;
    }

    private final void c() {
        bme bmeVar = this.t;
        if (bmeVar != null) {
            bmeVar.b();
            this.t = null;
        }
        bjz bjzVar = this.h;
        if (bjzVar != null) {
            bjzVar.d();
            this.h = null;
        }
        bug bugVar = this.i;
        if (bugVar != null) {
            bugVar.c();
            this.i = null;
        }
        btv btvVar = this.b;
        if (btvVar != null) {
            btvVar.g();
            this.b = null;
        }
        this.c = null;
    }

    private final void h() {
        biu biuVarF = F();
        btv btvVar = this.b;
        if (biuVarF == null || btvVar == null) {
            return;
        }
        btvVar.k(B(biuVarF, U(biuVarF)), x());
    }

    public final void a(bcg bcgVar) {
        Executor executor = e;
        box.b();
        if (bcgVar == null) {
            this.f = null;
            this.s = 2;
            M();
        } else {
            this.f = bcgVar;
            this.g = executor;
            if (D() != null) {
                b((blr) this.l, this.m);
                L();
            }
            K();
        }
    }

    @Override // defpackage.bdr
    public final Set ag() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public final void b(blr blrVar, bms bmsVar) {
        box.b();
        final biu biuVarF = F();
        biuVarF.getClass();
        c();
        lcg.c(this.b == null);
        Matrix matrix = this.o;
        boolean zH = biuVarF.H();
        Size sizeD = bmsVar.d();
        Rect rect = this.n;
        if (rect == null) {
            rect = sizeD != null ? new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight()) : null;
        }
        Rect rect2 = rect;
        rect2.getClass();
        this.b = new btv(1, 34, bmsVar, matrix, zH, rect2, B(biuVarF, U(biuVarF)), x(), biuVarF.H() && U(biuVarF));
        ayy ayyVar = this.p;
        if (ayyVar != null) {
            this.i = new bug(biuVarF, new buj(ayyVar));
            this.b.e(new Runnable() { // from class: bcb
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.L();
                }
            });
            buy buyVarI = buy.i(this.b);
            btv btvVar = (btv) this.i.a(new bsh(this.b, Collections.singletonList(buyVarI))).get(buyVarI);
            btvVar.getClass();
            btvVar.e(new Runnable() { // from class: bcc
                @Override // java.lang.Runnable
                public final void run() {
                    bch bchVar = this.a;
                    btv btvVar2 = bchVar.b;
                    box.b();
                    if (biuVarF == bchVar.F()) {
                        btvVar2.i();
                    }
                }
            });
            this.c = btvVar.a(biuVarF);
            this.h = this.b.c();
        } else {
            this.b.e(new Runnable() { // from class: bcb
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.L();
                }
            });
            bdp bdpVarA = this.b.a(biuVarF);
            this.c = bdpVarA;
            this.h = bdpVarA.j;
        }
        if (this.f != null) {
            h();
            final bcg bcgVar = this.f;
            lcg.i(bcgVar);
            final bdp bdpVar = this.c;
            lcg.i(bdpVar);
            this.g.execute(new Runnable() { // from class: bca
                @Override // java.lang.Runnable
                public final void run() {
                    int i = bch.d;
                    bcgVar.a(bdpVar);
                }
            });
        }
        bmd bmdVarA = bmd.a(blrVar, bmsVar.d());
        bmdVarA.h = bmsVar.a();
        J(bmdVarA, bmsVar);
        bmdVarA.s(bnf.a(blrVar));
        if (bmsVar.f() != null) {
            bmdVarA.h(bmsVar.f());
        }
        if (this.f != null) {
            bmdVarA.n(this.h, bmsVar.e(), z());
        }
        bme bmeVar = this.t;
        if (bmeVar != null) {
            bmeVar.b();
        }
        bme bmeVar2 = new bme(new bmf() { // from class: bcd
            @Override // defpackage.bmf
            public final void a(bml bmlVar) {
                bch bchVar = this.a;
                if (bchVar.F() == null) {
                    return;
                }
                bchVar.b((blr) bchVar.l, bchVar.m);
                bchVar.L();
            }
        });
        this.t = bmeVar2;
        bmdVarA.f = bmeVar2;
        this.a = bmdVarA;
        R(bbz.a(bmdVarA.b()));
    }

    @Override // defpackage.bdr
    public final bms d(bjq bjqVar) {
        this.a.h(bjqVar);
        R(bbz.a(this.a.b()));
        bmr bmrVarG = this.m.g();
        ((bhn) bmrVarG).b = bjqVar;
        return bmrVarG.a();
    }

    @Override // defpackage.bdr
    public final bnh e(bjq bjqVar) {
        return bce.a(bjqVar);
    }

    @Override // defpackage.bdr
    public final bni f(boolean z, bnm bnmVar) {
        blr blrVar = bcf.a;
        bjq bjqVarA = bnmVar.a(bnf.g(blrVar), 1);
        if (z) {
            bjqVarA = bjn.a(bjqVarA, blrVar);
        }
        if (bjqVarA == null) {
            return null;
        }
        return bce.a(bjqVarA).c();
    }

    @Override // defpackage.bdr
    protected final bni g(bir birVar, bnh bnhVar) {
        bnhVar.f().c(bkr.D, 34);
        return bnhVar.c();
    }

    @Override // defpackage.bdr
    public final void j() {
        c();
    }

    @Override // defpackage.bdr
    public final void l(Rect rect) {
        this.n = rect;
        h();
    }

    @Override // defpackage.bdr
    protected final void p(bms bmsVar, bms bmsVar2) {
        bbs.a("Preview", a.i(null, bmsVar, "onSuggestedStreamSpecUpdated: primaryStreamSpec = ", ", secondaryStreamSpec "));
        b((blr) this.l, bmsVar);
    }

    public final String toString() {
        return "Preview:".concat(I());
    }
}
