package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyx extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ abyy c;
    final /* synthetic */ efwo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abyx(abyy abyyVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = abyyVar;
        this.d = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abyx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        if (defpackage.fdxs.c(r8, r7) != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[PHI: r1
      0x0081: PHI (r1v7 java.lang.Object) = (r1v18 java.lang.Object), (r1v19 java.lang.Object) binds: [B:18:0x007f, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[PHI: r1
      0x009a: PHI (r1v8 java.lang.Object) = (r1v16 java.lang.Object), (r1v17 java.lang.Object) binds: [B:20:0x0098, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
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
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 4
            r6 = 2
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r3) goto L1f
            if (r1 == r5) goto L18
            defpackage.fctl.b(r8)
            goto Lcf
        L18:
            java.lang.Object r1 = r7.a
            defpackage.fctl.b(r8)
            goto L9a
        L1f:
            java.lang.Object r1 = r7.a
            defpackage.fctl.b(r8)
            goto L81
        L25:
            java.lang.Object r1 = r7.a
            defpackage.fctl.b(r8)
            goto L67
        L2b:
            defpackage.fctl.b(r8)
            goto L44
        L2f:
            defpackage.fctl.b(r8)
            abyy r8 = r7.c
            efwo r1 = r7.d
            egcd r8 = r8.a
            com.google.common.util.concurrent.ListenableFuture r8 = r8.a(r1)
            r7.b = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 == r0) goto Le9
        L44:
            abyy r8 = r7.c
            fcsu r1 = r8.d
            java.lang.Object r1 = r1.b()
            cogw r1 = (defpackage.cogw) r1
            j$.time.Instant r1 = r1.f()
            fcsu r8 = r8.e
            java.lang.Object r8 = r8.b()
            cdlu r8 = (defpackage.cdlu) r8
            r1.getClass()
            r7.a = r1
            r7.b = r6
            java.lang.Object r8 = r8.c(r6, r1, r5, r7)
            if (r8 == r0) goto Le9
        L67:
            abyy r8 = r7.c
            fcsu r8 = r8.e
            java.lang.Object r8 = r8.b()
            cdlu r8 = (defpackage.cdlu) r8
            r1.getClass()
            r7.a = r1
            r7.b = r3
            r3 = r1
            j$.time.Instant r3 = (j$.time.Instant) r3
            java.lang.Object r8 = r8.b(r3, r7)
            if (r8 == r0) goto Le9
        L81:
            abyy r8 = r7.c
            abzj r3 = new abzj
            abzk r8 = r8.b
            r3.<init>(r8, r2)
            fdjx r8 = r8.c
            eiju r8 = defpackage.auvw.h(r8, r3)
            r7.a = r1
            r7.b = r5
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 == r0) goto Le9
        L9a:
            abyy r8 = r7.c
            fcsu r8 = r8.f
            java.lang.Object r8 = r8.b()
            cdku r8 = (defpackage.cdku) r8
            r1.getClass()
            cmfo r3 = r8.c
            j$.time.Instant r1 = (j$.time.Instant) r1
            evvp r1 = defpackage.evxd.b(r1)
            cdko r4 = new cdko
            r4.<init>()
            eiju r1 = r3.j(r4)
            cdkp r3 = new cdkp
            r3.<init>()
            eosc r8 = r8.d
            eiju r8 = r1.h(r3, r8)
            r7.a = r2
            r1 = 5
            r7.b = r1
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 != r0) goto Lcf
            goto Le9
        Lcf:
            abyy r8 = r7.c
            fcsu r8 = r8.c
            java.lang.Object r8 = r8.b()
            abzl r8 = (defpackage.abzl) r8
            fcsu r8 = r8.a
            java.lang.Object r8 = r8.b()
            ains r8 = (defpackage.ains) r8
            java.lang.String r0 = "Bugle.UI.GAIA.AutoSignIn.NewUserSignedIn"
            r8.c(r0)
            fctx r8 = defpackage.fctx.a
            return r8
        Le9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abyx(this.c, this.d, fcxyVar);
    }
}
