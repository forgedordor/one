package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adhj extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ adhk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhj(adhk adhkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = adhkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adhj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [dose] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [dose, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L16
            java.lang.Object r1 = r9.c
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.b
            java.lang.Object r5 = r9.a
            defpackage.fctl.b(r10)
            goto L42
        L16:
            java.lang.Object r1 = r9.d
            java.lang.Object r4 = r9.c
            dorb r4 = (defpackage.dorb) r4
            java.lang.Object r5 = r9.b
            java.lang.Object r6 = r9.a
            defpackage.fctl.b(r10)
            r8 = r5
            r5 = r4
            r4 = r8
            goto L62
        L27:
            defpackage.fctl.b(r10)
            adhk r10 = r9.f
            dorb[] r1 = new defpackage.dorb[r2]
            r4 = 0
            dorb r5 = defpackage.dorb.MEDIA_TYPE_IMAGE
            r1[r4] = r5
            dorb r4 = defpackage.dorb.MEDIA_TYPE_VIDEO
            r1[r3] = r4
            java.util.List r1 = defpackage.fcva.g(r1)
            java.util.Iterator r1 = r1.iterator()
            dose r4 = r10.c
            r5 = r4
        L42:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L83
            java.lang.Object r10 = r1.next()
            dorb r10 = (defpackage.dorb) r10
            r9.a = r5
            r9.b = r4
            r9.c = r10
            r9.d = r1
            r9.e = r3
            java.lang.Object r6 = r4.b(r10, r9)
            if (r6 == r0) goto L82
            r8 = r5
            r5 = r10
            r10 = r6
            r6 = r8
        L62:
            dosh r7 = defpackage.dosh.a
            if (r10 != r7) goto L80
            r9.a = r6
            r9.b = r4
            r9.c = r1
            r10 = 0
            r9.d = r10
            r9.e = r2
            adik r10 = defpackage.adik.UNASSIGNED
            r7 = r4
            adhb r7 = (defpackage.adhb) r7
            java.lang.Object r10 = r7.a(r5, r10, r9)
            if (r10 == r0) goto L7e
            fctx r10 = defpackage.fctx.a
        L7e:
            if (r10 == r0) goto L82
        L80:
            r5 = r6
            goto L42
        L82:
            return r0
        L83:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adhj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adhj(this.f, fcxyVar);
    }
}
