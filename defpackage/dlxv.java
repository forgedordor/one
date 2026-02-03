package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxv extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlxv(List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlxv) c((dlyp) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dlyp dlypVar = (dlyp) this.a;
        if (dlypVar instanceof dlyo) {
            this.b.add(((dlyo) dlypVar).b);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dlxv dlxvVar = new dlxv(this.b, fcxyVar);
        dlxvVar.a = obj;
        return dlxvVar;
    }
}
