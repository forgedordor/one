package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oqd extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdau c;
    final /* synthetic */ opb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqd(fdau fdauVar, opb opbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdauVar;
        this.d = opbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oqd) c(obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            fdau fdauVar = this.c;
            opb opbVar = this.d;
            this.a = 1;
            if (fdauVar.a(opbVar, obj2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        oqd oqdVar = new oqd(this.c, this.d, fcxyVar);
        oqdVar.b = obj;
        return oqdVar;
    }
}
