package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culg extends fcyz implements fdat {
    int a;
    final /* synthetic */ culm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public culg(fcxy fcxyVar, culm culmVar) {
        super(2, fcxyVar);
        this.b = culmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((culg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            culm culmVar = this.b;
            this.a = 1;
            obj = culmVar.b.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(culf.a((culp) obj));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        culg culgVar = new culg(fcxyVar, this.b);
        culgVar.c = obj;
        return culgVar;
    }
}
