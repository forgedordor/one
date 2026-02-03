package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dloq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dloh b;
    final /* synthetic */ dew c;
    final /* synthetic */ dew d;
    final /* synthetic */ hox e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dloq(dloh dlohVar, dew dewVar, dew dewVar2, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlohVar;
        this.c = dewVar;
        this.d = dewVar2;
        this.e = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dloq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r10 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r10 == r0) goto L14;
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
            goto L51
        Ld:
            r5 = r9
            goto L31
        Lf:
            dloh r10 = r9.b
            boolean r10 = r10.e
            if (r10 == 0) goto L34
            hox r10 = r9.e
            ddp r3 = defpackage.dlor.a(r10)
            java.lang.Float r4 = new java.lang.Float
            r10 = 1048576000(0x3e800000, float:0.25)
            r4.<init>(r10)
            dew r5 = r9.c
            r9.a = r2
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r10 = defpackage.ddp.k(r3, r4, r5, r6, r7, r8)
            r5 = r7
            if (r10 == r0) goto L50
        L31:
            ddx r10 = (defpackage.ddx) r10
            goto L53
        L34:
            r5 = r9
            hox r10 = r5.e
            ddp r1 = defpackage.dlor.a(r10)
            java.lang.Float r2 = new java.lang.Float
            r10 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r10)
            dew r3 = r5.d
            r10 = 2
            r5.a = r10
            r4 = 0
            r6 = 12
            java.lang.Object r10 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L51
        L50:
            return r0
        L51:
            ddx r10 = (defpackage.ddx) r10
        L53:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dloq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dloq(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
