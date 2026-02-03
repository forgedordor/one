package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyy implements wyz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/MapiMessageSender");
    public final fcyh b;
    public final ajlu c;
    public final ajlw d;
    public final ConversationId e;
    public final wms f;
    public final doht g;
    public final vvh h;
    public final fcsu i;
    public final amif j;
    private final fdpl k;
    private final anxf l;
    private final fcsu m;
    private final fdpl n;

    public wyy(fcyh fcyhVar, ajlu ajluVar, ajlw ajlwVar, fdpl fdplVar, ConversationId conversationId, anxf anxfVar, wms wmsVar, doht dohtVar, amif amifVar, vvh vvhVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fcyhVar.getClass();
        ajluVar.getClass();
        ajlwVar.getClass();
        fdplVar.getClass();
        conversationId.getClass();
        amifVar.getClass();
        vvhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fcyhVar;
        this.c = ajluVar;
        this.d = ajlwVar;
        this.k = fdplVar;
        this.e = conversationId;
        this.l = anxfVar;
        this.f = wmsVar;
        this.g = dohtVar;
        this.j = amifVar;
        this.h = vvhVar;
        this.i = fcsuVar;
        this.m = fcsuVar2;
        this.n = ((ardn) fcsuVar2.b()).a() ? new wyx(fdplVar) : new auxq(new fdae() { // from class: wyh
            @Override // defpackage.fdae
            public final Object invoke() {
                return fcvp.a;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.wym
            if (r0 == 0) goto L13
            r0 = r6
            wym r0 = (defpackage.wym) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wym r0 = new wym
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L43
        L36:
            defpackage.fctl.b(r6)
            fdpl r6 = r5.k
            r0.c = r4
            java.lang.Object r6 = defpackage.fdtc.c(r6, r0)
            if (r6 == r1) goto L5e
        L43:
            ekgb r6 = (defpackage.ekgb) r6
            if (r6 == 0) goto L58
            anxf r2 = r5.l
            wyg r4 = new wyg
            r4.<init>()
            r0.c = r3
            java.lang.Object r6 = r2.a(r6, r4, r0)
            if (r6 != r1) goto L57
            goto L5e
        L57:
            return r6
        L58:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyy.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r12, java.lang.String r13, java.lang.Long r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.wyn
            if (r0 == 0) goto L13
            r0 = r15
            wyn r0 = (defpackage.wyn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wyn r0 = new wyn
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            eieu r12 = r0.d
            defpackage.fctl.b(r15)     // Catch: java.lang.Throwable -> L29
            goto L5e
        L29:
            r0 = move-exception
            r13 = r0
            goto L6a
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            defpackage.fctl.b(r15)
            fcyh r15 = r0.u()
            boolean r15 = defpackage.eicg.b(r15)
            if (r15 == 0) goto L71
            java.lang.String r15 = "MapiMessageSender#convertAttachments"
            eieu r15 = defpackage.eiiy.h(r15)
            wyp r4 = new wyp     // Catch: java.lang.Throwable -> L66
            r9 = 0
            r7 = r11
            r6 = r12
            r5 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L66
            r0.d = r15     // Catch: java.lang.Throwable -> L66
            r0.c = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r12 = defpackage.fdjy.a(r4, r0)     // Catch: java.lang.Throwable -> L66
            if (r12 == r1) goto L65
            r10 = r15
            r15 = r12
            r12 = r10
        L5e:
            java.util.List r15 = (java.util.List) r15     // Catch: java.lang.Throwable -> L29
            r13 = 0
            defpackage.fczl.a(r12, r13)
            return r15
        L65:
            return r1
        L66:
            r0 = move-exception
            r12 = r0
            r13 = r12
            r12 = r15
        L6a:
            throw r13     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            r14 = r0
            defpackage.fczl.a(r12, r13)
            throw r14
        L71:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyy.b(java.util.List, java.lang.String, java.lang.Long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vvw r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wyq
            if (r0 == 0) goto L13
            r0 = r6
            wyq r0 = (defpackage.wyq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wyq r0 = new wyq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            cilq r5 = r5.j
            if (r5 == 0) goto L9e
            fdpl r6 = r4.n
            java.util.List r5 = r5.a
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = defpackage.fdtc.c(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L53
            int r5 = defpackage.ekgb.d
            ekgb r5 = defpackage.ekoe.a
            r5.getClass()
            return r5
        L53:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L5c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r5.next()
            r2 = r1
            cilo r2 = (defpackage.cilo) r2
            anue r2 = r2.e
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L5c
            r0.add(r1)
            goto L5c
        L75:
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.fcva.p(r0, r1)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L84:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r0.next()
            cilo r1 = (defpackage.cilo) r1
            wyr r2 = new wyr
            r2.<init>(r1, r6)
            r5.add(r2)
            goto L84
        L99:
            ekgb r5 = defpackage.ekfv.a(r5)
            return r5
        L9e:
            int r5 = defpackage.ekgb.d
            ekgb r5 = defpackage.ekoe.a
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyy.c(vvw, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vvw r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.wys
            if (r0 == 0) goto L13
            r0 = r8
            wys r0 = (defpackage.wys) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wys r0 = new wys
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.String r7 = r0.f
            java.lang.String r1 = r0.e
            vvw r0 = r0.d
            defpackage.fctl.b(r8)
            r2 = r7
            r7 = r0
            goto L6f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            defpackage.fctl.b(r8)
            java.lang.String r8 = r7.a
            if (r8 == 0) goto L45
            int r2 = r8.length()
            if (r2 > 0) goto L46
        L45:
            r8 = r4
        L46:
            java.lang.String r2 = r7.c
            if (r2 == 0) goto L50
            int r5 = r2.length()
            if (r5 > 0) goto L51
        L50:
            r2 = r4
        L51:
            fcsu r5 = r6.m
            java.lang.Object r5 = r5.b()
            ardn r5 = (defpackage.ardn) r5
            boolean r5 = r5.a()
            if (r5 == 0) goto L75
            r0.d = r7
            r0.e = r8
            r0.f = r2
            r0.c = r3
            java.lang.Object r0 = r6.c(r7, r0)
            if (r0 == r1) goto L74
            r1 = r8
            r8 = r0
        L6f:
            ekgb r8 = (defpackage.ekgb) r8
            r0 = r8
            r8 = r1
            goto L79
        L74:
            return r1
        L75:
            int r0 = defpackage.ekgb.d
            ekgb r0 = defpackage.ekoe.a
        L79:
            if (r2 != 0) goto L8c
            boolean r1 = r7.d
            if (r1 == 0) goto L80
            goto L8c
        L80:
            if (r8 != 0) goto L83
            return r4
        L83:
            wyk r7 = new wyk
            r0.getClass()
            r7.<init>(r8, r0)
            return r7
        L8c:
            boolean r7 = r7.d
            wyl r1 = new wyl
            r0.getClass()
            r1.<init>(r8, r2, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyy.d(vvw, fcxy):java.lang.Object");
    }
}
