package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmg extends fcyz implements fdat {
    int a;
    final /* synthetic */ fmx b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmg(fmx fmxVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fmxVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fmg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
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
            if (r1 != 0) goto L5f
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
            boolean r5 = r4.c
            if (r5 != 0) goto L37
            goto L5f
        L37:
            fmx r5 = r4.b
            kew r0 = r5.f()
            long r0 = r0.c
            int r0 = defpackage.jyo.c(r0)
            kew r1 = r5.f()
            juo r1 = r1.b
            long r2 = defpackage.jyp.a(r0, r0)
            kew r0 = new kew
            r0.<init>(r1, r2)
            fdap r1 = r5.c
            r1.invoke(r0)
            ezm r0 = defpackage.ezm.a
            r5.q(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        L5f:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fmg(this.b, this.c, fcxyVar);
    }
}
