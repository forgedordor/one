package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chkw extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ egbv c;
    final /* synthetic */ chkx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chkw(egbv egbvVar, chkx chkxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = egbvVar;
        this.d = chkxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chkw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            if (r1 == 0) goto Lc
            java.lang.Object r0 = r6.a
            defpackage.fctl.b(r7)
            goto L37
        Lc:
            defpackage.fctl.b(r7)
            egbv r7 = r6.c
            chkx r1 = r6.d
            fcsu r1 = r1.c
            java.lang.Object r1 = r1.b()
            r1.getClass()
            j$.util.Optional r1 = (j$.util.Optional) r1
            java.lang.Object r1 = defpackage.fdct.b(r1)
            ctcm r1 = (defpackage.ctcm) r1
            egdc r7 = (defpackage.egdc) r7
            efwo r7 = r7.a
            if (r1 == 0) goto L3b
            r6.a = r7
            r2 = 1
            r6.b = r2
            java.lang.Object r1 = r1.a(r6)
            if (r1 == r0) goto L3a
            r0 = r7
            r7 = r1
        L37:
            efwo r7 = (defpackage.efwo) r7
            goto L3f
        L3a:
            return r0
        L3b:
            r0 = 0
            r5 = r0
            r0 = r7
            r7 = r5
        L3f:
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/profile/cleanup/ProfilesAccountCleanupInterceptor$cleanUpAccount$1"
            java.lang.String r3 = "BugleProfiles"
            java.lang.String r4 = "ProfilesAccountCleanupInterceptor.kt"
            if (r7 == 0) goto L69
            boolean r7 = defpackage.fdbq.f(r7, r0)
            if (r7 == 0) goto L50
            goto L69
        L50:
            ekrg r7 = defpackage.chkx.a
            ekrw r7 = r7.h()
            ekrz r0 = defpackage.eksq.a
            r7.X(r0, r3)
            r0 = 65
            ekrw r7 = r7.h(r2, r1, r0, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = "Account disabled/removed but not current signed in account, not cleaning up data"
            r7.q(r0)
            goto L98
        L69:
            ekrg r7 = defpackage.chkx.a
            ekrw r7 = r7.h()
            ekrz r0 = defpackage.eksq.a
            r7.X(r0, r3)
            r0 = 60
            ekrw r7 = r7.h(r2, r1, r0, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = "Account disabled/removed, cleaning up profiles data"
            r7.q(r0)
            chkx r7 = r6.d
            fcsu r7 = r7.b
            java.lang.Object r7 = r7.b()
            j$.util.Optional r7 = (j$.util.Optional) r7
            chku r0 = new chku
            r0.<init>()
            chkv r1 = new chkv
            r1.<init>()
            r7.ifPresent(r1)
        L98:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chkw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chkw(this.c, this.d, fcxyVar);
    }
}
