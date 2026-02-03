package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqd implements wrd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser");
    public final lwn b;
    public final fcyh c;
    public final fcsu d;
    public final vuc e;
    private final whe f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final vth j;
    private final aqhi k;

    public wqd(lwn lwnVar, whe wheVar, vuc vucVar, fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, vth vthVar, aqhi aqhiVar) {
        vucVar.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        vthVar.getClass();
        this.b = lwnVar;
        this.f = wheVar;
        this.e = vucVar;
        this.c = fcyhVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.d = fcsuVar4;
        this.j = vthVar;
        this.k = aqhiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r2 != r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        if (r0 != r4) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.a(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.wps
            if (r0 == 0) goto L13
            r0 = r15
            wps r0 = (defpackage.wps) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            wps r0 = new wps
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r14 = r0.e
            int r2 = r0.d
            vvl r4 = r0.j
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft$Attachment r5 = r0.i
            java.lang.Object r6 = r0.c
            java.lang.Object r7 = r0.b
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r15)
        L34:
            r12 = r15
            r15 = r14
            r14 = r2
            r2 = r0
            r0 = r12
            goto L8b
        L3a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L42:
            defpackage.fctl.b(r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
            r2 = 0
            r7 = r14
            r8 = r15
            r14 = r2
        L52:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto Lc4
            java.lang.Object r6 = r7.next()
            int r2 = r14 + 1
            if (r14 >= 0) goto L63
            defpackage.fcva.m()
        L63:
            r15 = r6
            fcti r15 = (defpackage.fcti) r15
            java.lang.Object r4 = r15.a
            r5 = r4
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft$Attachment r5 = (com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft.Attachment) r5
            java.lang.Object r15 = r15.b
            r4 = r15
            vvl r4 = (defpackage.vvl) r4
            whe r15 = r13.f
            android.net.Uri r9 = r5.b
            r0.a = r8
            r0.b = r7
            r0.c = r6
            r0.i = r5
            r0.j = r4
            r0.d = r2
            r0.e = r14
            r0.h = r3
            java.lang.Object r15 = r15.b(r9, r0)
            if (r15 != r1) goto L34
            return r1
        L8b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lbf
            ekrg r0 = defpackage.wqd.a
            ekrw r0 = r0.i()
            ekrz r6 = defpackage.eksq.a
            java.lang.String r9 = "BugleComposeRow2"
            r0.X(r6, r9)
            r6 = 258(0x102, float:3.62E-43)
            java.lang.String r9 = "ComposeRowStateParser.kt"
            java.lang.String r10 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser"
            java.lang.String r11 = "filterForbiddenAttachments"
            ekrw r0 = r0.h(r10, r11, r6, r9)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r6 = "Attachment from IncomingDraft blocked by security filter: silently removing %s"
            r0.t(r6, r5)
            if (r4 == 0) goto Lc2
            vth r0 = r13.j
            vvo r4 = defpackage.wrb.a(r5, r4)
            r0.b(r4, r15)
            goto Lc2
        Lbf:
            r8.add(r6)
        Lc2:
            r0 = r2
            goto L52
        Lc4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.b(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fdae r10, defpackage.fcxy r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.wpu
            if (r0 == 0) goto L13
            r0 = r11
            wpu r0 = (defpackage.wpu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wpu r0 = new wpu
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState r10 = r0.d
            defpackage.fctl.b(r11)
            goto L84
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            defpackage.fctl.b(r11)
            java.lang.Object r10 = r10.invoke()
            com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState r10 = (com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState) r10
            java.lang.String r11 = "parse"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser"
            java.lang.String r5 = "BugleComposeRow2"
            java.lang.String r6 = "ComposeRowStateParser.kt"
            if (r10 != 0) goto L5e
            ekrg r10 = defpackage.wqd.a
            ekrw r10 = r10.e()
            ekrz r0 = defpackage.eksq.a
            r10.X(r0, r5)
            r0 = 173(0xad, float:2.42E-43)
            ekrw r10 = r10.h(r2, r11, r0, r6)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "ComposeRowStateParser found no incoming state"
            r10.q(r11)
            return r4
        L5e:
            ekrg r7 = defpackage.wqd.a
            ekrw r7 = r7.e()
            ekrz r8 = defpackage.eksq.a
            r7.X(r8, r5)
            r5 = 177(0xb1, float:2.48E-43)
            ekrw r11 = r7.h(r2, r11, r5, r6)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "Parsing incoming %s"
            r11.t(r2, r10)
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r11 = r10.a
            if (r11 == 0) goto L88
            r0.d = r10
            r0.c = r3
            java.lang.Object r11 = r9.a(r11, r0)
            if (r11 == r1) goto L87
        L84:
            vvw r11 = (defpackage.vvw) r11
            goto L89
        L87:
            return r1
        L88:
            r11 = r4
        L89:
            avob r10 = r10.b
            if (r10 == 0) goto La1
            int r10 = r10.ordinal()
            if (r10 == 0) goto L9e
            if (r10 != r3) goto L98
            vwc r10 = defpackage.vwc.a
            goto La2
        L98:
            fctg r10 = new fctg
            r10.<init>()
            throw r10
        L9e:
            vwa r10 = defpackage.vwa.a
            goto La2
        La1:
            r10 = r4
        La2:
            if (r11 != 0) goto La7
            if (r10 != 0) goto La7
            return r4
        La7:
            wrc r0 = new wrc
            r0.<init>(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.c(fdae, fcxy):java.lang.Object");
    }

    @Override // defpackage.wrd
    public final Object d(fcxy fcxyVar) {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser", "peek", 76, "ComposeRowStateParser.kt")).q("Starting ComposeRowStateParser.peek");
        return ((aqib) this.g.b()).a() ? f(new wpw(this, null), fcxyVar) : c(new fdae() { // from class: wpp
            @Override // defpackage.fdae
            public final Object invoke() {
                return avnt.a(this.a.b);
            }
        }, fcxyVar);
    }

    @Override // defpackage.wrd
    public final Object e(fcxy fcxyVar) {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser", "pop", 61, "ComposeRowStateParser.kt")).q("Starting ComposeRowStateParser.pop");
        return ((aqib) this.g.b()).a() ? f(new wpy(this, null), fcxyVar) : c(new fdae() { // from class: wpq
            @Override // defpackage.fdae
            public final Object invoke() {
                return avnt.c(this.a.b);
            }
        }, fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3, types: [fdat] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fdat r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.f(fdat, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:21:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.wqa
            if (r0 == 0) goto L13
            r0 = r13
            wqa r0 = (defpackage.wqa) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            wqa r0 = new wqa
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft$Attachment r12 = r0.h
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r6 = r0.g
            defpackage.fctl.b(r13)
            goto L71
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            defpackage.fctl.b(r13)
            java.util.List r13 = r12.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r13 = r13.iterator()
            r4 = r13
            r5 = r2
        L49:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L9f
            java.lang.Object r2 = r4.next()
            r13 = r2
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft$Attachment r13 = (com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft.Attachment) r13
            whe r6 = r11.f
            android.net.Uri r7 = r13.b
            r0.g = r12
            r0.a = r5
            r0.b = r4
            r0.c = r2
            r0.h = r13
            r0.f = r3
            java.lang.Object r6 = r6.b(r7, r0)
            if (r6 != r1) goto L6d
            return r1
        L6d:
            r10 = r6
            r6 = r12
            r12 = r13
            r13 = r10
        L71:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L9a
            ekrg r13 = defpackage.wqd.a
            ekrw r13 = r13.i()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r7 = "BugleComposeRow2"
            r13.X(r2, r7)
            r2 = 239(0xef, float:3.35E-43)
            java.lang.String r7 = "ComposeRowStateParser.kt"
            java.lang.String r8 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser"
            java.lang.String r9 = "sanitizeAttachments"
            ekrw r13 = r13.h(r8, r9, r2, r7)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r2 = "Attachment from IncomingDraft blocked by security filter: silently removing %s"
            r13.t(r2, r12)
            goto L9d
        L9a:
            r5.add(r2)
        L9d:
            r12 = r6
            goto L49
        L9f:
            r13 = 125(0x7d, float:1.75E-43)
            r0 = 0
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r12 = com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft.a(r12, r5, r0, r0, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.g(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft, fcxy):java.lang.Object");
    }
}
