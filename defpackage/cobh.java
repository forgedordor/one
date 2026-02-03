package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobh extends fcyz implements fdat {
    int a;
    final /* synthetic */ cobl b;
    final /* synthetic */ cnxb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cobh(fcxy fcxyVar, cobl coblVar, cnxb cnxbVar) {
        super(2, fcxyVar);
        this.b = coblVar;
        this.c = cnxbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cobh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r12.b(r1, r11) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (defpackage.fdin.a(r1, r4, r11) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fcyl] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ekrz] */
    /* JADX WARN: Type inference failed for: r12v16, types: [ekrw] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.a
            java.lang.String r2 = "processBatches Ended"
            r3 = 198(0xc6, float:2.77E-43)
            r4 = 1
            r5 = 0
            java.lang.String r6 = "invokeSuspend"
            java.lang.String r7 = "com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer$processBatches$lambda$3$$inlined$asyncPropagatingLegacy$default$1"
            java.lang.String r8 = "BugleTelephony"
            java.lang.String r9 = "PausingForwardSyncWorkOrganizer.kt"
            if (r1 == 0) goto L22
            if (r1 != r4) goto L1e
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            goto L50
        L1a:
            r12 = move-exception
            goto L8b
        L1c:
            r12 = move-exception
            goto L6e
        L1e:
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L1a
            goto L85
        L22:
            defpackage.fctl.b(r12)
            java.lang.Object r12 = r11.d
            fdjx r12 = (defpackage.fdjx) r12
            ekrg r12 = defpackage.cobl.a     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            ekrw r12 = r12.h()     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            ekrz r1 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            r12.X(r1, r8)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            r1 = 183(0xb7, float:2.56E-43)
            ekrw r12 = r12.h(r7, r6, r1, r9)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            ekrd r12 = (defpackage.ekrd) r12     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            java.lang.String r1 = "Starting processBatches"
            r12.q(r1)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            cobl r12 = r11.b     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            coaw r12 = r12.b     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            cnxb r1 = r11.c     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            r11.a = r4     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            java.lang.Object r12 = r12.b(r1, r11)     // Catch: java.lang.Throwable -> L1a java.util.concurrent.CancellationException -> L1c
            if (r12 != r0) goto L50
            goto L84
        L50:
            ekrg r12 = defpackage.cobl.a
            ekrw r12 = r12.h()
            ekrz r0 = defpackage.eksq.a
            r12.X(r0, r8)
            ekrw r12 = r12.h(r7, r6, r3, r9)
            ekrd r12 = (defpackage.ekrd) r12
            r12.q(r2)
            cobl r12 = r11.b
            java.util.concurrent.atomic.AtomicReference r12 = r12.g
            r12.set(r5)
            fctx r12 = defpackage.fctx.a
            return r12
        L6e:
            fdmk r1 = defpackage.fdmk.a     // Catch: java.lang.Throwable -> L1a
            fcyh r1 = defpackage.eicg.a(r1)     // Catch: java.lang.Throwable -> L1a
            cobi r4 = new cobi     // Catch: java.lang.Throwable -> L1a
            cobl r10 = r11.b     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r5, r10, r12)     // Catch: java.lang.Throwable -> L1a
            r12 = 2
            r11.a = r12     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = defpackage.fdin.a(r1, r4, r11)     // Catch: java.lang.Throwable -> L1a
            if (r12 != r0) goto L85
        L84:
            return r0
        L85:
            fcta r12 = new fcta     // Catch: java.lang.Throwable -> L1a
            r12.<init>()     // Catch: java.lang.Throwable -> L1a
            throw r12     // Catch: java.lang.Throwable -> L1a
        L8b:
            ekrg r0 = defpackage.cobl.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r8)
            ekrw r0 = r0.h(r7, r6, r3, r9)
            ekrd r0 = (defpackage.ekrd) r0
            r0.q(r2)
            cobl r0 = r11.b
            java.util.concurrent.atomic.AtomicReference r0 = r0.g
            r0.set(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cobh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cobh cobhVar = new cobh(fcxyVar, this.b, this.c);
        cobhVar.d = obj;
        return cobhVar;
    }
}
