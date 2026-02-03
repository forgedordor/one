package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edxf extends fcyz implements fdat {
    int a;
    final /* synthetic */ edxi b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edxf(edxi edxiVar, String str, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = edxiVar;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edxf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            edxi edxiVar = this.b;
            edxiVar.g.f(new edxj(this.c, this.d));
            this.a = 1;
            if (edxiVar.a.a() == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new edxf(this.b, this.c, this.d, fcxyVar);
    }
}
