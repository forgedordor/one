package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdci extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdcf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdci(cdcf cdcfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdcfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdci) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r9 == r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            defpackage.fctl.b(r9)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L45
            goto L51
        Ld:
            cdcf r9 = r8.b
            fcsu r1 = r9.d
            java.lang.Object r1 = r1.b()
            cdio r1 = (defpackage.cdio) r1
            boolean r1 = r1.a()
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/fcm/impl/GaiaDittoPingRefreshHandler$refreshRegistration$1"
            java.lang.String r5 = "BugleGDitto"
            java.lang.String r6 = "GaiaDittoPingRefreshHandler.kt"
            if (r1 == 0) goto L55
            ekrg r1 = defpackage.cdcf.a
            ekrw r1 = r1.h()
            ekrz r7 = defpackage.eksq.a
            r1.X(r7, r5)
            r5 = 60
            ekrw r1 = r1.h(r4, r3, r5, r6)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r3 = "Start refresh registration"
            r1.q(r3)
            r8.a = r2
            java.lang.Object r9 = r9.b(r8)
            if (r9 == r0) goto L54
        L45:
            com.google.common.util.concurrent.ListenableFuture r9 = (com.google.common.util.concurrent.ListenableFuture) r9
            r1 = 2
            r8.a = r1
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 != r0) goto L51
            goto L54
        L51:
            java.lang.Void r9 = (java.lang.Void) r9
            return r9
        L54:
            return r0
        L55:
            ekrg r9 = defpackage.cdcf.a
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r5)
            r0 = 63
            ekrw r9 = r9.h(r4, r3, r0, r6)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Skip refresh registration"
            r9.q(r0)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdci.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdci(this.b, fcxyVar);
    }
}
