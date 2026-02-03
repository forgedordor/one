package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyv extends fcyz implements fdat {
    int a;
    final /* synthetic */ abyy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abyv(abyy abyyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abyyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abyv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        abyy abyyVar = this.b;
        egzr egzrVar = egzr.SAME_DAY;
        this.a = 1;
        Object objD = abyyVar.d(egzrVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abyv(this.b, fcxyVar);
    }
}
