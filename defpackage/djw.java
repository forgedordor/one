package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djw extends fcyz implements fdat {
    boolean a;
    int b;
    final /* synthetic */ dwn c;
    final /* synthetic */ long d;
    final /* synthetic */ dkd e;
    final /* synthetic */ ebk f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djw(dwn dwnVar, long j, ebk ebkVar, dkd dkdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dwnVar;
        this.d = j;
        this.f = ebkVar;
        this.e = dkdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (r14.a(r1, r13) != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r2.a(r14, r13) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.b
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 == r5) goto L16
            defpackage.fctl.b(r14)
            goto Lb0
        L16:
            java.lang.Object r1 = r13.g
            ebn r1 = (defpackage.ebn) r1
            defpackage.fctl.b(r14)
            goto L82
        L1e:
            boolean r1 = r13.a
            defpackage.fctl.b(r14)
            goto L68
        L24:
            java.lang.Object r1 = r13.g
            fdlr r1 = (defpackage.fdlr) r1
            defpackage.fctl.b(r14)
            goto L4f
        L2c:
            defpackage.fctl.b(r14)
            java.lang.Object r14 = r13.g
            fdjx r14 = (defpackage.fdjx) r14
            dkd r8 = r13.e
            long r9 = r13.d
            ebk r11 = r13.f
            djv r7 = new djv
            r12 = 0
            r7.<init>(r8, r9, r11, r12)
            fdlr r1 = defpackage.fdil.d(r14, r6, r6, r7, r5)
            dwn r14 = r13.c
            r13.g = r1
            r13.b = r4
            java.lang.Object r14 = r14.b(r13)
            if (r14 == r0) goto Lb7
        L4f:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            boolean r4 = r1.v()
            if (r4 == 0) goto L8f
            r13.g = r6
            r13.a = r14
            r13.b = r3
            java.lang.Object r1 = defpackage.fdlw.a(r1, r13)
            if (r1 == r0) goto Lb7
            r1 = r14
        L68:
            if (r1 == 0) goto Lb0
            long r3 = r13.d
            ebm r14 = new ebm
            r14.<init>(r3)
            ebn r1 = new ebn
            r1.<init>(r14)
            ebk r3 = r13.f
            r13.g = r1
            r13.b = r5
            java.lang.Object r14 = r3.a(r14, r13)
            if (r14 == r0) goto Lb7
        L82:
            ebk r14 = r13.f
            r13.g = r6
            r13.b = r2
            java.lang.Object r14 = r14.a(r1, r13)
            if (r14 != r0) goto Lb0
            goto Lb7
        L8f:
            dkd r1 = r13.e
            ebm r1 = r1.f
            if (r1 == 0) goto Lb0
            ebk r2 = r13.f
            if (r14 == 0) goto L9f
            ebn r14 = new ebn
            r14.<init>(r1)
            goto La4
        L9f:
            ebl r14 = new ebl
            r14.<init>(r1)
        La4:
            r13.g = r6
            r1 = 5
            r13.b = r1
            java.lang.Object r14 = r2.a(r14, r13)
            if (r14 != r0) goto Lb0
            goto Lb7
        Lb0:
            dkd r14 = r13.e
            r14.f = r6
            fctx r14 = defpackage.fctx.a
            return r14
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        djw djwVar = new djw(this.c, this.d, this.f, this.e, fcxyVar);
        djwVar.g = obj;
        return djwVar;
    }
}
