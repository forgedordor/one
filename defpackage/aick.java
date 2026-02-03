package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aick {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/service/StalledExecutionDetectorStarter");
    private final ahzu b;
    private final feav c = new feaz();
    private UUID d;
    private fdlr e;

    public aick(ahzv ahzvVar) {
        this.b = ahzvVar.a(a, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [fdlr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.UUID r5, defpackage.fdap r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.aici
            if (r0 == 0) goto L13
            r0 = r7
            aici r0 = (defpackage.aici) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aici r0 = new aici
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            feaz r5 = r0.f
            aibn r6 = r0.e
            java.util.UUID r0 = r0.d
            defpackage.fctl.b(r7)
            r7 = r5
            r5 = r0
            goto L50
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.fctl.b(r7)
            feav r7 = r4.c
            r0.d = r5
            r2 = r6
            aibn r2 = (defpackage.aibn) r2
            r0.e = r2
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.f = r2
            r0.c = r3
            java.lang.Object r0 = r7.b(r0)
            if (r0 == r1) goto L72
        L50:
            java.util.UUID r0 = r4.d     // Catch: java.lang.Throwable -> L6d
            boolean r0 = defpackage.fdbq.f(r0, r5)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L67
            fdlr r0 = r4.e     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L5f
            defpackage.fdlp.a(r0)     // Catch: java.lang.Throwable -> L6d
        L5f:
            r4.d = r5     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r5 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L6d
            r4.e = r5     // Catch: java.lang.Throwable -> L6d
        L67:
            r7.d()
            fctx r5 = defpackage.fctx.a
            return r5
        L6d:
            r5 = move-exception
            r7.d()
            throw r5
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aick.a(java.util.UUID, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aicj
            if (r0 == 0) goto L13
            r0 = r6
            aicj r0 = (defpackage.aicj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aicj r0 = new aicj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            feaz r5 = r0.e
            java.util.UUID r0 = r0.d
            defpackage.fctl.b(r6)
            r6 = r5
            r5 = r0
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r6)
            feav r6 = r4.c
            r0.d = r5
            r2 = r6
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L91
        L49:
            java.util.UUID r0 = r4.d     // Catch: java.lang.Throwable -> L8c
            boolean r0 = defpackage.fdbq.f(r5, r0)     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            if (r0 != 0) goto L60
            ahzu r0 = r4.b     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "SessionId mismatch: [%s] != [%s]"
            java.util.UUID r3 = r4.d     // Catch: java.lang.Throwable -> L8c
            r0.m(r2, r5, r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L8c
            goto L88
        L60:
            fdlr r0 = r4.e     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L7d
            boolean r0 = r0.v()     // Catch: java.lang.Throwable -> L8c
            if (r0 != r3) goto L7d
            ahzu r0 = r4.b     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "Cancelling detector job for sessionId [%s]"
            r0.d(r1, r5)     // Catch: java.lang.Throwable -> L8c
            fdlr r5 = r4.e     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L78
            defpackage.fdlp.a(r5)     // Catch: java.lang.Throwable -> L8c
        L78:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L8c
            goto L88
        L7d:
            ahzu r0 = r4.b     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "DetectorJob for sessionId [%s] is not active"
            r0.d(r2, r5)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L8c
        L88:
            r6.d()
            return r5
        L8c:
            r5 = move-exception
            r6.d()
            throw r5
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aick.b(java.util.UUID, fcxy):java.lang.Object");
    }
}
