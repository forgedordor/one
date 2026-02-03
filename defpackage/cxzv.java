package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxzv extends fcyz implements fdat {
    int a;
    final /* synthetic */ cxze b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxzv(fcxy fcxyVar, cxze cxzeVar, String str) {
        super(2, fcxyVar);
        this.b = cxzeVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxzv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:6:0x000f, B:17:0x0046, B:19:0x0053, B:20:0x0055, B:22:0x005d, B:23:0x005f, B:25:0x0067, B:26:0x0069, B:9:0x0017, B:14:0x0032, B:12:0x0022), top: B:32:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:6:0x000f, B:17:0x0046, B:19:0x0053, B:20:0x0055, B:22:0x005d, B:23:0x005f, B:25:0x0067, B:26:0x0069, B:9:0x0017, B:14:0x0032, B:12:0x0022), top: B:32:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:6:0x000f, B:17:0x0046, B:19:0x0053, B:20:0x0055, B:22:0x005d, B:23:0x005f, B:25:0x0067, B:26:0x0069, B:9:0x0017, B:14:0x0032, B:12:0x0022), top: B:32:0x0007 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "conversationId:\t"
            fcyl r1 = defpackage.fcyl.a
            int r2 = r6.a
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 == r3) goto L13
            java.lang.Object r1 = r6.d
            cxzf r1 = (defpackage.cxzf) r1
            defpackage.fctl.b(r7)     // Catch: java.lang.Exception -> La0
            goto L46
        L13:
            java.lang.Object r2 = r6.d
            cxzf r2 = (defpackage.cxzf) r2
            defpackage.fctl.b(r7)     // Catch: java.lang.Exception -> La0
            goto L32
        L1b:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.d
            fdjx r7 = (defpackage.fdjx) r7
            cxzf r2 = defpackage.cxze.a     // Catch: java.lang.Exception -> La0
            cxze r7 = r6.b     // Catch: java.lang.Exception -> La0
            fdkf r7 = r7.e     // Catch: java.lang.Exception -> La0
            r6.d = r2     // Catch: java.lang.Exception -> La0
            r6.a = r3     // Catch: java.lang.Exception -> La0
            java.lang.Object r7 = r7.c(r6)     // Catch: java.lang.Exception -> La0
            if (r7 == r1) goto L9f
        L32:
            cpmc r7 = (defpackage.cpmc) r7     // Catch: java.lang.Exception -> La0
            java.lang.String r3 = r6.c     // Catch: java.lang.Exception -> La0
            eiju r7 = r7.n(r3)     // Catch: java.lang.Exception -> La0
            r6.d = r2     // Catch: java.lang.Exception -> La0
            r2 = 2
            r6.a = r2     // Catch: java.lang.Exception -> La0
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)     // Catch: java.lang.Exception -> La0
            if (r7 != r1) goto L46
            goto L9f
        L46:
            r7.getClass()     // Catch: java.lang.Exception -> La0
            eqjv r7 = (defpackage.eqjv) r7     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = r7.c     // Catch: java.lang.Exception -> La0
            java.lang.String r2 = r7.d     // Catch: java.lang.Exception -> La0
            evvp r3 = r7.j     // Catch: java.lang.Exception -> La0
            if (r3 != 0) goto L55
            evvp r3 = defpackage.evvp.a     // Catch: java.lang.Exception -> La0
        L55:
            java.lang.String r3 = defpackage.evxc.h(r3)     // Catch: java.lang.Exception -> La0
            evvp r4 = r7.k     // Catch: java.lang.Exception -> La0
            if (r4 != 0) goto L5f
            evvp r4 = defpackage.evvp.a     // Catch: java.lang.Exception -> La0
        L5f:
            java.lang.String r4 = defpackage.evxc.h(r4)     // Catch: java.lang.Exception -> La0
            evvp r7 = r7.l     // Catch: java.lang.Exception -> La0
            if (r7 != 0) goto L69
            evvp r7 = defpackage.evvp.a     // Catch: java.lang.Exception -> La0
        L69:
            java.lang.String r7 = defpackage.evxc.h(r7)     // Catch: java.lang.Exception -> La0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La0
            r5.<init>(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r1)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "\ncorrelationId:\t"
            r5.append(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r2)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "\ncreateTime:\t"
            r5.append(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r3)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "\nupdateTime:\t"
            r5.append(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r4)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "\ndeleteTime:\t"
            r5.append(r0)     // Catch: java.lang.Exception -> La0
            r5.append(r7)     // Catch: java.lang.Exception -> La0
            java.lang.String r7 = "\n\n"
            r5.append(r7)     // Catch: java.lang.Exception -> La0
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Exception -> La0
            return r7
        L9f:
            return r1
        La0:
            r7 = move-exception
            r7.toString()
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r7 = r0.concat(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxzv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxzv cxzvVar = new cxzv(fcxyVar, this.b, this.c);
        cxzvVar.d = obj;
        return cxzvVar;
    }
}
