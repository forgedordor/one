package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cccm implements ccbo {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/core/processors/ReceivedCommitProcessor");
    private final cbqj b;
    private final fcsu c;
    private final ccrj d;
    private final awlc e;
    private final ccpm f;
    private final atvy g;

    public cccm(cbqj cbqjVar, fcsu fcsuVar, ccrj ccrjVar, awlc awlcVar, ccpm ccpmVar, atvy atvyVar) {
        cbqjVar.getClass();
        fcsuVar.getClass();
        ccrjVar.getClass();
        awlcVar.getClass();
        ccpmVar.getClass();
        atvyVar.getClass();
        this.b = cbqjVar;
        this.c = fcsuVar;
        this.d = ccrjVar;
        this.e = awlcVar;
        this.f = ccpmVar;
        this.g = atvyVar;
    }

    private final Object d(aufh aufhVar, ccep ccepVar) {
        String str = aufhVar.k;
        str.getClass();
        String str2 = aufhVar.j;
        str2.getClass();
        aubq aubqVar = aufhVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubqVar.getClass();
        cbqj cbqjVar = this.b;
        ConversationIdType conversationIdTypeB = cbqjVar.b(aubqVar, str);
        if (conversationIdTypeB == null) {
            throw new IllegalArgumentException("The RCS conversation does not exist for the incoming message ".concat(str2));
        }
        awjl awjlVarA = this.g.a(aufhVar);
        aubq aubqVar2 = aufhVar.h;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        aubq aubqVar3 = aubqVar2;
        aubqVar3.getClass();
        boolean zF = cbqjVar.f(conversationIdTypeB, awjlVarA, aubqVar3, cbqz.c, null, cbqw.a(ccepVar.a));
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.s, conversationIdTypeB);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/core/processors/ReceivedCommitProcessor", "upgrade", 188, "ReceivedCommitProcessor.kt")).t("New MLS update to conversation? %b.", Boolean.valueOf(zF));
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x036b, code lost:
    
        if (r0 != r4) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03af A[Catch: all -> 0x0049, TryCatch #3 {all -> 0x0049, blocks: (B:17:0x0044, B:175:0x0443, B:169:0x0426, B:171:0x042b, B:149:0x03ab, B:151:0x03af, B:153:0x03b5, B:154:0x03b9, B:156:0x03bf, B:158:0x03ca, B:161:0x03da, B:78:0x024c), top: B:196:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03bf A[Catch: all -> 0x0049, TryCatch #3 {all -> 0x0049, blocks: (B:17:0x0044, B:175:0x0443, B:169:0x0426, B:171:0x042b, B:149:0x03ab, B:151:0x03af, B:153:0x03b5, B:154:0x03b9, B:156:0x03bf, B:158:0x03ca, B:161:0x03da, B:78:0x024c), top: B:196:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042b A[Catch: all -> 0x0049, TryCatch #3 {all -> 0x0049, blocks: (B:17:0x0044, B:175:0x0443, B:169:0x0426, B:171:0x042b, B:149:0x03ab, B:151:0x03af, B:153:0x03b5, B:154:0x03b9, B:156:0x03bf, B:158:0x03ca, B:161:0x03da, B:78:0x024c), top: B:196:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028a A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:83:0x0286, B:85:0x028a, B:87:0x02af, B:89:0x02b3, B:91:0x02ba, B:93:0x02c5, B:106:0x02f1, B:125:0x0332, B:109:0x02f9, B:110:0x02fe, B:112:0x0304, B:114:0x0315, B:116:0x0319, B:96:0x02cd, B:97:0x02d3, B:99:0x02d9, B:101:0x02e6, B:103:0x02ea, B:90:0x02b8), top: B:207:0x0286 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b3 A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:83:0x0286, B:85:0x028a, B:87:0x02af, B:89:0x02b3, B:91:0x02ba, B:93:0x02c5, B:106:0x02f1, B:125:0x0332, B:109:0x02f9, B:110:0x02fe, B:112:0x0304, B:114:0x0315, B:116:0x0319, B:96:0x02cd, B:97:0x02d3, B:99:0x02d9, B:101:0x02e6, B:103:0x02ea, B:90:0x02b8), top: B:207:0x0286 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b8 A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:83:0x0286, B:85:0x028a, B:87:0x02af, B:89:0x02b3, B:91:0x02ba, B:93:0x02c5, B:106:0x02f1, B:125:0x0332, B:109:0x02f9, B:110:0x02fe, B:112:0x0304, B:114:0x0315, B:116:0x0319, B:96:0x02cd, B:97:0x02d3, B:99:0x02d9, B:101:0x02e6, B:103:0x02ea, B:90:0x02b8), top: B:207:0x0286 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c5 A[Catch: all -> 0x044f, TryCatch #8 {all -> 0x044f, blocks: (B:83:0x0286, B:85:0x028a, B:87:0x02af, B:89:0x02b3, B:91:0x02ba, B:93:0x02c5, B:106:0x02f1, B:125:0x0332, B:109:0x02f9, B:110:0x02fe, B:112:0x0304, B:114:0x0315, B:116:0x0319, B:96:0x02cd, B:97:0x02d3, B:99:0x02d9, B:101:0x02e6, B:103:0x02ea, B:90:0x02b8), top: B:207:0x0286 }] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0, types: [cccm] */
    /* JADX WARN: Type inference failed for: r2v0, types: [epun] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v60 */
    @Override // defpackage.ccbo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cbwd r24, defpackage.epun r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cccm.a(cbwd, epun, fcxy):java.lang.Object");
    }

    @Override // defpackage.ccbo
    public final /* synthetic */ boolean b() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.aufh r6, defpackage.ccep r7, defpackage.eput r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.ccck
            if (r0 == 0) goto L13
            r0 = r9
            ccck r0 = (defpackage.ccck) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccck r0 = new ccck
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r9)
            goto L94
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.fctl.b(r9)
            int r9 = r8.b
            r2 = 2
            r4 = 3
            if (r9 != r4) goto L56
            java.lang.Object r8 = r8.c
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 == 0) goto L51
            if (r8 == r3) goto L4f
            if (r8 == r2) goto L4d
            if (r8 == r4) goto L4b
            r8 = 0
            goto L52
        L4b:
            r8 = 5
            goto L52
        L4d:
            r8 = 4
            goto L52
        L4f:
            r8 = r4
            goto L52
        L51:
            r8 = r2
        L52:
            if (r8 != 0) goto L57
            r8 = r3
            goto L57
        L56:
            r8 = r2
        L57:
            int r8 = r8 + (-2)
            r9 = -1
            if (r8 == r9) goto L97
            if (r8 == r3) goto L8b
            if (r8 == r2) goto L8b
            if (r8 != r4) goto L83
            ekrg r6 = defpackage.cccm.a
            ekrw r6 = r6.h()
            ekrz r7 = defpackage.eksq.a
            java.lang.String r8 = "BugleE2eeMls"
            r6.X(r7, r8)
            r7 = 141(0x8d, float:1.98E-43)
            java.lang.String r8 = "ReceivedCommitProcessor.kt"
            java.lang.String r9 = "com/google/android/apps/messaging/shared/e2ee/mls/core/processors/ReceivedCommitProcessor"
            java.lang.String r0 = "handleExpectedCommit"
            ekrw r6 = r6.h(r9, r0, r7, r8)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r7 = "Received expected end_mls commit"
            r6.q(r7)
            goto L94
        L83:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Unknown expected commit type."
            r6.<init>(r7)
            throw r6
        L8b:
            r0.c = r3
            java.lang.Object r6 = r5.d(r6, r7)
            if (r6 != r1) goto L94
            return r1
        L94:
            fctx r6 = defpackage.fctx.a
            return r6
        L97:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Unrecognized expected commit type."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cccm.c(aufh, ccep, eput, fcxy):java.lang.Object");
    }
}
