package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxma extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxmj b;
    final /* synthetic */ String c;
    final /* synthetic */ String d = "oauth2:https://www.googleapis.com/auth/notifications";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxma(dxmj dxmjVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxmjVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxma) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return (defpackage.dxft) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        return (defpackage.dxft) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r5 == r0) goto L15;
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
            if (r1 == r2) goto L22
            goto L35
        Ld:
            boolean r5 = defpackage.fbce.b()
            if (r5 == 0) goto L25
            dxmj r5 = r4.b
            java.lang.String r1 = r4.c
            java.lang.String r3 = r4.d
            r4.a = r2
            java.lang.Object r5 = r5.i(r1, r3, r4)
            if (r5 != r0) goto L22
            goto L34
        L22:
            dxft r5 = (defpackage.dxft) r5
            return r5
        L25:
            dxmj r5 = r4.b
            java.lang.String r1 = r4.c
            java.lang.String r2 = r4.d
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r5.h(r1, r2, r4)
            if (r5 != r0) goto L35
        L34:
            return r0
        L35:
            dxft r5 = (defpackage.dxft) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxma.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxma(this.b, this.c, fcxyVar);
    }
}
