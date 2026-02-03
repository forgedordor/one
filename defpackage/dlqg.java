package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlqg extends fcyy implements fdat {
    int a;
    final /* synthetic */ fdjx b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fdap d;
    final /* synthetic */ dlqn e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlqg(fdjx fdjxVar, boolean z, fdap fdapVar, dlqn dlqnVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = fdjxVar;
        this.c = z;
        this.d = fdapVar;
        this.e = dlqnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlqg) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: irv -> 0x009b, TryCatch #0 {irv -> 0x009b, blocks: (B:6:0x000e, B:21:0x0066, B:23:0x006a, B:24:0x0077, B:26:0x0098, B:7:0x0012, B:17:0x0058, B:12:0x003c, B:14:0x0040, B:18:0x005b), top: B:31:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[Catch: irv -> 0x009b, TryCatch #0 {irv -> 0x009b, blocks: (B:6:0x000e, B:21:0x0066, B:23:0x006a, B:24:0x0077, B:26:0x0098, B:7:0x0012, B:17:0x0058, B:12:0x003c, B:14:0x0040, B:18:0x005b), top: B:31:0x0008 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            r3 = 2
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L16
            if (r1 == r3) goto L12
            defpackage.fctl.b(r9)     // Catch: defpackage.irv -> L9b
            goto L66
        L12:
            defpackage.fctl.b(r9)     // Catch: defpackage.irv -> L9b
            goto L58
        L16:
            java.lang.Object r1 = r8.f
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r9)
            goto L3c
        L1e:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.f
            r1 = r9
            ire r1 = (defpackage.ire) r1
            fdjx r9 = r8.b
            dlqn r6 = r8.e
            dlqc r7 = new dlqc
            r7.<init>(r6, r5)
            defpackage.fdil.d(r9, r5, r5, r7, r4)
            r8.f = r1
            r8.a = r2
            java.lang.Object r9 = defpackage.dzm.g(r1, r5, r8, r3)
            if (r9 == r0) goto L9e
        L3c:
            boolean r9 = r8.c     // Catch: defpackage.irv -> L9b
            if (r9 == 0) goto L5b
            jou r9 = r1.q()     // Catch: defpackage.irv -> L9b
            long r6 = r9.f()     // Catch: defpackage.irv -> L9b
            dlqf r9 = new dlqf     // Catch: defpackage.irv -> L9b
            r9.<init>(r5)     // Catch: defpackage.irv -> L9b
            r8.f = r5     // Catch: defpackage.irv -> L9b
            r8.a = r3     // Catch: defpackage.irv -> L9b
            java.lang.Object r9 = r1.s(r6, r9, r8)     // Catch: defpackage.irv -> L9b
            if (r9 != r0) goto L58
            goto L9e
        L58:
            ise r9 = (defpackage.ise) r9     // Catch: defpackage.irv -> L9b
            goto L68
        L5b:
            r8.f = r5     // Catch: defpackage.irv -> L9b
            r8.a = r4     // Catch: defpackage.irv -> L9b
            java.lang.Object r9 = defpackage.dlqj.b(r1, r8)     // Catch: defpackage.irv -> L9b
            if (r9 != r0) goto L66
            goto L9e
        L66:
            ise r9 = (defpackage.ise) r9     // Catch: defpackage.irv -> L9b
        L68:
            if (r9 != 0) goto L77
            fdjx r9 = r8.b     // Catch: defpackage.irv -> L9b
            dlqd r0 = new dlqd     // Catch: defpackage.irv -> L9b
            dlqn r1 = r8.e     // Catch: defpackage.irv -> L9b
            r0.<init>(r1, r5)     // Catch: defpackage.irv -> L9b
            defpackage.fdil.d(r9, r5, r5, r0, r4)     // Catch: defpackage.irv -> L9b
            goto L9b
        L77:
            fdjx r0 = r8.b     // Catch: defpackage.irv -> L9b
            dlqe r1 = new dlqe     // Catch: defpackage.irv -> L9b
            dlqn r2 = r8.e     // Catch: defpackage.irv -> L9b
            r1.<init>(r2, r5)     // Catch: defpackage.irv -> L9b
            defpackage.fdil.d(r0, r5, r5, r1, r4)     // Catch: defpackage.irv -> L9b
            fdap r0 = r8.d     // Catch: defpackage.irv -> L9b
            long r1 = r9.c     // Catch: defpackage.irv -> L9b
            ihs r3 = new ihs     // Catch: defpackage.irv -> L9b
            r3.<init>(r1)     // Catch: defpackage.irv -> L9b
            java.lang.Object r0 = r0.invoke(r3)     // Catch: defpackage.irv -> L9b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: defpackage.irv -> L9b
            boolean r0 = r0.booleanValue()     // Catch: defpackage.irv -> L9b
            if (r0 == 0) goto L9b
            r9.b()     // Catch: defpackage.irv -> L9b
        L9b:
            fctx r9 = defpackage.fctx.a
            return r9
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlqg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dlqg dlqgVar = new dlqg(this.b, this.c, this.d, this.e, fcxyVar);
        dlqgVar.f = obj;
        return dlqgVar;
    }
}
