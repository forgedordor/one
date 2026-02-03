package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayll {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionAsyncAction");
    public final fdjx b;
    private final cjpo c;
    private final Optional d;

    public ayll(fdjx fdjxVar, cjpo cjpoVar, Optional optional) {
        this.b = fdjxVar;
        this.c = cjpoVar;
        this.d = optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [aylg, fcxy] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.aylg
            if (r0 == 0) goto L13
            r0 = r14
            aylg r0 = (defpackage.aylg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aylg r0 = new aylg
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "execute"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionAsyncAction"
            java.lang.String r6 = "Bugle"
            r7 = 1
            java.lang.String r8 = "WaitForRcsServiceConnectionAsyncAction.kt"
            if (r2 == 0) goto L3d
            if (r2 != r7) goto L35
            eieu r0 = r0.d
            defpackage.fctl.b(r14)     // Catch: java.lang.Throwable -> L32 defpackage.fdmx -> L8f
            goto L86
        L32:
            r14 = move-exception
            goto Lb4
        L35:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3d:
            defpackage.fctl.b(r14)
            java.lang.String r14 = "WaitForRcsServiceConnectionAction.executeAction"
            eieu r14 = defpackage.eiiy.a(r14)
            ekrg r2 = defpackage.ayll.a     // Catch: java.lang.Throwable -> Lb0
            ekrw r2 = r2.g()     // Catch: java.lang.Throwable -> Lb0
            ekrz r9 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Lb0
            r2.X(r9, r6)     // Catch: java.lang.Throwable -> Lb0
            r9 = 42
            ekrw r2 = r2.h(r5, r4, r9, r8)     // Catch: java.lang.Throwable -> Lb0
            ekrd r2 = (defpackage.ekrd) r2     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r9 = "Waiting for Rcs services connection"
            r2.q(r9)     // Catch: java.lang.Throwable -> Lb0
            j$.util.Optional r2 = r13.d     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            java.lang.Long r9 = new java.lang.Long     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            r10 = 3000(0xbb8, double:1.482E-320)
            r9.<init>(r10)     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            java.lang.Object r2 = r2.orElse(r9)     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            r2.getClass()     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            long r9 = r2.longValue()     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            aylh r2 = new aylh     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            r2.<init>(r13, r3)     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            r0.d = r14     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            r0.c = r7     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            java.lang.Object r0 = defpackage.fdna.a(r9, r2, r0)     // Catch: defpackage.fdmx -> L8e java.lang.Throwable -> Lb0
            if (r0 == r1) goto L8d
            r12 = r0
            r0 = r14
            r14 = r12
        L86:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L32 defpackage.fdmx -> L8f
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L32 defpackage.fdmx -> L8f
            goto La8
        L8d:
            return r1
        L8e:
            r0 = r14
        L8f:
            ekrg r14 = defpackage.ayll.a     // Catch: java.lang.Throwable -> L32
            ekrw r14 = r14.j()     // Catch: java.lang.Throwable -> L32
            ekrz r1 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L32
            r14.X(r1, r6)     // Catch: java.lang.Throwable -> L32
            r1 = 51
            ekrw r14 = r14.h(r5, r4, r1, r8)     // Catch: java.lang.Throwable -> L32
            ekrd r14 = (defpackage.ekrd) r14     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Waiting for Rcs services connection timed out"
            r14.q(r1)     // Catch: java.lang.Throwable -> L32
            r14 = 0
        La8:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L32
            defpackage.fczl.a(r0, r3)
            return r14
        Lb0:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
        Lb4:
            throw r14     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r1 = move-exception
            defpackage.fczl.a(r0, r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayll.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aylj
            if (r0 == 0) goto L13
            r0 = r6
            aylj r0 = (defpackage.aylj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aylj r0 = new aylj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fdci r0 = r0.d
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L62
        L29:
            r6 = move-exception
            goto L75
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.fctl.b(r6)
            fdci r6 = new fdci
            r6.<init>()
            r0.d = r6     // Catch: java.lang.Throwable -> L71
            r0.c = r3     // Catch: java.lang.Throwable -> L71
            fdiu r2 = new fdiu     // Catch: java.lang.Throwable -> L71
            fcxy r0 = defpackage.fcym.c(r0)     // Catch: java.lang.Throwable -> L71
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L71
            r2.B()     // Catch: java.lang.Throwable -> L71
            aylk r0 = new aylk     // Catch: java.lang.Throwable -> L71
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L71
            r6.a = r0     // Catch: java.lang.Throwable -> L71
            cjpo r0 = r5.c     // Catch: java.lang.Throwable -> L71
            java.lang.Object r3 = r6.a     // Catch: java.lang.Throwable -> L71
            cjpn r3 = (defpackage.cjpn) r3     // Catch: java.lang.Throwable -> L71
            r0.j(r3)     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r2.m()     // Catch: java.lang.Throwable -> L71
            if (r0 == r1) goto L70
            r0 = r6
        L62:
            java.lang.Object r6 = r0.a
            cjpn r6 = (defpackage.cjpn) r6
            if (r6 == 0) goto L6d
            cjpo r0 = r5.c
            r0.k(r6)
        L6d:
            fctx r6 = defpackage.fctx.a
            return r6
        L70:
            return r1
        L71:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L75:
            java.lang.Object r0 = r0.a
            cjpn r0 = (defpackage.cjpn) r0
            if (r0 == 0) goto L80
            cjpo r1 = r5.c
            r1.k(r0)
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayll.b(fcxy):java.lang.Object");
    }
}
