package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajpr extends fcyz implements fdat {
    int a;
    final /* synthetic */ defn b;
    final /* synthetic */ ajps c;
    final /* synthetic */ dzub d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajpr(defn defnVar, ajps ajpsVar, dzub dzubVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = defnVar;
        this.c = ajpsVar;
        this.d = dzubVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajpr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajpr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajpr(this.b, this.c, this.d, fcxyVar);
    }
}
