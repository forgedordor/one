package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xmi extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ xmm d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmi(xmm xmmVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = xmmVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xmi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        if (r8.c(r2, r1, r7) != r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 == r2) goto L11
            defpackage.fctl.b(r8)
            goto L9f
        L11:
            java.lang.Object r1 = r7.b
            java.lang.Object r2 = r7.a
            defpackage.fctl.b(r8)
            goto L85
        L19:
            defpackage.fctl.b(r8)
            goto L2c
        L1d:
            defpackage.fctl.b(r8)
            xmm r8 = r7.d
            r7.c = r3
            fdpl r8 = r8.c
            java.lang.Object r8 = defpackage.fdtc.c(r8, r7)
            if (r8 == r0) goto La2
        L2c:
            aoer r8 = (defpackage.aoer) r8
            if (r8 == 0) goto L9f
            ekrg r1 = defpackage.xmm.a
            ekrw r1 = r1.e()
            ekrz r3 = defpackage.eksq.a
            java.lang.String r4 = "BugleComposeRow2"
            r1.X(r3, r4)
            r3 = 71
            java.lang.String r4 = "EnterSelfPhoneNumberDialogImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/selfphonenumber/EnterSelfPhoneNumberDialogImpl$savePhoneNumber$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r1 = r1.h(r5, r6, r3, r4)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r3 = "Updating phone number for selfId: %s"
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r4 = r8.h()
            r1.t(r3, r4)
            xmm r1 = r7.d
            fcsu r3 = r1.d
            java.lang.Object r3 = r3.b()
            alrj r3 = (defpackage.alrj) r3
            java.lang.String r4 = r7.e
            alqm r3 = r3.n(r4)
            int r4 = r8.b()
            cuur r1 = r1.e
            cuuq r1 = r1.a(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r3)
            eiju r1 = r1.b(r4)
            r7.a = r8
            r7.b = r3
            r7.c = r2
            java.lang.Object r1 = defpackage.fdxs.c(r1, r7)
            if (r1 == r0) goto La2
            r2 = r8
            r8 = r1
            r1 = r3
        L85:
            cuud r8 = (defpackage.cuud) r8
            xmm r8 = r7.d
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r2 = r2.h()
            r1.getClass()
            r3 = 0
            r7.a = r3
            r7.b = r3
            r3 = 3
            r7.c = r3
            java.lang.Object r8 = r8.c(r2, r1, r7)
            if (r8 != r0) goto L9f
            goto La2
        L9f:
            fctx r8 = defpackage.fctx.a
            return r8
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xmi(this.d, this.e, fcxyVar);
    }
}
