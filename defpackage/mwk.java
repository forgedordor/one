package defpackage;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwk implements mtu {
    public final mej a;
    public final mwj b;
    public final SparseArray c;
    public mfc d;
    public mcg e;
    public mew f;
    public boolean g;
    private final mcj h;
    private final mck i;

    public mwk(mej mejVar) {
        mee.f(mejVar);
        this.a = mejVar;
        this.d = new mfc(mgb.G(), mejVar, new mfa() { // from class: mvb
            @Override // defpackage.mfa
            public final void a(Object obj, mar marVar) {
            }
        });
        mcj mcjVar = new mcj();
        this.h = mcjVar;
        this.i = new mck();
        this.b = new mwj(mcjVar);
        this.c = new SparseArray();
    }

    private final mtv K(int i, nen nenVar) {
        mee.f(this.e);
        if (nenVar != null) {
            return this.b.a(nenVar) != null ? F(nenVar) : G(mcl.a, i, nenVar);
        }
        mcl mclVarH = this.e.H();
        if (i >= mclVarH.c()) {
            mclVarH = mcl.a;
        }
        return G(mclVarH, i, null);
    }

    private final mtv L(mbz mbzVar) {
        nen nenVar;
        return (!(mbzVar instanceof mpn) || (nenVar = ((mpn) mbzVar).h) == null) ? E() : F(nenVar);
    }

    @Override // defpackage.mce
    public final void A(mcq mcqVar) {
        J(E(), 19, new mez() { // from class: mtz
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void B(mcs mcsVar) {
        J(E(), 2, new mez() { // from class: mus
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void C(final mde mdeVar) {
        J(I(), 25, new mez() { // from class: mvq
            @Override // defpackage.mez
            public final void a(Object obj) {
                mde mdeVar2 = mdeVar;
                ((mtx) obj).h(mdeVar2);
                int i = mdeVar2.b;
                int i2 = mdeVar2.c;
                float f = mdeVar2.d;
            }
        });
    }

    public final mtv E() {
        return F(this.b.c);
    }

    public final mtv F(nen nenVar) {
        mee.f(this.e);
        mcl mclVarA = nenVar == null ? null : this.b.a(nenVar);
        if (nenVar != null && mclVarA != null) {
            return G(mclVarA, mclVarA.o(nenVar.a, this.h).c, nenVar);
        }
        int iAE = this.e.aE();
        mcl mclVarH = this.e.H();
        if (iAE >= mclVarH.c()) {
            mclVarH = mcl.a;
        }
        return G(mclVarH, iAE, null);
    }

    protected final mtv G(mcl mclVar, int i, nen nenVar) {
        nen nenVar2 = true == mclVar.q() ? null : nenVar;
        long jA = this.a.a();
        boolean z = mclVar.equals(this.e.H()) && i == this.e.aE();
        long jA2 = 0;
        if (nenVar2 == null || !nenVar2.b()) {
            if (z) {
                jA2 = this.e.x();
            } else if (!mclVar.q()) {
                jA2 = mclVar.p(i, this.i).a();
            }
        } else if (z && this.e.aC() == nenVar2.b && this.e.aD() == nenVar2.c) {
            jA2 = this.e.y();
        }
        nen nenVar3 = this.b.c;
        mcl mclVarH = this.e.H();
        int iAE = this.e.aE();
        long jY = this.e.y();
        mrn mrnVar = (mrn) this.e;
        mrnVar.ap();
        return new mtv(jA, mclVar, i, nenVar2, jA2, mclVarH, iAE, nenVar3, jY, mgb.B(mrnVar.C.s));
    }

    public final mtv H() {
        return F(this.b.d);
    }

    public final mtv I() {
        return F(this.b.e);
    }

    public final void J(mtv mtvVar, int i, mez mezVar) {
        this.c.put(i, mtvVar);
        this.d.f(i, mezVar);
    }

    @Override // defpackage.mce
    public final void a(mac macVar) {
        J(I(), 20, new mez() { // from class: muo
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void b(int i) {
        J(I(), 21, new mez() { // from class: mvp
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void c(mcc mccVar) {
        J(E(), 13, new mez() { // from class: mue
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void d(mdw mdwVar) {
        J(E(), 27, new mez() { // from class: mvv
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void e(List list) {
        J(E(), 27, new mez() { // from class: mva
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.ney
    public final void eB(int i, nen nenVar, final nej nejVar) {
        final mtv mtvVarK = K(i, nenVar);
        J(mtvVarK, 1004, new mez() { // from class: mvc
            @Override // defpackage.mez
            public final void a(Object obj) {
                ((mtx) obj).a(mtvVarK, nejVar);
            }
        });
    }

    @Override // defpackage.ney
    public final void eC(int i, nen nenVar, nee neeVar, nej nejVar) {
        J(K(i, nenVar), 1002, new mez() { // from class: mve
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.ney
    public final void eD(int i, nen nenVar, nee neeVar, nej nejVar) {
        J(K(i, nenVar), 1001, new mez() { // from class: mvk
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.ney
    public final void eE(int i, nen nenVar, nee neeVar, final nej nejVar, IOException iOException, final boolean z) {
        J(K(i, nenVar), 1003, new mez() { // from class: mul
            @Override // defpackage.mez
            public final void a(Object obj) {
                ((mtx) obj).i(z);
            }
        });
    }

    @Override // defpackage.ney
    public final void eF(int i, nen nenVar, nee neeVar, nej nejVar, int i2) {
        J(K(i, nenVar), 1000, new mez() { // from class: mwi
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.nal
    public final void eG(int i, nen nenVar) {
        J(K(i, nenVar), 1023, new mez() { // from class: mwb
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.nal
    public final void eH(int i, nen nenVar) {
        J(K(i, nenVar), 1025, new mez() { // from class: mvo
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.nal
    public final void eI(int i, nen nenVar, int i2) {
        J(K(i, nenVar), 1022, new mez() { // from class: mvi
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.nal
    public final void eJ(int i, nen nenVar, Exception exc) {
        J(K(i, nenVar), 1024, new mez() { // from class: mvj
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.nal
    public final void eK(int i, nen nenVar) {
        J(K(i, nenVar), 1027, new mez() { // from class: mwd
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void f(boolean z) {
        J(E(), 3, new mez() { // from class: muc
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void g(final boolean z) {
        final mtv mtvVarE = E();
        J(mtvVarE, 7, new mez() { // from class: mur
            @Override // defpackage.mez
            public final void a(Object obj) {
                ((mtx) obj).c(mtvVarE, z);
            }
        });
    }

    @Override // defpackage.mce
    public final void i(mbo mboVar, int i) {
        J(E(), 1, new mez() { // from class: mug
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void j(mbr mbrVar) {
        J(E(), 14, new mez() { // from class: mwf
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void k(mbt mbtVar) {
        J(E(), 28, new mez() { // from class: mup
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void l(boolean z, int i) {
        J(E(), 5, new mez() { // from class: muy
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void m(mca mcaVar) {
        J(E(), 12, new mez() { // from class: mty
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void n(int i) {
        J(E(), 4, new mez() { // from class: mvh
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void o(int i) {
        J(E(), 6, new mez() { // from class: muu
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void p(final mbz mbzVar) {
        J(L(mbzVar), 10, new mez() { // from class: mvf
            @Override // defpackage.mez
            public final void a(Object obj) {
                ((mtx) obj).e(mbzVar);
            }
        });
    }

    @Override // defpackage.mce
    public final void q(mbz mbzVar) {
        J(L(mbzVar), 10, new mez() { // from class: mux
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void r(boolean z, int i) {
        J(E(), -1, new mez() { // from class: mun
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void t(mcf mcfVar, mcf mcfVar2, final int i) {
        if (i == 1) {
            this.g = false;
            i = 1;
        }
        mwj mwjVar = this.b;
        mcg mcgVar = this.e;
        mee.f(mcgVar);
        mwjVar.c = mwj.b(mcgVar, mwjVar.b, mwjVar.d, mwjVar.a);
        J(E(), 11, new mez() { // from class: mvt
            @Override // defpackage.mez
            public final void a(Object obj) {
                ((mtx) obj).f(i);
            }
        });
    }

    @Override // defpackage.mce
    public final void v(int i) {
        J(E(), 8, new mez() { // from class: mvx
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void w(boolean z) {
        J(E(), 9, new mez() { // from class: mwg
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void x(boolean z) {
        J(I(), 23, new mez() { // from class: muh
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void y(int i, int i2) {
        J(I(), 24, new mez() { // from class: mwh
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void z(mcl mclVar, int i) {
        mcg mcgVar = this.e;
        mee.f(mcgVar);
        mwj mwjVar = this.b;
        mwjVar.c = mwj.b(mcgVar, mwjVar.b, mwjVar.d, mwjVar.a);
        mwjVar.c(mcgVar.H());
        J(E(), 0, new mez() { // from class: muf
            @Override // defpackage.mez
            public final void a(Object obj) {
            }
        });
    }

    @Override // defpackage.mce
    public final void u() {
    }

    @Override // defpackage.mce
    public final void D(mcd mcdVar) {
    }

    @Override // defpackage.mce
    public final void h(boolean z) {
    }

    @Override // defpackage.mce
    public final void s(int i) {
    }
}
