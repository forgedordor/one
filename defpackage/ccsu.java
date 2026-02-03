package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccsu implements ccso {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsMessageReceiptSignerImpl");
    private final ccpm b;
    private final cbun c;
    private final ccer d;

    public ccsu(ccpm ccpmVar, cbun cbunVar, ccer ccerVar, atzy atzyVar) {
        ccpmVar.getClass();
        cbunVar.getClass();
        ccerVar.getClass();
        atzyVar.getClass();
        this.b = ccpmVar;
        this.c = cbunVar;
        this.d = ccerVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ccso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.basd r8, defpackage.aubq r9, java.lang.String r10, defpackage.auhk r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.ccsq
            if (r0 == 0) goto L13
            r0 = r12
            ccsq r0 = (defpackage.ccsq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccsq r0 = new ccsq
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r12)
            goto L41
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.fctl.b(r12)
            r6.c = r2
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.e(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L41
            return r0
        L41:
            ccsp r12 = (defpackage.ccsp) r12
            evqs r8 = r12.a
            civc r9 = defpackage.civc.a()
            civa r10 = defpackage.civa.MLS_NAMESPACE
            java.lang.String r8 = defpackage.cccu.a(r8)
            java.lang.String r11 = "MLS-Derived-Content-Signature"
            r9.e(r10, r11, r8)
            int r8 = r12.b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Era-ID"
            r9.e(r10, r11, r8)
            eyga r8 = r9.c()
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsu.a(basd, aubq, java.lang.String, auhk, fcxy):java.lang.Object");
    }

    @Override // defpackage.ccso
    public final Object b(basd basdVar, aubq aubqVar, ConversationIdType conversationIdType, asrg asrgVar, auhk auhkVar, fcxy fcxyVar) {
        try {
            return a(basdVar, aubqVar, this.d.a(conversationIdType, asrgVar).a, auhkVar, fcxyVar);
        } catch (IllegalArgumentException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleE2eeMls");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(e);
            ekrdVar.X(cqnc.f, basdVar);
            ekrdVar.X(cqnc.i, auhkVar.name());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsMessageReceiptSignerImpl", "createCustomCpimHeaders", 78, "MlsRcsMessageReceiptSignerImpl.kt")).q("Failed to generate the MLS signature due to missing MLS group Id");
            throw new ccsn(basdVar, auhkVar, "missing MLS group ID", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        if (r14 != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.basd r10, defpackage.aubq r11, java.lang.String r12, defpackage.auhk r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsu.c(basd, aubq, java.lang.String, auhk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.basd r7, defpackage.aubq r8, java.lang.String r9, defpackage.auhk r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsu.d(basd, aubq, java.lang.String, auhk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r0 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r0 == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        return r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.basd r13, defpackage.aubq r14, java.lang.String r15, defpackage.auhk r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsu.e(basd, aubq, java.lang.String, auhk, fcxy):java.lang.Object");
    }
}
