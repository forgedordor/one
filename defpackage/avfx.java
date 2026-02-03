package defpackage;

import android.database.Cursor;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avfx implements fdap {
    public static final avfx a = new avfx();

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.getClass();
        long j = cursor.getLong(0);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(cursor.getLong(1));
        instantOfEpochMilli.getClass();
        return new avcy(j, instantOfEpochMilli);
    }
}
