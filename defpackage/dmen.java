package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmen extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmen(ddp ddpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmen) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if (defpackage.ddp.k(r5, r6, r7, null, r9, 12) == r0) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            r2 = 6
            r3 = 0
            r4 = 0
            r5 = 1
            defpackage.fctl.b(r13)
            if (r1 == 0) goto L12
            if (r1 == r5) goto L10
            goto L59
        L10:
            r9 = r12
            goto L36
        L12:
            ddp r6 = r12.b
            java.lang.Float r7 = new java.lang.Float
            r13 = 1066192077(0x3f8ccccd, float:1.1)
            r7.<init>(r13)
            j$.time.Duration r13 = defpackage.dmcc.a
            j$.time.Duration r13 = defpackage.dmcc.a
            long r8 = r13.toMillis()
            int r13 = (int) r8
            dia r8 = defpackage.dea.c(r13, r4, r3, r2)
            r12.a = r5
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r13 = defpackage.ddp.k(r6, r7, r8, r9, r10, r11)
            r9 = r10
            if (r13 == r0) goto L5c
        L36:
            ddp r5 = r9.b
            java.lang.Float r6 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13)
            j$.time.Duration r13 = defpackage.dmcc.a
            j$.time.Duration r13 = defpackage.dmcc.b
            long r7 = r13.toMillis()
            int r13 = (int) r7
            dia r7 = defpackage.dea.c(r13, r4, r3, r2)
            r13 = 2
            r9.a = r13
            r8 = 0
            r10 = 12
            java.lang.Object r13 = defpackage.ddp.k(r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto L59
            goto L5c
        L59:
            fctx r13 = defpackage.fctx.a
            return r13
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmen.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmen(this.b, fcxyVar);
    }
}
