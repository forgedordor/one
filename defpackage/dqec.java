package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqec extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqec(dqee dqeeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqeeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqec) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dqee dqeeVar = this.b;
            this.a = 1;
            if (dqeeVar.h.a(0, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqec(this.b, fcxyVar);
    }
}
