package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdpi implements fdpm {
    final /* synthetic */ fdpj a;
    final /* synthetic */ fdci b;
    final /* synthetic */ fdpm c;

    public fdpi(fdpj fdpjVar, fdci fdciVar, fdpm fdpmVar) {
        this.a = fdpjVar;
        this.b = fdciVar;
        this.c = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.fdph
            if (r0 == 0) goto L13
            r0 = r9
            fdph r0 = (defpackage.fdph) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdph r0 = new fdph
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L5d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r9)
            fdpj r9 = r7.a
            fdap r2 = r9.a
            java.lang.Object r2 = r2.invoke(r8)
            fdci r4 = r7.b
            java.lang.Object r5 = r4.a
            fdzi r6 = defpackage.fdwz.a
            if (r5 == r6) goto L50
            fdat r9 = r9.b
            java.lang.Object r9 = r9.a(r5, r2)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5d
        L50:
            r4.a = r2
            fdpm r9 = r7.c
            r0.c = r3
            java.lang.Object r8 = r9.fO(r8, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdpi.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
