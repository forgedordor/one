package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otr extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ ots e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otr(ots otsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = otsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((otr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        if (((defpackage.ots) r1).a(r7, r2, r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r7)
            goto L5c
        Ld:
            java.lang.Object r1 = r6.c
            java.lang.Object r2 = r6.b
            java.lang.Object r3 = r6.a
            defpackage.fctl.b(r7)
            goto L2f
        L17:
            defpackage.fctl.b(r7)
            ots r1 = r6.e
            ott r3 = r1.h
            r6.a = r3
            feav r7 = r3.a
            r6.b = r7
            r6.c = r1
            r6.d = r2
            java.lang.Object r2 = r7.b(r6)
            if (r2 == r0) goto L64
            r2 = r7
        L2f:
            ott r3 = (defpackage.ott) r3     // Catch: java.lang.Throwable -> L5f
            otw r7 = r3.b     // Catch: java.lang.Throwable -> L5f
            fdoa r3 = r7.h     // Catch: java.lang.Throwable -> L5f
            fdpf r4 = new fdpf     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            otu r3 = new otu     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            r3.<init>(r7, r5)     // Catch: java.lang.Throwable -> L5f
            fdqz r7 = new fdqz     // Catch: java.lang.Throwable -> L5f
            r7.<init>(r3, r4)     // Catch: java.lang.Throwable -> L5f
            r2.d()
            orr r2 = defpackage.orr.c
            r6.a = r5
            r6.b = r5
            r6.c = r5
            r3 = 2
            r6.d = r3
            ots r1 = (defpackage.ots) r1
            java.lang.Object r7 = r1.a(r7, r2, r6)
            if (r7 != r0) goto L5c
            goto L64
        L5c:
            fctx r7 = defpackage.fctx.a
            return r7
        L5f:
            r7 = move-exception
            r2.d()
            throw r7
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new otr(this.e, fcxyVar);
    }
}
