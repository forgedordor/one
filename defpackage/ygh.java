package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ygh extends fcyy implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ hox d;
    final /* synthetic */ ains e;
    final /* synthetic */ ddp f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygh(fdjx fdjxVar, hox hoxVar, ains ainsVar, ddp ddpVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = fdjxVar;
        this.d = hoxVar;
        this.e = ainsVar;
        this.f = ddpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ygh) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.b
            r2 = 3
            r3 = 1
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L20
            if (r1 == r4) goto L16
            java.lang.Object r0 = r13.g
            fdce r0 = (defpackage.fdce) r0
            defpackage.fctl.b(r14)
            goto L7f
        L16:
            java.lang.Object r1 = r13.a
            java.lang.Object r3 = r13.g
            ire r3 = (defpackage.ire) r3
            defpackage.fctl.b(r14)
            goto L5c
        L20:
            java.lang.Object r1 = r13.a
            java.lang.Object r3 = r13.g
            ire r3 = (defpackage.ire) r3
            defpackage.fctl.b(r14)
            goto L45
        L2a:
            defpackage.fctl.b(r14)
            java.lang.Object r14 = r13.g
            ire r14 = (defpackage.ire) r14
            fdce r1 = new fdce
            r1.<init>()
            r13.g = r14
            r13.a = r1
            r13.b = r3
            java.lang.Object r3 = defpackage.dzm.g(r14, r5, r13, r4)
            if (r3 == r0) goto La6
            r12 = r3
            r3 = r14
            r14 = r12
        L45:
            ise r14 = (defpackage.ise) r14
            long r6 = r14.a
            hox r14 = r13.d
            ygd r8 = new ygd
            r8.<init>()
            r13.g = r3
            r13.a = r1
            r13.b = r4
            java.lang.Object r14 = defpackage.duh.e(r3, r6, r8, r13)
            if (r14 == r0) goto La6
        L5c:
            ise r14 = (defpackage.ise) r14
            if (r14 == 0) goto La3
            hox r7 = r13.d
            fdjx r8 = r13.c
            ains r10 = r13.e
            ddp r11 = r13.f
            yge r6 = new yge
            r9 = r1
            fdce r9 = (defpackage.fdce) r9
            r6.<init>()
            r13.g = r1
            r13.a = r5
            r13.b = r2
            long r7 = r14.a
            java.lang.Object r14 = defpackage.duh.j(r3, r7, r6, r13)
            if (r14 == r0) goto La6
            r0 = r1
        L7f:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto La3
            fdjx r14 = r13.c
            ddp r1 = r13.f
            ygg r3 = new ygg
            r3.<init>(r1, r5)
            defpackage.auvw.k(r14, r5, r5, r3, r2)
            hox r14 = r13.d
            java.lang.Float r1 = new java.lang.Float
            r2 = 0
            r1.<init>(r2)
            r14.b(r1)
            fdce r0 = (defpackage.fdce) r0
            r14 = 0
            r0.a = r14
        La3:
            fctx r14 = defpackage.fctx.a
            return r14
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ygh yghVar = new ygh(this.c, this.d, this.e, this.f, fcxyVar);
        yghVar.g = obj;
        return yghVar;
    }
}
