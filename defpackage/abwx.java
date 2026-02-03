package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abwx extends fcyz implements fdat {
    int a;
    final /* synthetic */ abwy b;
    final /* synthetic */ abww c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abwx(abwy abwyVar, abww abwwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abwyVar;
        this.c = abwwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abwx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            abwy abwyVar = this.b;
            abww abwwVar = this.c;
            this.a = 1;
            if (abwyVar.a.fO(abwwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abwx(this.b, this.c, fcxyVar);
    }
}
