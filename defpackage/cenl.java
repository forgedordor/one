package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenl extends fcyz implements fdat {
    int a;
    final /* synthetic */ ceno b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cenl(fcxy fcxyVar, ceno cenoVar) {
        super(2, fcxyVar);
        this.b = cenoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cenl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (r7 == r0) goto L15;
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
            if (r1 == r2) goto L4a
            goto L66
        Ld:
            java.lang.Object r7 = r6.c
            fdjx r7 = (defpackage.fdjx) r7
            ekrg r7 = defpackage.ceno.a
            ekrw r7 = r7.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r3 = "BugleNetwork"
            r7.X(r1, r3)
            r1 = 45
            java.lang.String r3 = "TachyonTachygramBindDelegate.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/net/TachyonTachygramBindDelegate$bindTachygramChannels$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "invokeSuspend"
            ekrw r7 = r7.h(r4, r5, r1, r3)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r1 = "Start tachygram channels binding."
            r7.q(r1)
            ceno r7 = r6.b
            fcsu r7 = r7.e
            java.lang.Object r7 = r7.b()
            dggw r7 = (defpackage.dggw) r7
            com.google.common.util.concurrent.ListenableFuture r7 = r7.g()
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 == r0) goto L69
        L4a:
            ceno r7 = r6.b
            r1 = 2
            r6.a = r1
            fcyh r1 = r7.d
            fcyh r1 = defpackage.eicg.a(r1)
            cenk r2 = new cenk
            r3 = 0
            r2.<init>(r3, r7)
            java.lang.Object r7 = defpackage.fdin.a(r1, r2, r6)
            if (r7 == r0) goto L63
            fctx r7 = defpackage.fctx.a
        L63:
            if (r7 != r0) goto L66
            goto L69
        L66:
            fctx r7 = defpackage.fctx.a
            return r7
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cenl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cenl cenlVar = new cenl(fcxyVar, this.b);
        cenlVar.c = obj;
        return cenlVar;
    }
}
