package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxzs extends fcyz implements fdat {
    int a;
    final /* synthetic */ cxze b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxzs(fcxy fcxyVar, cxze cxzeVar) {
        super(2, fcxyVar);
        this.b = cxzeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxzs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:17:0x0045, B:19:0x0052, B:20:0x0054, B:22:0x005c, B:23:0x005e, B:25:0x0066, B:26:0x0068, B:28:0x0072, B:29:0x0074, B:31:0x0078, B:32:0x007a, B:9:0x0017, B:14:0x0032, B:12:0x0022), top: B:38:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:17:0x0045, B:19:0x0052, B:20:0x0054, B:22:0x005c, B:23:0x005e, B:25:0x0066, B:26:0x0068, B:28:0x0072, B:29:0x0074, B:31:0x0078, B:32:0x007a, B:9:0x0017, B:14:0x0032, B:12:0x0022), top: B:38:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:17:0x0045, B:19:0x0052, B:20:0x0054, B:22:0x005c, B:23:0x005e, B:25:0x0066, B:26:0x0068, B:28:0x0072, B:29:0x0074, B:31:0x0078, B:32:0x007a, B:9:0x0017, B:14:0x0032, B:12:0x0022), top: B:38:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:17:0x0045, B:19:0x0052, B:20:0x0054, B:22:0x005c, B:23:0x005e, B:25:0x0066, B:26:0x0068, B:28:0x0072, B:29:0x0074, B:31:0x0078, B:32:0x007a, B:9:0x0017, B:14:0x0032, B:12:0x0022), top: B:38:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:6:0x000f, B:17:0x0045, B:19:0x0052, B:20:0x0054, B:22:0x005c, B:23:0x005e, B:25:0x0066, B:26:0x0068, B:28:0x0072, B:29:0x0074, B:31:0x0078, B:32:0x007a, B:9:0x0017, B:14:0x0032, B:12:0x0022), top: B:38:0x0007 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r0 = "fileId:\t"
            fcyl r1 = defpackage.fcyl.a
            int r2 = r11.a
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 == r3) goto L13
            java.lang.Object r1 = r11.c
            cxzf r1 = (defpackage.cxzf) r1
            defpackage.fctl.b(r12)     // Catch: java.lang.Exception -> Ld3
            goto L45
        L13:
            java.lang.Object r2 = r11.c
            cxzf r2 = (defpackage.cxzf) r2
            defpackage.fctl.b(r12)     // Catch: java.lang.Exception -> Ld3
            goto L32
        L1b:
            defpackage.fctl.b(r12)
            java.lang.Object r12 = r11.c
            fdjx r12 = (defpackage.fdjx) r12
            cxzf r2 = defpackage.cxze.a     // Catch: java.lang.Exception -> Ld3
            cxze r12 = r11.b     // Catch: java.lang.Exception -> Ld3
            fdkf r12 = r12.e     // Catch: java.lang.Exception -> Ld3
            r11.c = r2     // Catch: java.lang.Exception -> Ld3
            r11.a = r3     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r12 = r12.c(r11)     // Catch: java.lang.Exception -> Ld3
            if (r12 == r1) goto Ld2
        L32:
            cpmc r12 = (defpackage.cpmc) r12     // Catch: java.lang.Exception -> Ld3
            eiju r12 = r12.j()     // Catch: java.lang.Exception -> Ld3
            r11.c = r2     // Catch: java.lang.Exception -> Ld3
            r2 = 2
            r11.a = r2     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r12 = defpackage.fdxs.c(r12, r11)     // Catch: java.lang.Exception -> Ld3
            if (r12 != r1) goto L45
            goto Ld2
        L45:
            r12.getClass()     // Catch: java.lang.Exception -> Ld3
            eqko r12 = (defpackage.eqko) r12     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = r12.b     // Catch: java.lang.Exception -> Ld3
            java.lang.String r2 = r12.c     // Catch: java.lang.Exception -> Ld3
            evvp r3 = r12.d     // Catch: java.lang.Exception -> Ld3
            if (r3 != 0) goto L54
            evvp r3 = defpackage.evvp.a     // Catch: java.lang.Exception -> Ld3
        L54:
            java.lang.String r3 = defpackage.evxc.h(r3)     // Catch: java.lang.Exception -> Ld3
            evvp r4 = r12.e     // Catch: java.lang.Exception -> Ld3
            if (r4 != 0) goto L5e
            evvp r4 = defpackage.evvp.a     // Catch: java.lang.Exception -> Ld3
        L5e:
            java.lang.String r4 = defpackage.evxc.h(r4)     // Catch: java.lang.Exception -> Ld3
            evvp r5 = r12.f     // Catch: java.lang.Exception -> Ld3
            if (r5 != 0) goto L68
            evvp r5 = defpackage.evvp.a     // Catch: java.lang.Exception -> Ld3
        L68:
            java.lang.String r5 = defpackage.evxc.h(r5)     // Catch: java.lang.Exception -> Ld3
            long r6 = r12.g     // Catch: java.lang.Exception -> Ld3
            ewue r8 = r12.h     // Catch: java.lang.Exception -> Ld3
            if (r8 != 0) goto L74
            ewue r8 = defpackage.ewue.a     // Catch: java.lang.Exception -> Ld3
        L74:
            ewtq r8 = r8.b     // Catch: java.lang.Exception -> Ld3
            if (r8 != 0) goto L7a
            ewtq r8 = defpackage.ewtq.a     // Catch: java.lang.Exception -> Ld3
        L7a:
            java.lang.String r8 = r8.b     // Catch: java.lang.Exception -> Ld3
            java.lang.String r9 = r12.i     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = r12.j     // Catch: java.lang.Exception -> Ld3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld3
            r10.<init>(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r1)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nname:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r2)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\ncreateTime:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r3)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nupdateTime:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r4)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\ndeleteTime:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r5)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nsizeBytes:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r6)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nblob_id:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r8)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nobjectId:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r9)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r0 = "\nconversationId:\t"
            r10.append(r0)     // Catch: java.lang.Exception -> Ld3
            r10.append(r12)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = "\n\n"
            r10.append(r12)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = r10.toString()     // Catch: java.lang.Exception -> Ld3
            return r12
        Ld2:
            return r1
        Ld3:
            r12 = move-exception
            r12.toString()
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "Failed. "
            java.lang.String r12 = r0.concat(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxzs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxzs cxzsVar = new cxzs(fcxyVar, this.b);
        cxzsVar.c = obj;
        return cxzsVar;
    }
}
