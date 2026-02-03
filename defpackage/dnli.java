package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnli extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnlv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnli(dnlv dnlvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnlvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnli) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
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
            r2 = 1
            defpackage.fctl.b(r9)
            if (r1 == 0) goto Lb
            goto L1f
        Lb:
            dnlv r9 = r8.b
            ecjh r9 = r9.a
            com.google.common.util.concurrent.ListenableFuture r9 = r9.a()
            r9.getClass()
            r8.a = r2
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)
            if (r9 != r0) goto L1f
            return r0
        L1f:
            dnlv r0 = r8.b
            dnnj r9 = (defpackage.dnnj) r9
            evub r1 = r9.b
            java.util.Map r1 = j$.util.DesugarCollections.unmodifiableMap(r1)
            r1.getClass()
            java.util.Map r3 = r0.c
            r3.putAll(r1)
            evub r9 = r9.c
            java.util.Map r9 = j$.util.DesugarCollections.unmodifiableMap(r9)
            r9.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r3 = r9.size()
            int r3 = defpackage.fcwa.a(r3)
            r1.<init>(r3)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L4f:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto La3
            java.lang.Object r3 = r9.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            dnng r3 = (defpackage.dnng) r3
            r3.getClass()
            java.lang.String r5 = r3.c
            r6 = 0
            if (r5 == 0) goto L81
            int r7 = r5.length()
            if (r7 != 0) goto L74
            r5 = r6
        L74:
            if (r5 == 0) goto L81
            fctc r7 = defpackage.dnjw.a
            java.lang.Class<dnjw> r7 = defpackage.dnjw.class
            java.lang.Enum r5 = java.lang.Enum.valueOf(r7, r5)
            dnjw r5 = (defpackage.dnjw) r5
            goto L82
        L81:
            r5 = r6
        L82:
            java.lang.String r3 = r3.d
            if (r3 == 0) goto L9a
            int r7 = r3.length()
            if (r7 != 0) goto L8d
            r3 = r6
        L8d:
            if (r3 == 0) goto L9a
            fctc r6 = defpackage.dnjz.a
            java.lang.Class<dnjz> r6 = defpackage.dnjz.class
            java.lang.Enum r3 = java.lang.Enum.valueOf(r6, r3)
            r6 = r3
            dnjz r6 = (defpackage.dnjz) r6
        L9a:
            dnlh r3 = new dnlh
            r3.<init>(r5, r6)
            r1.put(r4, r3)
            goto L4f
        La3:
            java.util.Map r9 = r0.d
            r9.putAll(r1)
            r0.b = r2
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnli.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnli(this.b, fcxyVar);
    }
}
