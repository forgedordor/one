package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class curm extends fcyz implements fdat {
    int a;
    final /* synthetic */ curo b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public curm(curo curoVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = curoVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((curm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r4.f(r1, r3) == r0) goto L16;
     */
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
            if (r1 == r2) goto L1c
            goto L49
        Ld:
            curo r4 = r3.b
            efwo r1 = r3.c
            r1.getClass()
            r3.a = r2
            java.lang.Object r4 = r4.e(r1, r3)
            if (r4 == r0) goto L4c
        L1c:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            curo r4 = r3.b
            efwo r1 = r3.c
            r1.getClass()
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.f(r1, r3)
            if (r4 != r0) goto L49
            goto L4c
        L35:
            curo r4 = r3.b
            curp r4 = r4.a
            com.google.android.apps.messaging.ui.appsettings.HqmsSettingsActivity r4 = r4.a
            r0 = 2131428591(0x7f0b04ef, float:1.847883E38)
            android.view.View r4 = r4.findViewById(r0)
            r4.getClass()
            r0 = 0
            r4.setVisibility(r0)
        L49:
            fctx r4 = defpackage.fctx.a
            return r4
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.curm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new curm(this.b, this.c, fcxyVar);
    }
}
