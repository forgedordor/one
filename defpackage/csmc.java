package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csmc extends fcyz implements fdat {
    int a;
    final /* synthetic */ csme b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csmc(csme csmeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csmeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csmc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L37
        Ld:
            csme r5 = r4.b
            fcsu r5 = r5.b
            java.lang.Object r5 = r5.b()
            csms r5 = (defpackage.csms) r5
            r4.a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 == r0) goto L5d
        L1f:
            efwo r5 = (defpackage.efwo) r5
            if (r5 == 0) goto L3a
            csme r1 = r4.b
            fcsu r1 = r1.c
            java.lang.Object r1 = r1.b()
            csmf r1 = (defpackage.csmf) r1
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r1.c(r5, r4)
            if (r5 != r0) goto L37
            goto L5d
        L37:
            csmb r5 = (defpackage.csmb) r5
            goto L5a
        L3a:
            ekrg r5 = defpackage.csme.a
            ekrw r5 = r5.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleSpam"
            r5.X(r0, r1)
            r0 = 63
            java.lang.String r1 = "SpatulaSettingsChecker.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker$getAccountIdAndCheckSpatulaSettings$1$1$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "No active account found from SpatulaAccountDataService."
            r5.q(r0)
        L5a:
            fctx r5 = defpackage.fctx.a
            return r5
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csmc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csmc(this.b, fcxyVar);
    }
}
