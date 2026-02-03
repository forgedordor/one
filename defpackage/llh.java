package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llh extends fcyz implements fdat {
    int a;
    final /* synthetic */ llo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llh(llo lloVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = lloVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((llh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r5 == r0) goto L19;
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
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)
            goto L3d
        Ld:
            defpackage.fctl.b(r5)     // Catch: java.lang.Throwable -> L11
            goto L30
        L11:
            r5 = move-exception
            goto L40
        L13:
            defpackage.fctl.b(r5)
            llo r5 = r4.b
            llp r1 = r5.c
            lmv r3 = r1.a()
            boolean r3 = r3 instanceof defpackage.lmf
            if (r3 == 0) goto L27
            lmv r5 = r1.a()
            return r5
        L27:
            r4.a = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r5 = r5.h(r4)     // Catch: java.lang.Throwable -> L11
            if (r5 != r0) goto L30
            goto L3c
        L30:
            llo r5 = r4.b
            r1 = 2
            r4.a = r1
            r1 = 0
            java.lang.Object r5 = r5.i(r1, r4)
            if (r5 != r0) goto L3d
        L3c:
            return r0
        L3d:
            lmv r5 = (defpackage.lmv) r5
            return r5
        L40:
            lmk r0 = new lmk
            r1 = -1
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new llh(this.b, fcxyVar);
    }
}
