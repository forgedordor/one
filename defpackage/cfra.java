package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfra {
    public final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public cfra(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.a = fcsuVar5;
        this.e = fcsuVar6;
        this.f = fcsuVar7;
        this.g = fcsuVar8;
        this.h = fcsuVar9;
    }

    public static final efnd l(String str, String str2, evqs evqsVar) {
        efmx efmxVar = new efmx();
        efmxVar.b(evqsVar);
        efil efilVarD = ContentType.d();
        efilVarD.f(str);
        efilVarD.e(str2);
        efmxVar.c(efilVarD.g());
        return efmxVar.a();
    }

    public static /* synthetic */ Object m(cfra cfraVar, ezol ezolVar, String str, emfy emfyVar, emfv emfvVar, fcxy fcxyVar, int i) {
        if ((i & 4) != 0) {
            emfyVar = emfy.BASIC_MESSAGE;
        }
        emfy emfyVar2 = emfyVar;
        if ((i & 8) != 0) {
            emfvVar = emfv.UNKNOWN_CONTENT_TYPE;
        }
        return cfraVar.a(ezolVar, str, emfyVar2, emfvVar, fcxyVar);
    }

    public static /* synthetic */ Object o(cfra cfraVar, String str, ezol ezolVar, emfy emfyVar, emfv emfvVar, fcxy fcxyVar, int i) {
        if ((i & 4) != 0) {
            emfyVar = emfy.BASIC_MESSAGE;
        }
        emfy emfyVar2 = emfyVar;
        if ((i & 8) != 0) {
            emfvVar = emfv.UNKNOWN_CONTENT_TYPE;
        }
        return cfraVar.j(str, ezolVar, emfyVar2, emfvVar, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ezol r8, java.lang.String r9, defpackage.emfy r10, defpackage.emfv r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.cfqq
            if (r0 == 0) goto L13
            r0 = r12
            cfqq r0 = (defpackage.cfqq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfqq r0 = new cfqq
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            emfv r11 = r6.f
            emfy r10 = r6.e
            java.lang.String r9 = r6.d
            defpackage.fctl.b(r12)     // Catch: java.lang.Exception -> L32
            r1 = r7
            goto L78
        L32:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L83
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            defpackage.fctl.b(r12)
            return r12
        L42:
            defpackage.fctl.b(r12)
            cczi r12 = defpackage.cbpz.m
            java.lang.Object r12 = r12.e()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L62
            r6.c = r3
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r8 = r1.c(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L61
            goto L74
        L61:
            return r8
        L62:
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6.d = r3     // Catch: java.lang.Exception -> L7e
            r6.e = r4     // Catch: java.lang.Exception -> L7e
            r6.f = r5     // Catch: java.lang.Exception -> L7e
            r6.c = r2     // Catch: java.lang.Exception -> L7e
            java.lang.Object r12 = r7.b(r8, r6)     // Catch: java.lang.Exception -> L7e
            if (r12 != r0) goto L75
        L74:
            return r0
        L75:
            r9 = r3
            r10 = r4
            r11 = r5
        L78:
            alza r12 = (defpackage.alza) r12     // Catch: java.lang.Exception -> L7b
            return r12
        L7b:
            r0 = move-exception
            r8 = r0
            goto L83
        L7e:
            r0 = move-exception
            r8 = r0
            r9 = r3
            r10 = r4
            r11 = r5
        L83:
            r12 = 7
            r7.p(r9, r10, r11, r12)
            cfpt r9 = new cfpt
            java.lang.String r10 = "Find message repository failed."
            r9.<init>(r10, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.a(ezol, java.lang.String, emfy, emfv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r0 != r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ezol r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof defpackage.cfqr
            if (r2 == 0) goto L17
            r2 = r0
            cfqr r2 = (defpackage.cfqr) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            cfqr r2 = new cfqr
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3d
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            defpackage.fctl.b(r0)     // Catch: java.lang.Exception -> L2e
            goto L78
        L2e:
            r0 = move-exception
            goto Lb4
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L39:
            defpackage.fctl.b(r0)
            goto L4a
        L3d:
            defpackage.fctl.b(r0)
            r2.c = r6
            r0 = r17
            java.lang.Object r0 = r1.g(r0, r2)
            if (r0 == r3) goto Lbc
        L4a:
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient) r0
            akzk r6 = new akzk
            ekgb r7 = defpackage.ekgb.r(r0)
            r7.getClass()
            r14 = 0
            r15 = 246(0xf6, float:3.45E-43)
            r8 = 0
            r9 = 0
            r10 = 4
            r11 = 0
            r12 = 0
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            fcsu r0 = r1.d     // Catch: java.lang.Exception -> L2e
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Exception -> L2e
            ajln r0 = (defpackage.ajln) r0     // Catch: java.lang.Exception -> L2e
            eiju r0 = r0.h(r6)     // Catch: java.lang.Exception -> L2e
            r0.getClass()     // Catch: java.lang.Exception -> L2e
            r2.c = r5     // Catch: java.lang.Exception -> L2e
            java.lang.Object r0 = defpackage.fdxs.c(r0, r2)     // Catch: java.lang.Exception -> L2e
            if (r0 == r3) goto Lbc
        L78:
            ekgb r0 = (defpackage.ekgb) r0     // Catch: java.lang.Exception -> L2e
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto Lac
            fcsu r2 = r1.d
            java.lang.Object r2 = r2.b()
            ajln r2 = (defpackage.ajln) r2
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r0 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r0
            ajlm r3 = defpackage.ajlm.MINIMAL
            com.google.android.apps.messaging.shared.api.messaging.Conversation r0 = r2.a(r0, r3)
            ajmh r0 = r0.c()
            boolean r2 = r0 instanceof defpackage.alza
            if (r2 == 0) goto La0
            alza r0 = (defpackage.alza) r0
            goto La1
        La0:
            r0 = 0
        La1:
            if (r0 == 0) goto La4
            return r0
        La4:
            cfpt r0 = new cfpt
            java.lang.String r2 = "MessageRepository needs to be BugleMessageRepository."
            r0.<init>(r2)
            throw r0
        Lac:
            cfpt r0 = new cfpt
            java.lang.String r2 = "ConversationIds cannot be empty."
            r0.<init>(r2)
            throw r0
        Lb4:
            cfpt r2 = new cfpt
            java.lang.String r3 = "Find conversation failed."
            r2.<init>(r3, r0)
            throw r2
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.b(ezol, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (r0 != r7) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [emfv] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6, types: [emfy] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ezol r21, java.lang.String r22, defpackage.emfy r23, defpackage.emfv r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.c(ezol, java.lang.String, emfy, emfv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aoer r9, defpackage.ezol r10, java.lang.String r11, defpackage.emfy r12, defpackage.emfv r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.cfqt
            if (r0 == 0) goto L13
            r0 = r14
            cfqt r0 = (defpackage.cfqt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfqt r0 = new cfqt
            r0.<init>(r8, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            emfv r13 = r7.f
            emfy r12 = r7.e
            java.lang.String r11 = r7.d
            defpackage.fctl.b(r14)     // Catch: java.lang.Exception -> L32
            r1 = r8
            goto L7a
        L32:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L85
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            defpackage.fctl.b(r14)
            return r14
        L42:
            defpackage.fctl.b(r14)
            cczi r14 = defpackage.cbpz.m
            java.lang.Object r14 = r14.e()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L63
            r7.c = r3
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r9 = r1.f(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L62
            goto L76
        L62:
            return r9
        L63:
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7.d = r4     // Catch: java.lang.Exception -> L80
            r7.e = r5     // Catch: java.lang.Exception -> L80
            r7.f = r6     // Catch: java.lang.Exception -> L80
            r7.c = r2     // Catch: java.lang.Exception -> L80
            java.lang.Object r14 = r8.e(r9, r3, r7)     // Catch: java.lang.Exception -> L80
            if (r14 != r0) goto L77
        L76:
            return r0
        L77:
            r11 = r4
            r12 = r5
            r13 = r6
        L7a:
            alza r14 = (defpackage.alza) r14     // Catch: java.lang.Exception -> L7d
            return r14
        L7d:
            r0 = move-exception
            r9 = r0
            goto L85
        L80:
            r0 = move-exception
            r9 = r0
            r11 = r4
            r12 = r5
            r13 = r6
        L85:
            r10 = 7
            r8.p(r11, r12, r13, r10)
            cfpt r10 = new cfpt
            java.lang.String r11 = "Get or create message repository failed."
            r10.<init>(r11, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.d(aoer, ezol, java.lang.String, emfy, emfv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aoer r7, defpackage.ezol r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cfqu
            if (r0 == 0) goto L13
            r0 = r9
            cfqu r0 = (defpackage.cfqu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cfqu r0 = new cfqu
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r9)     // Catch: java.lang.Exception -> L2b
            goto L6d
        L2b:
            r7 = move-exception
            goto L85
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r9)     // Catch: java.lang.Exception -> L2b
            goto L49
        L3b:
            defpackage.fctl.b(r9)
            r0.a = r7     // Catch: java.lang.Exception -> L2b
            r0.d = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = r6.g(r8, r0)     // Catch: java.lang.Exception -> L2b
            if (r9 != r1) goto L49
            goto L6c
        L49:
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r9 = (com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient) r9     // Catch: java.lang.Exception -> L2b
            fcsu r8 = r6.d     // Catch: java.lang.Exception -> L2b
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Exception -> L2b
            ajln r8 = (defpackage.ajln) r8     // Catch: java.lang.Exception -> L2b
            j$.util.Optional r7 = j$.util.Optional.of(r7)     // Catch: java.lang.Exception -> L2b
            ekgb r9 = defpackage.ekgb.r(r9)     // Catch: java.lang.Exception -> L2b
            eiju r7 = r8.o(r7, r9, r5)     // Catch: java.lang.Exception -> L2b
            r7.getClass()     // Catch: java.lang.Exception -> L2b
            r0.a = r5     // Catch: java.lang.Exception -> L2b
            r0.d = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = defpackage.fdxs.c(r7, r0)     // Catch: java.lang.Exception -> L2b
            if (r9 != r1) goto L6d
        L6c:
            return r1
        L6d:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r9 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r9     // Catch: java.lang.Exception -> L2b
            ajmh r7 = r9.c()
            boolean r8 = r7 instanceof defpackage.alza
            if (r8 == 0) goto L7a
            r5 = r7
            alza r5 = (defpackage.alza) r5
        L7a:
            if (r5 == 0) goto L7d
            return r5
        L7d:
            cfpt r7 = new cfpt
            java.lang.String r8 = "Handling reflection message. MessageRepository is not BugleMessageRepository."
            r7.<init>(r8)
            throw r7
        L85:
            cfpt r8 = new cfpt
            java.lang.String r9 = "Handling reflection message. Get or create conversation Failed."
            r8.<init>(r9, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.e(aoer, ezol, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.aoer r9, defpackage.ezol r10, java.lang.String r11, defpackage.emfy r12, defpackage.emfv r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.f(aoer, ezol, java.lang.String, emfy, emfv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ezol r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cfqw
            if (r0 == 0) goto L13
            r0 = r8
            cfqw r0 = (defpackage.cfqw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfqw r0 = new cfqw
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r8)
            goto L62
        L39:
            defpackage.fctl.b(r8)
            goto L50
        L3d:
            defpackage.fctl.b(r8)
            fcsu r8 = r6.g
            java.lang.Object r8 = r8.b()
            awjh r8 = (defpackage.awjh) r8
            r0.c = r5
            java.lang.Object r8 = r8.g(r7, r0)
            if (r8 == r1) goto L91
        L50:
            fcsu r7 = r6.g
            awjl r8 = (defpackage.awjl) r8
            java.lang.Object r7 = r7.b()
            awjh r7 = (defpackage.awjh) r7
            r0.c = r4
            java.lang.Object r8 = r7.i(r8, r0)
            if (r8 == r1) goto L91
        L62:
            fcsu r7 = r6.h
            aubq r8 = (defpackage.aubq) r8
            java.lang.Object r7 = r7.b()
            alfq r7 = (defpackage.alfq) r7
            alqm r7 = r7.b(r8)
            fcsu r8 = r6.c
            java.lang.Object r8 = r8.b()
            anty r8 = (defpackage.anty) r8
            eiju r7 = r8.p(r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)
            if (r8 == r1) goto L91
        L84:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r8
            if (r8 == 0) goto L89
            return r8
        L89:
            cfpt r7 = new cfpt
            java.lang.String r8 = "Recipient cannot be null."
            r7.<init>(r8)
            throw r7
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.g(ezol, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ezol r7, java.lang.String r8, defpackage.emfy r9, defpackage.emfv r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.cfqx
            if (r0 == 0) goto L13
            r0 = r11
            cfqx r0 = (defpackage.cfqx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfqx r0 = new cfqx
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            emfv r7 = r0.f
            emfy r8 = r0.e
            java.lang.String r9 = r0.d
            defpackage.fctl.b(r11)
            goto Lad
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            emfv r7 = r0.f
            emfy r8 = r0.e
            java.lang.String r9 = r0.d
            defpackage.fctl.b(r11)
            goto L85
        L46:
            emfv r10 = r0.f
            emfy r9 = r0.e
            java.lang.String r8 = r0.d
            defpackage.fctl.b(r11)
            goto L69
        L50:
            defpackage.fctl.b(r11)
            fcsu r11 = r6.g
            java.lang.Object r11 = r11.b()
            awjh r11 = (defpackage.awjh) r11
            r0.d = r8
            r0.e = r9
            r0.f = r10
            r0.c = r5
            java.lang.Object r11 = r11.g(r7, r0)
            if (r11 == r1) goto Lbf
        L69:
            fcsu r7 = r6.g
            awjl r11 = (defpackage.awjl) r11
            java.lang.Object r7 = r7.b()
            awjh r7 = (defpackage.awjh) r7
            r0.d = r8
            r0.e = r9
            r0.f = r10
            r0.c = r4
            java.lang.Object r11 = r7.i(r11, r0)
            if (r11 == r1) goto Lbf
            r7 = r9
            r9 = r8
            r8 = r7
            r7 = r10
        L85:
            fcsu r10 = r6.h
            aubq r11 = (defpackage.aubq) r11
            java.lang.Object r10 = r10.b()
            alfq r10 = (defpackage.alfq) r10
            alqm r10 = r10.b(r11)
            fcsu r11 = r6.c
            java.lang.Object r11 = r11.b()
            anty r11 = (defpackage.anty) r11
            eiju r10 = r11.p(r10)
            r0.d = r9
            r0.e = r8
            r0.f = r7
            r0.c = r3
            java.lang.Object r11 = defpackage.fdxs.c(r10, r0)
            if (r11 == r1) goto Lbf
        Lad:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r11 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r11
            if (r11 == 0) goto Lb2
            return r11
        Lb2:
            r10 = 20
            r6.p(r9, r8, r7, r10)
            cfpt r7 = new cfpt
            java.lang.String r8 = "Recipient cannot be null."
            r7.<init>(r8)
            throw r7
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.h(ezol, java.lang.String, emfy, emfv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, java.lang.String r6, defpackage.emfy r7, defpackage.emfv r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.cfqy
            if (r0 == 0) goto L13
            r0 = r9
            cfqy r0 = (defpackage.cfqy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfqy r0 = new cfqy
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            emfv r8 = r0.g
            emfy r7 = r0.f
            java.lang.String r6 = r0.e
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r9)     // Catch: java.lang.Exception -> L2f
            goto L60
        L2f:
            r6 = move-exception
            goto L92
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            defpackage.fctl.b(r9)
            fcsu r9 = r4.b     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Exception -> L2f
            aofc r9 = (defpackage.aofc) r9     // Catch: java.lang.Exception -> L2f
            anpj r9 = r9.a()     // Catch: java.lang.Exception -> L2f
            eiju r9 = r9.b()     // Catch: java.lang.Exception -> L2f
            r9.getClass()     // Catch: java.lang.Exception -> L2f
            r0.d = r5     // Catch: java.lang.Exception -> L2f
            r0.e = r6     // Catch: java.lang.Exception -> L2f
            r0.f = r7     // Catch: java.lang.Exception -> L2f
            r0.g = r8     // Catch: java.lang.Exception -> L2f
            r0.c = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)     // Catch: java.lang.Exception -> L2f
            if (r9 != r1) goto L60
            return r1
        L60:
            ekgb r9 = (defpackage.ekgb) r9     // Catch: java.lang.Exception -> L2f
            r9.getClass()     // Catch: java.lang.Exception -> L2f
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L2f
        L69:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Exception -> L2f
            r1 = r0
            aoer r1 = (defpackage.aoer) r1     // Catch: java.lang.Exception -> L2f
            j$.util.Optional r1 = r1.o()     // Catch: java.lang.Exception -> L2f
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L2f
            alqm r1 = (defpackage.alqm) r1     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = r1.j()     // Catch: java.lang.Exception -> L2f
            boolean r1 = defpackage.fdbq.f(r1, r6)     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L69
            goto L8c
        L8b:
            r0 = 0
        L8c:
            r0.getClass()     // Catch: java.lang.Exception -> L2f
            aoer r0 = (defpackage.aoer) r0     // Catch: java.lang.Exception -> L2f
            return r0
        L92:
            r9 = 6
            r4.p(r5, r7, r8, r9)
            cfpt r5 = new cfpt
            java.lang.String r7 = "Find selfIdentity failed."
            r5.<init>(r7, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.i(java.lang.String, java.lang.String, emfy, emfv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4 A[Catch: Exception -> 0x006f, PHI: r10 r12 r13 r14
      0x00d4: PHI (r10v7 java.lang.String) = (r10v6 java.lang.String), (r10v13 java.lang.String) binds: [B:43:0x00d2, B:25:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r12v6 emfy) = (r12v5 emfy), (r12v9 emfy) binds: [B:43:0x00d2, B:25:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r13v5 emfv) = (r13v4 emfv), (r13v8 emfv) binds: [B:43:0x00d2, B:25:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r14v18 java.lang.Object) = (r14v17 java.lang.Object), (r14v1 java.lang.Object) binds: [B:43:0x00d2, B:25:0x0056] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:25:0x0056, B:44:0x00d4, B:28:0x0061, B:42:0x00b8, B:31:0x006b, B:40:0x009c, B:37:0x0084), top: B:60:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:20:0x0044, B:48:0x0103, B:50:0x010b, B:52:0x010f, B:53:0x0116), top: B:62:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:20:0x0044, B:48:0x0103, B:50:0x010b, B:52:0x010f, B:53:0x0116), top: B:62:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r10, defpackage.ezol r11, defpackage.emfy r12, defpackage.emfv r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfra.j(java.lang.String, ezol, emfy, emfv, fcxy):java.lang.Object");
    }

    public final void k(String str, emfy emfyVar, emfv emfvVar) {
        emfyVar.getClass();
        emfvVar.getClass();
        if (((Boolean) cbpz.i.e()).booleanValue()) {
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellgVar.getClass();
            elgr.g(ellf.RCS_REFLECTION_EVENT, ellgVar);
            emfs emfsVar = (emfs) emga.a.createBuilder();
            emfsVar.getClass();
            emmq.b(str, emfsVar);
            emmq.d(emfyVar, emfsVar);
            emmq.c(emfvVar, emfsVar);
            emmq.e(4, emfsVar);
            emmq.f(2, emfsVar);
            elgr.h(emmq.a(emfsVar), ellgVar);
            fcsu fcsuVar = this.a;
            ((cfpv) fcsuVar.b()).a(elgr.a(ellgVar));
        }
    }

    public final void p(String str, emfy emfyVar, emfv emfvVar, int i) {
        str.getClass();
        emfyVar.getClass();
        emfvVar.getClass();
        if (((Boolean) cbpz.i.e()).booleanValue()) {
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellgVar.getClass();
            elgr.g(ellf.RCS_REFLECTION_EVENT, ellgVar);
            emfs emfsVar = (emfs) emga.a.createBuilder();
            emfsVar.getClass();
            emmq.b(str, emfsVar);
            emmq.d(emfyVar, emfsVar);
            emmq.c(emfvVar, emfsVar);
            emmq.e(3, emfsVar);
            emmq.f(3, emfsVar);
            emfsVar.copyOnWrite();
            emga emgaVar = (emga) emfsVar.instance;
            emgaVar.g = i - 1;
            emgaVar.b |= 16;
            elgr.h(emmq.a(emfsVar), ellgVar);
            ((cfpv) this.a.b()).a(elgr.a(ellgVar));
        }
    }
}
