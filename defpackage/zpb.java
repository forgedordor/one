package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zpb extends fcyz implements fdat {
    int a;
    final /* synthetic */ zpe b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpb(zpe zpeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zpeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zpb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r9 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 == r2) goto L15
            java.lang.Object r0 = r8.c
            fdjx r0 = (defpackage.fdjx) r0
            defpackage.fctl.b(r9)
            goto Lc2
        L15:
            java.lang.Object r1 = r8.c
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r9)
            goto L62
        L1d:
            java.lang.Object r1 = r8.c
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r9)
            goto L45
        L25:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.c
            fdjx r9 = (defpackage.fdjx) r9
            zpe r1 = r8.b
            ascy r4 = r1.b
            boolean r4 = r4.a()
            if (r4 == 0) goto Lb4
            r8.c = r9
            r8.a = r3
            java.lang.String r3 = "file_id_map"
            java.lang.Object r1 = r1.d(r3, r8)
            if (r1 == r0) goto Lc8
            r7 = r1
            r1 = r9
            r9 = r7
        L45:
            java.util.Map r9 = (java.util.Map) r9
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L54
            zpe r3 = r8.b
            fduf r3 = r3.c
            r3.f(r9)
        L54:
            zpe r9 = r8.b
            r8.c = r1
            r8.a = r2
            java.lang.String r2 = "priority_map"
            java.lang.Object r9 = r9.d(r2, r8)
            if (r9 == r0) goto Lc8
        L62:
            java.util.Map r9 = (java.util.Map) r9
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Lb3
            zpe r2 = r8.b
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = defpackage.fcwa.a(r4)
            r3.<init>(r4)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L81:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lae
            java.lang.Object r4 = r9.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r4 = defpackage.fdgn.g(r4)
            if (r4 == 0) goto La2
            int r4 = r4.intValue()
            goto La5
        La2:
            r4 = 2147483647(0x7fffffff, float:NaN)
        La5:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            r3.put(r5, r6)
            goto L81
        Lae:
            fduf r9 = r2.d
            r9.f(r3)
        Lb3:
            r9 = r1
        Lb4:
            zpe r1 = r8.b
            r8.c = r9
            r2 = 3
            r8.a = r2
            java.lang.Object r1 = r1.e(r8)
            if (r1 == r0) goto Lc8
            r0 = r9
        Lc2:
            defpackage.fdjy.h(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        zpb zpbVar = new zpb(this.b, fcxyVar);
        zpbVar.c = obj;
        return zpbVar;
    }
}
