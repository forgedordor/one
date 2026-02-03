package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daqw extends fcyz implements fdat {
    int a;
    final /* synthetic */ daqz b;
    final /* synthetic */ ctay c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daqw(daqz daqzVar, ctay ctayVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = daqzVar;
        this.c = ctayVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daqw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        daqz daqzVar = this.b;
        ctay ctayVar = this.c;
        String str = this.d;
        this.a = 1;
        Object objA = fdin.a(eicg.a(daqzVar.d), new daqq(null, daqzVar, ctayVar, str), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new daqw(this.b, this.c, this.d, fcxyVar);
    }
}
