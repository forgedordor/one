package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwni extends fcyz implements fdat {
    final /* synthetic */ bwnn a;
    final /* synthetic */ aubq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwni(bwnn bwnnVar, aubq aubqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bwnnVar;
        this.b = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwni) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bwnn bwnnVar = this.a;
        dggw dggwVar = (dggw) bwnnVar.b.b();
        dggl dgglVar = (dggl) bwnnVar.c.b();
        String str = this.b.d;
        str.getClass();
        return Boolean.valueOf(dggwVar.u(dgglVar.a(str)));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwni(this.a, this.b, fcxyVar);
    }
}
