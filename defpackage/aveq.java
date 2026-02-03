package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aveq implements fdap {
    public static final aveq a = new aveq();

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.getClass();
        return Long.valueOf(cursor.getLong(0));
    }
}
