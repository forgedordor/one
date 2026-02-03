package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class pdw extends fdbo implements fdap {
    public pdw(Object obj) {
        super(1, obj, pdz.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    @Override // defpackage.fdap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            java.util.Set r10 = (java.util.Set) r10
            r10.getClass()
            java.lang.Object r0 = r9.g
            pdz r0 = (defpackage.pdz) r0
            java.util.concurrent.locks.ReentrantLock r1 = r0.d
            r1.lock()
            java.util.Map r0 = r0.c     // Catch: java.lang.Throwable -> L7a
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L7a
            java.util.List r0 = defpackage.fcva.ao(r0)     // Catch: java.lang.Throwable -> L7a
            r1.unlock()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r0.next()
            peh r1 = (defpackage.peh) r1
            int[] r2 = r1.b
            int r3 = r2.length
            if (r3 == 0) goto L69
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L5a
            fcxk r5 = new fcxk
            r5.<init>()
            r6 = r4
        L3a:
            if (r4 >= r3) goto L55
            r7 = r2[r4]
            int r8 = r6 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r10.contains(r7)
            if (r7 == 0) goto L51
            java.lang.String[] r7 = r1.c
            r6 = r7[r6]
            r5.add(r6)
        L51:
            int r4 = r4 + 1
            r6 = r8
            goto L3a
        L55:
            java.util.Set r2 = defpackage.fcwm.a(r5)
            goto L6b
        L5a:
            r2 = r2[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r10.contains(r2)
            if (r2 == 0) goto L69
            java.util.Set r2 = r1.d
            goto L6b
        L69:
            fcvq r2 = defpackage.fcvq.a
        L6b:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L1f
            pdu r1 = r1.a
            r1.a(r2)
            goto L1f
        L77:
            fctx r10 = defpackage.fctx.a
            return r10
        L7a:
            r10 = move-exception
            r1.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdw.invoke(java.lang.Object):java.lang.Object");
    }
}
