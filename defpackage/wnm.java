package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnm implements wms {
    private final xak a;

    public wnm(xak xakVar) {
        this.a = xakVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vvr r6, defpackage.wmv r7, java.lang.String r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r8 = r9 instanceof defpackage.wnk
            if (r8 == 0) goto L13
            r8 = r9
            wnk r8 = (defpackage.wnk) r8
            int r0 = r8.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.d = r0
            goto L18
        L13:
            wnk r8 = new wnk
            r8.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r8.b
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.String r6 = r8.g
            java.lang.Object r7 = r8.a
            doau r0 = r8.f
            vvr r8 = r8.e
            defpackage.fctl.b(r9)
            r3 = r6
            r6 = r8
            goto L75
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            defpackage.fctl.b(r9)
            dltd r9 = r6.a
            boolean r1 = r9 instanceof defpackage.doyt
            if (r1 == 0) goto L92
            dohr r9 = (defpackage.dohr) r9
            doht r1 = r7.c
            dogm r1 = r1.a
            doin r3 = r7.b
            java.lang.Long r4 = r7.d
            dohq r9 = defpackage.doij.d(r9, r1, r3, r4)
            doau r9 = (defpackage.doau) r9
            java.lang.String r1 = r9.b
            dohm r3 = r9.a
            android.net.Uri r1 = android.net.Uri.parse(r1)
            doig r3 = defpackage.dogh.a(r3)
            java.lang.String r3 = r3.a()
            r8.e = r6
            r8.f = r9
            r8.a = r1
            r8.g = r3
            r8.d = r2
            java.lang.Object r7 = r5.b(r1, r6, r7, r8)
            if (r7 == r0) goto L91
            r0 = r9
            r9 = r7
            r7 = r1
        L75:
            android.net.Uri r9 = (android.net.Uri) r9
            android.util.Size r8 = new android.util.Size
            int r1 = r0.c
            int r0 = r0.d
            r8.<init>(r1, r0)
            vvq r6 = r6.b
            athh r6 = r6.b
            wny r0 = new wny
            r0.<init>(r3, r9, r8, r6)
            wno r6 = new wno
            android.net.Uri r7 = (android.net.Uri) r7
            r6.<init>(r0, r7)
            return r6
        L91:
            return r0
        L92:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnm.a(vvr, wmv, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r5, defpackage.vvr r6, defpackage.wmv r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.wnl
            if (r0 == 0) goto L13
            r0 = r8
            wnl r0 = (defpackage.wnl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wnl r0 = new wnl
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r8)     // Catch: defpackage.xai -> L27
            goto L50
        L27:
            r5 = move-exception
            goto L54
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r8)
            vvq r8 = r6.b
            android.net.Uri r8 = r8.c
            if (r8 == 0) goto L42
            vvq r5 = r6.b
            android.net.Uri r5 = r5.c
            r5.getClass()
            return r5
        L42:
            boolean r6 = r7.e
            if (r6 == 0) goto L5c
            xak r6 = r4.a     // Catch: defpackage.xai -> L27
            r0.c = r3     // Catch: defpackage.xai -> L27
            java.lang.Object r8 = defpackage.xah.a(r6, r5, r0)     // Catch: defpackage.xai -> L27
            if (r8 == r1) goto L53
        L50:
            android.net.Uri r8 = (android.net.Uri) r8     // Catch: defpackage.xai -> L27
            return r8
        L53:
            return r1
        L54:
            wmt r6 = new wmt
            java.lang.String r7 = "Failed to download sticker attachment"
            r6.<init>(r7, r5)
            throw r6
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnm.b(android.net.Uri, vvr, wmv, fcxy):java.lang.Object");
    }
}
