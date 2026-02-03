package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbhj extends dbho {
    final /* synthetic */ Long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbhj(dbhq dbhqVar, String str, Long l) {
        super(dbhqVar, str);
        this.a = l;
    }

    @Override // defpackage.dbho
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        String str = this.c;
        return sharedPreferences.contains(str) ? Long.valueOf(sharedPreferences.getLong(str, 0L)) : this.a;
    }

    @Override // defpackage.dbho
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            throw new IllegalArgumentException("null cannot be written for Long");
        }
        editor.putLong(this.c, l.longValue());
    }
}
