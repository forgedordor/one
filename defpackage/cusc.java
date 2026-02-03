package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusc {
    public final eg a;
    private final fcsu b;
    private final fcsu c;
    private final ehrb d;

    public cusc(cury curyVar, fcsu fcsuVar, fcsu fcsuVar2, ehrb ehrbVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        ehrbVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = ehrbVar;
        eg egVarG = curyVar.G();
        if (egVarG == null) {
            throw new IllegalStateException("Check failed.");
        }
        this.a = egVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.View r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cusa
            if (r0 == 0) goto L13
            r0 = r6
            cusa r0 = (defpackage.cusa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cusa r0 = new cusa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.c
            java.lang.Object r6 = r6.b()
            egbf r6 = (defpackage.egbf) r6
            fcsu r2 = r4.b
            java.lang.Object r2 = r2.b()
            efwo r2 = (defpackage.efwo) r2
            com.google.common.util.concurrent.ListenableFuture r6 = r6.c(r2)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L97
        L52:
            egbe r6 = (defpackage.egbe) r6
            android.view.View r5 = (android.view.View) r5
            r0 = 2131428597(0x7f0b04f5, float:1.8478843E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            egbs r1 = r6.b()
            java.lang.String r1 = r1.h
            r1.getClass()
            boolean r2 = defpackage.fdgn.H(r1)
            if (r3 != r2) goto L6f
            r1 = 0
        L6f:
            if (r1 == 0) goto L7a
            ehrb r2 = r4.d
            rbr r1 = r2.f(r1)
            r1.v(r0)
        L7a:
            r0 = 2131428596(0x7f0b04f4, float:1.847884E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            egbs r6 = r6.b()
            java.lang.String r6 = r6.g
            r0.setText(r6)
            curz r6 = new curz
            r6.<init>()
            r5.setOnClickListener(r6)
            fctx r5 = defpackage.fctx.a
            return r5
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cusc.a(android.view.View, fcxy):java.lang.Object");
    }
}
