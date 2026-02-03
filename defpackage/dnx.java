package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnx extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdlr b;
    final /* synthetic */ dob c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnx(fdlr fdlrVar, dob dobVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdlrVar;
        this.c = dobVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r5 == r0) goto L17;
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
            if (r1 == r2) goto L19
            goto L38
        Ld:
            fdlr r5 = r4.b
            if (r5 == 0) goto L19
            r4.a = r2
            java.lang.Object r5 = r5.o(r4)
            if (r5 == r0) goto L37
        L19:
            dob r5 = r4.c
            r1 = 2
            r4.a = r1
            int r1 = r5.a
            if (r1 > 0) goto L25
            fctx r5 = defpackage.fctx.a
            goto L35
        L25:
            dmd r1 = defpackage.dmd.a
            doa r2 = new doa
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = defpackage.fdin.a(r1, r2, r4)
            if (r5 == r0) goto L35
            fctx r5 = defpackage.fctx.a
        L35:
            if (r5 != r0) goto L38
        L37:
            return r0
        L38:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnx(this.b, this.c, fcxyVar);
    }
}
