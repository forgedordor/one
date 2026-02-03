package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmw extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmw(dmx dmxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmx dmxVar = this.b;
            this.a = 1;
            if (dmxVar.e(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmw(this.b, fcxyVar);
    }
}
