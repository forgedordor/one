package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aisi extends fcyz implements fdat {
    int a;
    final /* synthetic */ aisn b;
    final /* synthetic */ ellh c;
    final /* synthetic */ emxt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisi(aisn aisnVar, ellh ellhVar, emxt emxtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aisnVar;
        this.c = ellhVar;
        this.d = emxtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[RETURN] */
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
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            defpackage.fctl.b(r9)
            if (r1 == 0) goto Lf
            goto L7e
        Lf:
            aisn r9 = r8.b
            ellh r1 = r8.c
            emxt r4 = r8.d
            r8.a = r2
            cczv r5 = defpackage.aish.a
            fcvo r5 = defpackage.fcvo.a
            int r6 = r1.j
            ellf r6 = defpackage.ellf.b(r6)
            if (r6 != 0) goto L25
            ellf r6 = defpackage.ellf.UNKNOWN_BUGLE_EVENT_TYPE
        L25:
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L4d
            cczv r6 = defpackage.aish.a
            java.lang.Object r6 = r6.e()
            ewtm r6 = (defpackage.ewtm) r6
            evsx r6 = r6.b
            int r1 = r1.j
            ellf r1 = defpackage.ellf.b(r1)
            if (r1 != 0) goto L3f
            ellf r1 = defpackage.ellf.UNKNOWN_BUGLE_EVENT_TYPE
        L3f:
            java.lang.Integer r7 = new java.lang.Integer
            int r1 = r1.f11do
            r7.<init>(r1)
            boolean r1 = r6.contains(r7)
            if (r1 != 0) goto L4d
            goto L6a
        L4d:
            boolean r1 = r5.contains(r4)
            if (r1 == 0) goto L6c
            cczv r1 = defpackage.aish.b
            java.lang.Object r1 = r1.e()
            ewtm r1 = (defpackage.ewtm) r1
            evsx r1 = r1.b
            int r4 = r4.ds
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L6c
        L6a:
            r9 = r3
            goto L7b
        L6c:
            cczv r1 = defpackage.aish.c
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            java.lang.Object r9 = r9.b(r8)
        L7b:
            if (r9 != r0) goto L7e
            return r0
        L7e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r9 = r9 ^ r2
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aisi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aisi(this.b, this.c, this.d, fcxyVar);
    }
}
