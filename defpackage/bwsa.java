package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsa extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwsb b;
    final /* synthetic */ cffs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwsa(bwsb bwsbVar, cffs cffsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bwsbVar;
        this.c = cffsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwsa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bwsb bwsbVar = this.b;
        cffs cffsVar = this.c;
        this.a = 1;
        Object objA = bwsbVar.a(cffsVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwsa(this.b, this.c, fcxyVar);
    }
}
