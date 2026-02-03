package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zra extends fcyz implements fdat {
    int a;
    final /* synthetic */ zrb b;
    final /* synthetic */ agau c;
    final /* synthetic */ alff d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zra(zrb zrbVar, agau agauVar, alff alffVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zrbVar;
        this.c = agauVar;
        this.d = alffVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zra) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (defpackage.fdxs.c(r5, r4) == r0) goto L17;
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
            if (r1 == r2) goto L21
            goto L4f
        Ld:
            zrb r5 = r4.b
            fcsu r5 = r5.b
            java.lang.Object r5 = r5.b()
            afzc r5 = (defpackage.afzc) r5
            agau r1 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.f(r1, r4)
            if (r5 == r0) goto L52
        L21:
            adh r5 = (defpackage.adh) r5
            int r5 = r5.a
            r1 = -1
            if (r5 != r1) goto L4f
            zrb r5 = r4.b
            android.content.Context r1 = r5.c
            r2 = 2132083237(0x7f150225, float:1.980661E38)
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            r1.show()
            alff r1 = r4.d
            java.lang.String r2 = r1.b()
            if (r2 == 0) goto L4f
            ajlu r5 = r5.a
            eiju r5 = r5.j(r1)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 != r0) goto L4f
            goto L52
        L4f:
            fctx r5 = defpackage.fctx.a
            return r5
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zra.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zra(this.b, this.c, this.d, fcxyVar);
    }
}
