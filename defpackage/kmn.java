package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmn extends fcyz implements fdat {
    int a;
    final /* synthetic */ knx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmn(knx knxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = knxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kmn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r3.a() == r0) goto L13;
     */
    /* JADX WARN: Path cross not found for [B:16:0x0055, B:18:0x0059], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
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
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r8.c
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r9)
            goto L43
        Lf:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.c
            fdjx r9 = (defpackage.fdjx) r9
            r1 = r9
        L17:
            boolean r9 = defpackage.fdjy.g(r1)
            if (r9 == 0) goto L5d
            kmm r9 = defpackage.kmm.a
            r8.c = r1
            r8.a = r2
            fcyh r3 = r8.u()
            jnd r4 = defpackage.jne.a
            fcyf r3 = r3.get(r4)
            jne r3 = (defpackage.jne) r3
            if (r3 != 0) goto L36
            java.lang.Object r9 = defpackage.hos.c(r9, r8)
            goto L40
        L36:
            jnf r4 = new jnf
            r5 = 0
            r4.<init>(r9, r5)
            java.lang.Object r9 = r3.a()
        L40:
            if (r9 != r0) goto L43
            return r0
        L43:
            knx r9 = r8.b
            int[] r3 = r9.i
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.a
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L59
            r3 = r3[r2]
            if (r6 == r3) goto L17
        L59:
            r9.l()
            goto L17
        L5d:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        kmn kmnVar = new kmn(this.b, fcxyVar);
        kmnVar.c = obj;
        return kmnVar;
    }
}
