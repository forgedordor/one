package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmd implements fdpm {
    final /* synthetic */ fdpm a;

    public ctmd(fdpm fdpmVar) {
        this.a = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ctmc
            if (r0 == 0) goto L13
            r0 = r8
            ctmc r0 = (defpackage.ctmc) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ctmc r0 = new ctmc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r8)
            goto La8
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            defpackage.fctl.b(r8)
            fdpm r8 = r6.a
            ekgp r7 = (defpackage.ekgp) r7
            r7.getClass()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r7.size()
            int r4 = defpackage.fcwa.a(r4)
            r2.<init>(r4)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L4f:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r7.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            anyy r4 = (defpackage.anyy) r4
            r4.getClass()
            ctmo r4 = defpackage.ctmn.f(r4)
            r2.put(r5, r4)
            goto L4f
        L70:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L7d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L9f
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            ctmo r5 = (defpackage.ctmo) r5
            int r5 = r5.a
            if (r5 == r3) goto L7d
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r7.put(r5, r4)
            goto L7d
        L9f:
            r0.b = r3
            java.lang.Object r7 = r8.fO(r7, r0)
            if (r7 != r1) goto La8
            return r1
        La8:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctmd.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
