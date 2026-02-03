package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crtw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/SpamPrechecker");
    public final fcsu b;
    public final fcsu c;
    public final fdjx d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcyh h;

    public crtw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcyh fcyhVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
        this.g = fcsuVar4;
        this.c = fcsuVar5;
        this.h = fcyhVar;
        this.d = fdjxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r19, defpackage.csoc r20, defpackage.fcxy r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crtw.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, csoc, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9, defpackage.fcxy r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.crtt
            if (r0 == 0) goto L13
            r0 = r10
            crtt r0 = (defpackage.crtt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crtt r0 = new crtt
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "getSuspectedSpammer"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/spam/SpamPrechecker"
            java.lang.String r5 = "BugleSpam"
            r6 = 1
            java.lang.String r7 = "SpamPrechecker.kt"
            if (r2 == 0) goto L39
            if (r2 != r6) goto L31
            java.lang.String r9 = r0.d
            defpackage.fctl.b(r10)
            goto L60
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.fctl.b(r10)
            java.lang.String r9 = r9.aB()
            if (r9 == 0) goto L82
            boolean r10 = defpackage.fdgn.H(r9)
            if (r10 == 0) goto L49
            goto L82
        L49:
            fcsu r10 = r8.g
            java.lang.Object r10 = r10.b()
            csqi r10 = (defpackage.csqi) r10
            cspo r2 = new cspo
            r2.<init>(r9)
            r0.d = r9
            r0.c = r6
            java.lang.Object r10 = r10.c(r2, r0)
            if (r10 == r1) goto L81
        L60:
            csoc r10 = (defpackage.csoc) r10
            if (r10 != 0) goto L80
            ekrg r0 = defpackage.crtw.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r5)
            r1 = 102(0x66, float:1.43E-43)
            ekrw r0 = r0.h(r4, r3, r1, r7)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r9 = defpackage.cqcv.b(r9)
            java.lang.String r1 = "Failed to get existing participant with ID %s"
            r0.t(r1, r9)
        L80:
            return r10
        L81:
            return r1
        L82:
            ekrg r9 = defpackage.crtw.a
            ekrw r9 = r9.j()
            ekrz r10 = defpackage.eksq.a
            r9.X(r10, r5)
            r10 = 91
            ekrw r9 = r9.h(r4, r3, r10, r7)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Failed to get existing participant with null ID"
            r9.q(r10)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crtw.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    public final Object c(MessageCoreData messageCoreData, fcxy fcxyVar) {
        if (messageCoreData.cK()) {
            return fdin.a(eicg.a(this.h), new crtu(null, this, messageCoreData), fcxyVar);
        }
        return null;
    }
}
