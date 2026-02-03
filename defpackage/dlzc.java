package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzc implements dlym {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/audio/processor/XenoAudioProcessor");
    public final fdjx b;
    public final dlzf c;
    public final dlzd d;
    public final fdue e;
    public final fduj f;
    public final fduj g;
    public exkx h;
    public fdlr i;
    public int j;
    public int k;
    private final fdjx l;
    private final dqiz m;

    public dlzc(fdjx fdjxVar, fdjx fdjxVar2, dqiz dqizVar, dlzf dlzfVar, dlzd dlzdVar) {
        this.l = fdjxVar;
        this.b = fdjxVar2;
        this.m = dqizVar;
        this.c = dlzfVar;
        this.d = dlzdVar;
        fdue fdueVarE = fdun.e(0, 100, 0, 5);
        this.e = fdueVarE;
        this.f = dlzdVar.b;
        this.g = new fdug(fdueVarE);
    }

    private final boolean a() {
        return this.h != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r7.e(r4.a, r5, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dlym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dlyt
            if (r0 == 0) goto L13
            r0 = r7
            dlyt r0 = (defpackage.dlyt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlyt r0 = new dlyt
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L88
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            dlzc r2 = r0.d
            defpackage.fctl.b(r7)
            goto L56
        L38:
            defpackage.fctl.b(r7)
            boolean r7 = r6.a()
            if (r7 != 0) goto L8c
            dqiz r7 = r6.m
            r0.d = r6
            r0.c = r4
            exka r2 = defpackage.exkb.e()
            exkb r2 = r2.a()
            java.lang.Object r7 = r7.g(r2, r0)
            if (r7 == r1) goto L8b
            r2 = r6
        L56:
            exkx r7 = (defpackage.exkx) r7
            r2.h = r7
            exkx r7 = r6.h
            r2 = 0
            if (r7 != 0) goto L65
            java.lang.String r7 = "processor"
            defpackage.fdbq.c(r7)
            r7 = r2
        L65:
            dlyr r4 = new dlyr
            r4.<init>()
            java.util.concurrent.CopyOnWriteArraySet r7 = r7.i
            r7.clear()
            r7.add(r4)
            dqiz r7 = r6.m
            dlzd r4 = r6.d
            dlys r5 = new dlys
            r5.<init>()
            r0.d = r2
            r0.c = r3
            java.lang.String r2 = r4.a
            java.lang.Object r7 = r7.e(r2, r5, r0)
            if (r7 != r1) goto L88
            goto L8b
        L88:
            fctx r7 = defpackage.fctx.a
            return r7
        L8b:
            return r1
        L8c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This instance has already been prepared."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlzc.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.dlym
    public final Object c(fcxy fcxyVar) {
        if (a()) {
            exkx exkxVar = this.h;
            if (exkxVar == null) {
                fdbq.c("processor");
                exkxVar = null;
            }
            exkxVar.d();
            fdlr fdlrVar = this.i;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
        }
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r10.hJ(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dlym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dlyv
            if (r0 == 0) goto L13
            r0 = r10
            dlyv r0 = (defpackage.dlyv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlyv r0 = new dlyv
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r10)
            goto L8b
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            defpackage.fctl.b(r10)
            goto L72
        L37:
            defpackage.fctl.b(r10)
            boolean r10 = r9.a()
            if (r10 == 0) goto Laf
            r0.c = r4
            fdiu r10 = new fdiu
            fcxy r2 = defpackage.fcym.c(r0)
            r10.<init>(r2, r4)
            r10.B()
            exkx r2 = r9.h
            if (r2 != 0) goto L58
            java.lang.String r2 = "processor"
            defpackage.fdbq.c(r2)
            r2 = r5
        L58:
            dlzd r4 = r9.d
            com.google.research.xeno.effect.InputFrameSource r6 = com.google.research.xeno.effect.InputFrameSource.VIDEO
            android.util.Size r7 = defpackage.exkx.c
            dlza r8 = new dlza
            r8.<init>(r10)
            android.media.AudioFormat r4 = r4.c
            r2.c(r6, r7, r4, r8)
            java.lang.Object r10 = r10.m()
            if (r10 == r1) goto L70
            fctx r10 = defpackage.fctx.a
        L70:
            if (r10 == r1) goto Lae
        L72:
            fdjd r10 = new fdjd
            r10.<init>()
            fdjx r2 = r9.l
            dlyz r4 = new dlyz
            r4.<init>(r9, r10, r5)
            r6 = 3
            defpackage.fdil.d(r2, r5, r5, r4, r6)
            r0.c = r3
            java.lang.Object r10 = r10.hJ(r0)
            if (r10 != r1) goto L8b
            goto Lae
        L8b:
            ekrg r10 = defpackage.dlzc.a
            ekrw r10 = r10.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "HugoAudio"
            r10.X(r0, r1)
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r1 = "XenoAudioProcessor.kt"
            java.lang.String r2 = "com/google/android/libraries/compose/audio/processor/XenoAudioProcessor"
            java.lang.String r3 = "start"
            ekrw r10 = r10.h(r2, r3, r0, r1)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Successfully started audio processing."
            r10.q(r0)
            fctx r10 = defpackage.fctx.a
            return r10
        Lae:
            return r1
        Laf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "This instance needs to be prepared prior to starting."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlzc.d(fcxy):java.lang.Object");
    }
}
