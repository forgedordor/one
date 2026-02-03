package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ylo extends fcyz implements fdat {
    int a;
    final /* synthetic */ ylw b;
    final /* synthetic */ ajlt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(ylw ylwVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ylwVar;
        this.c = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ylo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r4.a(r1, r3) == r0) goto L16;
     */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, vvx] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L3f
        Ld:
            ylw r4 = r3.b
            ajlt r1 = r3.c
            zvz r4 = r4.f
            fdpl r4 = r4.b(r1)
            r3.a = r2
            java.lang.Object r4 = defpackage.fdtc.a(r4, r3)
            if (r4 == r0) goto L51
        L1f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4e
            ylw r4 = r3.b
            ajlt r1 = r3.c
            j$.util.Optional r4 = r4.d
            java.lang.Object r4 = r4.get()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r1.b()
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r0) goto L3f
            goto L51
        L3f:
            ylw r4 = r3.b
            fcsu r4 = r4.g
            java.lang.Object r4 = r4.b()
            vwg r4 = (defpackage.vwg) r4
            vwd r0 = defpackage.vwd.a
            r4.c(r0)
        L4e:
            fctx r4 = defpackage.fctx.a
            return r4
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ylo(this.b, this.c, fcxyVar);
    }
}
