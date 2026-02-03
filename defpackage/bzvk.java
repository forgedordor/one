package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzvk implements caar {
    @Override // defpackage.caas
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((bzzx) obj).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.bzvm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bzvj
            if (r0 == 0) goto L13
            r0 = r6
            bzvj r0 = (defpackage.bzvj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzvj r0 = new bzvj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            cpmc r5 = r5.fr()
            r6 = 4
            eiju r5 = r5.ah(r6)
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            cbcw r5 = defpackage.cbcw.i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzvk.b(bzvm, fcxy):java.lang.Object");
    }

    @Override // defpackage.caar
    public final /* bridge */ /* synthetic */ Object d(Object obj, cayy cayyVar, Object obj2, fcxy fcxyVar) {
        return b((bzvm) obj, fcxyVar);
    }
}
