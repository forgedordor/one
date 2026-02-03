package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdc implements accz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountDataServiceImpl");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountDataServiceImpl");
    private final egbf c;
    private final Optional d;
    private final Optional e;
    private final aofc f;

    public acdc(egbf egbfVar, Optional optional, Optional optional2, aofc aofcVar) {
        egbfVar.getClass();
        optional.getClass();
        aofcVar.getClass();
        this.c = egbfVar;
        this.d = optional;
        this.e = optional2;
        this.f = aofcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.accz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.acda
            if (r0 == 0) goto L13
            r0 = r10
            acda r0 = (defpackage.acda) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            acda r0 = new acda
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r0 = r0.a
            defpackage.fctl.b(r10)
            goto L7c
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L34:
            defpackage.fctl.b(r10)
            goto L69
        L38:
            defpackage.fctl.b(r10)
            ekrg r10 = defpackage.acdc.a
            ekrw r10 = r10.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r5 = "BugleAccountSignOut"
            r10.X(r2, r5)
            r2 = 36
            java.lang.String r5 = "SignOutAccountDataServiceImpl.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/gaia/signoutaccount/SignOutAccountDataServiceImpl"
            java.lang.String r7 = "prepareAccountSignOut"
            ekrw r10 = r10.h(r6, r7, r2, r5)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r2 = "Preparing to sign out..."
            r10.q(r2)
            egbf r10 = r9.c
            com.google.common.util.concurrent.ListenableFuture r10 = r10.e()
            r0.d = r4
            java.lang.Object r10 = defpackage.fdxs.c(r10, r0)
            if (r10 == r1) goto La8
        L69:
            java.util.Set r10 = (java.util.Set) r10
            int r10 = r10.size()
            r0.a = r10
            r0.d = r3
            java.lang.Object r0 = r9.b(r0)
            if (r0 == r1) goto La8
            r8 = r0
            r0 = r10
            r10 = r8
        L7c:
            accq r10 = (defpackage.accq) r10
            accp r1 = defpackage.accp.a
            evsf r1 = r1.createBuilder()
            acco r1 = (defpackage.acco) r1
            if (r0 <= r3) goto L89
            goto L8a
        L89:
            r4 = 0
        L8a:
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r1.instance
            accp r0 = (defpackage.accp) r0
            r0.c = r4
            r1.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r1.instance
            accp r0 = (defpackage.accp) r0
            int r10 = r10.a()
            r0.b = r10
            evsn r10 = r1.build()
            r10.getClass()
            return r10
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acdc.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r12 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0143, code lost:
    
        if (r2.c(r0) == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acdc.b(fcxy):java.lang.Object");
    }
}
