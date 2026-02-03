package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmi extends fcyz implements fdat {
    int a;
    final /* synthetic */ fmx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmi(fmx fmxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fmxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fmi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            defpackage.fctl.b(r5)
            if (r1 == 0) goto La
            goto L32
        La:
            fmx r5 = r4.b
            kew r1 = r5.f()
            long r1 = r1.c
            boolean r1 = defpackage.jyo.i(r1)
            if (r1 != 0) goto L84
            jgu r1 = r5.s
            if (r1 == 0) goto L32
            kew r5 = r5.f()
            juo r5 = defpackage.kex.a(r5)
            jlf r5 = defpackage.ebp.a(r5)
            r2 = 1
            r4.a = r2
            java.lang.Object r5 = r1.b(r5)
            if (r5 != r0) goto L32
            return r0
        L32:
            fmx r5 = r4.b
            kew r0 = r5.f()
            kew r1 = r5.f()
            java.lang.String r1 = r1.a()
            int r1 = r1.length()
            juo r0 = defpackage.kex.c(r0, r1)
            kew r1 = r5.f()
            kew r2 = r5.f()
            java.lang.String r2 = r2.a()
            int r2 = r2.length()
            juo r1 = defpackage.kex.b(r1, r2)
            juo r0 = r0.c(r1)
            kew r1 = r5.f()
            long r1 = r1.c
            int r1 = defpackage.jyo.d(r1)
            long r1 = defpackage.jyp.a(r1, r1)
            kew r3 = new kew
            r3.<init>(r0, r1)
            fdap r0 = r5.c
            r0.invoke(r3)
            ezm r0 = defpackage.ezm.a
            r5.q(r0)
            fdy r5 = r5.a
            if (r5 == 0) goto L84
            r5.a()
        L84:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fmi(this.b, fcxyVar);
    }
}
