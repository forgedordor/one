package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzh extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dlzk c;
    final /* synthetic */ dlzl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlzh(dlzk dlzkVar, dlzl dlzlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dlzkVar;
        this.d = dlzlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlzh) c((Exception) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r5.j.a(r3, r1, r4) == r0) goto L17;
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.fctl.b(r5)
            goto L46
        Le:
            java.lang.Object r1 = r4.b
            java.lang.Exception r1 = (java.lang.Exception) r1
            defpackage.fctl.b(r5)
            goto L34
        L16:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.b
            r1 = r5
            java.lang.Exception r1 = (java.lang.Exception) r1
            dlzk r5 = r4.c
            dlxt r5 = r5.e
            if (r5 != 0) goto L2a
            java.lang.String r5 = "audioGraph"
            defpackage.fdbq.c(r5)
            r5 = r2
        L2a:
            r4.b = r1
            r4.a = r3
            java.lang.Object r5 = r5.b(r4)
            if (r5 == r0) goto L49
        L34:
            dlzl r5 = r4.d
            dlzk r3 = r4.c
            r4.b = r2
            r2 = 2
            r4.a = r2
            fdau r5 = r5.j
            java.lang.Object r5 = r5.a(r3, r1, r4)
            if (r5 != r0) goto L46
            goto L49
        L46:
            fctx r5 = defpackage.fctx.a
            return r5
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlzh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dlzh dlzhVar = new dlzh(this.c, this.d, fcxyVar);
        dlzhVar.b = obj;
        return dlzhVar;
    }
}
