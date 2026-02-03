package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqdy extends fcyz implements fdap {
    int a;
    final /* synthetic */ dqee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqdy(dqee dqeeVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dqeeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            r2 = 2
            if (r1 == r2) goto L11
            defpackage.fctl.b(r6)
            goto L9c
        L11:
            defpackage.fctl.b(r6)
            goto L71
        L15:
            defpackage.fctl.b(r6)
            dqee r6 = r5.b
            fduf r1 = r6.m
            java.lang.Object r3 = r1.c()
            boolean r3 = r3 instanceof defpackage.dqdm
            if (r3 != 0) goto L50
            java.lang.Object r3 = r1.c()
            boolean r3 = r3 instanceof defpackage.dqdl
            if (r3 == 0) goto L2d
            goto L50
        L2d:
            ekrg r6 = defpackage.dqee.a
            ekrw r6 = r6.j()
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r2 = "VoiceRecordingManager.kt"
            java.lang.String r3 = "com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager$startRecording$2"
            java.lang.String r4 = "invokeSuspend"
            ekrw r6 = r6.h(r3, r4, r0, r2)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.Object r0 = r1.c()
            java.lang.String r1 = "Cannot start recording while in state '%s'"
            r6.t(r1, r0)
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L50:
            r6.j()
            dpzv r3 = r6.f
            r3.a()
            dqdn r3 = new dqdn
            j$.time.Duration r4 = j$.time.Duration.ZERO
            r4.getClass()
            r3.<init>(r4)
            r1.f(r3)
            fdlr r6 = r6.l
            if (r6 == 0) goto L71
            r5.a = r2
            java.lang.Object r6 = defpackage.fdlw.a(r6, r5)
            if (r6 == r0) goto L9b
        L71:
            dqee r6 = r5.b
            dpzv r1 = r6.f
            r1.b()
            eony r1 = r6.d
            j$.time.Instant r1 = r1.a()
            r6.k = r1
            dqdv r1 = new dqdv
            r2 = 0
            r1.<init>(r6, r2)
            dqdw r3 = new dqdw
            r3.<init>(r6, r2)
            dqdx r4 = new dqdx
            r4.<init>(r6, r2)
            r2 = 3
            r5.a = r2
            dqdh r6 = r6.c
            java.lang.Object r6 = r6.b(r1, r3, r4, r5)
            if (r6 != r0) goto L9c
        L9b:
            return r0
        L9c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto Lac
            dqee r0 = r5.b
            r1 = 2132082985(0x7f150129, float:1.98061E38)
            r0.k(r1)
        Lac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqdy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqdy(this.b, (fcxy) obj).b(fctx.a);
    }
}
