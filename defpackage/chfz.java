package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chfz implements cheq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/rcs/send/SendingMessagePipeline");
    public final awlc b;
    public final asbo c;
    private final auau d;
    private final cgxw e;
    private final fdjx f;

    public chfz(auau auauVar, cgxw cgxwVar, awlc awlcVar, fdjx fdjxVar, asbo asboVar) {
        auauVar.getClass();
        cgxwVar.getClass();
        awlcVar.getClass();
        fdjxVar.getClass();
        this.d = auauVar;
        this.e = cgxwVar;
        this.b = awlcVar;
        this.f = fdjxVar;
        this.c = asboVar;
    }

    @Override // defpackage.cheq
    public final auau a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.cheq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.chfi r19, defpackage.axcm r20, defpackage.awjl r21, defpackage.awpx r22, int r23, defpackage.chfg r24, defpackage.chfo r25, defpackage.fhaz r26, defpackage.basd r27, defpackage.eyga r28, defpackage.fcxy r29) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = r29
            boolean r2 = r1 instanceof defpackage.chfw
            if (r2 == 0) goto L17
            r2 = r1
            chfw r2 = (defpackage.chfw) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            chfw r2 = new chfw
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.c
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            defpackage.fctl.b(r1)
            goto L67
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            defpackage.fctl.b(r1)
            cgxw r1 = r0.e
            cgxy r4 = defpackage.cgxy.c
            chfr r6 = new chfr
            chft r7 = new chft
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r16 = r26
            r15 = r27
            r17 = r28
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            chem r8 = new chem
            r9 = 0
            r8.<init>(r9, r9, r9)
            r6.<init>(r7, r8)
            r2.c = r5
            java.lang.Object r1 = r1.c(r4, r6, r2)
            if (r1 != r3) goto L67
            return r3
        L67:
            chfs r1 = (defpackage.chfs) r1
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chfz.b(chfi, axcm, awjl, awpx, int, chfg, chfo, fhaz, basd, eyga, fcxy):java.lang.Object");
    }

    @Override // defpackage.cheq
    public final Object c(chfi chfiVar, axcm axcmVar, awjl awjlVar, awpx awpxVar, chfg chfgVar, chfo chfoVar, fhaz fhazVar, basd basdVar, eyga eygaVar, fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        chfy chfyVar = new chfy(this, fdiuVar, chfiVar);
        this.b.e(chfyVar);
        fdiuVar.d(new chfx(this, chfyVar));
        auvw.m(this.f, null, new chfv(this, chfiVar, axcmVar, awjlVar, awpxVar, chfgVar, chfoVar, fhazVar, basdVar, eygaVar, null), 3);
        return fdiuVar.m();
    }

    public final void d(fdis fdisVar, chfi chfiVar, chfi chfiVar2, int i, chfy chfyVar) {
        if (fdbq.f(chfiVar, chfiVar2)) {
            chvf chvfVarA = chvf.j(i, 0).a();
            this.b.f(chfyVar);
            fdisVar.w(chvfVarA);
        }
    }
}
