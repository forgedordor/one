package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxrt extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxrv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxrt(fcxy fcxyVar, bxrv bxrvVar) {
        super(2, fcxyVar);
        this.b = bxrvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxrt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        if (defpackage.fdxs.c(r7, r6) == r0) goto L13;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L43
            goto L5c
        Ld:
            java.lang.Object r7 = r6.c
            fdjx r7 = (defpackage.fdjx) r7
            ekrg r7 = defpackage.bxrv.a
            ekrw r7 = r7.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r3 = "BugleSearch"
            r7.X(r1, r3)
            r1 = 98
            java.lang.String r3 = "AppSearchIndexerImpl.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/search/appsearch/AppSearchIndexerImpl$removeAll$$inlined$sequenceAsyncPropagatingLegacy$1"
            java.lang.String r5 = "invokeSuspend"
            ekrw r7 = r7.h(r4, r5, r1, r3)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r1 = "Remove all indexables from AppSearch database."
            r7.q(r1)
            bxrv r7 = r6.b
            fcsu r7 = r7.b
            java.lang.Object r7 = r7.b()
            bxtq r7 = (defpackage.bxtq) r7
            r6.a = r2
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto L61
        L43:
            dvbf r7 = (defpackage.dvbf) r7
            agt r1 = new agt
            r1.<init>()
            agu r1 = r1.a()
            com.google.common.util.concurrent.ListenableFuture r7 = r7.d(r1)
            r1 = 2
            r6.a = r1
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 != r0) goto L5c
            goto L61
        L5c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxrt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxrt bxrtVar = new bxrt(fcxyVar, this.b);
        bxrtVar.c = obj;
        return bxrtVar;
    }
}
