package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atfc extends fcyz implements fdat {
    int a;
    final /* synthetic */ athf b;
    final /* synthetic */ atfx c;
    final /* synthetic */ athh d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atfc(fcxy fcxyVar, athf athfVar, atfx atfxVar, athh athhVar) {
        super(2, fcxyVar);
        this.b = athfVar;
        this.c = atfxVar;
        this.d = athhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atfc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r5.c.i(r1, r4) != r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r5)
            if (r1 == r3) goto L23
            if (r1 == r2) goto L2f
            goto L3f
        L10:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.e
            fdjx r5 = (defpackage.fdjx) r5
            athf r5 = r4.b
            r4.a = r3
            athk r5 = r5.a
            java.lang.Object r5 = r5.b(r4)
            if (r5 == r0) goto L42
        L23:
            athf r5 = r4.b
            r4.a = r2
            fdkf r5 = r5.c
            java.lang.Object r5 = r5.c(r4)
            if (r5 == r0) goto L42
        L2f:
            atfx r5 = r4.c
            athh r1 = r4.d
            r2 = 3
            r4.a = r2
            atjz r5 = r5.c
            java.lang.Object r5 = r5.i(r1, r4)
            if (r5 != r0) goto L3f
            goto L42
        L3f:
            fctx r5 = defpackage.fctx.a
            return r5
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atfc atfcVar = new atfc(fcxyVar, this.b, this.c, this.d);
        atfcVar.e = obj;
        return atfcVar;
    }
}
