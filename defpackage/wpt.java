package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wpt extends fcyz implements fdat {
    int a;
    final /* synthetic */ wqd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpt(wqd wqdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wqdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wpt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
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
            r3 = 0
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Lc
            goto L2a
        Lc:
            wqd r6 = r5.b
            fcsu r6 = r6.d
            java.lang.Object r6 = r6.b()
            r6.getClass()
            j$.util.Optional r6 = (j$.util.Optional) r6
            java.lang.Object r6 = defpackage.fdct.b(r6)
            cmfo r6 = (defpackage.cmfo) r6
            if (r6 == 0) goto L61
            r5.a = r2
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r0) goto L2a
            return r0
        L2a:
            wqx r6 = (defpackage.wqx) r6
            if (r6 == 0) goto L61
            int r0 = r6.b
            r0 = r0 & r2
            if (r0 == 0) goto L41
            evvp r6 = r6.c
            if (r6 != 0) goto L39
            evvp r6 = defpackage.evvp.a
        L39:
            r6.getClass()
            j$.time.Instant r6 = defpackage.evxd.d(r6)
            return r6
        L41:
            ekrg r6 = defpackage.wqd.a
            ekrw r6 = r6.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleComposeRow2"
            r6.X(r0, r1)
            r0 = 145(0x91, float:2.03E-43)
            java.lang.String r1 = "ComposeRowStateParser.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser$getLastAcceptedDraftTimestamp$2"
            java.lang.String r4 = "invokeSuspend"
            ekrw r6 = r6.h(r2, r4, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "ComposeRowStateParser#getLastAcceptedDraftTimestamp: last accepted draft timestamp was not present"
            r6.q(r0)
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wpt(this.b, fcxyVar);
    }
}
