package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckyt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/reactions/transport/xms/receiver/workhandler/XmsReactionClassificationProcessor");
    private final cdvn b;
    private final crcp c;
    private final ckyj d;
    private final bxlc e;
    private final ckmg f;
    private final fcsu g;
    private final dzuc h;
    private final cklg i;
    private final fcsu j;

    public ckyt(cdvn cdvnVar, crcp crcpVar, ckyj ckyjVar, bxlc bxlcVar, ckmg ckmgVar, fcsu fcsuVar, dzuc dzucVar, cklg cklgVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        cdvnVar.getClass();
        crcpVar.getClass();
        bxlcVar.getClass();
        ckmgVar.getClass();
        dzucVar.getClass();
        cklgVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = cdvnVar;
        this.c = crcpVar;
        this.d = ckyjVar;
        this.e = bxlcVar;
        this.f = ckmgVar;
        this.g = fcsuVar;
        this.h = dzucVar;
        this.i = cklgVar;
        this.j = fcsuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r11v26, types: [feeg, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r27, java.lang.String r28, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r29, j$.time.Duration r30, defpackage.ezgd r31, int r32, defpackage.fcxy r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckyt.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, j$.time.Duration, ezgd, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r13, java.lang.String r14, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r15, j$.time.Duration r16, defpackage.ezgd r17, int r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r19
            boolean r1 = r0 instanceof defpackage.ckys
            if (r1 == 0) goto L15
            r1 = r0
            ckys r1 = (defpackage.ckys) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            ckys r1 = new ckys
            r1.<init>(r12, r0)
        L1a:
            r9 = r1
            java.lang.Object r0 = r9.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r9.c
            r3 = 1
            r10 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            eieu r13 = r9.d
            defpackage.fctl.b(r0)     // Catch: java.lang.Throwable -> L2d
            goto L98
        L2d:
            r0 = move-exception
            r14 = r0
            goto Lb5
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            defpackage.fctl.b(r0)
            java.lang.String r0 = "XmsReactionClassificationProcessor.persistAndLogReaction"
            eieu r11 = defpackage.eiiy.h(r0)
            dzuc r0 = r12.h     // Catch: java.lang.Throwable -> Lb1
            dzub r0 = r0.d()     // Catch: java.lang.Throwable -> Lb1
            r0.getClass()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "XmsReactionClassificationProcessor.persistClassification"
            eieu r2 = defpackage.eiiy.h(r2)     // Catch: java.lang.Throwable -> Lb1
            cdvn r4 = r12.b     // Catch: java.lang.Throwable -> La8
            ekgb r5 = defpackage.ekgb.r(r17)     // Catch: java.lang.Throwable -> La8
            r5.getClass()     // Catch: java.lang.Throwable -> La8
            r4.e(r15, r5)     // Catch: java.lang.Throwable -> La8
            defpackage.fczl.a(r2, r10)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "XmsReactionClassificationProcessor.logClassification"
            eieu r2 = defpackage.eiiy.h(r2)     // Catch: java.lang.Throwable -> Lb1
            crcp r4 = r12.c     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r15.b()     // Catch: java.lang.Throwable -> L9f
            r5.getClass()     // Catch: java.lang.Throwable -> L9f
            r7 = r17
            r4.h(r7)     // Catch: java.lang.Throwable -> L9f
            defpackage.fczl.a(r2, r10)     // Catch: java.lang.Throwable -> Lb1
            dzuc r2 = r12.h     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r4 = "XmsReactionClassificationProcessor.persistAndLogClassification"
            dzfh r5 = new dzfh     // Catch: java.lang.Throwable -> Lb1
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lb1
            dzua r4 = defpackage.dzua.SUCCESS     // Catch: java.lang.Throwable -> Lb1
            r2.f(r0, r5, r10, r4)     // Catch: java.lang.Throwable -> Lb1
            r9.d = r11     // Catch: java.lang.Throwable -> Lb1
            r9.c = r3     // Catch: java.lang.Throwable -> Lb1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r18
            java.lang.Object r13 = r2.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lb1
            if (r13 == r1) goto L9e
            r13 = r11
        L98:
            defpackage.fczl.a(r13, r10)
            fctx r13 = defpackage.fctx.a
            return r13
        L9e:
            return r1
        L9f:
            r0 = move-exception
            r13 = r0
            throw r13     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
            r14 = r0
            defpackage.fczl.a(r2, r13)     // Catch: java.lang.Throwable -> Lb1
            throw r14     // Catch: java.lang.Throwable -> Lb1
        La8:
            r0 = move-exception
            r13 = r0
            throw r13     // Catch: java.lang.Throwable -> Lab
        Lab:
            r0 = move-exception
            r14 = r0
            defpackage.fczl.a(r2, r13)     // Catch: java.lang.Throwable -> Lb1
            throw r14     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            r13 = r0
            r14 = r13
            r13 = r11
        Lb5:
            throw r14     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r0 = move-exception
            r15 = r0
            defpackage.fczl.a(r13, r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckyt.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, j$.time.Duration, ezgd, int, fcxy):java.lang.Object");
    }
}
