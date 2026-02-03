package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoal extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ aoan d;
    final /* synthetic */ ekhx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoal(aoan aoanVar, ekhx ekhxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = aoanVar;
        this.e = ekhxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L15
            java.lang.Object r0 = r7.b
            java.lang.Object r1 = r7.a
            defpackage.fctl.b(r8)
            goto L68
        L15:
            java.lang.Object r1 = r7.a
            defpackage.fctl.b(r8)
            goto L45
        L1b:
            java.lang.Object r1 = r7.a
            defpackage.fctl.b(r8)
            goto L37
        L21:
            defpackage.fctl.b(r8)
            aoad r1 = new aoad
            r1.<init>()
            aoan r8 = r7.d
            ekhx r5 = r7.e
            r7.a = r1
            r7.c = r4
            java.lang.Object r8 = r8.h(r5, r7)
            if (r8 == r0) goto L96
        L37:
            aoan r5 = r7.d
            java.util.List r8 = (java.util.List) r8
            r7.a = r1
            r7.c = r3
            java.lang.Object r8 = r5.e(r8, r7)
            if (r8 == r0) goto L96
        L45:
            java.util.Collection r8 = (java.util.Collection) r8
            ekgb r8 = defpackage.ekfv.a(r8)
            int r3 = r8.size()
            r5 = r1
            aoad r5 = (defpackage.aoad) r5
            int r6 = r5.f
            int r6 = r6 + r3
            r5.f = r6
            aoan r3 = r7.d
            r7.a = r1
            r7.b = r8
            r5 = 3
            r7.c = r5
            java.lang.Object r3 = defpackage.aoan.n(r3, r2, r8, r7, r4)
            if (r3 != r0) goto L67
            goto L96
        L67:
            r0 = r8
        L68:
            ekrg r8 = defpackage.aoan.a
            ekrw r8 = r8.h()
            ekrz r3 = defpackage.eksq.a
            java.lang.String r4 = "BugleRecipientSync"
            r8.X(r3, r4)
            r3 = 124(0x7c, float:1.74E-43)
            java.lang.String r4 = "RecipientContactDataServiceImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactDataServiceImpl$syncRecipientsWithDeletedContacts$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r8 = r8.h(r5, r6, r3, r4)
            ekrd r8 = (defpackage.ekrd) r8
            ekgb r0 = (defpackage.ekgb) r0
            java.lang.String r3 = "Cleared contact data for %d recipients linked to deleted contacts"
            int r0 = r0.size()
            r8.r(r3, r0)
            aoan r8 = r7.d
            aoad r1 = (defpackage.aoad) r1
            r8.l(r1)
            return r2
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoal.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aoal(this.d, this.e, fcxyVar);
    }
}
