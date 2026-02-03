package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awuh extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Iterable c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awuh(Iterable iterable, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = iterable;
        this.d = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awuh) c((awvl) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awvl awvlVar = (awvl) this.b;
            Iterable iterable = this.c;
            List list = this.d;
            this.a = 1;
            if (awvlVar.o(iterable, list, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awuh awuhVar = new awuh(this.c, this.d, fcxyVar);
        awuhVar.b = obj;
        return awuhVar;
    }
}
