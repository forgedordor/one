package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcg extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ long d;
    final /* synthetic */ ebk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcg(hox hoxVar, long j, ebk ebkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = j;
        this.e = ebkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fcg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r3.a(r4, r5) != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r1.a(r6, r5) == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto L11
            java.lang.Object r0 = r5.a
            ebm r0 = (defpackage.ebm) r0
            defpackage.fctl.b(r6)
            goto L55
        L11:
            java.lang.Object r1 = r5.a
            hox r1 = (defpackage.hox) r1
            defpackage.fctl.b(r6)
            goto L39
        L19:
            defpackage.fctl.b(r6)
            hox r1 = r5.c
            java.lang.Object r6 = r1.a()
            ebm r6 = (defpackage.ebm) r6
            if (r6 == 0) goto L3d
            ebk r3 = r5.e
            ebl r4 = new ebl
            r4.<init>(r6)
            if (r3 == 0) goto L39
            r5.a = r1
            r5.b = r2
            java.lang.Object r6 = r3.a(r4, r5)
            if (r6 == r0) goto L53
        L39:
            r6 = 0
            r1.b(r6)
        L3d:
            long r1 = r5.d
            ebm r6 = new ebm
            r6.<init>(r1)
            ebk r1 = r5.e
            if (r1 == 0) goto L54
            r5.a = r6
            r2 = 2
            r5.b = r2
            java.lang.Object r1 = r1.a(r6, r5)
            if (r1 != r0) goto L54
        L53:
            return r0
        L54:
            r0 = r6
        L55:
            hox r6 = r5.c
            r6.b(r0)
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fcg(this.c, this.d, this.e, fcxyVar);
    }
}
