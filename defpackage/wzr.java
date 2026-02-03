package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzr extends fcyz implements fdat {
    int a;
    final /* synthetic */ xac b;
    final /* synthetic */ vvw c;
    final /* synthetic */ ekgp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzr(xac xacVar, vvw vvwVar, ekgp ekgpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xacVar;
        this.c = vvwVar;
        this.d = ekgpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wzr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r6.h.a(r5) == r0) goto L16;
     */
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
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L2b
            goto L63
        Ld:
            xac r6 = r5.b
            fctc r6 = r6.n
            java.lang.Object r6 = r6.a()
            r6.getClass()
            vvw r1 = r5.c
            ekgp r3 = r5.d
            vwj r6 = (defpackage.vwj) r6
            vto r4 = new vto
            r4.<init>(r3)
            r5.a = r2
            java.lang.Object r6 = r6.b(r1, r4, r5)
            if (r6 == r0) goto L66
        L2b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L41
            xac r6 = r5.b
            r1 = 2
            r5.a = r1
            wqf r6 = r6.h
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L63
            goto L66
        L41:
            ekrg r6 = defpackage.xac.a
            ekrw r6 = r6.i()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleComposeRow2"
            r6.X(r0, r1)
            r0 = 173(0xad, float:2.42E-43)
            java.lang.String r1 = "SendButtonUiAdapterImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl$onSend$1$2$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r6 = r6.h(r2, r3, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            vvw r0 = r5.c
            java.lang.String r1 = "Failed to send %s"
            r6.t(r1, r0)
        L63:
            fctx r6 = defpackage.fctx.a
            return r6
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wzr(this.b, this.c, this.d, fcxyVar);
    }
}
