package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnxy extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnyn b;
    final /* synthetic */ dnvg c;
    final /* synthetic */ dnhn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnxy(dnyn dnynVar, dnvg dnvgVar, dnhn dnhnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnynVar;
        this.c = dnvgVar;
        this.d = dnhnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnxy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (defpackage.dneq.e(r1, r2, r3, null, r7, 12) == r0) goto L18;
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
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L27
            goto L55
        Ld:
            dnyn r8 = r7.b
            fdae r8 = r8.bG()
            java.lang.Object r8 = r8.invoke()
            dnhl r8 = (defpackage.dnhl) r8
            dnhq r8 = r8.b
            dnvg r1 = r7.c
            dnhn r3 = r7.d
            r7.a = r2
            java.lang.Object r8 = r8.b(r1, r3, r7)
            if (r8 == r0) goto L58
        L27:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L55
            dnyn r8 = r7.b
            dneq r8 = r8.am
            if (r8 != 0) goto L3b
            java.lang.String r8 = "usageProcessor"
            defpackage.fdbq.c(r8)
            r8 = 0
        L3b:
            r1 = r8
            dnvg r8 = r7.c
            dnwt r2 = new dnwt
            java.lang.String r8 = r8.a
            r2.<init>(r8)
            dnce r3 = defpackage.dpil.aK
            r8 = 2
            r7.a = r8
            r4 = 0
            r6 = 12
            r5 = r7
            java.lang.Object r8 = defpackage.dneq.e(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L55
            goto L58
        L55:
            fctx r8 = defpackage.fctx.a
            return r8
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnxy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnxy(this.b, this.c, this.d, fcxyVar);
    }
}
