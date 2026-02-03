package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acew extends fcyz implements fdat {
    int a;
    final /* synthetic */ acex b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acew(acex acexVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = acexVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acew) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r4 == r0) goto L16;
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
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L21
            goto L37
        Ld:
            acex r4 = r3.b
            fcsu r4 = r4.h
            java.lang.Object r4 = r4.b()
            cgte r4 = (defpackage.cgte) r4
            efwo r1 = r3.c
            r3.a = r2
            java.lang.Object r4 = r4.h(r1, r3)
            if (r4 == r0) goto L3c
        L21:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            acex r4 = r3.b
            r1 = 2
            r3.a = r1
            cgus r4 = r4.j
            java.lang.Object r4 = r4.g(r3)
            if (r4 != r0) goto L37
            goto L3c
        L37:
            eyyz r4 = (defpackage.eyyz) r4
        L39:
            fctx r4 = defpackage.fctx.a
            return r4
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acew.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new acew(this.b, this.c, fcxyVar);
    }
}
