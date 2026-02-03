package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fduv implements fdpm {
    final /* synthetic */ fdce a;
    final /* synthetic */ fdpm b;

    public fduv(fdce fdceVar, fdpm fdpmVar) {
        this.a = fdceVar;
        this.b = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fduu
            if (r0 == 0) goto L13
            r0 = r6
            fduu r0 = (defpackage.fduu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fduu r0 = new fduu
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            if (r5 <= 0) goto L49
            fdce r5 = r4.a
            boolean r6 = r5.a
            if (r6 != 0) goto L49
            r5.a = r3
            fdpm r5 = r4.b
            fdup r6 = defpackage.fdup.a
            r0.c = r3
            java.lang.Object r5 = r5.fO(r6, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fduv.b(int, fcxy):java.lang.Object");
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        return b(((Number) obj).intValue(), fcxyVar);
    }
}
