package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbph {
    static final /* synthetic */ fdeh[] a;
    public static final /* synthetic */ int d = 0;
    public final cbor b;
    public final dqsn c;
    private final feav e;

    static {
        fdbt fdbtVar = new fdbt(cbph.class);
        int i = fdcj.a;
        a = new fdeh[]{fdbtVar};
    }

    public cbph(cbor cborVar, dqsn dqsnVar) {
        cborVar.getClass();
        dqsnVar.getClass();
        this.b = cborVar;
        this.c = dqsnVar;
        this.e = new feaz();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        if (r0 == defpackage.cbov.STOPPING) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        if (r0 == defpackage.cbov.RUNNING) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        if (r0 != defpackage.cbov.RESTARTING) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        if (r0 == defpackage.cbov.NONE) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0055, code lost:
    
        if (r0 != defpackage.cbov.RESTARTING) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0057, code lost:
    
        r3 = defpackage.cbov.b(r3.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005f, code lost:
    
        if (r3 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0061, code lost:
    
        r3 = defpackage.cbov.UNRECOGNIZED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0063, code lost:
    
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0069, code lost:
    
        throw new defpackage.cbpc(r3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cbow e(defpackage.cbow r3, defpackage.cbov r4) {
        /*
            int r0 = r3.b
            cbov r1 = defpackage.cbov.b(r0)
            if (r1 != 0) goto La
            cbov r1 = defpackage.cbov.UNRECOGNIZED
        La:
            if (r1 == r4) goto L8c
            cbov r0 = defpackage.cbov.b(r0)
            if (r0 != 0) goto L14
            cbov r0 = defpackage.cbov.UNRECOGNIZED
        L14:
            r0.getClass()
            int r1 = r4.ordinal()
            if (r1 == 0) goto L4b
            r2 = 1
            if (r1 == r2) goto L46
            r2 = 2
            if (r1 == r2) goto L3d
            r2 = 3
            if (r1 == r2) goto L38
            r2 = 4
            if (r1 == r2) goto L33
            r0 = 5
            if (r1 != r0) goto L2d
            goto L6a
        L2d:
            fctg r3 = new fctg
            r3.<init>()
            throw r3
        L33:
            cbov r1 = defpackage.cbov.STOPPING
            if (r0 != r1) goto L57
            goto L6a
        L38:
            cbov r1 = defpackage.cbov.RUNNING
            if (r0 != r1) goto L57
            goto L6a
        L3d:
            cbov r1 = defpackage.cbov.STARTING
            if (r0 == r1) goto L6a
            cbov r1 = defpackage.cbov.RESTARTING
            if (r0 != r1) goto L57
            goto L6a
        L46:
            cbov r1 = defpackage.cbov.NONE
            if (r0 != r1) goto L57
            goto L6a
        L4b:
            cbov r1 = defpackage.cbov.STOPPING
            if (r0 == r1) goto L6a
            cbov r1 = defpackage.cbov.STARTING
            if (r0 == r1) goto L6a
            cbov r1 = defpackage.cbov.RESTARTING
            if (r0 == r1) goto L6a
        L57:
            cbpc r0 = new cbpc
            int r3 = r3.b
            cbov r3 = defpackage.cbov.b(r3)
            if (r3 != 0) goto L63
            cbov r3 = defpackage.cbov.UNRECOGNIZED
        L63:
            r3.getClass()
            r0.<init>(r3, r4)
            throw r0
        L6a:
            evsf r3 = r3.toBuilder()
            cbos r3 = (defpackage.cbos) r3
            r3.getClass()
            r4.getClass()
            r3.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r3.instance
            cbow r0 = (defpackage.cbow) r0
            int r4 = r4.a()
            r0.b = r4
            evsn r3 = r3.build()
            r3.getClass()
            cbow r3 = (defpackage.cbow) r3
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbph.e(cbow, cbov):cbow");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cbpd
            if (r0 == 0) goto L13
            r0 = r5
            cbpd r0 = (defpackage.cbpd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbpd r0 = new cbpd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            cbor r5 = r4.b
            cmfo r5 = r5.a()
            eiju r5 = r5.h()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L54
        L44:
            cbow r5 = (defpackage.cbow) r5
            int r5 = r5.b
            cbov r5 = defpackage.cbov.b(r5)
            if (r5 != 0) goto L50
            cbov r5 = defpackage.cbov.UNRECOGNIZED
        L50:
            r5.getClass()
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbph.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final defpackage.cbov r7, final defpackage.cbov r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cbpe
            if (r0 == 0) goto L13
            r0 = r9
            cbpe r0 = (defpackage.cbpe) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cbpe r0 = new cbpe
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            feav r7 = (defpackage.feav) r7
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L79
        L2e:
            r8 = move-exception
            goto L85
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            feaz r7 = r0.f
            cbov r8 = r0.e
            java.lang.Object r2 = r0.a
            cbov r2 = (defpackage.cbov) r2
            defpackage.fctl.b(r9)
            r9 = r7
            r7 = r2
            goto L5c
        L46:
            defpackage.fctl.b(r9)
            feav r9 = r6.e
            r0.a = r7
            r0.e = r8
            r2 = r9
            feaz r2 = (defpackage.feaz) r2
            r0.f = r2
            r0.d = r4
            java.lang.Object r2 = r9.b(r0)
            if (r2 == r1) goto L89
        L5c:
            cbor r2 = r6.b     // Catch: java.lang.Throwable -> L82
            cmfo r2 = r2.a()     // Catch: java.lang.Throwable -> L82
            cbox r4 = new cbox     // Catch: java.lang.Throwable -> L82
            r4.<init>()     // Catch: java.lang.Throwable -> L82
            r0.a = r9     // Catch: java.lang.Throwable -> L82
            r7 = 0
            r0.e = r7     // Catch: java.lang.Throwable -> L82
            r0.f = r7     // Catch: java.lang.Throwable -> L82
            r0.d = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r7 = r6.d(r2, r4, r0)     // Catch: java.lang.Throwable -> L82
            if (r7 == r1) goto L89
            r5 = r9
            r9 = r7
            r7 = r5
        L79:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            r7.d()
            return r9
        L82:
            r7 = move-exception
            r8 = r7
            r7 = r9
        L85:
            r7.d()
            throw r8
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbph.b(cbov, cbov, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final defpackage.cbov r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cbpf
            if (r0 == 0) goto L13
            r0 = r8
            cbpf r0 = (defpackage.cbpf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cbpf r0 = new cbpf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            feav r7 = (defpackage.feav) r7
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L73
        L2e:
            r8 = move-exception
            goto L80
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            feaz r7 = r0.e
            java.lang.Object r2 = r0.a
            cbov r2 = (defpackage.cbov) r2
            defpackage.fctl.b(r8)
            r8 = r7
            r7 = r2
            goto L58
        L44:
            defpackage.fctl.b(r8)
            feav r8 = r6.e
            r0.a = r7
            r2 = r8
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 == r1) goto L84
        L58:
            cbor r2 = r6.b     // Catch: java.lang.Throwable -> L7c
            cmfo r2 = r2.a()     // Catch: java.lang.Throwable -> L7c
            cbpb r4 = new cbpb     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            r0.a = r8     // Catch: java.lang.Throwable -> L7c
            r7 = 0
            r0.e = r7     // Catch: java.lang.Throwable -> L7c
            r0.d = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r7 = r6.d(r2, r4, r0)     // Catch: java.lang.Throwable -> L7c
            if (r7 == r1) goto L84
            r5 = r8
            r8 = r7
            r7 = r5
        L73:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2e
            r8.booleanValue()     // Catch: java.lang.Throwable -> L2e
            r7.d()
            return r8
        L7c:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L80:
            r7.d()
            throw r8
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbph.c(cbov, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cmfo r5, final defpackage.fdap r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cbpg
            if (r0 == 0) goto L13
            r0 = r7
            cbpg r0 = (defpackage.cbpg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbpg r0 = new cbpg
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fdcx r5 = r0.d
            defpackage.fctl.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            fdcx r7 = new fdcx
            r7.<init>()
            cboy r2 = new cboy
            r2.<init>()
            r0.d = r7
            r0.c = r3
            java.lang.Object r5 = r5.d(r2, r0)
            if (r5 == r1) goto L58
            r5 = r7
        L49:
            fdeh[] r6 = defpackage.cbph.a
            r7 = 0
            r6 = r6[r7]
            java.lang.Object r5 = r5.c(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            return r5
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbph.d(cmfo, fdap, fcxy):java.lang.Object");
    }
}
