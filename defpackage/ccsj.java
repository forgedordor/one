package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccsj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccsm b;
    final /* synthetic */ basd c;
    final /* synthetic */ aubq d;
    final /* synthetic */ String e;
    final /* synthetic */ asrg f;
    final /* synthetic */ Instant g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccsj(ccsm ccsmVar, basd basdVar, aubq aubqVar, String str, asrg asrgVar, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ccsmVar;
        this.c = basdVar;
        this.d = aubqVar;
        this.e = str;
        this.f = asrgVar;
        this.g = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccsj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r0 == r6) goto L22;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r5 = r16
            fcyl r6 = defpackage.fcyl.a
            int r0 = r5.a
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 == r1) goto L15
            defpackage.fctl.b(r17)     // Catch: defpackage.fbtf -> L12
            r0 = r17
            goto L86
        L12:
            r0 = move-exception
            goto L94
        L15:
            defpackage.fctl.b(r17)     // Catch: defpackage.ccsn -> L1b
            r0 = r17
            goto L3a
        L1b:
            r0 = move-exception
            goto La2
        L1e:
            defpackage.fctl.b(r17)
            ccsm r0 = r5.b     // Catch: defpackage.ccsn -> L1b
            ccso r0 = r0.c     // Catch: defpackage.ccsn -> L1b
            basd r2 = r5.c     // Catch: defpackage.ccsn -> L1b
            r3 = r2
            aubq r2 = r5.d     // Catch: defpackage.ccsn -> L1b
            r4 = r3
            java.lang.String r3 = r5.e     // Catch: defpackage.ccsn -> L1b
            r7 = r4
            auhk r4 = defpackage.auhk.DELIVERY     // Catch: defpackage.ccsn -> L1b
            r5.a = r1     // Catch: defpackage.ccsn -> L1b
            r1 = r7
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5)     // Catch: defpackage.ccsn -> L1b
            if (r0 != r6) goto L3a
            goto L85
        L3a:
            r15 = r0
            eyga r15 = (defpackage.eyga) r15     // Catch: defpackage.ccsn -> L1b
            ccsm r0 = r5.b     // Catch: defpackage.fbtf -> L12
            cmnp r7 = r0.a     // Catch: defpackage.fbtf -> L12
            basd r8 = r5.c     // Catch: defpackage.fbtf -> L12
            asrg r9 = r5.f     // Catch: defpackage.fbtf -> L12
            auhk r10 = defpackage.auhk.DELIVERY     // Catch: defpackage.fbtf -> L12
            j$.time.Instant r11 = r5.g     // Catch: defpackage.fbtf -> L12
            cmst r12 = r0.b     // Catch: defpackage.fbtf -> L12
            aufx r0 = defpackage.aufx.a     // Catch: defpackage.fbtf -> L12
            evsf r0 = r0.createBuilder()     // Catch: defpackage.fbtf -> L12
            aufs r0 = (defpackage.aufs) r0     // Catch: defpackage.fbtf -> L12
            r0.getClass()     // Catch: defpackage.fbtf -> L12
            aufw r1 = defpackage.aufw.CONTROL     // Catch: defpackage.fbtf -> L12
            defpackage.aufy.c(r1, r0)     // Catch: defpackage.fbtf -> L12
            aufu r1 = defpackage.aufu.HIGH     // Catch: defpackage.fbtf -> L12
            defpackage.aufy.b(r1, r0)     // Catch: defpackage.fbtf -> L12
            defpackage.aufy.d(r0)     // Catch: defpackage.fbtf -> L12
            aufx r13 = defpackage.aufy.a(r0)     // Catch: defpackage.fbtf -> L12
            aubq r14 = r5.d     // Catch: defpackage.fbtf -> L12
            java.lang.String r0 = "ChatApiSender::sendMessageReceiptForUnsavedMessage"
            eieu r1 = defpackage.eiiy.k(r0)     // Catch: defpackage.fbtf -> L12
            eiju r0 = r7.i(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L89
            r1.b(r0)     // Catch: java.lang.Throwable -> L89
            r1.close()     // Catch: defpackage.fbtf -> L12
            r0.getClass()     // Catch: defpackage.fbtf -> L12
            r1 = 2
            r5.a = r1     // Catch: defpackage.fbtf -> L12
            java.lang.Object r0 = defpackage.fdxs.c(r0, r5)     // Catch: defpackage.fbtf -> L12
            if (r0 != r6) goto L86
        L85:
            return r6
        L86:
            chwo r0 = (defpackage.chwo) r0     // Catch: defpackage.fbtf -> L12
            goto L9e
        L89:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: defpackage.fbtf -> L12
        L93:
            throw r2     // Catch: defpackage.fbtf -> L12
        L94:
            basd r1 = r5.c
            auhk r2 = defpackage.auhk.DELIVERY
            java.lang.String r3 = "Failed to send message receipt due to a StatusRuntimeException"
            chwo r0 = defpackage.ccsm.c(r1, r2, r3, r0)
        L9e:
            r0.getClass()
            return r0
        La2:
            basd r1 = r5.c
            auhk r2 = defpackage.auhk.DELIVERY
            java.lang.String r3 = "Failed to send message receipt due to missing signature"
            chwo r0 = defpackage.ccsm.c(r1, r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccsj(this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
