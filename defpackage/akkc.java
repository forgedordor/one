package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akkc {
    public static final fdap a = new fdap() { // from class: akjo
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            alqm alqmVar = (alqm) obj;
            alqmVar.getClass();
            Optional optionalE = alqmVar.e();
            optionalE.getClass();
            aubq aubqVar = (aubq) fdct.b(optionalE);
            String str = aubqVar != null ? aubqVar.d : null;
            if (str != null) {
                return fdgn.X(fdgn.q(str, "+", "")).toString();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    };
    public final ajvr b;
    public final fcsu c;
    private final cogw d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final asyh j;
    private final aswq k;
    private final aprv l;

    public akkc(ajvr ajvrVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, asyh asyhVar, cirj cirjVar, aswq aswqVar, aprv aprvVar) {
        ajvrVar.getClass();
        cogwVar.getClass();
        fcsuVar6.getClass();
        cirjVar.getClass();
        this.b = ajvrVar;
        this.d = cogwVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.c = fcsuVar6;
        this.j = asyhVar;
        this.k = aswqVar;
        this.l = aprvVar;
    }

    private static final boolean g(awhp awhpVar, int i) {
        Integer numG;
        String strA = awhpVar.a("mms-group-upgrade");
        return ((strA == null || (numG = fdgn.g(strA)) == null) ? Integer.parseInt("0") : numG.intValue()) >= i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r5, defpackage.asxy r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.akjt
            if (r0 == 0) goto L13
            r0 = r7
            akjt r0 = (defpackage.akjt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akjt r0 = new akjt
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L6b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L3b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            alqm r2 = r2.g()
            j$.util.Optional r2 = r2.e()
            r2.getClass()
            java.lang.Object r2 = defpackage.fdct.b(r2)
            aubq r2 = (defpackage.aubq) r2
            if (r2 == 0) goto L3b
            r7.add(r2)
            goto L3b
        L5e:
            eiju r5 = r6.a(r7)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r5, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkc.a(java.util.List, asxy, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r1 != r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b5, code lost:
    
        if (r1 != r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b5 -> B:23:0x00b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r19, java.util.List r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof defpackage.akjv
            if (r2 == 0) goto L17
            r2 = r1
            akjv r2 = (defpackage.akjv) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            akjv r2 = new akjv
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.b
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.d
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L44
            if (r4 == r7) goto L3c
            if (r4 != r6) goto L34
            java.lang.Object r4 = r2.a
            java.util.Iterator r4 = (java.util.Iterator) r4
            defpackage.fctl.b(r1)
            goto Lb7
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            java.lang.Object r4 = r2.a
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r4 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r4
            defpackage.fctl.b(r1)
            goto L6c
        L44:
            defpackage.fctl.b(r1)
            ajvr r1 = r0.b
            akzk r8 = new akzk
            ekgb r9 = defpackage.ekfv.a(r20)
            r16 = 0
            r17 = 230(0xe6, float:3.22E-43)
            r10 = 0
            r11 = 0
            r12 = 4
            r13 = 1
            r14 = 0
            r15 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            eiju r1 = r1.h(r8)
            r4 = r19
            r2.a = r4
            r2.d = r7
            java.lang.Object r1 = defpackage.fdxs.c(r1, r2)
            if (r1 == r3) goto Lc5
        L6c:
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            fdev r1 = defpackage.fcva.ax(r1)
            akju r8 = defpackage.akju.a
            fdeq r9 = new fdeq
            r9.<init>(r1, r7, r8)
            akjp r1 = new akjp
            r1.<init>()
            fdeq r4 = new fdeq
            r4.<init>(r9, r5, r1)
            akjq r1 = new akjq
            r1.<init>()
            fdev r1 = defpackage.fdey.j(r4, r1)
            fdft r4 = new fdft
            fdfu r1 = (defpackage.fdfu) r1
            r4.<init>(r1)
        L96:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r4.next()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r1 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation) r1
            anpj r1 = r1.n()
            eiju r1 = r1.b()
            r1.getClass()
            r2.a = r4
            r2.d = r6
            java.lang.Object r1 = defpackage.fdxs.c(r1, r2)
            if (r1 == r3) goto Lc5
        Lb7:
            ajts r1 = (defpackage.ajts) r1
            boolean r1 = r1.S()
            if (r1 == 0) goto L96
            r5 = r7
        Lc0:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        Lc5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkc.b(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.akjw
            if (r0 == 0) goto L13
            r0 = r6
            akjw r0 = (defpackage.akjw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akjw r0 = new akjw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            alza r5 = r5.m()
            eiju r5 = r5.O(r3)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L7f
        L42:
            ekgb r6 = (defpackage.ekgb) r6
            r6.getClass()
            java.lang.Object r5 = defpackage.fcva.P(r6)
            ajlt r5 = (defpackage.ajlt) r5
            if (r5 != 0) goto L55
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L55:
            cogw r6 = r4.d
            fcsu r0 = r4.e
            j$.time.Instant r5 = r5.o()
            j$.time.Instant r6 = r6.f()
            java.lang.Object r0 = r0.b()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            j$.time.Duration r0 = j$.time.Duration.ofDays(r0)
            j$.time.Instant r6 = r6.minus(r0)
            boolean r5 = r5.isAfter(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkc.c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x03ee, code lost:
    
        if (r2 == r4) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x03ee -> B:116:0x03f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkc.d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aoer r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.akka
            if (r0 == 0) goto L13
            r0 = r7
            akka r0 = (defpackage.akka) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akka r0 = new akka
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r7)
            goto L47
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.fctl.b(r7)
            anpj r6 = r6.f()
            if (r6 == 0) goto L51
            eiju r6 = r6.b()
            if (r6 == 0) goto L51
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L50
        L47:
            aoio r7 = (defpackage.aoio) r7
            if (r7 == 0) goto L51
            boolean r4 = r7.a()
            goto L51
        L50:
            return r1
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkc.e(aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.aoer r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.akkb
            if (r0 == 0) goto L13
            r0 = r6
            akkb r0 = (defpackage.akkb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akkb r0 = new akkb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            ajna r6 = defpackage.ajna.RICH
            eiju r5 = r5.n(r6)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L4f
        L40:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L49
            boolean r5 = r6.booleanValue()
            goto L4a
        L49:
            r5 = 0
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkc.f(aoer, fcxy):java.lang.Object");
    }
}
