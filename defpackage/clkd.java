package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkd {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/incoming/IncomingSatelliteMessageProcessor");
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/incoming/IncomingSatelliteMessageProcessor");
    public final fcyh a;
    private final bveg d;
    private final bbdl e;
    private final bauh f;
    private final fcsu g;
    private final clpm h;
    private final clhq i;
    private final alrj j;
    private final clox k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final cogw o;
    private final bbfn p;

    public clkd(bveg bvegVar, bbdl bbdlVar, bauh bauhVar, fcsu fcsuVar, clpm clpmVar, fcyh fcyhVar, clhq clhqVar, alrj alrjVar, clox cloxVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cogw cogwVar, bbfn bbfnVar) {
        bvegVar.getClass();
        bbdlVar.getClass();
        bauhVar.getClass();
        fcsuVar.getClass();
        fcyhVar.getClass();
        alrjVar.getClass();
        cloxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        cogwVar.getClass();
        bbfnVar.getClass();
        this.d = bvegVar;
        this.e = bbdlVar;
        this.f = bauhVar;
        this.g = fcsuVar;
        this.h = clpmVar;
        this.a = fcyhVar;
        this.i = clhqVar;
        this.j = alrjVar;
        this.k = cloxVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        this.n = fcsuVar4;
        this.o = cogwVar;
        this.p = bbfnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.clng r7, defpackage.alqm r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cljz
            if (r0 == 0) goto L13
            r0 = r9
            cljz r0 = (defpackage.cljz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cljz r0 = new cljz
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L61
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            alqk r8 = r0.e
            clhq r7 = r0.d
            defpackage.fctl.b(r9)
            goto L51
        L3a:
            defpackage.fctl.b(r9)
            clhq r9 = r6.i
            r0.d = r9
            r2 = r8
            alqk r2 = (defpackage.alqk) r2
            r0.e = r2
            r0.c = r4
            java.lang.Object r7 = r6.b(r7, r0)
            if (r7 == r1) goto L6b
            r5 = r9
            r9 = r7
            r7 = r5
        L51:
            clod r9 = (defpackage.clod) r9
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r9 = r7.e(r8, r9, r0)
            if (r9 != r1) goto L61
            goto L6b
        L61:
            bojh r9 = (defpackage.bojh) r9
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r9.C()
            r7.getClass()
            return r7
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clkd.a(clng, alqm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.clng r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.clka
            if (r0 == 0) goto L13
            r0 = r6
            clka r0 = (defpackage.clka) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clka r0 = new clka
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            clng r5 = r0.d
            defpackage.fctl.b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            clox r6 = r4.k
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto La6
        L40:
            clod r6 = (defpackage.clod) r6
            int r0 = r5.c
            r1 = 2
            if (r0 != r1) goto L4c
            java.lang.Object r0 = r5.d
            clmm r0 = (defpackage.clmm) r0
            goto L4e
        L4c:
            clmm r0 = defpackage.clmm.a
        L4e:
            clnz r0 = r0.e
            if (r0 != 0) goto L54
            clnz r0 = defpackage.clnz.a
        L54:
            int r0 = r0.c
            int r0 = defpackage.clny.a(r0)
            if (r0 != 0) goto L5d
            goto La5
        L5d:
            r1 = 3
            if (r0 != r1) goto La5
            int r0 = r6.c
            cloc r0 = defpackage.cloc.b(r0)
            if (r0 != 0) goto L6a
            cloc r0 = defpackage.cloc.UNRECOGNIZED
        L6a:
            cloc r1 = defpackage.cloc.SESSION_STATUS_DEMO
            if (r0 == r1) goto La5
            io.grpc.Status r0 = io.grpc.Status.e
            clmj r5 = r5.e
            if (r5 != 0) goto L76
            clmj r5 = defpackage.clmj.a
        L76:
            java.lang.String r5 = r5.c
            int r6 = r6.c
            cloc r6 = defpackage.cloc.b(r6)
            if (r6 != 0) goto L82
            cloc r6 = defpackage.cloc.UNRECOGNIZED
        L82:
            java.lang.String r6 = r6.name()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Discarding datagram[id:"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = "] because it is an incoming emergency demo message and the session status is: "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            io.grpc.Status r5 = r0.withDescription(r5)
            io.grpc.StatusException r5 = r5.asException()
            throw r5
        La5:
            return r6
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clkd.b(clng, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.clng r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clkd.c(clng, fcxy):java.lang.Object");
    }
}
