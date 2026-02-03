package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gap extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ gaq e;
    final /* synthetic */ ebj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gap(ddp ddpVar, float f, boolean z, gaq gaqVar, ebj ebjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = f;
        this.d = z;
        this.e = gaqVar;
        this.f = ebjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gap) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r7.e(r1, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (defpackage.hik.a(r7, r3, r1, r2, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
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
            if (r1 == 0) goto Lb
            goto L72
        Lb:
            ddp r7 = r6.b
            java.lang.Object r1 = r7.c()
            kir r1 = (defpackage.kir) r1
            float r1 = r1.a
            float r3 = r6.c
            boolean r1 = defpackage.kir.b(r1, r3)
            if (r1 != 0) goto L72
            boolean r1 = r6.d
            if (r1 != 0) goto L2f
            kir r1 = new kir
            r1.<init>(r3)
            r6.a = r2
            java.lang.Object r7 = r7.e(r1, r6)
            if (r7 != r0) goto L72
            goto L71
        L2f:
            java.lang.Object r1 = r7.c()
            kir r1 = (defpackage.kir) r1
            float r1 = r1.a
            gaq r2 = r6.e
            float r4 = r2.b
            boolean r4 = defpackage.kir.b(r1, r4)
            if (r4 == 0) goto L49
            ebm r1 = new ebm
            r4 = 0
            r1.<init>(r4)
            goto L66
        L49:
            float r4 = r2.d
            boolean r4 = defpackage.kir.b(r1, r4)
            if (r4 == 0) goto L57
            ebh r1 = new ebh
            r1.<init>()
            goto L66
        L57:
            float r2 = r2.c
            boolean r1 = defpackage.kir.b(r1, r2)
            if (r1 == 0) goto L65
            ebc r1 = new ebc
            r1.<init>()
            goto L66
        L65:
            r1 = 0
        L66:
            ebj r2 = r6.f
            r4 = 2
            r6.a = r4
            java.lang.Object r7 = defpackage.hik.a(r7, r3, r1, r2, r6)
            if (r7 != r0) goto L72
        L71:
            return r0
        L72:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gap.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gap(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
