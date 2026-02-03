package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwob extends fcyz implements fdat {
    final /* synthetic */ cwny a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwob(cwny cwnyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cwnyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwob) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            defpackage.fctl.b(r11)
            cwny r11 = r10.a
            android.app.Activity r0 = r11.b
            android.content.Intent r0 = r0.getIntent()
            r0.getClass()
            java.lang.String r1 = r11.c(r0)
            fcsu r2 = r11.m
            java.lang.Object r2 = r2.b()
            cwoo r2 = (defpackage.cwoo) r2
            j$.util.Optional r2 = r2.b(r0)
            java.lang.Object r2 = defpackage.fdct.b(r2)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri r3 = r0.getData()
            r4 = 0
            if (r3 == 0) goto L30
            java.lang.String r3 = r3.toString()
            goto L31
        L30:
            r3 = r4
        L31:
            fcsu r5 = r11.n
            java.lang.String r3 = defpackage.cqcv.b(r3)
            java.lang.Object r6 = r5.b()
            apsu r6 = (defpackage.apsu) r6
            eksp r6 = defpackage.cwny.a
            ekrw r7 = r6.h()
            eksl r7 = (defpackage.eksl) r7
            java.lang.String r8 = defpackage.cqcv.b(r2)
            java.lang.String r9 = "Deep Link '%s', bot: %s, shortCode: %s..."
            r7.I(r9, r3, r1, r8)
            if (r1 == 0) goto L5f
            int r7 = r1.length()
            if (r7 != 0) goto L57
            goto L5f
        L57:
            cqce r7 = defpackage.cmvy.a
            boolean r7 = defpackage.alwh.i(r1)
            if (r7 != 0) goto L68
        L5f:
            if (r2 == 0) goto La8
            int r7 = r2.length()
            if (r7 != 0) goto L68
            goto La8
        L68:
            if (r2 == 0) goto L72
            int r0 = r2.length()
            if (r0 != 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            r1.getClass()
            ekrw r0 = r6.h()
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r2 = "Fetching Rbm Deep Link for: %s..."
            java.lang.String r3 = defpackage.cqcv.b(r1)
            r0.t(r2, r3)
            java.lang.Object r0 = r5.b()
            apsu r0 = (defpackage.apsu) r0
            fcsu r0 = r11.j
            java.lang.Object r0 = r0.b()
            ehac r0 = (defpackage.ehac) r0
            fcsu r2 = r11.k
            java.lang.Object r2 = r2.b()
            asoq r2 = (defpackage.asoq) r2
            ason r3 = new ason
            r3.<init>(r2, r1)
            cwny$a r1 = new cwny$a
            r1.<init>()
            r0.a(r3, r1)
            goto Ld8
        La8:
            ekrw r2 = r6.j()
            eksl r2 = (defpackage.eksl) r2
            java.lang.String r6 = "Bot id or short code is not enabled/valid: %s"
            r2.t(r6, r3)
            java.lang.Object r2 = r5.b()
            apsu r2 = (defpackage.apsu) r2
            fcsu r2 = r11.i
            java.lang.Object r2 = r2.b()
            aspz r2 = (defpackage.aspz) r2
            android.net.Uri r3 = r0.getData()
            if (r3 == 0) goto Lcb
            java.lang.String r4 = r3.getScheme()
        Lcb:
            java.lang.String r3 = "android.intent.extra.REFERRER"
            java.lang.String r0 = r0.getStringExtra(r3)
            r3 = 2
            r2.m(r3, r1, r4, r0)
            r11.g()
        Ld8:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwob.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwob(this.a, fcxyVar);
    }
}
