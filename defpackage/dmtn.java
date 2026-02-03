package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmtn extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmtr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmtn(dmtr dmtrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmtrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmtn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmtr dmtrVar = this.b;
            List listB = fcva.b(dngy.a);
            this.a = 1;
            obj = dmtrVar.x.b(listB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            dmtr dmtrVar2 = this.b;
            dmiu dmiuVarF = dmtrVar2.F();
            dmtrVar2.J(dmiuVarF != null ? dmiuVarF.b : false);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmtn(this.b, fcxyVar);
    }
}
