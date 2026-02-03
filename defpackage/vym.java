package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vym implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ vzk b;

    public vym(fdpm fdpmVar, vzk vzkVar) {
        this.a = fdpmVar;
        this.b = vzkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r2.fO(r6, r0) == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.vyl
            if (r0 == 0) goto L13
            r0 = r11
            vyl r0 = (defpackage.vyl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            vyl r0 = new vyl
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.fctl.b(r11)
            goto Ld0
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            ajna r10 = r0.e
            java.lang.Object r2 = r0.c
            defpackage.fctl.b(r11)
            goto L75
        L3c:
            defpackage.fctl.b(r11)
            fdpm r2 = r9.a
            vzn r10 = (defpackage.vzn) r10
            aokl r11 = r10.a
            ajna r6 = r10.b
            java.lang.String r10 = r10.c
            vzk r7 = r9.b
            r0.c = r2
            r0.e = r6
            r0.b = r4
            if (r10 == 0) goto L71
            int r8 = r10.length()
            if (r8 > 0) goto L5a
            r10 = r5
        L5a:
            if (r10 == 0) goto L71
            fcyh r7 = r7.d
            fcyh r7 = defpackage.eicg.a(r7)
            vxp r8 = new vxp
            r8.<init>(r5, r11, r10)
            java.lang.Object r10 = defpackage.fdin.a(r7, r8, r0)
            if (r10 == r1) goto L6f
            aokk r10 = (defpackage.aokk) r10
        L6f:
            r11 = r10
            goto L72
        L71:
            r11 = r5
        L72:
            if (r11 == r1) goto Ld3
            r10 = r6
        L75:
            aokk r11 = (defpackage.aokk) r11
            if (r11 == 0) goto Lc2
            vzo r6 = new vzo
            boolean r7 = r11.g()
            ajna r8 = defpackage.ajna.SATELLITE
            if (r10 != r8) goto La1
            vzk r10 = r9.b
            aqbh r10 = r10.g
            boolean r10 = r10.a()
            if (r10 == 0) goto La1
            int r10 = r11.a()
            if (r10 >= 0) goto Lb1
            waa r10 = new waa
            int r8 = r11.a()
            int r11 = r11.c()
            r10.<init>(r8, r11, r4)
            goto Lbe
        La1:
            int r10 = r11.c()
            if (r10 > r4) goto Lb1
            int r10 = r11.a()
            r4 = 10
            if (r10 <= r4) goto Lb1
            r10 = r5
            goto Lbe
        Lb1:
            waa r10 = new waa
            int r4 = r11.a()
            int r11 = r11.c()
            r10.<init>(r4, r11)
        Lbe:
            r6.<init>(r7, r10)
            goto Lc3
        Lc2:
            r6 = r5
        Lc3:
            r0.c = r5
            r0.e = r5
            r0.b = r3
            java.lang.Object r10 = r2.fO(r6, r0)
            if (r10 != r1) goto Ld0
            goto Ld3
        Ld0:
            fctx r10 = defpackage.fctx.a
            return r10
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vym.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
