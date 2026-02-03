package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdnu extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdoa b;
    final /* synthetic */ cdnl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdnu(cdoa cdoaVar, cdnl cdnlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdoaVar;
        this.c = cdnlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdnu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r5.l(r4) == r0) goto L19;
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
            if (r1 == r2) goto L19
            goto L69
        Ld:
            cdoa r5 = r4.b
            cdnl r1 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.m(r1, r4)
            if (r5 == r0) goto L6c
        L19:
            cdoa r5 = r4.b
            cdnl r1 = r4.c
            java.util.Map r2 = r1.b
            java.util.Set r3 = r2.keySet()
            r5.q(r3)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2d
            goto L5f
        L2d:
            java.util.Set r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5f
            ekrg r5 = defpackage.cdoa.a
            ekrw r5 = r5.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleTrustedContacts"
            r5.X(r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            ekrz r0 = defpackage.cqnc.S
            java.lang.String r1 = "ParentAllowlistUpdateHandler"
            r5.X(r0, r1)
            r0 = 532(0x214, float:7.45E-43)
            java.lang.String r1 = "ParentAllowlistUpdateHandler.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler$postConversationParentStateChangeDbUpdateWork$2"
            java.lang.String r3 = "invokeSuspend"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "No DB update has been made from this Trusted Contact update."
            r5.q(r0)
            goto L69
        L5f:
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = r5.l(r4)
            if (r5 != r0) goto L69
            goto L6c
        L69:
            fctx r5 = defpackage.fctx.a
            return r5
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdnu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdnu(this.b, this.c, fcxyVar);
    }
}
