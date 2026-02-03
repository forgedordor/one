package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ankw implements ankx {
    public final cogw a;
    private final fcsu b;
    private final fcsu c;
    private final fdjx d;

    public ankw(cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        cogwVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.a = cogwVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fdjxVar;
    }

    @Override // defpackage.ankx
    public final eiju a(ajts ajtsVar, aoer aoerVar) {
        ajtsVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new anku(aoerVar, ajtsVar, this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ajts r5, defpackage.aoer r6, boolean r7, defpackage.fcxy r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ankv
            if (r0 == 0) goto L13
            r0 = r8
            ankv r0 = (defpackage.ankv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ankv r0 = new ankv
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r8)
            goto L80
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r8)
            ajlj r8 = r5.c()
            ajlj r2 = defpackage.ajlj.GROUP
            if (r8 != r2) goto L3f
            elnu r5 = defpackage.elnu.GROUP_CONVERSATION
            return r5
        L3f:
            elwp r8 = r5.I()
            elwp r2 = defpackage.elwp.SEND_MODE_XMS
            if (r8 != r2) goto L4a
            elnu r5 = defpackage.elnu.CONVERSATION_SET_TO_XMS_ONLY
            return r5
        L4a:
            if (r7 == 0) goto L9d
            java.lang.String r7 = r5.L()
            if (r7 == 0) goto L63
            fcsu r8 = r4.c
            java.lang.Object r8 = r8.b()
            alrj r8 = (defpackage.alrj) r8
            int r6 = r6.b()
            alqm r6 = r8.u(r7, r6)
            goto L64
        L63:
            r6 = 0
        L64:
            if (r6 == 0) goto L9a
            fcsu r7 = r4.b
            java.lang.Object r7 = r7.b()
            awhr r7 = (defpackage.awhr) r7
            eiju r6 = r7.e(r6)
            r6.getClass()
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = defpackage.fdxs.c(r6, r0)
            if (r8 != r1) goto L80
            return r1
        L80:
            r8.getClass()
            assi r8 = (defpackage.assi) r8
            boolean r6 = r8.g()
            if (r6 != 0) goto L8c
            goto L9a
        L8c:
            elwp r5 = r5.I()
            elwp r6 = defpackage.elwp.SEND_MODE_XMS_LATCH
            if (r5 != r6) goto L97
            elnu r5 = defpackage.elnu.CONVERSATION_LATCHED_TO_XMS
            return r5
        L97:
            elnu r5 = defpackage.elnu.OTHER_REASON
            return r5
        L9a:
            elnu r5 = defpackage.elnu.RECEIVER_NOT_AVAILABLE
            return r5
        L9d:
            elnu r5 = defpackage.elnu.SENDER_NOT_AVAILABLE_RCS_AVAILABILITIES_ISSUES
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ankw.b(ajts, aoer, boolean, fcxy):java.lang.Object");
    }
}
