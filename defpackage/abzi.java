package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abzi extends fcyz implements fdat {
    int a;
    final /* synthetic */ abzk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abzi(abzk abzkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abzkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abzi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        abzk abzkVar = this.b;
        this.a = 1;
        Object objB = crrj.b(abzkVar.d, new fdap() { // from class: abzc
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                abyz abyzVar = (abyz) obj2;
                abyzVar.copyOnWrite();
                abza abzaVar = (abza) abyzVar.instance;
                abza abzaVar2 = abza.a;
                abzaVar.b |= 2;
                abzaVar.d = true;
                return fctx.a;
            }
        }, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abzi(this.b, fcxyVar);
    }
}
