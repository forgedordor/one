package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztd extends fcyz implements fdap {
    final /* synthetic */ ztv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztd(ztv ztvVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ztvVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ztv ztvVar = this.a;
        ((uvn) ztvVar.F.b()).c();
        ((vwg) ztvVar.o.b()).c(vvz.a);
        return true;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ztd(this.a, (fcxy) obj).b(fctx.a);
    }
}
