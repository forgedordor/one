package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnrm extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dnro c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnrm(dnro dnroVar, String str, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnroVar;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnrm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r9.a
            defpackage.fctl.b(r10)
            goto L47
        Lf:
            defpackage.fctl.b(r10)
            goto L26
        L13:
            defpackage.fctl.b(r10)
            dnro r10 = r9.c
            java.lang.String r1 = r9.d
            dnkk r10 = r10.a()
            r9.b = r2
            java.lang.Object r10 = r10.d(r1, r9)
            if (r10 == r0) goto L89
        L26:
            dnkf r10 = (defpackage.dnkf) r10
            if (r10 != 0) goto L32
            java.lang.String r10 = r9.d
            dnjr r1 = new dnjr
            r1.<init>(r10)
            r10 = r1
        L32:
            dnro r1 = r9.c
            java.lang.String r2 = r9.d
            dnkk r1 = r1.a()
            r9.a = r10
            r3 = 2
            r9.b = r3
            java.lang.Object r1 = r1.e(r2, r9)
            if (r1 == r0) goto L89
            r0 = r10
            r10 = r1
        L47:
            dnmj r10 = (defpackage.dnmj) r10
            if (r10 != 0) goto L57
            dnmh r10 = new dnmh
            r1 = r0
            dnkf r1 = (defpackage.dnkf) r1
            dnjs r1 = r1.b()
            r10.<init>(r1)
        L57:
            r3 = r10
            dnro r10 = r9.c
            fdae r1 = r10.bG()
            java.lang.Object r1 = r1.invoke()
            dnhl r1 = (defpackage.dnhl) r1
            dnih r1 = r1.a
            dnsj r10 = r10.ah
            if (r10 == 0) goto L74
            java.lang.String r10 = r10.i
            if (r10 == 0) goto L74
            dnnn r2 = new dnnn
            r2.<init>(r10)
            goto L76
        L74:
            dnnk r2 = defpackage.dnnk.a
        L76:
            r6 = r2
            boolean r7 = r9.e
            dnnp r2 = new dnnp
            r4 = r0
            dnkf r4 = (defpackage.dnkf) r4
            r5 = 0
            r8 = 4
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.f(r2)
            fctx r10 = defpackage.fctx.a
            return r10
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnrm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnrm(this.c, this.d, this.e, fcxyVar);
    }
}
