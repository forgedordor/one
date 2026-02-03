package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvgr extends fcyz implements fdat {
    int a;
    final /* synthetic */ dggn b;
    final /* synthetic */ cvgs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvgr(dggn dggnVar, cvgs cvgsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dggnVar;
        this.c = cvgsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvgr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (defpackage.fdxs.c(r7, r6) == r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L45
            goto L8d
        Le:
            ekrg r7 = defpackage.cvgs.a
            ekrw r7 = r7.e()
            r1 = 261(0x105, float:3.66E-43)
            java.lang.String r3 = "RcsStatusUiAdapter.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/ui/appsettings/rcssettings/RcsStatusUiAdapter$updateRcsChatsSimLevelToggle$1"
            java.lang.String r5 = "invokeSuspend"
            ekrw r7 = r7.h(r4, r5, r1, r3)
            ekrd r7 = (defpackage.ekrd) r7
            dggn r1 = r6.b
            java.lang.String r3 = "updateRcsChatsSimLevelToggle: %s, enabled: %s"
            java.lang.String r4 = defpackage.cvgb.a(r1)
            r7.E(r3, r4, r2)
            cvgs r7 = r6.c
            fcsu r7 = r7.e
            java.lang.Object r7 = r7.b()
            cjzq r7 = (defpackage.cjzq) r7
            ckcc r3 = defpackage.ckcc.PER_SIM_TOGGLE_STATE_ENABLED
            eiju r7 = r7.f(r1, r3)
            r6.a = r2
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 == r0) goto L9f
        L45:
            cvgs r7 = r6.c
            dggn r1 = r6.b
            fcsu r3 = r7.h
            java.lang.Object r3 = r3.b()
            cebq r3 = (defpackage.cebq) r3
            dggp r4 = defpackage.dggo.a(r1)
            java.lang.String r4 = r4.a
            etsz r3 = r3.c(r4)
            boolean r4 = r3.t
            if (r4 == 0) goto L6c
            boolean r3 = r3.n
            if (r3 == 0) goto L6c
            fduf r3 = r7.k
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r3.f(r4)
        L6c:
            fcsu r3 = r7.g
            java.lang.Object r3 = r3.b()
            cvdg r3 = (defpackage.cvdg) r3
            r3.a(r1)
            fcsu r7 = r7.i
            java.lang.Object r7 = r7.b()
            cjyi r7 = (defpackage.cjyi) r7
            eiju r7 = r7.e(r1)
            r1 = 2
            r6.a = r1
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 != r0) goto L8d
            goto L9f
        L8d:
            cvgs r7 = r6.c
            fcsu r7 = r7.f
            java.lang.Object r7 = r7.b()
            chtr r7 = (defpackage.chtr) r7
            dggn r0 = r6.b
            r7.j(r0, r2)
            fctx r7 = defpackage.fctx.a
            return r7
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvgr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvgr(this.b, this.c, fcxyVar);
    }
}
