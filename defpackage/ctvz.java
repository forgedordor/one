package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvz implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ ctwh b;

    public ctvz(fdpm fdpmVar, ctwh ctwhVar) {
        this.a = fdpmVar;
        this.b = ctwhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r12.fO(r3, r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.ctvy
            if (r0 == 0) goto L13
            r0 = r13
            ctvy r0 = (defpackage.ctvy) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ctvy r0 = new ctvy
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            java.lang.String r3 = "emit"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector$special$$inlined$map$1$2"
            java.lang.String r5 = "BugleContacts"
            r6 = 2
            r7 = 1
            java.lang.String r8 = "RcsGroupChatCapabilityCollector.kt"
            if (r2 == 0) goto L41
            if (r2 == r7) goto L3b
            if (r2 != r6) goto L33
            defpackage.fctl.b(r13)
            goto Lbe
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            java.lang.Object r12 = r0.c
            defpackage.fctl.b(r13)
            goto L77
        L41:
            defpackage.fctl.b(r13)
            fdpm r13 = r11.a
            aoer r12 = (defpackage.aoer) r12
            if (r12 != 0) goto L62
            ekrg r2 = defpackage.ctwh.b
            ekrw r2 = r2.j()
            ekrz r9 = defpackage.eksq.a
            r2.X(r9, r5)
            r9 = 87
            ekrw r2 = r2.h(r4, r3, r9, r8)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r9 = "Self identity is not present."
            r2.q(r9)
        L62:
            if (r12 == 0) goto L81
            eiju r12 = r12.l()
            if (r12 == 0) goto L81
            r0.c = r13
            r0.b = r7
            java.lang.Object r12 = defpackage.fdxs.c(r12, r0)
            if (r12 == r1) goto Lbd
            r10 = r13
            r13 = r12
            r12 = r10
        L77:
            aoip r13 = (defpackage.aoip) r13
            if (r13 == 0) goto L80
            int r13 = r13.a()
            goto L87
        L80:
            r13 = r12
        L81:
            r12 = 2147483647(0x7fffffff, float:NaN)
            r10 = r13
            r13 = r12
            r12 = r10
        L87:
            ekrg r2 = defpackage.ctwh.b
            ekrw r2 = r2.e()
            ekrz r7 = defpackage.eksq.a
            r2.X(r7, r5)
            r5 = 91
            ekrw r2 = r2.h(r4, r3, r5, r8)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r3 = "Max group size: %d"
            r2.r(r3, r13)
            ctwh r2 = r11.b
            cmum r2 = r2.g
            ctvx r3 = new ctvx
            r4 = -1
            cmuh r2 = r2.a(r4)
            int r2 = r2.e()
            int r13 = r13 + r4
            r3.<init>(r2, r13)
            r13 = 0
            r0.c = r13
            r0.b = r6
            java.lang.Object r12 = r12.fO(r3, r0)
            if (r12 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctvz.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
