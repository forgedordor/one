package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctdg implements ctcm {
    public final cmfo a;
    public final fcsu b;
    public final fcsu c;
    private final fcyh d;
    private final fdjx e;

    public ctdg(cmfo cmfoVar, fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        this.a = cmfoVar;
        this.d = fcyhVar;
        this.e = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.ctcm
    public final Object a(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new ctco(null, this), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ctcm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ctcq
            if (r0 == 0) goto L13
            r0 = r6
            ctcq r0 = (defpackage.ctcq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctcq r0 = new ctcq
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
            fcyh r6 = r5.d
            fcyh r6 = defpackage.eicg.a(r6)
            ctcp r2 = new ctcp
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctdg.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.ctcm
    public final Object c(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new ctcr(null, this), fcxyVar);
    }

    @Override // defpackage.ctcm
    public final Object d(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new ctcs(null, this), fcxyVar);
    }

    @Override // defpackage.ctcm
    public final Object e(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new ctct(null, this), fcxyVar);
    }

    @Override // defpackage.ctcm
    public final Object f(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.d), new ctcu(null, this), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ctcm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ctcw
            if (r0 == 0) goto L13
            r0 = r6
            ctcw r0 = (defpackage.ctcw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctcw r0 = new ctcw
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
            fcyh r6 = r5.d
            fcyh r6 = defpackage.eicg.a(r6)
            ctcv r2 = new ctcv
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctdg.g(fcxy):java.lang.Object");
    }

    @Override // defpackage.ctcm
    public final Object h(Instant instant, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new ctdc(null, this, instant), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.ctcm
    public final Object i(ekhx ekhxVar, Instant instant, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.d), new ctde(null, this, instant, ekhxVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.ctcm
    public final void j(efwo efwoVar, String str, ctch ctchVar, ctcj ctcjVar) {
        ctchVar.getClass();
        auvw.k(this.e, null, null, new ctcz(this, str, ctchVar, ctcjVar, efwoVar, null), 3);
    }

    @Override // defpackage.ctcm
    public final void k() {
        auvw.k(this.e, null, null, new ctdb(this, null), 3);
    }

    @Override // defpackage.egbw
    public final ListenableFuture l(egbv egbvVar) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new ctcx(this, egbvVar, null));
    }

    public final Object m(fcxy fcxyVar) {
        Object objD = this.a.d(new fdap() { // from class: ctcn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ctcl ctclVar = (ctcl) obj;
                ctclVar.getClass();
                ctck ctckVar = (ctck) ctclVar.toBuilder();
                ctckVar.copyOnWrite();
                ctcl ctclVar2 = (ctcl) ctckVar.instance;
                ctclVar2.b &= -2;
                ctclVar2.c = 0;
                evsn evsnVarBuild = ctckVar.build();
                evsnVarBuild.getClass();
                return (ctcl) evsnVarBuild;
            }
        }, fcxyVar);
        return objD == fcyl.a ? objD : fctx.a;
    }
}
