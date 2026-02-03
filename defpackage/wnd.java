package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnd implements wms {
    public final cqmt a;
    private final fcyh b;

    public wnd(cqmt cqmtVar, fcyh fcyhVar) {
        fcyhVar.getClass();
        this.a = cqmtVar;
        this.b = fcyhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vvr r10, defpackage.wmv r11, java.lang.String r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r11 = r13 instanceof defpackage.wnb
            if (r11 == 0) goto L13
            r11 = r13
            wnb r11 = (defpackage.wnb) r11
            int r12 = r11.e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r12 & r0
            if (r1 == 0) goto L13
            int r12 = r12 - r0
            r11.e = r12
            goto L18
        L13:
            wnb r11 = new wnb
            r11.<init>(r9, r13)
        L18:
            java.lang.Object r12 = r11.c
            fcyl r13 = defpackage.fcyl.a
            int r0 = r11.e
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto L33
            java.lang.Object r10 = r11.b
            java.lang.Object r13 = r11.a
            java.lang.String r0 = r11.h
            dlto r1 = r11.g
            vvr r11 = r11.f
            defpackage.fctl.b(r12)
            r3 = r10
            r10 = r11
            goto L7e
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            defpackage.fctl.b(r12)
            dltd r12 = r10.a
            boolean r0 = r12 instanceof defpackage.dlto
            if (r0 == 0) goto La5
            dlto r12 = (defpackage.dlto) r12
            doig r0 = r12.a
            java.lang.String r2 = r12.b
            vvq r3 = r10.b
            android.net.Uri r3 = r3.c
            java.lang.String r0 = r0.a()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            if (r3 != 0) goto L59
            r3 = r2
        L59:
            java.lang.String r4 = r12.d
            if (r4 != 0) goto L85
            fcyh r4 = r9.b
            fcyh r4 = defpackage.eicg.a(r4)
            wnc r5 = new wnc
            r6 = 0
            r5.<init>(r6, r9, r0)
            r11.f = r10
            r11.g = r12
            r11.h = r0
            r11.a = r2
            r11.b = r3
            r11.e = r1
            java.lang.Object r11 = defpackage.fdin.a(r4, r5, r11)
            if (r11 == r13) goto L84
            r1 = r12
            r13 = r2
            r12 = r11
        L7e:
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            r12 = r1
        L82:
            r1 = r0
            goto L87
        L84:
            return r13
        L85:
            r13 = r2
            goto L82
        L87:
            wno r11 = new wno
            wns r0 = new wns
            r3.getClass()
            r4.getClass()
            vvq r10 = r10.b
            athh r6 = r10.b
            r2 = r3
            android.net.Uri r2 = (android.net.Uri) r2
            long r7 = r12.c
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r6)
            android.net.Uri r13 = (android.net.Uri) r13
            r11.<init>(r0, r13)
            return r11
        La5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Failed requirement."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnd.a(vvr, wmv, java.lang.String, fcxy):java.lang.Object");
    }
}
