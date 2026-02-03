package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coos extends fcyz implements fdau {
    int a;
    final /* synthetic */ fcsu b;
    final /* synthetic */ fcsu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coos(fcsu fcsuVar, fcsu fcsuVar2, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        coos coosVar = new coos(this.b, this.c, (fcxy) obj3);
        coosVar.d = (coow) obj;
        return coosVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r7 != r0) goto L28;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L98
            goto L74
        Ld:
            java.lang.Object r7 = r6.d
            coow r7 = (defpackage.coow) r7
            java.lang.String r1 = r7.b
            r1.getClass()
            int r1 = r1.length()
            if (r1 <= 0) goto Lb0
            java.lang.String r1 = r7.c
            r1.getClass()
            int r1 = r1.length()
            if (r1 <= 0) goto La8
            int r1 = r7.e
            int r1 = defpackage.coov.b(r1)
            r3 = 2
            if (r1 != 0) goto L31
            goto L33
        L31:
            if (r1 == r3) goto La0
        L33:
            java.lang.String r1 = r7.b
            basd r1 = defpackage.basd.a(r1)
            fcsu r4 = r6.b
            java.lang.Object r4 = r4.b()
            baxe r4 = (defpackage.baxe) r4
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r1 = r4.x(r1)
            java.lang.String r4 = r7.c
            android.net.Uri r4 = android.net.Uri.parse(r4)
            int r5 = r7.e
            int r5 = defpackage.coov.b(r5)
            if (r5 != 0) goto L54
            r5 = r2
        L54:
            int r5 = r5 + (-2)
            if (r5 == r2) goto L7f
            if (r5 != r3) goto L77
            fcsu r2 = r6.c
            java.lang.Object r2 = r2.b()
            chvp r2 = (defpackage.chvp) r2
            java.lang.String r7 = r7.d
            eiju r7 = r2.j(r1, r4, r7)
            r7.getClass()
            r6.a = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 != r0) goto L74
            goto L9f
        L74:
            java.lang.Void r7 = (java.lang.Void) r7
            goto L9a
        L77:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "FileTransferContentType is invalid."
            r7.<init>(r0)
            throw r7
        L7f:
            fcsu r3 = r6.c
            java.lang.Object r3 = r3.b()
            chvp r3 = (defpackage.chvp) r3
            java.lang.String r7 = r7.d
            eiju r7 = r3.i(r1, r4, r7)
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 == r0) goto L9f
        L98:
            java.lang.Void r7 = (java.lang.Void) r7
        L9a:
            cbcw r7 = defpackage.cbcw.i()
            return r7
        L9f:
            return r0
        La0:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "FileTransferContentType is unspecified in work handler."
            r7.<init>(r0)
            throw r7
        La8:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ContentUri is empty in work handler."
            r7.<init>(r0)
            throw r7
        Lb0:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "RcsMessageId is empty in work handler."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coos.b(java.lang.Object):java.lang.Object");
    }
}
