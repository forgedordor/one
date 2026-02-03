package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djoc extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ evxt c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djoc(ddp ddpVar, evxt evxtVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = evxtVar;
        this.d = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djoc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (defpackage.ddp.k(r1, r2, r3, null, r5, 12) == r0) goto L20;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            r2 = 1
            defpackage.fctl.b(r10)
            if (r1 == 0) goto Lf
            if (r1 == r2) goto Ld
            goto L6f
        Ld:
            r5 = r9
            goto L49
        Lf:
            ddp r3 = r9.b
            evxt r10 = r9.c
            evta r1 = r10.b
            r1.getClass()
            java.lang.Object r1 = defpackage.fcva.N(r1)
            r1.getClass()
            java.lang.Number r1 = (java.lang.Number) r1
            long r4 = r1.longValue()
            long r4 = defpackage.ijg.d(r4)
            r5 = r4
            ije r4 = new ije
            r4.<init>(r5)
            evxf r10 = r10.c
            if (r10 != 0) goto L35
            evxf r10 = defpackage.evxf.a
        L35:
            r10.getClass()
            dia r5 = defpackage.djnx.a(r10)
            r9.a = r2
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r10 = defpackage.ddp.k(r3, r4, r5, r6, r7, r8)
            r5 = r7
            if (r10 == r0) goto L72
        L49:
            ddp r1 = r5.b
            long r2 = r5.d
            r3 = r2
            ije r2 = new ije
            r2.<init>(r3)
            evxt r10 = r5.c
            evxf r10 = r10.d
            if (r10 != 0) goto L5b
            evxf r10 = defpackage.evxf.a
        L5b:
            r10.getClass()
            dia r3 = defpackage.djnx.a(r10)
            r10 = 2
            r5.a = r10
            r4 = 0
            r6 = 12
            java.lang.Object r10 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L6f
            goto L72
        L6f:
            fctx r10 = defpackage.fctx.a
            return r10
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djoc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djoc(this.b, this.c, this.d, fcxyVar);
    }
}
