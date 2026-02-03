package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlyz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlzc b;
    final /* synthetic */ fdjc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlyz(dlzc dlzcVar, fdjc fdjcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlzcVar;
        this.c = fdjcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlyz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r8.e.fO(r1, r7) != r0) goto L20;
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
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L11
            defpackage.fctl.b(r8)
            if (r1 == r3) goto L3b
            if (r1 == r2) goto L67
            goto L7a
        L11:
            defpackage.fctl.b(r8)
            dlzc r8 = r7.b
            fdjc r1 = r7.c
            dlyw r5 = new dlyw
            r5.<init>(r1, r4)
            fdvl r1 = new fdvl
            fduj r6 = r8.f
            r1.<init>(r6, r5)
            dlyx r5 = new dlyx
            r5.<init>(r4)
            fdrw r6 = new fdrw
            r6.<init>(r1, r5)
            dlyy r1 = new dlyy
            r1.<init>(r8)
            r7.a = r3
            java.lang.Object r8 = r6.a(r1, r7)
            if (r8 == r0) goto L7d
        L3b:
            dlzc r8 = r7.b
            r7.a = r2
            fdiu r1 = new fdiu
            fcxy r2 = defpackage.fcym.c(r7)
            r1.<init>(r2, r3)
            r1.B()
            exkx r2 = r8.h
            if (r2 != 0) goto L55
            java.lang.String r2 = "processor"
            defpackage.fdbq.c(r2)
            r2 = r4
        L55:
            dlzb r3 = new dlzb
            r3.<init>(r8, r1)
            r2.e(r3)
            java.lang.Object r8 = r1.m()
            if (r8 == r0) goto L65
            fctx r8 = defpackage.fctx.a
        L65:
            if (r8 == r0) goto L7d
        L67:
            dlzc r8 = r7.b
            dlyn r1 = new dlyn
            r1.<init>(r4)
            r2 = 3
            r7.a = r2
            fdue r8 = r8.e
            java.lang.Object r8 = r8.fO(r1, r7)
            if (r8 != r0) goto L7a
            goto L7d
        L7a:
            fctx r8 = defpackage.fctx.a
            return r8
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlyz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlyz(this.b, this.c, fcxyVar);
    }
}
