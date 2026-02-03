package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akmv extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ akmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akmv(akmw akmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = akmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akmv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L10
            defpackage.fctl.b(r9)
            return r9
        L10:
            java.lang.Object r1 = r8.a
            defpackage.fctl.b(r9)
            r3 = r1
            goto L4a
        L17:
            defpackage.fctl.b(r9)
            goto L31
        L1b:
            defpackage.fctl.b(r9)
            akmw r9 = r8.c
            anpj r9 = r9.d
            eiju r9 = r9.b()
            r9.getClass()
            r8.b = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 == r0) goto L71
        L31:
            akmw r1 = r8.c
            akmy r9 = (defpackage.akmy) r9
            anpj r1 = r1.c
            eiju r1 = r1.b()
            r1.getClass()
            r8.a = r9
            r8.b = r2
            java.lang.Object r1 = defpackage.fdxs.c(r1, r8)
            if (r1 == r0) goto L71
            r3 = r9
            r9 = r1
        L4a:
            akmw r1 = r8.c
            r2 = r9
            ekgb r2 = (defpackage.ekgb) r2
            fcsu r9 = r1.a
            java.lang.Object r9 = r9.b()
            akcv r9 = (defpackage.akcv) r9
            r2.getClass()
            r3.getClass()
            r4 = 0
            r8.a = r4
            r4 = 3
            r8.b = r4
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r1.b
            r6 = 1
            r4 = 0
            r7 = r8
            r1 = r9
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L70
            goto L71
        L70:
            return r9
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akmv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akmv(this.c, fcxyVar);
    }
}
