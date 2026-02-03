package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cylr extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public cylr(fcxy fcxyVar) {
        super(4, fcxyVar);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cylr cylrVar = new cylr((fcxy) obj4);
        cylrVar.a = (List) obj;
        cylrVar.b = (List) obj2;
        cylrVar.c = (List) obj3;
        return cylrVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new cylp(this.b, this.a, this.c);
    }
}
