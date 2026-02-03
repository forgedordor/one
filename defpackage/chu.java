package defpackage;

import android.content.Context;
import android.util.Range;
import android.util.Rational;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class chu {
    private static final bbd C = new chq();
    public final long A;
    public final chm B;
    private final azv D;
    private final azv E;
    private final Range F;
    private final chw G;
    private final chw H;
    private final chz I;
    public azg a;
    public int b;
    public bch c;
    public bbf d;
    public bvc e;
    public Executor f;
    public baj g;
    public cad h;
    public bzh i;
    public final Map j;
    public bxs k;
    public int l;
    public ayv m;
    public cit n;
    public bdu o;
    public bcg p;
    public final ciz q;
    public boolean r;
    public final boolean s;
    public cht t;
    public final lvy u;
    public final chz v;
    public final chz w;
    public final Set x;
    public final Context y;
    public final Map z;

    public chu(Context context) {
        bwg bwgVar = bwg.a;
        ListenableFuture listenableFutureF = bqk.f(bwf.a(context), new akv() { // from class: chn
            @Override // defpackage.akv
            public final Object a(Object obj) {
                return new ciu((bwg) obj);
            }
        }, bpc.a());
        this.a = azg.b;
        this.b = 3;
        this.i = null;
        this.j = new HashMap();
        this.k = bzf.a;
        this.l = 0;
        azv azvVar = azv.a;
        this.D = azvVar;
        this.E = azvVar;
        this.F = bms.h;
        this.r = true;
        this.s = true;
        this.G = new chw();
        this.H = new chw();
        lvy lvyVar = new lvy(new cjh(0));
        this.u = lvyVar;
        bol.a(lvyVar, new akv() { // from class: chk
            @Override // defpackage.akv
            public final Object a(Object obj) {
                return Integer.valueOf(((cjh) obj).a);
            }
        });
        this.v = new chz();
        this.w = new chz();
        this.I = new chz();
        this.x = new HashSet();
        this.z = new HashMap();
        this.A = TimeUnit.MILLISECONDS.toNanos(5000L);
        Context contextA = bnw.a(context);
        this.y = contextA;
        this.c = A();
        this.d = z(null);
        this.g = y(null, null, null);
        this.h = B();
        bqk.f(listenableFutureF, new akv() { // from class: chl
            @Override // defpackage.akv
            public final Object a(Object obj) {
                chu chuVar = this.a;
                chuVar.n = (cit) obj;
                chuVar.n();
                chuVar.l();
                return null;
            }
        }, bpn.a());
        this.q = new ciz(contextA);
        this.B = new chm(this);
    }

    private final bch A() {
        bce bceVar = new bce();
        C(bceVar, null);
        bceVar.i(this.E);
        return bceVar.b();
    }

    private final cad B() {
        final int iX;
        bxs bxsVar = bzf.a;
        bxg bxgVarE = bxh.e();
        final bxs bxsVar2 = this.k;
        lcg.j(bxsVar2, "The specified quality selector can't be null.");
        bxgVarE.e(new lbz() { // from class: byr
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                ((caw) obj).c(bxsVar2);
            }
        });
        bdu bduVar = this.o;
        if (bduVar != null && this.k == bzf.a && (iX = x(bduVar)) != -1) {
            bxgVarE.e(new lbz() { // from class: byq
                @Override // defpackage.lbz
                public final void accept(Object obj) {
                    ((caw) obj).b(iX);
                }
            });
        }
        bzz bzzVar = new bzz(new bzf(bxgVarE.a()));
        Range range = this.F;
        bli bliVar = bzzVar.a;
        bliVar.c(bni.u, range);
        bliVar.c(bku.I, Integer.valueOf(this.l));
        bzzVar.d(this.D);
        return new cad(bzzVar.c());
    }

    private final void C(bkt bktVar, bvc bvcVar) {
        bva bvaVarD;
        if (bvcVar != null) {
            bktVar.e(bvcVar);
            return;
        }
        bdu bduVar = this.o;
        if (bduVar == null || (bvaVarD = d(bduVar)) == null) {
            return;
        }
        bktVar.e(new bvc(bvaVarD, null));
    }

    private final int x(bdu bduVar) {
        int iB = bduVar == null ? 0 : bnq.b(bduVar.c);
        cit citVar = this.n;
        int iB2 = citVar == null ? 0 : citVar.b(this.a).b();
        cit citVar2 = this.n;
        int iA = bnq.a(iB, iB2, citVar2 == null || citVar2.b(this.a).a() == 1);
        Rational rational = bduVar.b;
        if (iA == 90 || iA == 270) {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        }
        if (rational.equals(new Rational(4, 3))) {
            return 0;
        }
        return rational.equals(new Rational(16, 9)) ? 1 : -1;
    }

    private final baj y(Integer num, Integer num2, Integer num3) {
        bag bagVar = new bag();
        if (num != null) {
            bli bliVar = bagVar.a;
            num.intValue();
            bliVar.c(bko.a, num);
        }
        if (num2 != null) {
            bli bliVar2 = bagVar.a;
            num2.intValue();
            bliVar2.c(bko.b, num2);
        }
        if (num3 != null) {
            bli bliVar3 = bagVar.a;
            num3.intValue();
            bliVar3.c(bko.d, num3);
        }
        C(bagVar, null);
        bko bkoVarB = bagVar.c();
        bks.d(bkoVarB);
        return new baj(bkoVarB);
    }

    private final bbf z(Integer num) {
        bax baxVar = new bax();
        if (num != null) {
            bli bliVar = baxVar.a;
            num.intValue();
            bliVar.c(bkp.a, num);
        }
        C(baxVar, this.e);
        Executor executor = this.f;
        if (executor != null) {
            baxVar.i(executor);
        }
        return baxVar.b();
    }

    public final int a() {
        box.b();
        return this.d.b();
    }

    public final int b() {
        box.b();
        return this.d.a;
    }

    public abstract ayv c();

    public final bva d(bdu bduVar) {
        int iX = x(bduVar);
        if (iX != -1) {
            return new bva(iX);
        }
        return null;
    }

    public final cjx e() {
        Map map = this.z;
        cjw cjwVar = cjw.SCREEN_FLASH_VIEW;
        if (map.get(cjwVar) != null) {
            return (cjx) map.get(cjwVar);
        }
        cjw cjwVar2 = cjw.PREVIEW_VIEW;
        if (map.get(cjwVar2) != null) {
            return (cjx) map.get(cjwVar2);
        }
        return null;
    }

    public final lvv f() {
        box.b();
        return this.G;
    }

    public final ListenableFuture g(float f) {
        box.b();
        return !r() ? this.I.a(Float.valueOf(f)) : this.m.b().j(f);
    }

    public final void h() {
        box.b();
        cit citVar = this.n;
        if (citVar != null) {
            citVar.c(this.c, this.d, this.g, this.h);
        }
        this.c.a(null);
        this.m = null;
        this.p = null;
        this.o = null;
        ciz cizVar = this.q;
        chm chmVar = this.B;
        synchronized (cizVar.a) {
            Map map = cizVar.c;
            ciy ciyVar = (ciy) map.get(chmVar);
            if (ciyVar != null) {
                ciyVar.b.set(false);
                map.remove(chmVar);
            }
            if (map.isEmpty()) {
                cizVar.b.disable();
            }
        }
    }

    public final void i(bzh bzhVar) {
        if (this.i == bzhVar) {
            this.i = null;
        }
    }

    final void j(lbz lbzVar) {
        bzh bzhVar = (bzh) this.j.remove(lbzVar);
        if (bzhVar != null) {
            i(bzhVar);
        }
    }

    public final void k(int i) {
        box.b();
        if (i == 3) {
            Integer numB = this.a.b();
            if (numB != null && numB.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            q();
            i = 3;
        }
        bbf bbfVar = this.d;
        bbs.a("ImageCapture", a.g(i, "setFlashMode: flashMode = "));
        if (i != 0 && i != 1 && i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(a.g(i, "Invalid flash mode: "));
            }
            if (bbfVar.f.a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (bbfVar.F() != null && bbfVar.a() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (bbfVar.b) {
            bbfVar.d = i;
            bbfVar.t();
        }
    }

    public final void l() {
        m(null);
    }

    public final void m(Runnable runnable) {
        try {
            this.m = c();
            if (!r()) {
                bbs.a("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.G.b(this.m.c().j());
            this.H.b(this.m.c().i());
            this.v.b(new akv() { // from class: chg
                @Override // defpackage.akv
                public final Object a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    boolean zBooleanValue = bool.booleanValue();
                    box.b();
                    chu chuVar = this.a;
                    return !chuVar.r() ? chuVar.v.a(bool) : chuVar.m.b().h(zBooleanValue);
                }
            });
            this.w.b(new akv() { // from class: chh
                @Override // defpackage.akv
                public final Object a(Object obj) {
                    Float f = (Float) obj;
                    float fFloatValue = f.floatValue();
                    box.b();
                    chu chuVar = this.a;
                    return !chuVar.r() ? chuVar.w.a(f) : chuVar.m.b().i(fFloatValue);
                }
            });
            this.I.b(new akv() { // from class: chi
                @Override // defpackage.akv
                public final Object a(Object obj) {
                    return this.a.g(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw e;
        }
    }

    public final void n() {
        if (s()) {
            this.n.c(this.c);
        }
        bch bchVarA = A();
        this.c = bchVarA;
        bcg bcgVar = this.p;
        if (bcgVar != null) {
            bchVarA.a(bcgVar);
        }
        o(Integer.valueOf(b()));
        Integer numValueOf = Integer.valueOf(this.g.a());
        Integer numValueOf2 = Integer.valueOf(this.g.b());
        Integer numValueOf3 = Integer.valueOf(this.g.c());
        box.b();
        if (s()) {
            this.n.c(this.g);
        }
        this.g = y(numValueOf, numValueOf2, numValueOf3);
        p();
    }

    public final void o(Integer num) {
        if (s()) {
            this.n.c(this.d);
        }
        int iB = this.d.b();
        this.d = z(num);
        k(iB);
    }

    public final void p() {
        if (s()) {
            this.n.c(this.h);
        }
        this.h = B();
    }

    public final void q() {
        cjx cjxVarE = e();
        if (cjxVarE == null) {
            bbs.a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.d.r(C);
        } else {
            this.d.r(null);
            bbs.a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by ".concat(String.valueOf(cjxVarE.a.name())));
        }
    }

    public final boolean r() {
        return this.m != null;
    }

    public final boolean s() {
        return this.n != null;
    }

    public final boolean t() {
        box.b();
        return v(1);
    }

    public final boolean u() {
        box.b();
        bzh bzhVar = this.i;
        return (bzhVar == null || bzhVar.a.get()) ? false : true;
    }

    public final boolean v(int i) {
        return (i & this.b) != 0;
    }

    public final boolean w() {
        box.b();
        return v(4);
    }
}
