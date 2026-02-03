package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cylq extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public cylq(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cylq cylqVar = new cylq((fcxy) obj3);
        cylqVar.a = (List) obj;
        cylqVar.b = (cynj) obj2;
        return cylqVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r2 = this.a;
        r2.add(this.b);
        return r2;
    }
}
