package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yau extends fcyz implements fdat {
    int a;
    final /* synthetic */ ybd b;
    final /* synthetic */ ajlt c;
    final /* synthetic */ fdvc d;
    final /* synthetic */ fdae e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yau(ybd ybdVar, ajlt ajltVar, fdvc fdvcVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ybdVar;
        this.c = ajltVar;
        this.d = fdvcVar;
        this.e = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yau) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yat yatVar = new yat((fdpm) this.f, this.b, this.c, this.d, this.e, null);
            this.a = 1;
            if (fdjy.a(yatVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        yau yauVar = new yau(this.b, this.c, this.d, this.e, fcxyVar);
        yauVar.f = obj;
        return yauVar;
    }
}
