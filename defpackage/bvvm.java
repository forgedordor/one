package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvvm extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvvn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvvm(bvvn bvvnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvvm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L16
            if (r1 == r5) goto L12
            defpackage.fctl.b(r7)
            if (r1 == r4) goto L48
            goto L6c
        L12:
            defpackage.fctl.b(r7)
            goto L36
        L16:
            defpackage.fctl.b(r7)
            bvvn r7 = r6.b
            fcsu r1 = r7.d
            java.lang.Object r1 = r1.b()
            bvut r1 = (defpackage.bvut) r1
            aubq r7 = r7.f
            java.lang.String r7 = r7.d
            eiju r7 = r1.e(r7)
            r7.getClass()
            r6.a = r5
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 == r0) goto L6d
        L36:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5e
            bvvn r7 = r6.b
            r6.a = r4
            java.lang.Object r7 = r7.f(r6)
            if (r7 == r0) goto L6d
        L48:
            bvvn r7 = r6.b
            fcyh r1 = r7.c
            fcyh r1 = defpackage.eicg.a(r1)
            bvvl r4 = new bvvl
            r4.<init>(r2, r7)
            r6.a = r3
            java.lang.Object r7 = defpackage.fdin.a(r1, r4, r6)
            if (r7 != r0) goto L6c
            goto L6d
        L5e:
            bvvn r7 = r6.b
            bwvi r1 = defpackage.bwvi.DOWNGRADE_E2EE_NOT_PROVISIONED
            r3 = 4
            r6.a = r3
            java.lang.Object r7 = r7.j(r1, r6)
            if (r7 != r0) goto L6c
            goto L6d
        L6c:
            return r2
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvvm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvvm(this.b, fcxyVar);
    }
}
