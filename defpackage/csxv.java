package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csxv implements fdap {
    public static final csxv a = new csxv();

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = ((egrr) obj).a;
        return new csxu(egrr.b(cursor, egrr.a(cursor, "number")), cursor.getLong(egrr.a(cursor, "date")));
    }
}
