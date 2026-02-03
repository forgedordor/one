package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chqx extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ chqz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chqx(chqz chqzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = chqzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chqx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L14
            java.lang.Object r0 = r6.b
            java.lang.Object r1 = r6.a
            defpackage.fctl.b(r7)
            goto L6b
        L14:
            java.lang.Object r1 = r6.a
            defpackage.fctl.b(r7)
            goto L50
        L1a:
            defpackage.fctl.b(r7)
            goto L33
        L1e:
            defpackage.fctl.b(r7)
            chqz r7 = r6.d
            fcsu r7 = r7.h
            java.lang.Object r7 = r7.b()
            ctcm r7 = (defpackage.ctcm) r7
            r6.c = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto L9b
        L33:
            chqz r1 = r6.d
            efwo r7 = (defpackage.efwo) r7
            fcsu r1 = r1.i
            java.lang.Object r1 = r1.b()
            cdku r1 = (defpackage.cdku) r1
            eiju r1 = r1.a()
            r6.a = r7
            r6.c = r2
            java.lang.Object r1 = defpackage.fdxs.c(r1, r6)
            if (r1 == r0) goto L9b
            r5 = r1
            r1 = r7
            r7 = r5
        L50:
            chqz r2 = r6.d
            egbf r4 = r2.c
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            efwo r2 = r2.b
            com.google.common.util.concurrent.ListenableFuture r2 = r4.c(r2)
            r6.a = r1
            r6.b = r7
            r4 = 3
            r6.c = r4
            java.lang.Object r2 = defpackage.fdxs.c(r2, r6)
            if (r2 == r0) goto L9b
            r0 = r7
            r7 = r2
        L6b:
            egbe r7 = (defpackage.egbe) r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L7f
            chqz r2 = r6.d
            efwo r2 = r2.b
            boolean r1 = defpackage.fdbq.f(r1, r2)
            if (r1 != 0) goto L96
        L7f:
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L95
            egbs r7 = r7.b()
            java.lang.String r7 = r7.k
            java.lang.String r0 = "pseudonymous"
            boolean r7 = defpackage.fdbq.f(r7, r0)
            if (r7 == 0) goto L95
            goto L96
        L95:
            r3 = r1
        L96:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chqx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chqx(this.d, fcxyVar);
    }
}
