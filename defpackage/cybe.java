package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cybe extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ cybf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cybe(cybf cybfVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = cybfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L10
            defpackage.fctl.b(r7)
            return r7
        L10:
            java.lang.Object r1 = r6.a
            defpackage.fctl.b(r7)
            goto L3c
        L16:
            defpackage.fctl.b(r7)
            goto L29
        L1a:
            defpackage.fctl.b(r7)
            cybf r7 = r6.c
            r6.b = r3
            fdkf r7 = r7.e
            java.lang.Object r7 = r7.c(r6)
            if (r7 == r0) goto L5c
        L29:
            cybf r1 = r6.c
            cyaq r7 = (defpackage.cyaq) r7
            r6.a = r7
            r6.b = r2
            fdkf r1 = r1.d
            java.lang.Object r1 = r1.c(r6)
            if (r1 == r0) goto L5c
            r5 = r1
            r1 = r7
            r7 = r5
        L3c:
            r7.getClass()
            efwo r7 = (defpackage.efwo) r7
            r2 = 0
            r6.a = r2
            r3 = 3
            r6.b = r3
            cyaq r1 = (defpackage.cyaq) r1
            fcyh r3 = r1.b
            fcyh r3 = defpackage.eicg.a(r3)
            cyap r4 = new cyap
            r4.<init>(r2, r1, r7)
            java.lang.Object r7 = defpackage.fdin.a(r3, r4, r6)
            if (r7 != r0) goto L5b
            goto L5c
        L5b:
            return r7
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cybe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cybe(this.c, (fcxy) obj).b(fctx.a);
    }
}
