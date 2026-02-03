package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wkg extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlto b;
    final /* synthetic */ wkk c;
    final /* synthetic */ String d;
    final /* synthetic */ dike e;
    final /* synthetic */ int f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkg(dlto dltoVar, wkk wkkVar, String str, int i, dike dikeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dltoVar;
        this.c = wkkVar;
        this.d = str;
        this.f = i;
        this.e = dikeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wkg) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r14 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r1.fO(r4, r13) != r0) goto L20;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L17
            if (r1 == r2) goto Lf
            defpackage.fctl.b(r14)
            goto L7e
        Lf:
            java.lang.Object r1 = r13.g
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r14)
            goto L3e
        L17:
            defpackage.fctl.b(r14)
            java.lang.Object r14 = r13.g
            r1 = r14
            fdpm r1 = (defpackage.fdpm) r1
            dlto r14 = r13.b
            java.lang.String r14 = r14.d
            if (r14 != 0) goto L51
            wkk r14 = r13.c
            java.lang.String r4 = r13.d
            fcyh r14 = r14.c
            fcyh r14 = defpackage.eicg.a(r14)
            wkf r5 = new wkf
            r5.<init>(r3, r4)
            r13.g = r1
            r13.a = r2
            java.lang.Object r14 = defpackage.fdin.a(r14, r5, r13)
            if (r14 == r0) goto L7d
        L3e:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L4c
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toUpperCase(r2)
            r14.getClass()
            goto L4d
        L4c:
            r14 = r3
        L4d:
            if (r14 != 0) goto L51
            java.lang.String r14 = r13.d
        L51:
            r6 = r14
            int r5 = r13.f
            wkk r14 = r13.c
            dlto r2 = r13.b
            dike r11 = r13.e
            android.content.Context r4 = r14.b
            r7 = r4
            dila r4 = new dila
            long r8 = r2.c
            java.lang.String r7 = android.text.format.Formatter.formatFileSize(r7, r8)
            aqkb r14 = r14.f
            boolean r10 = r14.a()
            r12 = 16
            r9 = 0
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.g = r3
            r14 = 2
            r13.a = r14
            java.lang.Object r14 = r1.fO(r4, r13)
            if (r14 != r0) goto L7e
        L7d:
            return r0
        L7e:
            fctx r14 = defpackage.fctx.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wkg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wkg wkgVar = new wkg(this.b, this.c, this.d, this.f, this.e, fcxyVar);
        wkgVar.g = obj;
        return wkgVar;
    }
}
