package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgzb extends fcyz implements fdap {
    int a;
    final /* synthetic */ cgzi b;
    final /* synthetic */ cgzx c;
    final /* synthetic */ cgxy d;
    final /* synthetic */ byte[] e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgzb(cgzi cgziVar, cgzx cgzxVar, cgxy cgxyVar, byte[] bArr, String str, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cgziVar;
        this.c = cgzxVar;
        this.d = cgxyVar;
        this.e = bArr;
        this.f = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        if (defpackage.eicj.a(r0.g, r3, r15) == r10) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r16) throws java.lang.Throwable {
        /*
            r15 = this;
            fcyl r10 = defpackage.fcyl.a
            int r0 = r15.a
            java.lang.String r11 = "invokeSuspend"
            java.lang.String r12 = "com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager$queue$4"
            java.lang.String r13 = "BuglePipeline"
            r1 = 1
            java.lang.String r14 = "PwqBackedPipelineManager.kt"
            defpackage.fctl.b(r16)
            if (r0 == 0) goto L15
            if (r0 == r1) goto L56
            goto L6e
        L15:
            ekrg r0 = defpackage.cgzi.a
            ekrw r0 = r0.h()
            ekrz r2 = defpackage.eksq.a
            r0.X(r2, r13)
            r2 = 243(0xf3, float:3.4E-43)
            ekrw r0 = r0.h(r12, r11, r2, r14)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r2 = "Queuing new pipeline work item"
            r0.q(r2)
            cgzi r0 = r15.b
            cgzx r2 = r15.c
            r3 = r2
            cgxy r2 = r15.d
            r4 = r3
            byte[] r3 = r15.e
            r5 = r4
            java.lang.String r4 = r15.f
            r15.a = r1
            r1 = r5
            cgzv r5 = defpackage.cgzv.a
            chaw r0 = r0.d
            fcsu r6 = r0.b
            java.lang.Object r6 = r6.b()
            cogw r6 = (defpackage.cogw) r6
            j$.time.Instant r6 = r6.f()
            r7 = 0
            r9 = r15
            java.lang.Object r0 = r0.b(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 == r10) goto L92
        L56:
            cgzi r0 = r15.b
            java.lang.String r1 = r15.f
            cgzx r2 = r15.c
            cgza r3 = new cgza
            r4 = 0
            r3.<init>(r0, r1, r2, r4)
            r1 = 2
            r15.a = r1
            fcyh r0 = r0.g
            java.lang.Object r0 = defpackage.eicj.a(r0, r3, r15)
            if (r0 != r10) goto L6e
            goto L92
        L6e:
            cgzi r0 = r15.b
            cgxy r1 = r15.d
            cgxu r0 = r0.e
            r0.a(r1)
            ekrg r0 = defpackage.cgzi.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r13)
            r1 = 255(0xff, float:3.57E-43)
            ekrw r0 = r0.h(r12, r11, r1, r14)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Successfully queued pipeline work item"
            r0.q(r1)
            fctx r0 = defpackage.fctx.a
            return r0
        L92:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cgzb(this.b, this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}
