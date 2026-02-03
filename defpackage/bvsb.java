package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvsb implements bvqv {
    public static final eksp a = eksp.c("BugleGDitto");
    public static final Map b = fcwa.g(new fcti(bvqq.ERROR_USER_CANCELED_VERIFICATION, cecq.c), new fcti(bvqq.ERROR_NOT_ME, cecq.e), new fcti(bvqq.ERROR_USER_CANCELED_VERIFICATION_FROM_DITTO, cecq.d));
    public final fdjx c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final egzh h;
    public final fcsu i;
    public final fcsu j;
    public final aprp k;
    public final fcsu l;
    public final eygg m;
    public final fdde n;
    public final AtomicBoolean o;
    private final fcyh p;
    private final fdjx q;
    private final fcsu r;
    private final fcsu s;
    private final fctc t;
    private final AtomicReference u;
    private final AtomicInteger v;
    private final AtomicReference w;

    public bvsb(fdjx fdjxVar, fcyh fcyhVar, fdjx fdjxVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, egzh egzhVar, fcsu fcsuVar5, fcsu fcsuVar6, aprp aprpVar, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, eygg eyggVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        egzhVar.getClass();
        fcsuVar6.getClass();
        aprpVar.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        eyggVar.getClass();
        this.c = fdjxVar;
        this.p = fcyhVar;
        this.q = fdjxVar2;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = egzhVar;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = aprpVar;
        this.r = fcsuVar7;
        this.s = fcsuVar8;
        this.l = fcsuVar9;
        this.m = eyggVar;
        this.t = fctd.a(new fdae() { // from class: bvqw
            @Override // defpackage.fdae
            public final Object invoke() {
                ecem.b();
                cmgk cmgkVar = (cmgk) this.a.f.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.GAIA_PAIRING_VERIFICATION_KEY);
                cmggVarC.f(bvqr.a);
                return cmgkVar.a(cmggVarC.a());
            }
        });
        this.n = fddf.a;
        this.u = new AtomicReference();
        this.v = new AtomicInteger(0);
        this.o = new AtomicBoolean(false);
        this.w = new AtomicReference();
    }

    public static final boolean r(bvqq bvqqVar) {
        return b.containsKey(bvqqVar);
    }

    @Override // defpackage.bvqv
    public final ehaw a() {
        return new bvre(this);
    }

    @Override // defpackage.bvqv
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bvqy(this, null));
    }

    @Override // defpackage.bvqv
    public final eiju c() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bvqz(this, null));
    }

    @Override // defpackage.bvqv
    public final eiju d() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bvrf(this, null));
    }

    @Override // defpackage.bvqv
    public final eiju e() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bvrg(this, null));
    }

    @Override // defpackage.bvqv
    public final eiju f() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new bvri(this, null));
    }

    @Override // defpackage.bvqv
    public final eiju g(bvqq bvqqVar) {
        bvqqVar.getClass();
        eiju eijuVarC = auvw.c(this.c, fcyi.a, fdjz.a, new bvrm(this, bvqqVar, null));
        this.h.a(eijuVarC, bvqt.a);
        return eijuVarC;
    }

    @Override // defpackage.bvqv
    public final eiju h(String str) {
        eiju eijuVarC = auvw.c(this.c, fcyi.a, fdjz.a, new bvro(this, str, null));
        this.h.a(eijuVarC, bvqt.a);
        return eijuVarC;
    }

    @Override // defpackage.bvqv
    public final void i(String str, String str2, String str3, String str4) {
        bvqg bvqgVar = (bvqg) bvqh.a.createBuilder();
        bvqgVar.getClass();
        bvqgVar.copyOnWrite();
        ((bvqh) bvqgVar.instance).b = str;
        bvqgVar.copyOnWrite();
        ((bvqh) bvqgVar.instance).c = str2;
        bvqgVar.copyOnWrite();
        ((bvqh) bvqgVar.instance).d = str3;
        bvqgVar.copyOnWrite();
        ((bvqh) bvqgVar.instance).e = str4;
        evsn evsnVarBuild = bvqgVar.build();
        evsnVarBuild.getClass();
        this.h.a(auvw.c(this.c, fcyi.a, fdjz.a, new bvrk(this, (bvqh) evsnVarBuild, null)), bvqt.a);
    }

    @Override // defpackage.bvqv
    public final void j(String str) {
        str.getClass();
        this.h.a(auvw.c(this.c, fcyi.a, fdjz.a, new bvrq(str, this, null)), bvqt.a);
    }

    @Override // defpackage.bvqv
    public final void k() {
        AtomicReference atomicReference = this.w;
        fdlr fdlrVar = (fdlr) atomicReference.get();
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        a.n().q("Start to block user interaction.");
        atomicReference.set(auvw.k(this.q, null, null, new bvrt(this, null), 3));
    }

    @Override // defpackage.bvqv
    public final eiju l(long j, int i, int i2, int i3) {
        if (i3 == 0) {
            throw null;
        }
        eiju eijuVarC = auvw.c(this.c, fcyi.a, fdjz.a, new bvrs(this, j, i, i2, i3, null));
        this.h.a(eijuVarC, bvqt.a);
        return eijuVarC;
    }

    @Override // defpackage.bvqv
    public final void m(int i, bvqo bvqoVar) {
        bvqoVar.getClass();
        auvw.c(this.c, fcyi.a, fdjz.a, new bvsa(this, i, bvqoVar, null));
    }

    public final cmfo n() {
        return (cmfo) this.t.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.bvrb
            if (r0 == 0) goto L13
            r0 = r6
            bvrb r0 = (defpackage.bvrb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bvrb r0 = new bvrb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.p
            fcyh r6 = defpackage.eicg.a(r6)
            bvra r2 = new bvra
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvsb.o(fcxy):java.lang.Object");
    }

    public final String p() {
        fdde fddeVar = this.n;
        return fddeVar.f(9) + " " + fddeVar.f(9) + " " + fddeVar.f(9);
    }

    public final void q() {
        this.v.set(0);
        this.o.set(false);
        fdlr fdlrVar = (fdlr) this.u.get();
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(final int r9, final defpackage.bvqo r10, defpackage.fcxy r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvsb.s(int, bvqo, fcxy):java.lang.Object");
    }
}
