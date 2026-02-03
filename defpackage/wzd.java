package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzd extends fcyz implements fdat {
    int a;
    final /* synthetic */ wze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzd(wze wzeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wzeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wzd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r5.d.a(com.google.android.apps.messaging.R.raw.message_sent_v2, r4) == r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L23
            goto L3c
        Ld:
            wze r5 = r4.b
            r4.a = r2
            fcyh r1 = r5.b
            fcyh r1 = defpackage.eicg.a(r1)
            wzc r2 = new wzc
            r3 = 0
            r2.<init>(r3, r5)
            java.lang.Object r5 = defpackage.fdin.a(r1, r2, r4)
            if (r5 == r0) goto L3f
        L23:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L3c
            wze r5 = r4.b
            r1 = 2
            r4.a = r1
            dqbu r5 = r5.d
            r1 = 2132017213(0x7f14003d, float:1.9672698E38)
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L3c
            goto L3f
        L3c:
            fctx r5 = defpackage.fctx.a
            return r5
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wzd(this.b, fcxyVar);
    }
}
