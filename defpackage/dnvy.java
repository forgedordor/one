package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnvy extends fcyz implements fdau {
    /* synthetic */ Object a;
    final /* synthetic */ dnwk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnvy(dnwk dnwkVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = dnwkVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dnvy dnvyVar = new dnvy(this.b, (fcxy) obj3);
        dnvyVar.a = (Cursor) obj2;
        return dnvyVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r2 = this.a;
        r2.getClass();
        return Boolean.valueOf(this.b.a(r2) != null);
    }
}
