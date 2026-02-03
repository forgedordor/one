package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdnw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdoa b;
    final /* synthetic */ cdnk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdnw(fcxy fcxyVar, cdoa cdoaVar, cdnk cdnkVar) {
        super(2, fcxyVar);
        this.b = cdoaVar;
        this.c = cdnkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdnw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (r7.l(r6) == r0) goto L20;
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
            if (r1 == r2) goto L33
            goto L78
        Ld:
            java.lang.Object r7 = r6.d
            fdjx r7 = (defpackage.fdjx) r7
            cdoa r7 = r6.b
            fcsu r1 = r7.g
            java.lang.Object r1 = r1.b()
            dqsn r1 = (defpackage.dqsn) r1
            cdnk r3 = r6.c
            cdnx r4 = new cdnx
            r4.<init>(r7, r3)
            java.lang.String r5 = "ParentAllowlistUpdateHandler#updateConversationAllowlistStatusInDb"
            r1.d(r5, r4)
            r6.a = r2
            java.util.Set r1 = r3.a
            java.util.Set r2 = r3.b
            java.lang.Object r7 = r7.n(r1, r2, r6)
            if (r7 == r0) goto L7b
        L33:
            cdoa r7 = r6.b
            cdnk r1 = r6.c
            java.util.Set r2 = r1.a
            r7.q(r2)
            java.util.Set r1 = r1.b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L45
            goto L6e
        L45:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L6e
            ekrg r7 = defpackage.cdoa.a
            ekrw r7 = r7.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleTrustedContacts"
            r7.X(r0, r1)
            r0 = 573(0x23d, float:8.03E-43)
            java.lang.String r1 = "ParentAllowlistUpdateHandler.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler$updateConversationAllowlistStatusInDb$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r7 = r7.h(r2, r3, r0, r1)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = "No DB update has been made from this Trusted Contact update."
            r7.q(r0)
            fctx r7 = defpackage.fctx.a
            return r7
        L6e:
            r1 = 2
            r6.a = r1
            java.lang.Object r7 = r7.l(r6)
            if (r7 != r0) goto L78
            goto L7b
        L78:
            fctx r7 = defpackage.fctx.a
            return r7
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdnw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdnw cdnwVar = new cdnw(fcxyVar, this.b, this.c);
        cdnwVar.d = obj;
        return cdnwVar;
    }
}
