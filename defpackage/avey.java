package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avey implements fdap {
    public static final avey a = new avey();

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.getClass();
        return Long.valueOf(cursor.getLong(0));
    }
}
