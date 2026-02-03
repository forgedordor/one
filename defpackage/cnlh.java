package defpackage;

import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnlh {
    public final fdjx a;
    private final fcyh b;
    private final fdjx c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final Optional h;

    public cnlh(fcyh fcyhVar, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, Optional optional) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.b = fcyhVar;
        this.c = fdjxVar;
        this.a = fdjxVar2;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = optional;
    }

    static /* synthetic */ Object i(cnlh cnlhVar, aubq aubqVar, eqfh eqfhVar, fbrg fbrgVar, eqfw eqfwVar, fcxy fcxyVar, int i) {
        if ((i & 2) != 0) {
            eqfhVar = null;
        }
        if ((i & 4) != 0) {
            fbrgVar = null;
        }
        if ((i & 8) != 0) {
            eqfwVar = null;
        }
        return cnlhVar.f(aubqVar, eqfhVar, fbrgVar, eqfwVar, fcxyVar);
    }

    public static /* synthetic */ eiju j(cnlh cnlhVar, aubq aubqVar, cmzw cmzwVar, int i) {
        if ((i & 4) != 0) {
            cmzwVar = null;
        }
        return cnlhVar.h(aubqVar, cmzwVar, null);
    }

    @fcsv
    public final cnlm a(aubq aubqVar) throws IOException {
        aubqVar.getClass();
        ecem.b();
        fcsu fcsuVar = this.e;
        return new cnlm(eqgl.a((ahkq) this.d.b(), d(aubqVar, null), ((ahkr) fcsuVar.b()).a(aubqVar), null, null, 12), this.a);
    }

    @fcsv
    public final eiju b(aubq aubqVar) {
        aubqVar.getClass();
        return auvw.c(this.a, fcyi.a, fdjz.a, new cnlc(this, aubqVar, null));
    }

    public final eiju c(aubq aubqVar, eqfh eqfhVar) {
        aubqVar.getClass();
        return auvw.c(this.a, fcyi.a, fdjz.a, new cnld(this, aubqVar, eqfhVar, null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [cnky, java.lang.Object] */
    public final eqfy d(aubq aubqVar, fbrg fbrgVar) throws IOException {
        cepu cepuVar = (cepu) this.g.b();
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        if (aubpVarB != aubp.PHONE) {
            throw new cnlb();
        }
        dggl dgglVar = (dggl) this.f.b();
        String str = aubqVar.d;
        str.getClass();
        ceog ceogVarA = cepuVar.a(dgglVar.a(str));
        Optional optional = this.h;
        optional.isPresent();
        return new eqfy(optional.get().a(ceogVarA, fbrgVar));
    }

    public final Object e(aubq aubqVar, eqfh eqfhVar, fcxy fcxyVar) {
        return i(this, aubqVar, eqfhVar, null, null, fcxyVar, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.aubq r18, defpackage.eqfh r19, defpackage.fbrg r20, defpackage.eqfw r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r22
            boolean r3 = r2 instanceof defpackage.cnlg
            if (r3 == 0) goto L19
            r3 = r2
            cnlg r3 = (defpackage.cnlg) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.d = r4
            goto L1e
        L19:
            cnlg r3 = new cnlg
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.b
            fcyl r4 = defpackage.fcyl.a
            int r5 = r3.d
            r6 = 1
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            csbh r1 = r3.f
            java.lang.Object r4 = r3.a
            aubq r3 = r3.e
            defpackage.fctl.b(r2)
            r10 = r1
            r1 = r3
            r6 = r4
            goto L66
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            defpackage.fctl.b(r2)
            fcyh r2 = r0.b
            fcyh r2 = defpackage.eicg.a(r2)
            cnlf r5 = new cnlf
            r7 = 0
            r8 = r20
            r5.<init>(r7, r0, r1, r8)
            r3.e = r1
            r7 = r19
            r3.a = r7
            r8 = r21
            csbh r8 = (defpackage.csbh) r8
            r3.f = r8
            r3.d = r6
            java.lang.Object r2 = defpackage.fdin.a(r2, r5, r3)
            if (r2 == r4) goto Lc2
            r10 = r21
            r6 = r7
        L66:
            fcsu r3 = r0.e
            r12 = r2
            eqfy r12 = (defpackage.eqfy) r12
            java.lang.Object r2 = r3.b()
            ahkr r2 = (defpackage.ahkr) r2
            eqcb r13 = r2.a(r1)
            if (r6 == 0) goto L86
            if (r10 == 0) goto L86
            fcsu r1 = r0.d
            java.lang.Object r1 = r1.b()
            ahkq r1 = (defpackage.ahkq) r1
            eqhr r1 = r1.a(r12, r13, r10, r6)
            return r1
        L86:
            if (r6 == 0) goto L9a
            fcsu r1 = r0.d
            java.lang.Object r1 = r1.b()
            r2 = r1
            ahkq r2 = (defpackage.ahkq) r2
            r5 = 0
            r7 = 4
            r3 = r12
            r4 = r13
            eqhr r1 = defpackage.eqgl.a(r2, r3, r4, r5, r6, r7)
            return r1
        L9a:
            if (r10 == 0) goto Lb0
            fcsu r1 = r0.d
            java.lang.Object r1 = r1.b()
            r7 = r1
            ahkq r7 = (defpackage.ahkq) r7
            r11 = 0
            r3 = r12
            r12 = 8
            r8 = r3
            r9 = r13
            eqhr r1 = defpackage.eqgl.a(r7, r8, r9, r10, r11, r12)
            return r1
        Lb0:
            fcsu r1 = r0.d
            java.lang.Object r1 = r1.b()
            r11 = r1
            ahkq r11 = (defpackage.ahkq) r11
            r15 = 0
            r16 = 12
            r14 = 0
            eqhr r1 = defpackage.eqgl.a(r11, r12, r13, r14, r15, r16)
            return r1
        Lc2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnlh.f(aubq, eqfh, fbrg, eqfw, fcxy):java.lang.Object");
    }

    @fcsv
    public final eiju h(aubq aubqVar, cmzw cmzwVar, eqfw eqfwVar) {
        aubqVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new cnle(cmzwVar, this, aubqVar, eqfwVar, null));
    }
}
