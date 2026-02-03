package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aver implements fdap {
    public static final aver a = new aver();

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.getClass();
        return Long.valueOf(cursor.getLong(0));
    }
}
