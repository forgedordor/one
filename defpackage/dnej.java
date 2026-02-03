package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnej implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ dneq b;
    final /* synthetic */ dnce c;

    public dnej(fdpm fdpmVar, dneq dneqVar, dnce dnceVar) {
        this.a = fdpmVar;
        this.b = dneqVar;
        this.c = dnceVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8.fO(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(defpackage.dneb r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dnei
            if (r0 == 0) goto L13
            r0 = r9
            dnei r0 = (defpackage.dnei) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dnei r0 = new dnei
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L5c
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)
            goto L50
        L38:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            dneq r2 = r7.b
            dnce r5 = r7.c
            r0.a = r9
            r0.d = r4
            dnfa r2 = r2.f
            java.lang.Object r8 = defpackage.dnfa.g(r2, r8, r5, r0)
            if (r8 == r1) goto L5f
            r6 = r9
            r9 = r8
            r8 = r6
        L50:
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.fO(r9, r0)
            if (r8 != r1) goto L5c
            goto L5f
        L5c:
            fctx r8 = defpackage.fctx.a
            return r8
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnej.fO(dneb, fcxy):java.lang.Object");
    }
}
