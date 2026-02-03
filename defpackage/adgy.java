package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgy extends fcyz implements fdat {
    int a;
    final /* synthetic */ adhb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgy(fcxy fcxyVar, adhb adhbVar) {
        super(2, fcxyVar);
        this.b = adhbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adgy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            adhb adhbVar = this.b;
            this.a = 1;
            if (adhbVar.a.c(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        adgy adgyVar = new adgy(fcxyVar, this.b);
        adgyVar.c = obj;
        return adgyVar;
    }
}
