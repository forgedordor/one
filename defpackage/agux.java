package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agux extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ aguy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agux(aguy aguyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = aguyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agux) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.Object r0 = r5.a
            defpackage.fctl.b(r6)
            goto L60
        L10:
            defpackage.fctl.b(r6)
            goto L23
        L14:
            defpackage.fctl.b(r6)
            aguy r6 = r5.c
            r5.b = r3
            agqq r6 = r6.c
            java.lang.Object r6 = defpackage.agqm.a(r6, r2, r3, r5, r3)
            if (r6 == r0) goto Ld6
        L23:
            agqo r6 = (defpackage.agqo) r6
            java.util.List r6 = r6.b
            ejxr r1 = defpackage.crbf.ak
            java.lang.Object r1 = r1.get()
            cczi r1 = (defpackage.cczi) r1
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld3
            ejxr r1 = defpackage.crbf.aG
            java.lang.Object r1 = r1.get()
            cczi r1 = (defpackage.cczi) r1
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld3
            aguy r1 = r5.c
            r5.a = r6
            r3 = 2
            r5.b = r3
            cgte r1 = r1.b
            java.lang.Object r1 = r1.e(r5)
            if (r1 == r0) goto Ld6
            r0 = r6
            r6 = r1
        L60:
            aguy r1 = r5.c
            efwo r3 = r1.a
            boolean r6 = defpackage.fdbq.f(r6, r3)
            if (r6 == 0) goto Ld3
            agqp r6 = defpackage.agqp.d
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto Ld3
            agqp r6 = defpackage.agqp.c
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto Ld3
            agqp r6 = defpackage.agqp.f
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto Ld3
            agqp r6 = defpackage.agqp.e
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L8b
            goto Ld3
        L8b:
            cogw r6 = r1.d
            j$.time.LocalDateTime r6 = r6.g()
            int r0 = r6.getHour()
            r3 = 8
            r4 = 9
            if (r0 >= r4) goto Lab
            int r4 = r4 - r0
            fdde r0 = defpackage.fddf.a
            int r0 = r0.c(r3)
            int r4 = r4 + r0
            int r4 = r4 * 60
            int r6 = r6.getMinute()
            int r4 = r4 - r6
            goto Lc2
        Lab:
            r4 = 17
            if (r0 < r4) goto Lc1
            int r0 = 33 - r0
            fdde r4 = defpackage.fddf.a
            int r3 = r4.c(r3)
            int r0 = r0 + r3
            int r0 = r0 * 60
            int r6 = r6.getMinute()
            int r4 = r0 - r6
            goto Lc2
        Lc1:
            r4 = 0
        Lc2:
            aguw r6 = r1.e
            aguv r0 = new aguv
            long r3 = (long) r4
            r0.<init>(r6, r3, r2)
            fdjx r6 = r6.a
            r1 = 3
            defpackage.auvw.k(r6, r2, r2, r0, r1)
            fctx r6 = defpackage.fctx.a
            return r6
        Ld3:
            fctx r6 = defpackage.fctx.a
            return r6
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agux.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agux(this.c, fcxyVar);
    }
}
