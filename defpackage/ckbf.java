package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckbf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;
    final /* synthetic */ dggn c;
    final /* synthetic */ ckcc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckbf(ckbk ckbkVar, dggn dggnVar, ckcc ckccVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
        this.c = dggnVar;
        this.d = ckccVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckbf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r5.q(r4) == r0) goto L15;
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
            if (r1 == r2) goto L1b
            goto L2d
        Ld:
            ckbk r5 = r4.b
            dggn r1 = r4.c
            ckcc r3 = r4.d
            r4.a = r2
            java.lang.Object r5 = r5.z(r1, r3, r4)
            if (r5 == r0) goto L34
        L1b:
            ckcc r5 = r4.d
            ckcc r1 = defpackage.ckcc.PER_SIM_TOGGLE_STATE_DISABLED
            if (r5 != r1) goto L2d
            ckbk r5 = r4.b
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = r5.q(r4)
            if (r5 != r0) goto L2d
            goto L34
        L2d:
            ckbk r5 = r4.b
            r5.l()
            r5 = 0
            return r5
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckbf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckbf(this.b, this.c, this.d, fcxyVar);
    }
}
