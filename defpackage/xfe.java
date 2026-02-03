package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfe extends fcyz implements fdat {
    int a;
    final /* synthetic */ asgk b;
    final /* synthetic */ xfi c;
    Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfe(fcxy fcxyVar, asgk asgkVar, xfi xfiVar) {
        super(2, fcxyVar);
        this.b = asgkVar;
        this.c = xfiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xfe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L15
            java.lang.Object r0 = r6.d
            java.lang.Object r1 = r6.e
            java.util.List r1 = (java.util.List) r1
            defpackage.fctl.b(r7)
            goto La8
        L15:
            java.lang.Object r1 = r6.d
            java.lang.Object r4 = r6.e
            java.util.List r4 = (java.util.List) r4
            defpackage.fctl.b(r7)
            goto L4d
        L1f:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.e
            fdjx r7 = (defpackage.fdjx) r7
            fcww r1 = new fcww
            r7 = 0
            r1.<init>(r7)
            asgk r7 = r6.b
            boolean r7 = r7.a()
            if (r7 != 0) goto L69
            boolean r7 = defpackage.crbf.e()
            if (r7 == 0) goto L69
            xfi r7 = r6.c
            dnuy r7 = r7.p
            if (r7 == 0) goto L59
            r6.e = r1
            r6.d = r1
            r6.a = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto Lb6
            r4 = r1
        L4d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != r3) goto L57
            r7 = r3
            goto L5b
        L57:
            r7 = r2
            goto L5b
        L59:
            r4 = r1
            goto L57
        L5b:
            if (r7 == 0) goto L6a
            xfi r7 = r6.c
            dpxe r5 = defpackage.dpxe.i
            dpyz r7 = r7.e(r5)
            r1.add(r7)
            goto L6a
        L69:
            r4 = r1
        L6a:
            xfi r7 = r6.c
            dpxe r5 = defpackage.dpxe.b
            dpyz r5 = r7.e(r5)
            r1.add(r5)
            dpxe r5 = defpackage.dpxe.c
            dpyz r5 = r7.e(r5)
            r1.add(r5)
            dpxe r5 = defpackage.dpxe.f
            dpyz r5 = r7.e(r5)
            r1.add(r5)
            asgk r5 = r6.b
            boolean r5 = r5.a()
            if (r5 == 0) goto Lc4
            boolean r5 = defpackage.crbf.e()
            if (r5 == 0) goto Lc4
            dnuy r7 = r7.p
            if (r7 == 0) goto Lb7
            r6.e = r4
            r6.d = r1
            r5 = 2
            r6.a = r5
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto Lb6
            r0 = r1
            r1 = r4
        La8:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != r3) goto Lb3
            r4 = r1
            r2 = r3
            goto Lb4
        Lb3:
            r4 = r1
        Lb4:
            r1 = r0
            goto Lb7
        Lb6:
            return r0
        Lb7:
            if (r2 == 0) goto Lc4
            xfi r7 = r6.c
            dpxe r0 = defpackage.dpxe.i
            dpyz r7 = r7.e(r0)
            r1.add(r7)
        Lc4:
            java.util.List r7 = defpackage.fcva.a(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xfe xfeVar = new xfe(fcxyVar, this.b, this.c);
        xfeVar.e = obj;
        return xfeVar;
    }
}
