package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awul extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Iterable c;
    final /* synthetic */ Iterable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awul(Iterable iterable, Iterable iterable2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = iterable;
        this.d = iterable2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awul) c((awvl) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awvl awvlVar = (awvl) this.b;
            Iterable iterable = this.c;
            Iterable iterable2 = this.d;
            this.a = 1;
            if (awvlVar.o(iterable, iterable2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awul awulVar = new awul(this.c, this.d, fcxyVar);
        awulVar.b = obj;
        return awulVar;
    }
}
