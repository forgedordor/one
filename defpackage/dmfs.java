package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmfs extends fcyz implements fdap {
    int a;
    final /* synthetic */ dmhi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmfs(dmhi dmhiVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dmhiVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmgo dmgoVar = ((dmhc) this.b).b;
            this.a = 1;
            if (dmgoVar.e(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dmfs(this.b, (fcxy) obj).b(fctx.a);
    }
}
