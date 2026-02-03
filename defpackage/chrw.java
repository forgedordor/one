package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chrw implements chrj {
    public static final chrm a = new chrm();
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl");
    public final fcsu c;
    public final chlv d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    private final fdjx i;
    private final aujb j;
    private final fcsu k;
    private final fcsu l;
    private final aqny m;

    public chrw(fdjx fdjxVar, aujb aujbVar, fcsu fcsuVar, fcsu fcsuVar2, chlv chlvVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, aqny aqnyVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        this.i = fdjxVar;
        this.j = aujbVar;
        this.k = fcsuVar;
        this.c = fcsuVar2;
        this.d = chlvVar;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.l = fcsuVar7;
        this.m = aqnyVar;
    }

    private static final aufx h() {
        aufs aufsVar = (aufs) aufx.a.createBuilder();
        aufsVar.getClass();
        aufy.c(aufw.CONTROL, aufsVar);
        aufy.b(aufu.NORMAL, aufsVar);
        aufy.d(aufsVar);
        return aufy.a(aufsVar);
    }

    @Override // defpackage.chrj
    public final void a(amlm amlmVar) {
        auvw.k(this.i, null, null, new chrs(amlmVar, this, null), 3);
    }

    @Override // defpackage.chrj
    public final void b(ekgb ekgbVar, int i) {
        auvw.k(this.i, null, null, new chrp(ekgbVar, this, i, null), 3);
    }

    @Override // defpackage.chrj
    public final void c(ParticipantsTable.BindData bindData) {
        auvw.k(this.i, null, null, new chro(this, bindData, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aoer r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chrn
            if (r0 == 0) goto L13
            r0 = r6
            chrn r0 = (defpackage.chrn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chrn r0 = new chrn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.l
            java.lang.Object r6 = r6.b()
            chtk r6 = (defpackage.chtk) r6
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r5 = r5.h()
            eiju r5 = r6.d(r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L79
        L4a:
            j$.util.Optional r6 = (j$.util.Optional) r6
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L74
            ekrg r5 = defpackage.chrw.b
            ekrw r5 = r5.j()
            ekrz r6 = defpackage.eksq.a
            java.lang.String r0 = "BugleProfiles"
            r5.X(r6, r0)
            r6 = 238(0xee, float:3.34E-43)
            java.lang.String r0 = "ProfileActionSenderImpl.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/profile/transport/ProfileActionSenderImpl"
            java.lang.String r2 = "asChatEndPoint"
            ekrw r5 = r5.h(r1, r2, r6, r0)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Failed to get chat endpoint from self identity"
            r5.q(r6)
            r5 = 0
            return r5
        L74:
            java.lang.Object r5 = r6.get()
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chrw.d(aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.chrh r20, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r21, defpackage.aubq r22, boolean r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chrw.e(chrh, com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, aubq, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010d, code lost:
    
        if (defpackage.fdxs.c(r13, r10) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b4 -> B:30:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.chpt r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chrw.f(chpt, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a7, code lost:
    
        if (defpackage.fdxs.c(r0, r10) == r3) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175 A[LOOP:0: B:46:0x016f->B:48:0x0175, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r22v0, types: [chrw] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.chpt r23, defpackage.ekgb r24, defpackage.awjl r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chrw.g(chpt, ekgb, awjl, fcxy):java.lang.Object");
    }
}
