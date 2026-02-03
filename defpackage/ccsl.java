package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccsl extends fcyz implements fdat {
    int a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ ccsm c;
    final /* synthetic */ auhk d;
    final /* synthetic */ asrg e;
    final /* synthetic */ aufx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccsl(MessageCoreData messageCoreData, ccsm ccsmVar, auhk auhkVar, asrg asrgVar, aufx aufxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = messageCoreData;
        this.c = ccsmVar;
        this.d = auhkVar;
        this.e = asrgVar;
        this.f = aufxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccsl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(6:46|5|6|27|32|33)(3:40|9|10))(2:13|(2:15|16)(8:17|48|18|19|42|20|(1:22)|26))|23|44|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r11 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r11 = r0;
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
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L14
            defpackage.fctl.b(r11)     // Catch: defpackage.fbtf -> Lf
            r9 = r10
            goto L86
        Lf:
            r0 = move-exception
            r11 = r0
            r9 = r10
            goto L8b
        L14:
            defpackage.fctl.b(r11)     // Catch: defpackage.ccsn -> L19
            r9 = r10
            goto L60
        L19:
            r0 = move-exception
            r11 = r0
            r9 = r10
            goto La6
        L1e:
            defpackage.fctl.b(r11)
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r11 = r10.b
            basd r4 = r11.F()
            j$.util.Optional r1 = r11.ag()
            r1.getClass()
            java.lang.Object r1 = defpackage.fdct.b(r1)
            r5 = r1
            aubq r5 = (defpackage.aubq) r5
            if (r5 != 0) goto L44
            r4.getClass()
            auhk r11 = r10.d
            r0 = 0
            java.lang.String r1 = "Failed to send message receipt due to missing self identity"
            chwo r11 = defpackage.ccsm.d(r4, r11, r0, r1)
            return r11
        L44:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6 = r11.A()
            ccsm r11 = r10.c     // Catch: defpackage.ccsn -> La3
            ccso r3 = r11.c     // Catch: defpackage.ccsn -> La3
            r4.getClass()     // Catch: defpackage.ccsn -> La3
            r6.getClass()     // Catch: defpackage.ccsn -> La3
            asrg r7 = r10.e     // Catch: defpackage.ccsn -> La3
            auhk r8 = r10.d     // Catch: defpackage.ccsn -> La3
            r10.a = r2     // Catch: defpackage.ccsn -> La3
            r9 = r10
            java.lang.Object r11 = r3.b(r4, r5, r6, r7, r8, r9)     // Catch: defpackage.ccsn -> La0
            if (r11 != r0) goto L60
            goto L85
        L60:
            eyga r11 = (defpackage.eyga) r11     // Catch: defpackage.ccsn -> La0
            ccsm r1 = r9.c     // Catch: defpackage.fbtf -> L89
            cmnp r2 = r1.a     // Catch: defpackage.fbtf -> L89
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3 = r9.b     // Catch: defpackage.fbtf -> L89
            asrg r4 = r9.e     // Catch: defpackage.fbtf -> L89
            auhk r5 = r9.d     // Catch: defpackage.fbtf -> L89
            cmst r6 = r1.b     // Catch: defpackage.fbtf -> L89
            ccsk r7 = new ccsk     // Catch: defpackage.fbtf -> L89
            r7.<init>()     // Catch: defpackage.fbtf -> L89
            aufx r8 = r9.f     // Catch: defpackage.fbtf -> L89
            eiju r11 = r2.h(r3, r4, r5, r6, r7, r8)     // Catch: defpackage.fbtf -> L89
            r11.getClass()     // Catch: defpackage.fbtf -> L89
            r1 = 2
            r9.a = r1     // Catch: defpackage.fbtf -> L89
            java.lang.Object r11 = defpackage.fdxs.c(r11, r10)     // Catch: defpackage.fbtf -> L89
            if (r11 != r0) goto L86
        L85:
            return r0
        L86:
            chwo r11 = (defpackage.chwo) r11     // Catch: defpackage.fbtf -> L89
            goto L9c
        L89:
            r0 = move-exception
            r11 = r0
        L8b:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r0 = r9.b
            basd r0 = r0.F()
            r0.getClass()
            auhk r1 = r9.d
            java.lang.String r2 = "Failed to send message receipt due to a StatusRuntimeException"
            chwo r11 = defpackage.ccsm.c(r0, r1, r2, r11)
        L9c:
            r11.getClass()
            return r11
        La0:
            r0 = move-exception
        La1:
            r11 = r0
            goto La6
        La3:
            r0 = move-exception
            r9 = r10
            goto La1
        La6:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r0 = r9.b
            basd r0 = r0.F()
            r0.getClass()
            auhk r1 = r9.d
            java.lang.String r2 = "Failed to send message receipt due to missing signature"
            chwo r11 = defpackage.ccsm.c(r0, r1, r2, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccsl(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
