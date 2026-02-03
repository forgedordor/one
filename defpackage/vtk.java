package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vtk extends fcyz implements fdat {
    int a;
    final /* synthetic */ vtm b;
    final /* synthetic */ vvr c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtk(vtm vtmVar, vvr vvrVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vtmVar;
        this.c = vvrVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vtk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vtm vtmVar = this.b;
            vvr vvrVar = this.c;
            this.a = 1;
            obj = vtmVar.a(vvrVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        this.b.b(2, (vte) obj, this.d);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vtk(this.b, this.c, this.d, fcxyVar);
    }
}
