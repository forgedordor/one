package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avfv implements fdat {
    public static final avfv a = new avfv();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Cursor cursor = (Cursor) obj2;
        return Integer.valueOf(cursor != null ? cursor.getCount() : 0);
    }
}
