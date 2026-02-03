package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhos extends fcyz implements fdat {
    int a;
    final /* synthetic */ dhov b;
    final /* synthetic */ dhuu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhos(dhov dhovVar, dhuu dhuuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dhovVar;
        this.c = dhuuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhos) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dhov dhovVar = this.b;
        dhuu dhuuVar = this.c;
        this.a = 1;
        Object objB = dhovVar.b(dhuuVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dhos(this.b, this.c, fcxyVar);
    }
}
