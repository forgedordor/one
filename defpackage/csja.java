package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csja extends fcyz implements fdat {
    int a;
    final /* synthetic */ csjd b;
    final /* synthetic */ csch c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csja(fcxy fcxyVar, csjd csjdVar, csch cschVar) {
        super(2, fcxyVar);
        this.b = csjdVar;
        this.c = cschVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csja) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r6 != r0) goto L25;
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L11
            defpackage.fctl.b(r6)
            if (r1 == r4) goto L24
            if (r1 == r3) goto L3b
            goto L53
        L11:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.d
            fdjx r6 = (defpackage.fdjx) r6
            csjd r6 = r5.b
            csch r1 = r5.c
            r5.a = r4
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 == r0) goto L8b
        L24:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L2f
            fctx r6 = defpackage.fctx.a
            return r6
        L2f:
            csch r6 = r5.c
            r5.a = r3
            fdkf r6 = r6.b
            java.lang.Object r6 = r6.c(r5)
            if (r6 == r0) goto L8b
        L3b:
            csef r6 = (defpackage.csef) r6
            if (r6 == 0) goto L46
            boolean r6 = r6.e
            if (r6 != 0) goto L46
            fctx r6 = defpackage.fctx.a
            return r6
        L46:
            csch r6 = r5.c
            r5.a = r2
            fdap r6 = r6.e
            java.lang.Object r6 = r6.invoke(r5)
            if (r6 != r0) goto L53
            goto L8b
        L53:
            bvdk r6 = (defpackage.bvdk) r6
            r0 = 0
            if (r6 == 0) goto L73
            bvdk[] r1 = new defpackage.bvdk[r2]
            bvdk r2 = defpackage.bvdk.SPAM_FOLDER
            r1[r0] = r2
            bvdk r2 = defpackage.bvdk.BLOCKED_FOLDER
            r1[r4] = r2
            bvdk r2 = defpackage.bvdk.CROSS_COUNTRY_FOLDER
            r1[r3] = r2
            java.util.Set r1 = defpackage.fcwm.d(r1)
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L73
            fctx r6 = defpackage.fctx.a
            return r6
        L73:
            csjd r6 = r5.b
            fcsu r6 = r6.a
            java.lang.Object r6 = r6.b()
            cpgf r6 = (defpackage.cpgf) r6
            csch r1 = r5.c
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r1.j
            bvdk r2 = defpackage.bvdk.CROSS_COUNTRY_FOLDER
            elka r3 = defpackage.elka.CONVERSATION_FROM_CROSS_COUNTRY_HIDE
            r6.b(r1, r2, r3, r0)
            fctx r6 = defpackage.fctx.a
            return r6
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csja.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csja csjaVar = new csja(fcxyVar, this.b, this.c);
        csjaVar.d = obj;
        return csjaVar;
    }
}
