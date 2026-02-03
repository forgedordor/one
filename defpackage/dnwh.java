package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnwh extends fcyz implements fdau {
    /* synthetic */ Object a;

    public dnwh(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dnwh dnwhVar = new dnwh((fcxy) obj3);
        dnwhVar.a = (Cursor) obj2;
        return dnwhVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r3 = this.a;
        boolean zMoveToFirst = r3.moveToFirst();
        Cursor cursor = r3;
        if (true != zMoveToFirst) {
            cursor = null;
        }
        return new Integer(cursor != null ? cursor.getInt(0) : -1);
    }
}
