package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbce extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbcf b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbce(fcxy fcxyVar, cbcf cbcfVar, String str) {
        super(2, fcxyVar);
        this.b = cbcfVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbce) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r5.g(r1, r4) == r0) goto L31;
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
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L55
            goto L79
        Ld:
            java.lang.Object r5 = r4.d
            fdjx r5 = (defpackage.fdjx) r5
            cczi r5 = defpackage.cbcf.a
            java.lang.Object r5 = r5.e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L22
            cbbk r5 = defpackage.cbbk.b
            return r5
        L22:
            cbcf r5 = r4.b
            fcsu r1 = r5.b
            java.lang.Object r1 = r1.b()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = r4.c
            java.lang.Object r1 = r1.get(r3)
            fcsu r1 = (defpackage.fcsu) r1
            if (r1 != 0) goto L3a
            fcsu r1 = r5.h(r3)
        L3a:
            java.lang.Object r1 = r1.b()
            cazg r1 = (defpackage.cazg) r1
            caya r1 = r1.a()
            caxl r1 = (defpackage.caxl) r1
            boolean r1 = r1.j
            if (r1 != 0) goto L4d
            cbbk r5 = defpackage.cbbk.a
            return r5
        L4d:
            r4.a = r2
            java.lang.Object r5 = r5.f(r4)
            if (r5 == r0) goto L7c
        L55:
            java.lang.String r1 = r4.c
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r5.get(r1)
            cbbk r2 = defpackage.cbbk.b
            if (r5 != r2) goto L62
            return r2
        L62:
            cczi r5 = defpackage.cbcf.a
            boolean r5 = defpackage.cbbr.a(r1)
            if (r5 == 0) goto L6d
            cbbk r5 = defpackage.cbbk.a
            return r5
        L6d:
            cbcf r5 = r4.b
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r5.g(r1, r4)
            if (r5 != r0) goto L79
            goto L7c
        L79:
            cbbk r5 = defpackage.cbbk.b
            return r5
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbce.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbce cbceVar = new cbce(fcxyVar, this.b, this.c);
        cbceVar.d = obj;
        return cbceVar;
    }
}
