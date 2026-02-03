package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aagc extends fcyz implements fdat {
    int a;
    final /* synthetic */ aagf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aagc(aagf aagfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aagfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aagc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aagf aagfVar = this.b;
            this.a = 1;
            obj = fdtc.a(aagfVar.c, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(((ajlh) obj).e().g);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aagc(this.b, fcxyVar);
    }
}
