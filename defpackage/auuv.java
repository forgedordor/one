package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auuv extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ fdap d;
    final /* synthetic */ fdos e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auuv(fdos fdosVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = fdosVar;
        this.d = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auuv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (((defpackage.fdob) r1).a(r2, r3) == r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.c
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r4)
            goto L47
        Ld:
            java.lang.Object r1 = r3.b
            java.lang.Object r2 = r3.a
            defpackage.fctl.b(r4)     // Catch: java.lang.Throwable -> L15
            goto L31
        L15:
            r4 = move-exception
            r1 = r2
            goto L2d
        L18:
            defpackage.fctl.b(r4)
            fdos r1 = r3.e
            fdap r4 = r3.d     // Catch: java.lang.Throwable -> L2c
            r3.a = r1     // Catch: java.lang.Throwable -> L2c
            r3.b = r1     // Catch: java.lang.Throwable -> L2c
            r3.c = r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L2c
            if (r4 != r0) goto L31
            goto L46
        L2c:
            r4 = move-exception
        L2d:
            java.lang.Object r4 = defpackage.fctl.a(r4)
        L31:
            fctk r2 = new fctk
            r2.<init>(r4)
            r4 = 0
            r3.a = r4
            r3.b = r4
            r4 = 2
            r3.c = r4
            fdob r1 = (defpackage.fdob) r1
            java.lang.Object r4 = r1.a(r2, r3)
            if (r4 != r0) goto L47
        L46:
            return r0
        L47:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auuv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new auuv(this.e, this.d, fcxyVar);
    }
}
