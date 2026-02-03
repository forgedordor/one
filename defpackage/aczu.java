package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aczu extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ aczv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczu(aczv aczvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = aczvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aczu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Path cross not found for [B:16:0x0065, B:10:0x003c], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0061). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r1 = r5.a
            defpackage.fctl.b(r6)
            goto L61
        Lf:
            defpackage.fctl.b(r6)
            goto L2f
        L13:
            defpackage.fctl.b(r6)
            aczv r6 = r5.c
            ejxr r6 = r6.b
            java.lang.Object r6 = r6.get()
            anpj r6 = (defpackage.anpj) r6
            eiju r6 = r6.b()
            r6.getClass()
            r5.b = r2
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L70
        L2f:
            ekgb r6 = (defpackage.ekgb) r6
            ekqh r6 = r6.iterator()
            r6.getClass()
            r1 = 0
            r4 = r1
            r1 = r6
            r6 = r4
        L3c:
            r2 = r1
            ekqg r2 = (defpackage.ekqg) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r6 = r2.next()
            aoer r6 = (defpackage.aoer) r6
            anpj r6 = r6.f()
            eiju r6 = r6.b()
            r6.getClass()
            r5.a = r1
            r2 = 2
            r5.b = r2
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L70
        L61:
            aoio r6 = (defpackage.aoio) r6
            if (r6 == 0) goto L3c
            boolean r2 = r6.a()
            if (r2 == 0) goto L3c
        L6b:
            aczs r0 = new aczs
            r0.<init>(r6)
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aczu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aczu(this.c, fcxyVar);
    }
}
