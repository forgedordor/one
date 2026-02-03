package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdru implements fdpm {
    final /* synthetic */ fdcg a;
    final /* synthetic */ int b;
    final /* synthetic */ fdpm c;
    final /* synthetic */ Object d;

    public fdru(fdcg fdcgVar, int i, fdpm fdpmVar, Object obj) {
        this.a = fdcgVar;
        this.b = i;
        this.c = fdpmVar;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r7.fO(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (defpackage.fdsc.a(r7, r6, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fdrt
            if (r0 == 0) goto L13
            r0 = r7
            fdrt r0 = (defpackage.fdrt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdrt r0 = new fdrt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            goto L59
        L33:
            defpackage.fctl.b(r7)
            fdcg r7 = r5.a
            int r2 = r7.a
            int r2 = r2 + r4
            r7.a = r2
            int r7 = r5.b
            if (r2 >= r7) goto L4c
            fdpm r7 = r5.c
            r0.c = r4
            java.lang.Object r6 = r7.fO(r6, r0)
            if (r6 != r1) goto L59
            goto L58
        L4c:
            fdpm r7 = r5.c
            java.lang.Object r2 = r5.d
            r0.c = r3
            java.lang.Object r6 = defpackage.fdsc.a(r7, r6, r2, r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdru.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
