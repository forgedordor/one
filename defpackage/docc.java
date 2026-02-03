package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class docc extends fcyz implements fdat {
    final /* synthetic */ dqaf a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public docc(dqaf dqafVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dqafVar;
        this.b = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((docc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return dndw.a(this.a.e, this.b, 0, null, null, 60);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new docc(this.a, this.b, fcxyVar);
    }
}
