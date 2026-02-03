package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnfg extends fcyz implements fdap {
    int a;
    final /* synthetic */ dnfr b;
    final /* synthetic */ dneb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnfg(dnfr dnfrVar, dneb dnebVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dnfrVar;
        this.c = dnebVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r6)
            if (r1 == r3) goto L21
            if (r1 == r2) goto L39
            return r6
        L10:
            defpackage.fctl.b(r6)
            dnfr r6 = r5.b
            dneb r1 = r5.c
            r5.a = r3
            fdue r6 = r6.g
            java.lang.Object r6 = r6.fO(r1, r5)
            if (r6 == r0) goto L54
        L21:
            dnfr r6 = r5.b
            fctc r1 = r6.h
            boolean r1 = r1.b()
            if (r1 == 0) goto L39
            fdue r6 = r6.d()
            dneb r1 = r5.c
            r5.a = r2
            java.lang.Object r6 = r6.fO(r1, r5)
            if (r6 == r0) goto L54
        L39:
            dnfr r6 = r5.b
            dneb r1 = r5.c
            fdjx r2 = r6.c
            fcyh r2 = r2.hE()
            dnff r3 = new dnff
            r4 = 0
            r3.<init>(r6, r1, r4)
            r6 = 3
            r5.a = r6
            java.lang.Object r6 = defpackage.fdin.a(r2, r3, r5)
            if (r6 != r0) goto L53
            goto L54
        L53:
            return r6
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnfg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnfg(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
