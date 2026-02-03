package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvla extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ bvld d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvla(bvld bvldVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = bvldVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvla) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        if (r2.d(r3, r8) != r0) goto L14;
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
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L10
            java.lang.Object r0 = r8.a
            defpackage.fctl.b(r9)
            goto L95
        L10:
            java.lang.Object r1 = r8.b
            java.lang.Object r2 = r8.a
            defpackage.fctl.b(r9)
            r7 = r2
            r2 = r1
            r1 = r7
            goto L36
        L1b:
            defpackage.fctl.b(r9)
            fdci r1 = new fdci
            r1.<init>()
            bvld r9 = r8.d
            cmfo r9 = r9.c()
            r8.a = r1
            r8.b = r1
            r8.c = r2
            java.lang.Object r9 = r9.c(r8)
            if (r9 == r0) goto L9a
            r2 = r1
        L36:
            bvkv r9 = (defpackage.bvkv) r9
            java.lang.String r9 = r9.c
            r9.getClass()
            fdci r2 = (defpackage.fdci) r2
            r2.a = r9
            r9 = r1
            fdci r9 = (defpackage.fdci) r9
            java.lang.Object r2 = r9.a
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L94
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            r2.getClass()
            r9.a = r2
            ekrg r2 = defpackage.bvld.a
            ekrw r2 = r2.h()
            ekrz r3 = defpackage.eksq.a
            java.lang.String r4 = "BugleDittoRcs"
            r2.X(r3, r4)
            r3 = 71
            java.lang.String r4 = "CryptoKeyDataServiceImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/ditto/directrcs/CryptoKeyDataServiceImpl$getMultiDeviceUserId$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r2 = r2.h(r5, r6, r3, r4)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r3 = "Generated a user id for multi-device user. Storing it in DITTO_RCS_CRYPTO_KEY_SETTINGS"
            r2.q(r3)
            bvld r2 = r8.d
            cmfo r2 = r2.c()
            bvkz r3 = new bvkz
            r3.<init>()
            r8.a = r1
            r9 = 0
            r8.b = r9
            r9 = 2
            r8.c = r9
            java.lang.Object r9 = r2.d(r3, r8)
            if (r9 == r0) goto L9a
        L94:
            r0 = r1
        L95:
            fdci r0 = (defpackage.fdci) r0
            java.lang.Object r9 = r0.a
            return r9
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvla.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvla(this.d, fcxyVar);
    }
}
