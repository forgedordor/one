package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djob extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ evxt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djob(ddp ddpVar, evxt evxtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = evxtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djob) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
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
            goto L58
        Ld:
            r5 = r9
            goto L34
        Lf:
            ddp r3 = r9.b
            java.lang.Float r4 = new java.lang.Float
            r10 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r10)
            evxt r10 = r9.c
            evxf r10 = r10.c
            if (r10 != 0) goto L20
            evxf r10 = defpackage.evxf.a
        L20:
            r10.getClass()
            dia r5 = defpackage.djnx.b(r10)
            r9.a = r2
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r10 = defpackage.ddp.k(r3, r4, r5, r6, r7, r8)
            r5 = r7
            if (r10 == r0) goto L5b
        L34:
            ddp r1 = r5.b
            java.lang.Float r2 = new java.lang.Float
            r10 = 0
            r2.<init>(r10)
            evxt r10 = r5.c
            evxf r10 = r10.d
            if (r10 != 0) goto L44
            evxf r10 = defpackage.evxf.a
        L44:
            r10.getClass()
            dia r3 = defpackage.djnx.b(r10)
            r10 = 2
            r5.a = r10
            r4 = 0
            r6 = 12
            java.lang.Object r10 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L58
            goto L5b
        L58:
            fctx r10 = defpackage.fctx.a
            return r10
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djob.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djob(this.b, this.c, fcxyVar);
    }
}
