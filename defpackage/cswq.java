package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cswq extends fcyz implements fdat {
    int a;
    final /* synthetic */ cswx b;
    final /* synthetic */ ekgb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cswq(fcxy fcxyVar, cswx cswxVar, ekgb ekgbVar) {
        super(2, fcxyVar);
        this.b = cswxVar;
        this.c = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cswq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r5 == r0) goto L16;
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
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L11
            goto L33
        Ld:
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L11
            goto L27
        L11:
            r5 = move-exception
            goto L36
        L13:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.d
            fdjx r5 = (defpackage.fdjx) r5
            cswx r5 = r4.b     // Catch: java.lang.Exception -> L11
            ekgb r1 = r4.c     // Catch: java.lang.Exception -> L11
            r4.a = r2     // Catch: java.lang.Exception -> L11
            java.lang.Object r5 = r5.e(r1, r4)     // Catch: java.lang.Exception -> L11
            if (r5 != r0) goto L27
            goto L32
        L27:
            com.google.common.util.concurrent.ListenableFuture r5 = (com.google.common.util.concurrent.ListenableFuture) r5     // Catch: java.lang.Exception -> L11
            r1 = 2
            r4.a = r1     // Catch: java.lang.Exception -> L11
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)     // Catch: java.lang.Exception -> L11
            if (r5 != r0) goto L33
        L32:
            return r0
        L33:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L11
            return r5
        L36:
            ekrg r0 = defpackage.cswx.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "Bugle"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r5 = r0.g(r5)
            r0 = 191(0xbf, float:2.68E-43)
            java.lang.String r1 = "BugleVideoCalling2.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/video/BugleVideoCalling2$callRecipients$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "launchCallOrSetup failed"
            r5.q(r0)
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cswq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cswq cswqVar = new cswq(fcxyVar, this.b, this.c);
        cswqVar.d = obj;
        return cswqVar;
    }
}
