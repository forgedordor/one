package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzg extends fcyz implements fdap {
    int a;
    final /* synthetic */ dlzk b;
    final /* synthetic */ dlzl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlzg(dlzk dlzkVar, dlzl dlzlVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dlzkVar;
        this.c = dlzlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r4.i.a(r1, r3) == r0) goto L13;
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
            if (r1 == r2) goto L17
            goto L27
        Ld:
            dlzk r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.b(r3)
            if (r4 == r0) goto L2a
        L17:
            dlzl r4 = r3.c
            dlzk r1 = r3.b
            r2 = 2
            r3.a = r2
            fdat r4 = r4.i
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r0) goto L27
            goto L2a
        L27:
            fctx r4 = defpackage.fctx.a
            return r4
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlzg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dlzg(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
