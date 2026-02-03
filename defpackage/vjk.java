package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vjk extends fcyz implements fdat {
    int a;
    final /* synthetic */ vjl b;
    final /* synthetic */ fdap c;
    final /* synthetic */ ajlt d;
    final /* synthetic */ amvx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjk(vjl vjlVar, fdap fdapVar, ajlt ajltVar, amvx amvxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vjlVar;
        this.c = fdapVar;
        this.d = ajltVar;
        this.e = amvxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vjk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r5 == r0) goto L27;
     */
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
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L21
            goto L78
        Ld:
            vjl r5 = r4.b
            fcsu r1 = r5.c
            java.lang.Object r1 = r1.b()
            csmf r1 = (defpackage.csmf) r1
            r4.a = r2
            efwo r5 = r5.d
            java.lang.Object r5 = r1.c(r5, r4)
            if (r5 == r0) goto L9e
        L21:
            csmb r5 = (defpackage.csmb) r5
            boolean r5 = r5.a
            if (r5 != 0) goto L2e
            fdap r5 = r4.c
            ajlt r1 = r4.d
            r5.invoke(r1)
        L2e:
            r5 = 3
            amvx[] r5 = new defpackage.amvx[r5]
            r1 = 0
            amvx r3 = defpackage.amvx.DISPLAY_BUT_UNPROCESSESED
            r5[r1] = r3
            amvx r1 = defpackage.amvx.DISPLAY_AND_ALLOW_HIDING
            r5[r2] = r1
            amvx r2 = defpackage.amvx.PROCESSING
            r3 = 2
            r5[r3] = r2
            java.util.Set r5 = defpackage.fcwm.d(r5)
            amvx r2 = r4.e
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L96
            if (r2 != r1) goto L59
            vjl r5 = r4.b
            ajlt r0 = r4.d
            fdap r1 = r4.c
            r5.b(r0, r1)
            fctx r5 = defpackage.fctx.a
            return r5
        L59:
            vjl r5 = r4.b
            fcsu r5 = r5.b
            java.lang.Object r5 = r5.b()
            cslj r5 = (defpackage.cslj) r5
            ajlt r1 = r4.d
            amvr r1 = r1.g()
            amvy r1 = (defpackage.amvy) r1
            android.net.Uri r1 = r1.e()
            r4.a = r3
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L78
            goto L9e
        L78:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L8c
            vjl r5 = r4.b
            ajlt r0 = r4.d
            fdap r1 = r4.c
            r5.b(r0, r1)
            fctx r5 = defpackage.fctx.a
            return r5
        L8c:
            fdap r5 = r4.c
            ajlt r0 = r4.d
            r5.invoke(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        L96:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r5.<init>(r0)
            throw r5
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vjk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vjk(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
