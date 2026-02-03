package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abzg extends fcyz implements fdat {
    int a;
    final /* synthetic */ abzk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abzg(abzk abzkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abzkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abzg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r6 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r6)
            if (r1 == r3) goto L24
            if (r1 == r2) goto L41
            goto L5f
        L10:
            defpackage.fctl.b(r6)
            abzk r6 = r5.b
            r5.a = r3
            abzd r1 = new abzd
            r1.<init>()
            ecjh r6 = r6.d
            java.lang.Object r6 = defpackage.crrj.a(r6, r1, r5)
            if (r6 == r0) goto L9c
        L24:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L2f
            abzf r6 = defpackage.abzf.a
            goto L77
        L2f:
            abzk r6 = r5.b
            fcsu r6 = r6.e
            java.lang.Object r6 = r6.b()
            dath r6 = (defpackage.dath) r6
            r5.a = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto L9c
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4c
            abzf r6 = defpackage.abzf.e
            goto L77
        L4c:
            abzk r6 = r5.b
            r1 = 3
            r5.a = r1
            abzb r1 = new abzb
            r1.<init>()
            ecjh r6 = r6.d
            java.lang.Object r6 = defpackage.crrj.a(r6, r1, r5)
            if (r6 != r0) goto L5f
            goto L9c
        L5f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6a
            abzf r6 = defpackage.abzf.d
            goto L77
        L6a:
            abzk r6 = r5.b
            boolean r0 = r6.f
            if (r0 == 0) goto L73
            abzf r6 = defpackage.abzf.b
            goto L77
        L73:
            r6.f = r3
            abzf r6 = defpackage.abzf.c
        L77:
            ekrg r0 = defpackage.abzk.a
            ekrw r0 = r0.e()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleGaia"
            r0.X(r1, r2)
            r1 = 59
            java.lang.String r2 = "AutoSignInDataService.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/gaia/autosignin/AutoSignInDataService$dataSource$1$loadData$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "[Auto sign-in] Auto sign-in state checked. Value: %s"
            java.lang.String r2 = r6.name()
            r0.t(r1, r2)
            return r6
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abzg(this.b, fcxyVar);
    }
}
