package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agma implements fdap {
    public static final agma a = new agma();

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.getClass();
        return Long.valueOf(cursor.getLong(0));
    }
}
