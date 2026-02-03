package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akbc implements akbe {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleDestinationConversationMatcher");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final aqnz e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcyh i;
    private final fdjx j;
    private final aqnw k;
    private final aqob l;
    private final aqnx m;

    public akbc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcyh fcyhVar, fdjx fdjxVar, aqnw aqnwVar, aqnz aqnzVar, aqob aqobVar, aqnx aqnxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        aqnwVar.getClass();
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.d = fcsuVar5;
        this.h = fcsuVar6;
        this.i = fcyhVar;
        this.j = fdjxVar;
        this.k = aqnwVar;
        this.e = aqnzVar;
        this.l = aqobVar;
        this.m = aqnxVar;
    }

    private final Object i(bojh bojhVar, awjl awjlVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.i), new akbb(null, this, bojhVar, awjlVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.akbe
    public final eiju a(awjl awjlVar) {
        awjlVar.getClass();
        return auvw.c(this.j, fcyi.a, fdjz.a, new akat(this, awjlVar, null));
    }

    @Override // defpackage.akbe
    public final eiju b(awjl awjlVar, ajsm ajsmVar) {
        awjlVar.getClass();
        ajsmVar.getClass();
        return auvw.c(this.j, fcyi.a, fdjz.a, new akav(this, awjlVar, ajsmVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        if (i(r10, r8, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.awjb r8, defpackage.ajsm r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.akal
            if (r0 == 0) goto L13
            r0 = r10
            akal r0 = (defpackage.akal) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akal r0 = new akal
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.a
            bojh r8 = (defpackage.bojh) r8
            defpackage.fctl.b(r10)
            goto Ld1
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.a
            awjb r8 = (defpackage.awjb) r8
            defpackage.fctl.b(r10)
            goto Lb7
        L43:
            bake r8 = r0.f
            ajsm r9 = r0.e
            java.lang.Object r2 = r0.a
            awjb r2 = (defpackage.awjb) r2
            defpackage.fctl.b(r10)
            goto L7a
        L4f:
            defpackage.fctl.b(r10)
            baqz r10 = defpackage.bara.z()
            r2 = 0
            r10.k(r2)
            r10.l(r2)
            cnqj r2 = new cnqj
            r2.<init>()
            r10.x(r2)
            r0.a = r8
            r0.e = r9
            r2 = r10
            bake r2 = (defpackage.bake) r2
            r0.f = r2
            r0.d = r5
            java.lang.Object r2 = r7.h(r8, r0)
            if (r2 == r1) goto Ld9
            r6 = r2
            r2 = r8
            r8 = r10
            r10 = r6
        L7a:
            java.util.List r10 = defpackage.fcva.b(r10)
            r8.p(r10)
            r8.g(r9)
            aqnw r9 = r7.k
            boolean r9 = r9.a()
            if (r9 == 0) goto L91
            awjl r9 = r2.a
            r8.j(r9)
        L91:
            fcsu r9 = r7.g
            java.lang.Object r9 = r9.b()
            avpc r9 = (defpackage.avpc) r9
            java.lang.String r10 = r2.c
            akak r5 = new akak
            r5.<init>()
            eiju r8 = r9.m(r10, r5)
            r8.getClass()
            r0.a = r2
            r9 = 0
            r0.e = r9
            r0.f = r9
            r0.d = r4
            java.lang.Object r10 = defpackage.fdxs.c(r8, r0)
            if (r10 == r1) goto Ld9
            r8 = r2
        Lb7:
            aqnw r9 = r7.k
            bojh r10 = (defpackage.bojh) r10
            boolean r9 = r9.a()
            if (r9 != 0) goto Ld0
            r10.getClass()
            awjl r8 = r8.a
            r0.a = r10
            r0.d = r3
            java.lang.Object r8 = r7.i(r10, r8, r0)
            if (r8 == r1) goto Ld9
        Ld0:
            r8 = r10
        Ld1:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = r8.C()
            r8.getClass()
            return r8
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbc.c(awjb, ajsm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r9 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.awjl r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.akam
            if (r0 == 0) goto L13
            r0 = r9
            akam r0 = (defpackage.akam) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akam r0 = new akam
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            awjl r8 = r0.d
            defpackage.fctl.b(r9)
            goto L82
        L3c:
            awjl r8 = r0.d
            defpackage.fctl.b(r9)
            goto L6a
        L42:
            defpackage.fctl.b(r9)
            aqob r9 = r7.l
            aqnk r9 = (defpackage.aqnk) r9
            fcsu r9 = r9.a
            java.lang.Object r9 = r9.b()
            eoth r9 = (defpackage.eoth) r9
            java.lang.String r2 = "bugle.handle_duplicate_destination_token"
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L6d
            r0.d = r8
            r0.c = r5
            fcyh r9 = r7.i
            akaq r2 = new akaq
            r2.<init>(r7, r8, r6)
            java.lang.Object r9 = defpackage.eicj.a(r9, r2, r0)
            if (r9 == r1) goto L93
        L6a:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r9
            goto L84
        L6d:
            r0.d = r8
            r0.c = r4
            fcyh r9 = r7.i
            fcyh r9 = defpackage.eicg.a(r9)
            akar r2 = new akar
            r2.<init>(r6, r8, r7)
            java.lang.Object r9 = defpackage.fdin.a(r9, r2, r0)
            if (r9 == r1) goto L93
        L82:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r9
        L84:
            if (r9 != 0) goto L92
            r0.d = r6
            r0.c = r3
            java.lang.Object r8 = r7.f(r8, r0)
            if (r8 != r1) goto L91
            goto L93
        L91:
            return r8
        L92:
            return r9
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbc.d(awjl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.awjb r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.akan
            if (r0 == 0) goto L13
            r0 = r6
            akan r0 = (defpackage.akan) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akan r0 = new akan
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.g
            java.lang.Object r6 = r6.b()
            avpc r6 = (defpackage.avpc) r6
            java.lang.String r5 = r5.c
            eiju r5 = r6.g(r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L70
        L48:
            bojh r6 = (defpackage.bojh) r6
            if (r6 != 0) goto L4e
            r5 = 5
            goto L62
        L4e:
            aqnz r5 = r4.e
            boolean r5 = r5.a()
            r0 = 4
            if (r5 == 0) goto L61
            awjl r5 = r6.B()
            if (r5 != 0) goto L5e
            goto L61
        L5e:
            r5 = 8
            goto L62
        L61:
            r5 = r0
        L62:
            fcsu r0 = r4.b
            java.lang.Object r0 = r0.b()
            ains r0 = (defpackage.ains) r0
            java.lang.String r1 = "Bugle.Cme.Destination.Conversation.Match.Fallback"
            r0.e(r1, r5)
            return r6
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbc.e(awjb, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r11 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        if (i(r10, r11, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.awjl r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.akao
            if (r0 == 0) goto L13
            r0 = r11
            akao r0 = (defpackage.akao) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akao r0 = new akao
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L56
            if (r2 == r7) goto L4e
            if (r2 == r6) goto L46
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r10 = r0.a
            bojh r10 = (defpackage.bojh) r10
            defpackage.fctl.b(r11)
            goto La7
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            java.lang.Object r10 = r0.a
            awjl r10 = (defpackage.awjl) r10
            defpackage.fctl.b(r11)
            goto L98
        L46:
            java.lang.Object r10 = r0.a
            awjl r10 = (defpackage.awjl) r10
            defpackage.fctl.b(r11)
            goto L88
        L4e:
            java.lang.Object r10 = r0.a
            awjl r10 = (defpackage.awjl) r10
            defpackage.fctl.b(r11)
            goto L6b
        L56:
            defpackage.fctl.b(r11)
            fcsu r11 = r9.f
            java.lang.Object r11 = r11.b()
            awjh r11 = (defpackage.awjh) r11
            r0.a = r10
            r0.d = r7
            java.lang.Object r11 = r11.e(r10, r0)
            if (r11 == r1) goto Laf
        L6b:
            awjb r11 = (defpackage.awjb) r11
            awja r2 = r11.b
            awja r7 = defpackage.awja.c
            if (r2 != r7) goto L8e
            r0.a = r10
            r0.d = r6
            fcyh r2 = r9.i
            fcyh r2 = defpackage.eicg.a(r2)
            akaw r5 = new akaw
            r5.<init>(r3, r9, r11)
            java.lang.Object r11 = defpackage.fdin.a(r2, r5, r0)
            if (r11 == r1) goto Laf
        L88:
            bojh r11 = (defpackage.bojh) r11
        L8a:
            r8 = r11
            r11 = r10
            r10 = r8
            goto L9b
        L8e:
            r0.a = r10
            r0.d = r5
            java.lang.Object r11 = r9.e(r11, r0)
            if (r11 == r1) goto Laf
        L98:
            bojh r11 = (defpackage.bojh) r11
            goto L8a
        L9b:
            if (r10 == 0) goto La7
            r0.a = r10
            r0.d = r4
            java.lang.Object r11 = r9.i(r10, r11, r0)
            if (r11 == r1) goto Laf
        La7:
            if (r10 == 0) goto Lae
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r10 = r10.C()
            return r10
        Lae:
            return r3
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbc.f(awjl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.awjl r8, defpackage.ajsm r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.akau
            if (r0 == 0) goto L13
            r0 = r10
            akau r0 = (defpackage.akau) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            akau r0 = new akau
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r10)
            return r10
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.b
            awjb r8 = (defpackage.awjb) r8
            java.lang.Object r9 = r0.a
            ajsm r9 = (defpackage.ajsm) r9
            defpackage.fctl.b(r10)
            goto L7c
        L41:
            java.lang.Object r8 = r0.b
            r9 = r8
            ajsm r9 = (defpackage.ajsm) r9
            java.lang.Object r8 = r0.a
            awjl r8 = (defpackage.awjl) r8
            defpackage.fctl.b(r10)
            goto L65
        L4e:
            defpackage.fctl.b(r10)
            fcsu r10 = r7.f
            java.lang.Object r10 = r10.b()
            awjh r10 = (defpackage.awjh) r10
            r0.a = r8
            r0.b = r9
            r0.e = r5
            java.lang.Object r10 = r10.e(r8, r0)
            if (r10 == r1) goto L98
        L65:
            awjb r10 = (defpackage.awjb) r10
            awja r2 = r10.b
            awja r5 = defpackage.awja.c
            if (r2 == r5) goto L90
            r0.a = r9
            r0.b = r10
            r0.e = r4
            java.lang.Object r8 = r7.d(r8, r0)
            if (r8 == r1) goto L98
            r6 = r10
            r10 = r8
            r8 = r6
        L7c:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r10 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r10
            if (r10 != 0) goto L8f
            r10 = 0
            r0.a = r10
            r0.b = r10
            r0.e = r3
            java.lang.Object r8 = r7.c(r8, r9, r0)
            if (r8 != r1) goto L8e
            goto L98
        L8e:
            return r8
        L8f:
            return r10
        L90:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Conversation creation not supported for GROUP type."
            r8.<init>(r9)
            throw r8
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbc.g(awjl, ajsm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r8 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.awjb r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.akaz
            if (r0 == 0) goto L13
            r0 = r8
            akaz r0 = (defpackage.akaz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akaz r0 = new akaz
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
            goto L71
        L39:
            defpackage.fctl.b(r8)
            goto L5a
        L3d:
            defpackage.fctl.b(r8)
            aqnx r8 = r6.m
            boolean r8 = r8.a()
            if (r8 == 0) goto L5d
            fcsu r8 = r6.f
            java.lang.Object r8 = r8.b()
            awjh r8 = (defpackage.awjh) r8
            awjl r7 = r7.a
            r0.c = r5
            java.lang.Object r8 = r8.i(r7, r0)
            if (r8 == r1) goto L88
        L5a:
            aubq r8 = (defpackage.aubq) r8
            goto L73
        L5d:
            fcsu r8 = r6.h
            java.lang.Object r8 = r8.b()
            awjd r8 = (defpackage.awjd) r8
            awjf r7 = r8.a(r7)
            r0.c = r4
            java.lang.Object r8 = r7.a(r0)
            if (r8 == r1) goto L88
        L71:
            aubq r8 = (defpackage.aubq) r8
        L73:
            fcyh r7 = r6.i
            akba r2 = new akba
            r4 = 0
            r2.<init>(r6, r8, r4)
            r0.c = r3
            java.lang.Object r8 = defpackage.eicj.a(r7, r2, r0)
            if (r8 != r1) goto L84
            goto L88
        L84:
            r8.getClass()
            return r8
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbc.h(awjb, fcxy):java.lang.Object");
    }
}
