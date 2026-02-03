package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aveu implements fdap {
    public static final aveu a = new aveu();

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.getClass();
        return new avge(cursor.getLong(0), cursor.getLong(1));
    }
}
