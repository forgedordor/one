package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llf extends fcyz implements fdat {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ llo d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llf(llo lloVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = lloVar;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((llf) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.fctl.b(r5)
            goto L39
        Lf:
            boolean r1 = r4.c
            defpackage.fctl.b(r5)
            goto L24
        L15:
            defpackage.fctl.b(r5)
            boolean r1 = r4.c
            llo r5 = r4.d
            r4.b = r2
            java.lang.Object r5 = r5.j(r4)
            if (r5 == r0) goto L53
        L24:
            if (r1 == 0) goto L43
            llo r1 = r4.d
            lmg r1 = r1.c()
            r4.a = r5
            r2 = 2
            r4.b = r2
            java.lang.Object r1 = r1.d()
            if (r1 == r0) goto L53
            r0 = r5
            r5 = r1
        L39:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r3 = r0
            r0 = r5
            r5 = r3
            goto L45
        L43:
            int r0 = r4.e
        L45:
            ljt r1 = new ljt
            if (r5 == 0) goto L4e
            int r2 = r5.hashCode()
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r1.<init>(r5, r2, r0)
            return r1
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        llf llfVar = new llf(this.d, this.e, fcxyVar);
        llfVar.c = ((Boolean) obj).booleanValue();
        return llfVar;
    }
}
