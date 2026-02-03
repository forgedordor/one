package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yat extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpm b;
    final /* synthetic */ ybd c;
    final /* synthetic */ ajlt d;
    final /* synthetic */ fdvc e;
    final /* synthetic */ fdae f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yat(fdpm fdpmVar, ybd ybdVar, ajlt ajltVar, fdvc fdvcVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdpmVar;
        this.c = ybdVar;
        this.d = ajltVar;
        this.e = fdvcVar;
        this.f = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yat) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.g;
            fdpm fdpmVar = this.b;
            ybd ybdVar = this.c;
            ajlt ajltVar = this.d;
            fdvc fdvcVar = this.e;
            fdae fdaeVar = this.f;
            HashMap map = new HashMap(ybdVar.a());
            fdpl fdplVarA = fdqq.a(anov.a(ajltVar.k(ybdVar.a())));
            yav yavVar = new yav(null, map, ybdVar, fdjxVar, fdaeVar);
            int i2 = fdsn.a;
            fdpl fdplVarA2 = fdud.a(new fdwg(yavVar, fdplVarA), fdqq.a(anov.a(ajltVar.l())), fdvcVar, new yax(ybdVar, fdvcVar, null));
            this.a = 1;
            if (fdpy.c(fdpmVar, fdplVarA2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        yat yatVar = new yat(this.b, this.c, this.d, this.e, this.f, fcxyVar);
        yatVar.g = obj;
        return yatVar;
    }
}
