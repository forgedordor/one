package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyfm extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ cyfu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyfm(hox hoxVar, cyfu cyfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = cyfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyfm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        hox hoxVar;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            hoxVar = obj2;
        } else {
            fctl.b(obj);
            hox hoxVar2 = this.c;
            cyfu cyfuVar = this.d;
            this.a = hoxVar2;
            this.b = 1;
            Object objE = cyfuVar.b.e(this);
            if (objE == fcylVar) {
                return fcylVar;
            }
            hoxVar = hoxVar2;
            obj = objE;
        }
        hoxVar.b(obj);
        hox hoxVar3 = this.c;
        cqce cqceVar = cyfu.a;
        Object objA = hoxVar3.a();
        Objects.toString(objA);
        cqceVar.p("listVaults result ".concat(String.valueOf(objA)));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cyfm(this.c, this.d, fcxyVar);
    }
}
