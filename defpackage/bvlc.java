package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvlc extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ bvld d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvlc(bvld bvldVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = bvldVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvlc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009c, code lost:
    
        if (r2.d(r3, r9) != r0) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.c
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L10
            java.lang.Object r0 = r9.a
            defpackage.fctl.b(r10)
            goto L9f
        L10:
            java.lang.Object r1 = r9.b
            java.lang.Object r2 = r9.a
            defpackage.fctl.b(r10)
            r8 = r2
            r2 = r1
            r1 = r8
            goto L36
        L1b:
            defpackage.fctl.b(r10)
            fdci r1 = new fdci
            r1.<init>()
            bvld r10 = r9.d
            cmfo r10 = r10.c()
            r9.a = r1
            r9.b = r1
            r9.c = r2
            java.lang.Object r10 = r10.c(r9)
            if (r10 == r0) goto La4
            r2 = r1
        L36:
            bvkv r10 = (defpackage.bvkv) r10
            evqs r10 = r10.b
            r10.getClass()
            fdci r2 = (defpackage.fdci) r2
            r2.a = r10
            r10 = r1
            fdci r10 = (defpackage.fdci) r10
            java.lang.Object r2 = r10.a
            evqs r3 = defpackage.evqs.b
            boolean r2 = defpackage.fdbq.f(r2, r3)
            if (r2 == 0) goto L9e
            bvld r2 = r9.d
            fcsu r3 = r2.c
            java.lang.Object r3 = r3.b()
            bvle r3 = (defpackage.bvle) r3
            r3 = 32
            byte[] r3 = new byte[r3]
            java.security.SecureRandom r4 = defpackage.ejwx.a
            r4.nextBytes(r3)
            evqs r3 = defpackage.evwm.a(r3)
            r10.a = r3
            ekrg r3 = defpackage.bvld.a
            ekrw r3 = r3.h()
            ekrz r4 = defpackage.eksq.a
            java.lang.String r5 = "BugleDittoRcs"
            r3.X(r4, r5)
            r4 = 53
            java.lang.String r5 = "CryptoKeyDataServiceImpl.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/datamodel/ditto/directrcs/CryptoKeyDataServiceImpl$getOutOfBandCryptoKey$1"
            java.lang.String r7 = "invokeSuspend"
            ekrw r3 = r3.h(r6, r7, r4, r5)
            ekrd r3 = (defpackage.ekrd) r3
            java.lang.String r4 = "Generated a new key. Storing it in DITTO_RCS_CRYPTO_KEY_SETTINGS"
            r3.q(r4)
            cmfo r2 = r2.c()
            bvlb r3 = new bvlb
            r3.<init>()
            r9.a = r1
            r10 = 0
            r9.b = r10
            r10 = 2
            r9.c = r10
            java.lang.Object r10 = r2.d(r3, r9)
            if (r10 == r0) goto La4
        L9e:
            r0 = r1
        L9f:
            fdci r0 = (defpackage.fdci) r0
            java.lang.Object r10 = r0.a
            return r10
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvlc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvlc(this.d, fcxyVar);
    }
}
