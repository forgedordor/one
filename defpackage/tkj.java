package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkj extends fcyz implements fdat {
    int a;
    final /* synthetic */ tkk b;
    final /* synthetic */ cpkh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkj(tkk tkkVar, cpkh cpkhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tkkVar;
        this.c = cpkhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tkj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r6.a(r2, null, r1, null, r5) == r0) goto L19;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L21
            goto L48
        Ld:
            tkk r6 = r5.b
            fcsu r6 = r6.d
            java.lang.Object r6 = r6.b()
            cpjw r6 = (defpackage.cpjw) r6
            cpkh r1 = r5.c
            r5.a = r2
            java.lang.Object r6 = r6.c(r1, r5)
            if (r6 == r0) goto L4b
        L21:
            tkk r6 = r5.b
            cpkh r1 = r5.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r3 = r1.f
            r4 = 0
            if (r3 == 0) goto L35
            alqm r3 = r3.g()
            if (r3 == 0) goto L35
            alqj r2 = r3.G(r2)
            goto L36
        L35:
            r2 = r4
        L36:
            tiy r6 = r6.e
            java.lang.Boolean r1 = r1.b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3 = 2
            r5.a = r3
            java.lang.Object r6 = defpackage.tit.a(r6, r2, r4, r1, r5)
            if (r6 != r0) goto L48
            goto L4b
        L48:
            fctx r6 = defpackage.fctx.a
            return r6
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tkj(this.b, this.c, fcxyVar);
    }
}
