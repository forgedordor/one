package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgsl implements cgst {
    private final cgst a;
    private final cgss b;

    public cgsl(fdjx fdjxVar, cgst cgstVar) {
        fdjxVar.getClass();
        this.a = cgstVar;
        this.b = new cgss();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cgst
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.axcm r5, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.fcxy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cgsk
            if (r0 == 0) goto L13
            r0 = r7
            cgsk r0 = (defpackage.cgsk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgsk r0 = new cgsk
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r0.e
            axcm r5 = r0.d
            defpackage.fctl.b(r7)
            fctk r7 = (defpackage.fctk) r7
            java.lang.Object r7 = r7.a
            goto L60
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.fctl.b(r7)
            cgss r7 = r4.b
            r5.getClass()
            r6.getClass()
            cgsv r2 = new cgsv
            r2.<init>(r5, r6)
            j$.util.concurrent.ConcurrentHashMap r7 = r7.a
            java.lang.Object r7 = r7.get(r2)
            cgsr r7 = (defpackage.cgsr) r7
            if (r7 == 0) goto L52
            return r7
        L52:
            cgst r7 = r4.a
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r7.b(r5, r6, r0)
            if (r7 == r1) goto L7f
        L60:
            boolean r0 = r7 instanceof defpackage.fctj
            if (r3 == r0) goto L66
            r0 = r7
            goto L67
        L66:
            r0 = 0
        L67:
            cgsr r0 = (defpackage.cgsr) r0
            if (r0 != 0) goto L6c
            return r7
        L6c:
            cgss r1 = r4.b
            r5.getClass()
            r6.getClass()
            cgsv r2 = new cgsv
            r2.<init>(r5, r6)
            j$.util.concurrent.ConcurrentHashMap r5 = r1.a
            r5.put(r2, r0)
            return r7
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgsl.b(axcm, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, fcxy):java.lang.Object");
    }
}
