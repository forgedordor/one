package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgzy extends fcyz implements fdat {
    int a;
    final /* synthetic */ chbd b;
    final /* synthetic */ chab c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgzy(chbd chbdVar, chab chabVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chbdVar;
        this.c = chabVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgzy) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        if (r1.fO(r8, r7) == r0) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r8)
            goto L61
        Ld:
            java.lang.Object r1 = r7.d
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r8)
            goto L52
        L15:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.d
            r1 = r8
            fdpm r1 = (defpackage.fdpm) r1
            chbd r8 = r7.b
            chab r3 = r7.c
            cogw r3 = r3.a
            j$.time.Instant r3 = r3.f()
            r3.getClass()
            j$.time.Instant r8 = r8.f
            j$.time.Duration r8 = defpackage.eooc.a(r8, r3)
            long r3 = r8.getSeconds()
            fdhl r5 = defpackage.fdhl.d
            long r3 = defpackage.fdhk.g(r3, r5)
            int r8 = r8.getNano()
            fdhl r5 = defpackage.fdhl.a
            long r5 = defpackage.fdhk.f(r8, r5)
            long r3 = defpackage.fdhi.j(r3, r5)
            r7.d = r1
            r7.a = r2
            java.lang.Object r8 = defpackage.fdkj.d(r3, r7)
            if (r8 == r0) goto L64
        L52:
            chah r8 = defpackage.chah.b
            r2 = 0
            r7.d = r2
            r2 = 2
            r7.a = r2
            java.lang.Object r8 = r1.fO(r8, r7)
            if (r8 != r0) goto L61
            goto L64
        L61:
            fctx r8 = defpackage.fctx.a
            return r8
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgzy cgzyVar = new cgzy(this.b, this.c, fcxyVar);
        cgzyVar.d = obj;
        return cgzyVar;
    }
}
