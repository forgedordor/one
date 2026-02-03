package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wfg extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ wfk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfg(wfk wfkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = wfkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wfg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r2.c((defpackage.wfm) r1, r8) != r0) goto L20;
     */
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
            int r1 = r7.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L10
            defpackage.fctl.b(r8)
            goto L7d
        L10:
            java.lang.Object r1 = r7.a
            defpackage.fctl.b(r8)
            goto L63
        L16:
            defpackage.fctl.b(r8)
            goto L47
        L1a:
            defpackage.fctl.b(r8)
            ekrg r8 = defpackage.wfk.a
            ekrw r8 = r8.e()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r4 = "BugleComposeRow2"
            r8.X(r1, r4)
            r1 = 126(0x7e, float:1.77E-43)
            java.lang.String r4 = "DirectSendImageCompressionUiAdapter.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter$setImageCompressionSettingsToOptimized$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r8 = r8.h(r5, r6, r1, r4)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r1 = "Setting image compression to OPTIMIZED"
            r8.q(r1)
            wfk r8 = r7.c
            r7.b = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto L80
        L47:
            wfk r1 = r7.c
            wfm r8 = (defpackage.wfm) r8
            fcsu r1 = r1.f
            java.lang.Object r1 = r1.b()
            cmfo r1 = (defpackage.cmfo) r1
            wff r3 = new wff
            r3.<init>()
            r7.a = r8
            r7.b = r2
            java.lang.Object r1 = r1.d(r3, r7)
            if (r1 == r0) goto L80
            r1 = r8
        L63:
            wfm r8 = defpackage.wfm.a
            if (r1 == r8) goto L6c
            wfk r2 = r7.c
            r2.b()
        L6c:
            wfk r2 = r7.c
            r3 = 0
            r7.a = r3
            r3 = 3
            r7.b = r3
            wfm r1 = (defpackage.wfm) r1
            java.lang.Object r8 = r2.c(r1, r8)
            if (r8 != r0) goto L7d
            goto L80
        L7d:
            fctx r8 = defpackage.fctx.a
            return r8
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wfg(this.c, fcxyVar);
    }
}
