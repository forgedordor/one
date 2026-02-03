package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsb {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/rpc/IdentityBoundRealTachyonRegistrationRpc");
    public final aubq a;
    public final fcsu b;
    public final fdjx c;
    private final eygg e;

    public bwsb(aubq aubqVar, eygg eyggVar, fcsu fcsuVar, fdjx fdjxVar) {
        eyggVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = aubqVar;
        this.e = eyggVar;
        this.b = fcsuVar;
        this.c = fdjxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cffs r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bwrz
            if (r0 == 0) goto L13
            r0 = r8
            bwrz r0 = (defpackage.bwrz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwrz r0 = new bwrz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            cffs r7 = r0.d
            defpackage.fctl.b(r8)     // Catch: defpackage.fbtf -> L29
            goto L54
        L29:
            r8 = move-exception
            goto Lae
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r8)
            eygg r8 = r6.e     // Catch: defpackage.fbtf -> L29
            java.lang.Object r8 = r8.b()     // Catch: defpackage.fbtf -> L29
            cema r8 = (defpackage.cema) r8     // Catch: defpackage.fbtf -> L29
            java.lang.String r2 = "Bugle.Etouffee.LookupRegistered"
            cepz r2 = defpackage.cepz.c(r2)     // Catch: defpackage.fbtf -> L29
            eiju r8 = r8.b(r7, r2)     // Catch: defpackage.fbtf -> L29
            r0.d = r7     // Catch: defpackage.fbtf -> L29
            r0.c = r3     // Catch: defpackage.fbtf -> L29
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)     // Catch: defpackage.fbtf -> L29
            if (r8 != r1) goto L54
            return r1
        L54:
            ezjv r8 = (defpackage.ezjv) r8     // Catch: defpackage.fbtf -> L29
            java.lang.String r0 = r7.a     // Catch: defpackage.fbtf -> L29
            r8.getClass()     // Catch: defpackage.fbtf -> L29
            evtg r8 = r8.c     // Catch: defpackage.fbtf -> L29
            r8.getClass()     // Catch: defpackage.fbtf -> L29
            r1 = 10
            int r1 = defpackage.fcva.p(r8, r1)     // Catch: defpackage.fbtf -> L29
            int r1 = defpackage.fcwa.a(r1)     // Catch: defpackage.fbtf -> L29
            r2 = 16
            int r1 = defpackage.fddu.f(r1, r2)     // Catch: defpackage.fbtf -> L29
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: defpackage.fbtf -> L29
            r2.<init>(r1)     // Catch: defpackage.fbtf -> L29
            java.util.Iterator r8 = r8.iterator()     // Catch: defpackage.fbtf -> L29
        L79:
            boolean r1 = r8.hasNext()     // Catch: defpackage.fbtf -> L29
            if (r1 == 0) goto La3
            java.lang.Object r1 = r8.next()     // Catch: defpackage.fbtf -> L29
            ezqd r1 = (defpackage.ezqd) r1     // Catch: defpackage.fbtf -> L29
            ezol r4 = r1.b     // Catch: defpackage.fbtf -> L29
            if (r4 != 0) goto L8b
            ezol r4 = defpackage.ezol.a     // Catch: defpackage.fbtf -> L29
        L8b:
            java.lang.String r4 = r4.c     // Catch: defpackage.fbtf -> L29
            evtg r1 = r1.c     // Catch: defpackage.fbtf -> L29
            r1.getClass()     // Catch: defpackage.fbtf -> L29
            ekgb r1 = defpackage.ekfv.a(r1)     // Catch: defpackage.fbtf -> L29
            fcti r5 = new fcti     // Catch: defpackage.fbtf -> L29
            r5.<init>(r4, r1)     // Catch: defpackage.fbtf -> L29
            java.lang.Object r1 = r5.a     // Catch: defpackage.fbtf -> L29
            java.lang.Object r4 = r5.b     // Catch: defpackage.fbtf -> L29
            r2.put(r1, r4)     // Catch: defpackage.fbtf -> L29
            goto L79
        La3:
            ekgp r8 = defpackage.ekfv.e(r2)     // Catch: defpackage.fbtf -> L29
            bwry r1 = new bwry     // Catch: defpackage.fbtf -> L29
            r2 = 0
            r1.<init>(r3, r0, r8, r2)     // Catch: defpackage.fbtf -> L29
            return r1
        Lae:
            ekrg r0 = defpackage.bwsb.d
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleE2eeEtouffee"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r0 = r0.g(r8)
            r1 = 74
            java.lang.String r2 = "IdentityBoundRealTachyonRegistrationRpc.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/rpc/IdentityBoundRealTachyonRegistrationRpc"
            java.lang.String r4 = "executeRpc"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Caught StatusRuntimeException, failed to retrieve registration Ids from tachyon"
            r0.q(r1)
            io.grpc.Status r8 = r8.a
            java.lang.String r7 = r7.a
            io.grpc.Status$Code r8 = r8.getCode()
            int r8 = r8.value()
            bwry r0 = new bwry
            r1 = 3
            ekgp r2 = defpackage.ekoj.a
            r0.<init>(r1, r7, r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwsb.a(cffs, fcxy):java.lang.Object");
    }
}
