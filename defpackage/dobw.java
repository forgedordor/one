package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dobw extends fcyz implements fdat {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dobw(List list, List list2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dobw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return dndw.a(this.a, this.b, 0, null, new fdat() { // from class: dobv
            @Override // defpackage.fdat
            public final Object a(Object obj2, Object obj3) {
                return Boolean.valueOf(fdbq.f(((doav) obj2).e(), ((doav) obj3).e()));
            }
        }, 28);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dobw(this.a, this.b, fcxyVar);
    }
}
