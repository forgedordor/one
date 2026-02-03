package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vtl extends fcyz implements fdat {
    int a;
    final /* synthetic */ vtm b;
    final /* synthetic */ vvs c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtl(vtm vtmVar, vvs vvsVar, int i, int i2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vtmVar;
        this.c = vvsVar;
        this.e = i;
        this.d = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vtl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vtm vtmVar = this.b;
            vvs vvsVar = this.c;
            this.a = 1;
            obj = vtmVar.a(vvsVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        this.b.b(this.e + (-1) != 1 ? 3 : 4, (vte) obj, this.d);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vtl(this.b, this.c, this.e, this.d, fcxyVar);
    }
}
