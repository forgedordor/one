package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkf extends fcyz implements fdat {
    int a;
    final /* synthetic */ clkk b;
    final /* synthetic */ clng c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clkf(fcxy fcxyVar, clkk clkkVar, clng clngVar) {
        super(2, fcxyVar);
        this.b = clkkVar;
        this.c = clngVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clkf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:5:0x000d, B:15:0x0036, B:22:0x0046, B:24:0x006d, B:25:0x006f), top: B:33:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [fcyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            java.lang.String r2 = "DatagramNotificationServiceImpl.kt"
            r3 = 0
            if (r1 == 0) goto L16
            java.lang.Object r0 = r8.d
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L14
            goto L36
        L11:
            r9 = move-exception
            goto L8b
        L14:
            r9 = move-exception
            goto L46
        L16:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.d
            fdjx r9 = (defpackage.fdjx) r9
            java.lang.String r9 = "DatagramNotificationService.onReceiveDatagram"
            eieu r9 = defpackage.eiiy.h(r9)
            clkk r1 = r8.b     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
            clhb r1 = r1.b     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
            clng r4 = r8.c     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
            r8.d = r9     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
            r5 = 1
            r8.a = r5     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
            java.lang.Object r1 = r1.a(r4, r8)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L42
            if (r1 == r0) goto L3c
            r0 = r9
            r9 = r1
        L36:
            clni r9 = (defpackage.clni) r9     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L14
            defpackage.fczl.a(r0, r3)
            goto L85
        L3c:
            return r0
        L3d:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L8b
        L42:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L46:
            ekrg r1 = defpackage.clkk.a     // Catch: java.lang.Throwable -> L11
            ekrw r1 = r1.i()     // Catch: java.lang.Throwable -> L11
            ekrz r4 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "BugleSatellite"
            r1.X(r4, r5)     // Catch: java.lang.Throwable -> L11
            ekrd r1 = (defpackage.ekrd) r1     // Catch: java.lang.Throwable -> L11
            ekrw r1 = r1.g(r9)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "com/google/android/apps/messaging/shared/satelliteapi/incoming/datagramnotificationservice/DatagramNotificationServiceImpl$callOnReceiveSatelliteMessage-gIAlu-s$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "invokeSuspend"
            r6 = 85
            ekrw r1 = r1.h(r4, r5, r6, r2)     // Catch: java.lang.Throwable -> L11
            ekrd r1 = (defpackage.ekrd) r1     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "Call IncomingSatelliteApi.onReceiveSatelliteMessage failed for datagram[id:%s]"
            clng r4 = r8.c     // Catch: java.lang.Throwable -> L11
            clmj r4 = r4.e     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto L6f
            clmj r4 = defpackage.clmj.a     // Catch: java.lang.Throwable -> L11
        L6f:
            java.lang.String r4 = r4.c     // Catch: java.lang.Throwable -> L11
            r1.t(r2, r4)     // Catch: java.lang.Throwable -> L11
            io.grpc.Status r1 = io.grpc.Status.o     // Catch: java.lang.Throwable -> L11
            io.grpc.Status r9 = r1.d(r9)     // Catch: java.lang.Throwable -> L11
            io.grpc.StatusException r9 = r9.asException()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r9 = defpackage.fctl.a(r9)     // Catch: java.lang.Throwable -> L11
            defpackage.fczl.a(r0, r3)
        L85:
            fctk r0 = new fctk
            r0.<init>(r9)
            return r0
        L8b:
            throw r9     // Catch: java.lang.Throwable -> L8c
        L8c:
            r1 = move-exception
            defpackage.fczl.a(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clkf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clkf clkfVar = new clkf(fcxyVar, this.b, this.c);
        clkfVar.d = obj;
        return clkfVar;
    }
}
