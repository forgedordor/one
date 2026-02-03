package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctfz extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ctgb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctfz(ctgb ctgbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ctgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctfz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r6 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L12
            java.lang.Object r0 = r5.a
            ctgb r0 = (defpackage.ctgb) r0
            defpackage.fctl.b(r6)
            goto L7c
        L12:
            java.lang.Object r1 = r5.b
            java.lang.Object r4 = r5.a
            eiju r4 = (defpackage.eiju) r4
            defpackage.fctl.b(r6)
            goto L54
        L1c:
            defpackage.fctl.b(r6)
            boolean r6 = defpackage.abxb.a()
            if (r6 == 0) goto L2a
            ctgb r6 = r5.d
            efwo r6 = r6.f
            goto L2b
        L2a:
            r6 = r2
        L2b:
            ctgb r1 = r5.d
            fcsu r4 = r1.b
            java.lang.Object r4 = r4.b()
            afgn r4 = (defpackage.afgn) r4
            eiju r4 = r4.a(r6)
            boolean r6 = defpackage.crxi.a()
            if (r6 == 0) goto L5b
            fcsu r6 = r1.d
            java.lang.Object r6 = r6.b()
            csei r6 = (defpackage.csei) r6
            r5.a = r4
            r5.b = r1
            r5.c = r3
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L54
            goto L99
        L54:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L67
        L5b:
            fcsu r6 = r1.c
            java.lang.Object r6 = r6.b()
            csel r6 = (defpackage.csel) r6
            boolean r6 = r6.e()
        L67:
            ctgb r1 = (defpackage.ctgb) r1
            r1.j = r6
            ctgb r6 = r5.d
            r5.a = r6
            r5.b = r2
            r1 = 2
            r5.c = r1
            java.lang.Object r1 = defpackage.fdxs.c(r4, r5)
            if (r1 == r0) goto L99
            r0 = r6
            r6 = r1
        L7c:
            r6.getClass()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0.i = r6
            ctgb r6 = r5.d
            boolean r0 = r6.i
            r1 = 0
            if (r0 == 0) goto L93
            boolean r0 = r6.j
            if (r0 == 0) goto L93
            goto L94
        L93:
            r3 = r1
        L94:
            r6.h = r3
            fctx r6 = defpackage.fctx.a
            return r6
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctfz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctfz(this.d, fcxyVar);
    }
}
