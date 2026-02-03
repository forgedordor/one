package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbe extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ gbf e;
    final /* synthetic */ ebj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbe(ddp ddpVar, float f, boolean z, gbf gbfVar, ebj ebjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = f;
        this.d = z;
        this.e = gbfVar;
        this.f = ebjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gbe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r7.e(r1, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (defpackage.hik.a(r7, r3, r1, r2, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        return r0;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Lc
            goto L7e
        Lc:
            ddp r7 = r6.b
            java.lang.Object r1 = r7.c()
            kir r1 = (defpackage.kir) r1
            float r1 = r1.a
            float r3 = r6.c
            boolean r1 = defpackage.kir.b(r1, r3)
            if (r1 != 0) goto L7e
            boolean r1 = r6.d
            if (r1 != 0) goto L30
            kir r1 = new kir
            r1.<init>(r3)
            r6.a = r2
            java.lang.Object r7 = r7.e(r1, r6)
            if (r7 != r0) goto L7e
            goto L7d
        L30:
            java.lang.Object r1 = r7.c()
            kir r1 = (defpackage.kir) r1
            float r1 = r1.a
            gbf r2 = r6.e
            r4 = 0
            boolean r5 = defpackage.kir.b(r1, r4)
            if (r5 == 0) goto L49
            ebm r1 = new ebm
            r4 = 0
            r1.<init>(r4)
            goto L72
        L49:
            float r2 = r2.a
            boolean r2 = defpackage.kir.b(r1, r2)
            if (r2 == 0) goto L57
            ebh r1 = new ebh
            r1.<init>()
            goto L72
        L57:
            boolean r2 = defpackage.kir.b(r1, r4)
            if (r2 == 0) goto L63
            ebc r1 = new ebc
            r1.<init>()
            goto L72
        L63:
            r2 = 1086324736(0x40c00000, float:6.0)
            boolean r1 = defpackage.kir.b(r1, r2)
            if (r1 == 0) goto L71
            eba r1 = new eba
            r1.<init>()
            goto L72
        L71:
            r1 = 0
        L72:
            ebj r2 = r6.f
            r4 = 2
            r6.a = r4
            java.lang.Object r7 = defpackage.hik.a(r7, r3, r1, r2, r6)
            if (r7 != r0) goto L7e
        L7d:
            return r0
        L7e:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gbe(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
