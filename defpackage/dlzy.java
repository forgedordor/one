package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlzy extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmaf b;
    final /* synthetic */ fdjc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlzy(dmaf dmafVar, fdjc fdjcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmafVar;
        this.c = fdjcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlzy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r11.e(r10) == r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 1
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/libraries/compose/audio/sink/FileAudioSink$launchInputCoroutine$job$1"
            java.lang.String r5 = "HugoAudio"
            r6 = 0
            java.lang.String r7 = "FileAudioSink.kt"
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L16
            defpackage.fctl.b(r11)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            goto L79
        L16:
            defpackage.fctl.b(r11)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            goto L47
        L1a:
            r11 = move-exception
            goto L7c
        L1c:
            defpackage.fctl.b(r11)
            dmaf r11 = r10.b     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            fduj r1 = r11.h     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            dlzu r8 = new dlzu     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            fdjc r9 = r10.c     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r8.<init>(r9, r6)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            fdvl r9 = new fdvl     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r9.<init>(r1, r8)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            dlzv r1 = new dlzv     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r1.<init>(r6)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            fdrw r8 = new fdrw     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r8.<init>(r9, r1)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            dlzw r1 = new dlzw     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r1.<init>(r11)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r10.a = r2     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            java.lang.Object r11 = r8.a(r1, r10)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            if (r11 != r0) goto L47
            goto L78
        L47:
            ekrg r11 = defpackage.dmaf.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            ekrw r11 = r11.e()     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            ekrz r1 = defpackage.eksq.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r11.X(r1, r5)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r1 = 97
            ekrw r11 = r11.h(r4, r3, r1, r7)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            ekrd r11 = (defpackage.ekrd) r11     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            java.lang.String r1 = "Reached end of input flow for %s"
            dmaf r2 = r10.b     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            dmag r8 = r2.f     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            android.net.Uri r8 = r8.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r11.t(r1, r8)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            dlwv r11 = r2.i     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            if (r11 != 0) goto L6f
            java.lang.String r11 = "encoder"
            defpackage.fdbq.c(r11)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            r11 = r6
        L6f:
            r1 = 2
            r10.a = r1     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            java.lang.Object r11 = r11.e(r10)     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            if (r11 != r0) goto L79
        L78:
            return r0
        L79:
            fctx r11 = defpackage.fctx.a     // Catch: java.lang.Exception -> L1a java.util.concurrent.CancellationException -> La8
            return r11
        L7c:
            ekrg r0 = defpackage.dmaf.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r5)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r0 = r0.g(r11)
            r1 = 103(0x67, float:1.44E-43)
            ekrw r0 = r0.h(r4, r3, r1, r7)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Unexpected error when encoding input data."
            r0.q(r1)
            dmaf r0 = r10.b
            dlzx r1 = new dlzx
            r1.<init>(r0, r11, r6)
            fdjx r11 = r0.b
            r0 = 3
            defpackage.fdil.d(r11, r6, r6, r1, r0)
            goto Lc0
        La8:
            ekrg r11 = defpackage.dmaf.a
            ekrw r11 = r11.h()
            ekrz r0 = defpackage.eksq.a
            r11.X(r0, r5)
            r0 = 101(0x65, float:1.42E-43)
            ekrw r11 = r11.h(r4, r3, r0, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r0 = "Input job cancelled."
            r11.q(r0)
        Lc0:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlzy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlzy(this.b, this.c, fcxyVar);
    }
}
