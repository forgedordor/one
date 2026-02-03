package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqp extends fcyz implements fdau {
    int a;
    final /* synthetic */ dmqz b;
    final /* synthetic */ hox c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmqp(dmqz dmqzVar, hox hoxVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = dmqzVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((ihs) obj2).a;
        dmqp dmqpVar = new dmqp(this.b, this.c, (fcxy) obj3);
        dmqpVar.d = (dwn) obj;
        return dmqpVar.b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Type inference failed for: r3v3, types: [dwn, java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r3) throws java.lang.Throwable {
        /*
            r2 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r2.a
            defpackage.fctl.b(r3)
            if (r1 == 0) goto La
            goto L1a
        La:
            java.lang.Object r3 = r2.d
            dmqz r1 = r2.b
            if (r1 == 0) goto L2d
            r1 = 1
            r2.a = r1
            java.lang.Object r3 = r3.a(r2)
            if (r3 != r0) goto L1a
            return r0
        L1a:
            hox r3 = r2.c
            boolean r0 = defpackage.dmqw.d(r3)
            if (r0 == 0) goto L2d
            dmqz r0 = r2.b
            fdae r0 = r0.b
            r0.invoke()
            r0 = 0
            defpackage.dmqw.c(r3, r0)
        L2d:
            fctx r3 = defpackage.fctx.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmqp.b(java.lang.Object):java.lang.Object");
    }
}
