package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
@fcsv
/* loaded from: classes8.dex */
public final class cmpv {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/sms/RcsMessageReceiptSenderWrapper");
    public final fdjx a;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final cigh i;
    private final fcsu j;

    public cmpv(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, cigh cighVar, fdjx fdjxVar, fcsu fcsuVar7) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fdjxVar.getClass();
        fcsuVar7.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.i = cighVar;
        this.a = fdjxVar;
        this.j = fcsuVar7;
    }

    private final void d(MessageCoreData messageCoreData, int i) {
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxwVar.e = 1;
        enxwVar.b |= 4;
        enxi enxiVar = enxi.CHAT_API_INVALID_REMOTE_PARTICIPANT;
        enxvVar.copyOnWrite();
        enxw enxwVar2 = (enxw) enxvVar.instance;
        enxwVar2.f = enxiVar.D;
        enxwVar2.b |= 8;
        enxtVar.copyOnWrite();
        enxu enxuVar = (enxu) enxtVar.instance;
        enxw enxwVar3 = (enxw) enxvVar.build();
        enxwVar3.getClass();
        enxuVar.c = enxwVar3;
        enxuVar.b |= 1;
        evsn evsnVarBuild = enxtVar.build();
        evsnVarBuild.getClass();
        ((ajhd) this.e.b()).w(messageCoreData.F(), messageCoreData, i, (enxu) evsnVarBuild, ((asrf) this.f.b()).a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        if (r1 == 3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        if (r18.h() == 1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmpv.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v11, types: [alqm, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r10, int r11, int r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmpv.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9, boolean r10, int r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.cmpu
            if (r0 == 0) goto L13
            r0 = r12
            cmpu r0 = (defpackage.cmpu) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cmpu r0 = new cmpu
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            java.lang.String r3 = "verifyDestinationAndConversationValid"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/sms/RcsMessageReceiptSenderWrapper"
            java.lang.String r5 = "BugleDataModel"
            r6 = 1
            java.lang.String r7 = "RcsMessageReceiptSenderWrapper.kt"
            if (r2 == 0) goto L3b
            if (r2 != r6) goto L33
            int r11 = r0.b
            java.lang.Object r9 = r0.a
            defpackage.fctl.b(r12)
            goto L94
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.fctl.b(r12)
            j$.util.Optional r12 = r9.ah()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L71
            ekrg r10 = defpackage.cmpv.b
            ekrw r10 = r10.j()
            ekrz r12 = defpackage.eksq.a
            r10.X(r12, r5)
            ekrd r10 = (defpackage.ekrd) r10
            ekrz r12 = defpackage.cqnc.f
            basd r0 = r9.F()
            r10.X(r12, r0)
            r12 = 214(0xd6, float:3.0E-43)
            ekrw r10 = r10.h(r4, r3, r12, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r12 = "Invalid messaging identity"
            r10.q(r12)
            r8.d(r9, r11)
            cmpw r9 = defpackage.cmpw.b
            return r9
        L71:
            if (r10 == 0) goto Ld7
            cigh r10 = r8.i
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12 = r9.A()
            cigg r2 = new cigg
            r2.<init>()
            eosc r10 = r10.b
            eiju r10 = defpackage.eijx.g(r2, r10)
            r10.getClass()
            r0.a = r9
            r0.b = r11
            r0.e = r6
            java.lang.Object r12 = defpackage.fdxs.c(r10, r0)
            if (r12 != r1) goto L94
            return r1
        L94:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            if (r10 != 0) goto Ld7
            ekrg r10 = defpackage.cmpv.b
            ekrw r10 = r10.j()
            ekrz r12 = defpackage.eksq.a
            r10.X(r12, r5)
            ekrd r10 = (defpackage.ekrd) r10
            ekrz r12 = defpackage.cqnc.f
            basd r0 = r9.F()
            r10.X(r12, r0)
            ekrz r12 = defpackage.cqnc.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r0 = r9.C()
            r10.X(r12, r0)
            ekrz r12 = defpackage.cqnc.s
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = r9.A()
            r10.X(r12, r0)
            r12 = 228(0xe4, float:3.2E-43)
            ekrw r10 = r10.h(r4, r3, r12, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r12 = "Not sending report. RCS group does not have valid global identifiers and we are using ChatAPI."
            r10.q(r12)
            r8.d(r9, r11)
            cmpw r9 = defpackage.cmpw.c
            return r9
        Ld7:
            cmpw r9 = defpackage.cmpw.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmpv.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, boolean, int, fcxy):java.lang.Object");
    }
}
