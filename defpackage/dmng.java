package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmng implements dmlz {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManagerImpl");
    public static final Duration b = eoob.d(500);
    public final Executor c;
    public final fdjx d;
    public final fdjx e;
    public final dmra f;
    public final dndk g;
    public final dolm h;
    public final dmnj i;
    public final dmmb j;
    public final fdue k;
    public final dmrt l;
    public final fdvc m;
    public final vun n;
    private final Executor o;
    private final dnzt p;
    private fdlr q;
    private fdlr r;
    private final dmnd s;

    public dmng(Executor executor, fdjx fdjxVar, fdjx fdjxVar2, Executor executor2, dmra dmraVar, dndk dndkVar, dolm dolmVar, dnzt dnztVar, dmru dmruVar, dmnj dmnjVar, dmmb dmmbVar, Optional optional) {
        executor.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        executor2.getClass();
        dmraVar.getClass();
        dndkVar.getClass();
        dolmVar.getClass();
        dmruVar.getClass();
        optional.getClass();
        this.c = executor;
        this.d = fdjxVar;
        this.e = fdjxVar2;
        this.o = executor2;
        this.f = dmraVar;
        this.g = dndkVar;
        this.h = dolmVar;
        this.p = dnztVar;
        this.i = dmnjVar;
        this.j = dmmbVar;
        this.n = (vun) fdct.b(optional);
        this.k = fdun.e(0, 0, 0, 7);
        dmrm dmrmVar = dmmbVar.f;
        this.l = dmrmVar != null ? dmruVar.a(dmrmVar) : null;
        this.m = fdtg.b(lut.a(dmraVar.d()), fdjxVar, fdur.b, null);
        this.s = new dmnd(this);
        if (dmmbVar.g.a) {
            dmraVar.i(5);
        } else {
            dmraVar.i(1);
        }
        dmraVar.u();
        dmraVar.k(executor2);
        dmraVar.g(dmmbVar.c);
        dmraVar.v();
        dmraVar.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.dmbx t(defpackage.dmbu r10) {
        /*
            r9 = this;
            dmra r0 = r9.f
            dmbx r1 = new dmbx
            azg r2 = r0.c()
            azg r3 = defpackage.azg.a
            boolean r3 = defpackage.fdbq.f(r2, r3)
            r4 = 1
            if (r3 == 0) goto L14
            r2 = 3
        L12:
            r3 = r2
            goto L1f
        L14:
            azg r3 = defpackage.azg.b
            boolean r2 = defpackage.fdbq.f(r2, r3)
            if (r2 == 0) goto L1e
            r2 = 2
            goto L12
        L1e:
            r3 = r4
        L1f:
            int r0 = r0.a()
            if (r0 != r4) goto L26
            goto L27
        L26:
            r4 = 0
        L27:
            r5 = r4
            dmrt r0 = r9.l
            r2 = 0
            if (r0 == 0) goto L44
            fduf r0 = r0.f
            java.lang.Object r0 = r0.c()
            dmrk r0 = (defpackage.dmrk) r0
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.a
            java.lang.String r4 = "no_effect"
            boolean r4 = defpackage.fdbq.f(r0, r4)
            if (r4 == 0) goto L42
            goto L44
        L42:
            r7 = r0
            goto L45
        L44:
            r7 = r2
        L45:
            r6 = 0
            r8 = 16
            r4 = 1
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmng.t(dmbu):dmbx");
    }

    private final Object u(doig doigVar, fcxy fcxyVar) {
        return fdin.a(this.e.hE(), new dmmr(this, doigVar, null), fcxyVar);
    }

    private final void v(lvj lvjVar, fdae fdaeVar) {
        dmra dmraVar = this.f;
        dmraVar.r();
        fdaeVar.invoke();
        dmraVar.e(lvjVar);
    }

    private final Object w(int i, fcxy fcxyVar) {
        Object objA;
        return (dmnj.a() && (objA = fdin.a(this.e.hE(), new dmmt(this, i, null), fcxyVar)) == fcyl.a) ? objA : fctx.a;
    }

    @Override // defpackage.dmlz
    public final Duration a() {
        return this.j.d;
    }

    @Override // defpackage.dmlz
    public final Duration b() {
        return this.j.b;
    }

    @Override // defpackage.dmlz
    public final Object c(lvj lvjVar, jfw jfwVar, fcxy fcxyVar) {
        if (jfwVar.a == null) {
            throw new IllegalArgumentException("PreviewView cannot be null during bind.");
        }
        lvjVar.P().c(this.s);
        try {
            v(lvjVar, new fdae() { // from class: dmme
                @Override // defpackage.fdae
                public final Object invoke() {
                    ekrg ekrgVar = dmng.a;
                    return fctx.a;
                }
            });
            this.f.m(jfwVar);
        } catch (IllegalStateException e) {
            Object objFO = this.k.fO(new dmlt(e), fcxyVar);
            if (objFO == fcyl.a) {
                return objFO;
            }
        }
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r8 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r8.fO(r2, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dmlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dmmg
            if (r0 == 0) goto L13
            r0 = r8
            dmmg r0 = (defpackage.dmmg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmmg r0 = new dmmg
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L3a
            if (r2 == r3) goto L36
            if (r2 != r5) goto L2e
            defpackage.fctl.b(r8)
            goto L83
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            defpackage.fctl.b(r8)
            goto L68
        L3a:
            defpackage.fctl.b(r8)
            goto L5e
        L3e:
            defpackage.fctl.b(r8)
            fdlr r8 = r7.r
            if (r8 == 0) goto L48
            defpackage.fdlp.a(r8)
        L48:
            r7.r = r6
            dnzt r8 = r7.p
            boolean r8 = r8.b()
            if (r8 == 0) goto L76
            fdue r8 = r7.k
            dmlv r2 = defpackage.dmlv.a
            r0.c = r4
            java.lang.Object r8 = r8.fO(r2, r0)
            if (r8 == r1) goto L82
        L5e:
            dnzt r8 = r7.p
            r0.c = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 == r1) goto L82
        L68:
            android.net.Uri r8 = (android.net.Uri) r8
            if (r8 == 0) goto L76
            fdjx r2 = r7.e
            dmmh r3 = new dmmh
            r3.<init>(r7, r8, r6)
            defpackage.fdil.d(r2, r6, r6, r3, r5)
        L76:
            fdue r8 = r7.k
            dmls r2 = defpackage.dmls.a
            r0.c = r5
            java.lang.Object r8 = r8.fO(r2, r0)
            if (r8 != r1) goto L83
        L82:
            return r1
        L83:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmng.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0192, code lost:
    
        if (r11.fO(r2, r0) != r1) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0181 A[PHI: r12
      0x0181: PHI (r12v32 java.lang.Object) = (r12v29 java.lang.Object), (r12v1 java.lang.Object) binds: [B:61:0x017f, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:21:0x0057, B:77:0x01b6, B:69:0x019b, B:71:0x019f, B:74:0x01a4, B:75:0x01a5, B:37:0x00a1, B:50:0x00eb, B:47:0x00d4), top: B:93:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b6 A[Catch: all -> 0x00a5, PHI: r2 r11
      0x01b6: PHI (r2v22 fdci) = (r2v13 fdci), (r2v24 fdci) binds: [B:76:0x01b4, B:21:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r11v36 'e' java.lang.Exception) = (r11v24 'e' java.lang.Exception), (r11v41 'e' java.lang.Exception) binds: [B:76:0x01b4, B:21:0x0057] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00a5, blocks: (B:21:0x0057, B:77:0x01b6, B:69:0x019b, B:71:0x019f, B:74:0x01a4, B:75:0x01a5, B:37:0x00a1, B:50:0x00eb, B:47:0x00d4), top: B:93:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /* JADX WARN: Type inference failed for: r11v42, types: [fdci] */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // defpackage.dmlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dmbu r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmng.e(dmbu, fcxy):java.lang.Object");
    }

    @Override // defpackage.dmlz
    public final Object f(Uri uri, fcxy fcxyVar) {
        Object objA = fdin.a(this.e.hE(), new dmmq(this, uri, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dmlz
    public final Object g(dmrk dmrkVar, fcxy fcxyVar) {
        Object objA;
        dmrt dmrtVar = this.l;
        return (dmrtVar == null || (objA = dmrtVar.a(dmrkVar, new dmmu(this), fcxyVar)) != fcyl.a) ? fctx.a : objA;
    }

    @Override // defpackage.dmlz
    public final Object h(dmbu dmbuVar, fcxy fcxyVar) throws Throwable {
        fdlr fdlrVar = this.r;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        Object objS = s(dmbuVar, fcxyVar);
        return objS == fcyl.a ? objS : fctx.a;
    }

    @Override // defpackage.dmlz
    public final fduj i() {
        return new fdug(this.k);
    }

    @Override // defpackage.dmlz
    public final fdvc j() {
        fdvc fdvcVar;
        dmrt dmrtVar = this.l;
        return (dmrtVar == null || (fdvcVar = dmrtVar.n) == null) ? fdvf.a(new dmrw(null)) : fdvcVar;
    }

    @Override // defpackage.dmlz
    public final fdvc k() {
        return this.m;
    }

    @Override // defpackage.dmlz
    public final void l(lvj lvjVar, final azg azgVar) {
        if (this.f.s(azgVar)) {
            v(lvjVar, new fdae() { // from class: dmmf
                @Override // defpackage.fdae
                public final Object invoke() {
                    this.a.f.g(azgVar);
                    return fctx.a;
                }
            });
        } else {
            ((ekrd) a.j().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManagerImpl", "setCamera", BasePaymentResult.ERROR_REQUEST_FAILED, "CameraManagerImpl.kt")).t("Attempted to set camera to CameraSelector: %s when this camera does not exist on this device.", azgVar);
        }
    }

    @Override // defpackage.dmlz
    public final void m(lvj lvjVar, final int i) {
        if (this.j.g.a) {
            return;
        }
        v(lvjVar, new fdae() { // from class: dmmd
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.f.i(i);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.dmlz
    public final void n(int i) {
        this.f.j(i);
    }

    @Override // defpackage.dmlz
    public final void o(float f) {
        this.f.x(f);
    }

    @Override // defpackage.dmlz
    public final void p(lvj lvjVar) {
        azg azgVarC = this.f.c();
        azg azgVar = azg.a;
        if (fdbq.f(azgVarC, azgVar)) {
            azgVar = azg.b;
        } else if (!fdbq.f(azgVarC, azg.b)) {
            azgVar = null;
        }
        if (azgVar != null) {
            l(lvjVar, azgVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.dmlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.dmbu r19, defpackage.dnzg r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmng.q(dmbu, dnzg, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (w(4, r2) != r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        if (defpackage.eooa.a(r9, r2) != r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dmlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.dmbu r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmng.r(dmbu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r10.fO(r11, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r10.fO(r2, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.dmbu r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmng.s(dmbu, fcxy):java.lang.Object");
    }
}
