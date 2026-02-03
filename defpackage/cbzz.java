package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbzz implements cbtp {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/conversation/groupoperations/update/MlsGroupMetadataProcessor");
    private final atyq b;
    private final arob c;
    private final fdjx d;

    public cbzz(atyq atyqVar, awjh awjhVar, apwn apwnVar, arob arobVar, fdjx fdjxVar) {
        awjhVar.getClass();
        apwnVar.getClass();
        arobVar.getClass();
        fdjxVar.getClass();
        this.b = atyqVar;
        this.c = arobVar;
        this.d = fdjxVar;
    }

    @Override // defpackage.cbtp
    public final eiju a(atrj atrjVar, aufo aufoVar) {
        aufoVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new cbzy(this, atrjVar, aufoVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cbzx
            if (r0 == 0) goto L13
            r0 = r6
            cbzx r0 = (defpackage.cbzx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbzx r0 = new cbzx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            if (r2 == 0) goto L89
            r3 = 1
            r4 = 2
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.fctl.b(r6)
            goto L85
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            aufh r6 = (defpackage.aufh) r6
            if (r6 != 0) goto L6b
            ekrg r6 = defpackage.cbzz.a
            ekrw r6 = r6.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleE2eeMls"
            r6.X(r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            ekrz r0 = defpackage.cqnc.e
            r1 = 0
            r6.X(r0, r1)
            ekrz r0 = defpackage.cqnc.S
            java.lang.String r1 = "MlsGroupMetadataProcessor"
            r6.X(r0, r1)
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r1 = "MlsGroupMetadataProcessor.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/e2ee/mls/conversation/groupoperations/update/MlsGroupMetadataProcessor"
            java.lang.String r3 = "process"
            ekrw r6 = r6.h(r2, r3, r0, r1)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r0 = "Failed to create a request for GroupEvent's opaque data."
            r6.q(r0)
            atav r6 = defpackage.atav.FAIL_NO_RETRY
            return r6
        L6b:
            atyq r2 = r5.b
            atyr r3 = defpackage.atys.c()
            r3.c(r6)
            atys r6 = r3.d()
            eiju r6 = r2.a(r6)
            r0.c = r4
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 != r1) goto L85
            return r1
        L85:
            r6.getClass()
            return r6
        L89:
            defpackage.fctl.b(r6)
            arob r6 = r5.c
            r6.a()
            atav r6 = defpackage.atav.SUCCESS
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbzz.b(fcxy):java.lang.Object");
    }
}
