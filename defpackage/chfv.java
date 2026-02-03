package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chfv extends fcyz implements fdat {
    int a;
    final /* synthetic */ chfz b;
    final /* synthetic */ chfi c;
    final /* synthetic */ axcm d;
    final /* synthetic */ awjl e;
    final /* synthetic */ awpx f;
    final /* synthetic */ chfg g;
    final /* synthetic */ chfo h;
    final /* synthetic */ fhaz i;
    final /* synthetic */ basd j;
    final /* synthetic */ eyga k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chfv(chfz chfzVar, chfi chfiVar, axcm axcmVar, awjl awjlVar, awpx awpxVar, chfg chfgVar, chfo chfoVar, fhaz fhazVar, basd basdVar, eyga eygaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chfzVar;
        this.c = chfiVar;
        this.d = axcmVar;
        this.e = awjlVar;
        this.f = awpxVar;
        this.g = chfgVar;
        this.h = chfoVar;
        this.i = fhazVar;
        this.j = basdVar;
        this.k = eygaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chfv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r2.b(r3, r4, r5, r6, 1, r8, r9, r10, r11, r12, r13) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (r15.b(r2, r14) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            fcyl r1 = defpackage.fcyl.a
            int r0 = r14.a
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 == r2) goto Lf
            defpackage.fctl.b(r15)
        Lc:
            r13 = r14
            goto L92
        Lf:
            defpackage.fctl.b(r15)     // Catch: java.lang.Exception -> L13
            goto Lc
        L13:
            r0 = move-exception
            r15 = r0
            r13 = r14
            goto L3f
        L17:
            defpackage.fctl.b(r15)
            r15 = r2
            chfz r2 = r14.b     // Catch: java.lang.Exception -> L3c
            chfi r3 = r14.c     // Catch: java.lang.Exception -> L3c
            axcm r4 = r14.d     // Catch: java.lang.Exception -> L3c
            awjl r5 = r14.e     // Catch: java.lang.Exception -> L3c
            awpx r6 = r14.f     // Catch: java.lang.Exception -> L3c
            chfg r8 = r14.g     // Catch: java.lang.Exception -> L3c
            chfo r9 = r14.h     // Catch: java.lang.Exception -> L3c
            fhaz r10 = r14.i     // Catch: java.lang.Exception -> L3c
            basd r11 = r14.j     // Catch: java.lang.Exception -> L3c
            eyga r12 = r14.k     // Catch: java.lang.Exception -> L3c
            r14.a = r15     // Catch: java.lang.Exception -> L3c
            r7 = 1
            r13 = r14
            java.lang.Object r15 = r2.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L3a
            if (r15 != r1) goto L92
            goto L91
        L3a:
            r0 = move-exception
            goto L3e
        L3c:
            r0 = move-exception
            r13 = r14
        L3e:
            r15 = r0
        L3f:
            ekrg r0 = defpackage.chfz.a
            ekrw r0 = r0.i()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r3 = "BugleSending"
            r0.X(r2, r3)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r0 = r0.g(r15)
            r2 = 161(0xa1, float:2.26E-43)
            java.lang.String r3 = "SendingMessagePipeline.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/pipeline/rcs/send/SendingMessagePipeline$launchSendMessage$1"
            java.lang.String r5 = "invokeSuspend"
            ekrw r0 = r0.h(r4, r5, r2, r3)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r2 = "Failed to send message with exception."
            r0.q(r2)
            chfz r0 = r13.b
            asbo r2 = r0.c
            asba r2 = (defpackage.asba) r2
            fcsu r2 = r2.a
            java.lang.Object r2 = r2.b()
            eoth r2 = (defpackage.eoth) r2
            java.lang.String r3 = "bugle.crash_send_pipeline_on_unexpected_exception"
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L7e
            defpackage.auvh.d(r15)
        L7e:
            awlc r15 = r0.b
            chfi r0 = r13.c
            chfu r2 = new chfu
            r3 = 0
            r2.<init>(r0, r3)
            r0 = 2
            r13.a = r0
            java.lang.Object r15 = r15.b(r2, r14)
            if (r15 != r1) goto L92
        L91:
            return r1
        L92:
            fctx r15 = defpackage.fctx.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chfv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chfv(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, fcxyVar);
    }
}
