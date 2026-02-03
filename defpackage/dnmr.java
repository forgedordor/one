package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnmr extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnmw b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnmr(dnmw dnmwVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnmwVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnmr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r4 == r0) goto L21;
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
            if (r1 == r2) goto L1b
            goto L2d
        Ld:
            dnmw r4 = r3.b
            java.lang.String r1 = r3.c
            r3.a = r2
            dnkk r4 = r4.b
            java.lang.Object r4 = r4.e(r1, r3)
            if (r4 == r0) goto L3e
        L1b:
            dnmj r4 = (defpackage.dnmj) r4
            if (r4 == 0) goto L3c
            dnmw r1 = r3.b
            r2 = 2
            r3.a = r2
            dnky r1 = r1.c
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 != r0) goto L2d
            goto L3e
        L2d:
            dnkf r4 = (defpackage.dnkf) r4
            if (r4 == 0) goto L3c
            java.lang.CharSequence r4 = r4.a()
            if (r4 == 0) goto L3c
            java.lang.String r4 = r4.toString()
            return r4
        L3c:
            r4 = 0
            return r4
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnmr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnmr(this.b, this.c, fcxyVar);
    }
}
