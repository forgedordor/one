package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dspc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsbi b;
    final /* synthetic */ dspd c;
    final /* synthetic */ dsoo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dspc(dsbi dsbiVar, dspd dspdVar, dsoo dsooVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsbiVar;
        this.c = dspdVar;
        this.d = dsooVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dspc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            defpackage.fctl.b(r10)
            if (r1 == 0) goto La
            goto L47
        La:
            dsbi r5 = r9.b
            ethk r10 = r5.c()
            etht r10 = r10.c
            if (r10 != 0) goto L16
            etht r10 = defpackage.etht.a
        L16:
            java.lang.String r10 = defpackage.dskj.b(r10)
            java.util.Map r1 = defpackage.dspd.b
            java.lang.Object r1 = r1.get(r10)
            r7 = r1
            etns r7 = (defpackage.etns) r7
            java.util.Map r1 = defpackage.dspd.c
            java.lang.Object r10 = r1.get(r10)
            r6 = r10
            eg r6 = (defpackage.eg) r6
            r10 = 1
            if (r7 == 0) goto L85
            if (r6 != 0) goto L32
            goto L85
        L32:
            dspd r4 = r9.c
            dsoo r3 = r9.d
            r9.a = r10
            dspa r2 = new dspa
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            fcyh r10 = r4.d
            java.lang.Object r10 = defpackage.fdin.a(r10, r2, r9)
            if (r10 != r0) goto L47
            return r0
        L47:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r10.booleanValue()
            eksp r0 = defpackage.dspd.a
            ekrw r0 = r0.h()
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r1 = "Promotion render result - %s"
            r0.t(r1, r10)
            dsoo r10 = r9.d
            dsoo r0 = defpackage.dsoo.SUCCESS
            if (r10 != r0) goto L76
            dsbi r1 = r9.b
            ethk r2 = r1.c()
            etnj r2 = r2.f
            if (r2 != 0) goto L6b
            etnj r2 = defpackage.etnj.a
        L6b:
            boolean r2 = r2.f
            if (r2 == 0) goto L70
            goto L76
        L70:
            dspd r0 = r9.c
            r0.f(r1, r10)
            goto L82
        L76:
            dspd r1 = r9.c
            dsbi r2 = r9.b
            r1.d(r2)
            if (r10 == r0) goto L82
            r1.f(r2, r10)
        L82:
            fctx r10 = defpackage.fctx.a
            return r10
        L85:
            eksp r0 = defpackage.dspd.a
            ekrw r0 = r0.i()
            eksl r0 = (defpackage.eksl) r0
            r1 = 0
            if (r7 != 0) goto L92
            r2 = r10
            goto L93
        L92:
            r2 = r1
        L93:
            if (r6 != 0) goto L96
            goto L97
        L96:
            r10 = r1
        L97:
            java.lang.String r1 = "Theme or activity not found for promotion logging. IsThemeNull [%s], IsActivityNull [%s]"
            r0.H(r1, r2, r10)
            dspd r10 = r9.c
            r10.d(r5)
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dspc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dspc(this.b, this.c, this.d, fcxyVar);
    }
}
