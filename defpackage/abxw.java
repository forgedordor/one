package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abxw extends fcyz implements fdat {
    int a;
    final /* synthetic */ abxy b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abxw(abxy abxyVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abxyVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abxw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            abxy abxyVar = this.b;
            efwo efwoVar = this.c;
            this.a = 1;
            obj = abxyVar.b(efwoVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        egbe egbeVar = (egbe) obj;
        if (egbeVar == null || !fdbq.f(egbeVar.b().k, "google")) {
            ((ajbu) this.b.a.get()).c();
            return fctx.a;
        }
        ((ajbu) this.b.a.get()).b(egbeVar.a());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abxw(this.b, this.c, fcxyVar);
    }
}
