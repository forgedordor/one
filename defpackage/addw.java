package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addw extends fcyz implements fdat {
    int a;
    final /* synthetic */ addx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addw(fcxy fcxyVar, addx addxVar) {
        super(2, fcxyVar);
        this.b = addxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((addw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
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
            r2 = 0
            r3 = 1
            defpackage.fctl.b(r5)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L1c
            goto L49
        Le:
            java.lang.Object r5 = r4.c
            fdjx r5 = (defpackage.fdjx) r5
            addx r5 = r4.b
            r4.a = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 == r0) goto L53
        L1c:
            egbs r5 = (defpackage.egbs) r5
            if (r5 == 0) goto L35
            addx r1 = r4.b
            egej r1 = r1.c
            java.lang.String r5 = r1.e(r5)
            if (r5 == 0) goto L30
            dlsu r1 = new dlsu
            r1.<init>(r5)
            goto L31
        L30:
            r1 = r2
        L31:
            if (r1 != 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            addx r5 = r4.b
            egej r1 = r5.c
            efwo r5 = r5.a
            com.google.common.util.concurrent.ListenableFuture r5 = r1.b(r5)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)
            if (r5 != r0) goto L49
            goto L53
        L49:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L4e
            return r2
        L4e:
            dlsu r0 = new dlsu
            r0.<init>(r5)
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.addw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        addw addwVar = new addw(fcxyVar, this.b);
        addwVar.c = obj;
        return addwVar;
    }
}
